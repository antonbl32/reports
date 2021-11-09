package com.biclast.reports.dto;

import com.biclast.reports.bean.StudentBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDTO {
    @NotNull
    private DocumentDTO documentDTO;
}
