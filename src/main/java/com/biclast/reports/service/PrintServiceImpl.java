package com.biclast.reports.service;

import com.biclast.reports.bean.StudentBean;
import com.biclast.reports.dto.ReportDTO;
import com.biclast.reports.entity.Report;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PrintServiceImpl implements PrintService {

    @Override
    public InputStream print(ReportDTO report) {
        try {
            File file = ResourceUtils.getFile("classpath:\\jasper\\document.jrxml");
            Map<String, Object> params = new HashMap<>();
            List<StudentBean> allStudents= report.getAllStudents();
            params.put("STUDENTS", allStudents);
            List<Report> rep = new ArrayList<>();
            Report printReport=new Report(report.getDocumentName(),report.getTypeOfDocuments());
            rep.add(printReport);
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rep);
            JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
            JasperPrint reportToPrint = JasperFillManager.fillReport(jasperReport,
                    params, dataSource);
            String fileName = report.getDocumentName() + ".pdf";
            JasperExportManager.exportReportToPdfFile(reportToPrint, "src/main/resources/reports/" + fileName);
            InputStream inputStream=new ByteArrayInputStream(JasperExportManager.exportReportToPdf(reportToPrint));
            return inputStream;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JRException e) {
            e.printStackTrace();
        }
        return null;
    }
}
