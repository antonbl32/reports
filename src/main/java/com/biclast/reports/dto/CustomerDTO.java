package com.biclast.reports.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    protected String customerId;
    protected String registrationNo;
    protected String contactPhoneNo;
    protected String fax;
    protected String billMedium;
    protected AddressType billingAddress;
    protected AddressType mailingAddress;
    protected String password;
    protected String allPhones;
    protected String allMails;
    protected String dcCompanyName;
    protected String dcTypeContract;
    protected String dcSite;
    protected String dcTextList;
    protected String dcTypeService;
    protected String dcFirstPar;
    protected String dcSecondPar;
    protected String dcThPar;
    protected String dcFourthPar;
    protected String dcTopText;
    protected String dcRootText;
    protected BigInteger dcContractCount;
    protected String agreementID;
    protected Calendar agreementDate;
    protected Calendar agreementEndDate;
    protected List<BillingAccountType> account;
}
