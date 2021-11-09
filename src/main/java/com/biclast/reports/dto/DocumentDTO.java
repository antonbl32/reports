package com.biclast.reports.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO {
    @NotNull
    private String documentName;
    @NotNull
    private String documentType;
    private String action;
    private String customerType;
    private String paymentType;
    private String paymentSlipType;
    private String needDisplayTextWoT;
    private String isNeedOcc;
    @NotNull
    private String city;
    private Calendar time;
    private CsrDTO csr;
    private CsrDTO personalConsult;
    // private PrivateCustomerType privateCustomer;
    private LegalCustomerDTO legalCustomer;
    private List<BillingAccountType> billingAccount;
    private Document.ServicesSummary servicesSummary;
    private List<ContractType> contract;
    private Document.SumCharges sumCharges;
    private String newMSISDN;
    private Document.NewCustomer newCustomer;
    private String newRateplanName;
    private String newSpName;
    private Document.NewServices newServices;
    private String newSIM;
    private boolean isSplitBill;
    private boolean isFirstAndSingleContract;
    private String rsDes;
    private StatusReasonType newStatus;
    private List<Document.CdsStatement> cdsStatement;
    private Document.DcSpecificationServices dcSpecificationServices;
    private boolean isMultyOrder;
    private boolean isPaymentSlipForBA;
    private boolean isRegFormForSIP;
    private boolean isRegFormNotOnlyForSIP;
    private boolean isRegFormForNbiot;
    private boolean isAnnexForNbiot;
    private BalAdjustment balAdjustment;
    private List<ServiceWithCost> servicesRecurringCharge;
    private List<ServiceWithCost> servicesRecurringChargeR;
    private List<ServiceWithCost> servicesRecurringChargeA;
    private List<ServiceWithCost> servicesRecurringChargeNone;
    private List<ServiceWithCost> servicesOneTimeCharge;
}
