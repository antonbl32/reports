package com.biclast.reports.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
;
import java.util.Calendar;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CsrDTO {
    protected String position;
    protected String surname;
    protected String forename;
    protected String patronymicName;
    protected String licenseNumber;
    protected Calendar licenseIssueDate;
    protected String department;
    protected String departmentChiefFio;
}
