package com.biclast.reports.dto;

import com.biclast.reports.bean.StudentBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDTO {
    @NotEmpty
    private String documentName;
    @NotEmpty
    private String typeOfDocuments;
    @NotEmpty
    private List<StudentBean> allStudents;
}
