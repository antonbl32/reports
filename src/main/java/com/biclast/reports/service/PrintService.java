package com.biclast.reports.service;

import com.biclast.reports.dto.ReportDTO;

import java.io.InputStream;


public interface PrintService {
    InputStream print(ReportDTO report);
}
