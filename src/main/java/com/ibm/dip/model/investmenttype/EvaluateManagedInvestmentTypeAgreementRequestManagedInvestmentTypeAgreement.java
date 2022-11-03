package com.ibm.dip.model.investmenttype;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:51.356Z[GMT]")

public class EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("LegalEntityReference")
  private Object legalEntityReference;

  @JsonProperty("InvestmentTypeInstanceReference")
  private Object investmentTypeInstanceReference;

  @JsonProperty("InvestmentTypeAgreementType")
  private String investmentTypeAgreementType;

  @JsonProperty("InvestmentTypeAgreementJurisdiction")
  private String investmentTypeAgreementJurisdiction;

  @JsonProperty("InvestmentTypeAgreementValidFromOrToDate")
  private String investmentTypeAgreementValidFromOrToDate;

  @JsonProperty("InvestmentTypeAgreementSignatoriesOrResponsibleParties")
  private String investmentTypeAgreementSignatoriesOrResponsibleParties;

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement legalEntityReference(Object legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
    return this;
  }

  /**
   * Get legalEntityReference
   * @return legalEntityReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getLegalEntityReference() {
    return legalEntityReference;
  }

  public void setLegalEntityReference(Object legalEntityReference) {
    this.legalEntityReference = legalEntityReference;
  }

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement investmentTypeInstanceReference(Object investmentTypeInstanceReference) {
    this.investmentTypeInstanceReference = investmentTypeInstanceReference;
    return this;
  }

  /**
   * Get investmentTypeInstanceReference
   * @return investmentTypeInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInvestmentTypeInstanceReference() {
    return investmentTypeInstanceReference;
  }

  public void setInvestmentTypeInstanceReference(Object investmentTypeInstanceReference) {
    this.investmentTypeInstanceReference = investmentTypeInstanceReference;
  }

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement investmentTypeAgreementType(String investmentTypeAgreementType) {
    this.investmentTypeAgreementType = investmentTypeAgreementType;
    return this;
  }

  /**
   * Get investmentTypeAgreementType
   * @return investmentTypeAgreementType
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementType() {
    return investmentTypeAgreementType;
  }

  public void setInvestmentTypeAgreementType(String investmentTypeAgreementType) {
    this.investmentTypeAgreementType = investmentTypeAgreementType;
  }

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement investmentTypeAgreementJurisdiction(String investmentTypeAgreementJurisdiction) {
    this.investmentTypeAgreementJurisdiction = investmentTypeAgreementJurisdiction;
    return this;
  }

  /**
   * Get investmentTypeAgreementJurisdiction
   * @return investmentTypeAgreementJurisdiction
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementJurisdiction() {
    return investmentTypeAgreementJurisdiction;
  }

  public void setInvestmentTypeAgreementJurisdiction(String investmentTypeAgreementJurisdiction) {
    this.investmentTypeAgreementJurisdiction = investmentTypeAgreementJurisdiction;
  }

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement investmentTypeAgreementValidFromOrToDate(String investmentTypeAgreementValidFromOrToDate) {
    this.investmentTypeAgreementValidFromOrToDate = investmentTypeAgreementValidFromOrToDate;
    return this;
  }

  /**
   * Get investmentTypeAgreementValidFromOrToDate
   * @return investmentTypeAgreementValidFromOrToDate
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementValidFromOrToDate() {
    return investmentTypeAgreementValidFromOrToDate;
  }

  public void setInvestmentTypeAgreementValidFromOrToDate(String investmentTypeAgreementValidFromOrToDate) {
    this.investmentTypeAgreementValidFromOrToDate = investmentTypeAgreementValidFromOrToDate;
  }

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement investmentTypeAgreementSignatoriesOrResponsibleParties(String investmentTypeAgreementSignatoriesOrResponsibleParties) {
    this.investmentTypeAgreementSignatoriesOrResponsibleParties = investmentTypeAgreementSignatoriesOrResponsibleParties;
    return this;
  }

  /**
   * Get investmentTypeAgreementSignatoriesOrResponsibleParties
   * @return investmentTypeAgreementSignatoriesOrResponsibleParties
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementSignatoriesOrResponsibleParties() {
    return investmentTypeAgreementSignatoriesOrResponsibleParties;
  }

  public void setInvestmentTypeAgreementSignatoriesOrResponsibleParties(String investmentTypeAgreementSignatoriesOrResponsibleParties) {
    this.investmentTypeAgreementSignatoriesOrResponsibleParties = investmentTypeAgreementSignatoriesOrResponsibleParties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement = (EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement) o;
    return Objects.equals(this.customerReference, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.customerReference) &&
        Objects.equals(this.legalEntityReference, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.legalEntityReference) &&
        Objects.equals(this.investmentTypeInstanceReference, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.investmentTypeInstanceReference) &&
        Objects.equals(this.investmentTypeAgreementType, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.investmentTypeAgreementType) &&
        Objects.equals(this.investmentTypeAgreementJurisdiction, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.investmentTypeAgreementJurisdiction) &&
        Objects.equals(this.investmentTypeAgreementValidFromOrToDate, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.investmentTypeAgreementValidFromOrToDate) &&
        Objects.equals(this.investmentTypeAgreementSignatoriesOrResponsibleParties, evaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement.investmentTypeAgreementSignatoriesOrResponsibleParties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, legalEntityReference, investmentTypeInstanceReference, investmentTypeAgreementType, investmentTypeAgreementJurisdiction, investmentTypeAgreementValidFromOrToDate, investmentTypeAgreementSignatoriesOrResponsibleParties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    legalEntityReference: ").append(toIndentedString(legalEntityReference)).append("\n");
    sb.append("    investmentTypeInstanceReference: ").append(toIndentedString(investmentTypeInstanceReference)).append("\n");
    sb.append("    investmentTypeAgreementType: ").append(toIndentedString(investmentTypeAgreementType)).append("\n");
    sb.append("    investmentTypeAgreementJurisdiction: ").append(toIndentedString(investmentTypeAgreementJurisdiction)).append("\n");
    sb.append("    investmentTypeAgreementValidFromOrToDate: ").append(toIndentedString(investmentTypeAgreementValidFromOrToDate)).append("\n");
    sb.append("    investmentTypeAgreementSignatoriesOrResponsibleParties: ").append(toIndentedString(investmentTypeAgreementSignatoriesOrResponsibleParties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

