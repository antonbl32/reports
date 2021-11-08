package com.biclast.reports.controller;

import com.biclast.reports.dto.ReportDTO;
import com.biclast.reports.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;


@RestController
@RequestMapping("api")
public class ReportController {
    @Autowired
    private PrintService printService;

    @RequestMapping(value = "/report", method = RequestMethod.GET, produces = "application/pdf")
    public ResponseEntity<InputStreamResource> download(@Valid @RequestBody ReportDTO reportDTO) throws IOException {
        InputStream inputStream = printService.print(reportDTO);
        //System.out.println("Calling Download:- " + fileName);
       // ClassPathResource pdfFile = new ClassPathResource("reports/"+fileName);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT");
        headers.add("Access-Control-Allow-Headers", "Content-Type");
        headers.add("Content-Disposition", "filename=" + reportDTO.getDocumentName());
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        //headers.setContentLength(pdfFile.contentLength());
        ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(
                new InputStreamResource(inputStream), headers, HttpStatus.OK);
        //new InputStreamResource(pdfFile.getInputStream()), headers, HttpStatus.OK);
        return response;
    }
}
