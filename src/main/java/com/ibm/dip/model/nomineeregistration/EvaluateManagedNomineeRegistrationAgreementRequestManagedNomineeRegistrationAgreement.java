package com.ibm.dip.model.nomineeregistration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:53.958Z[GMT]")

public class EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("LegalEntityReference")
  private Object legalEntityReference;

  @JsonProperty("NomineeRegistrationInstanceReference")
  private Object nomineeRegistrationInstanceReference;

  @JsonProperty("NomineeRegistrationAgreementType")
  private String nomineeRegistrationAgreementType;

  @JsonProperty("INomineeRegistrationAgreementJurisdiction")
  private String inomineeRegistrationAgreementJurisdiction;

  @JsonProperty("NomineeRegistrationAgreementValidFromOrToDate")
  private String nomineeRegistrationAgreementValidFromOrToDate;

  @JsonProperty("NomineeRegistrationAgreementSignatoriesOrResponsibleParties")
  private String nomineeRegistrationAgreementSignatoriesOrResponsibleParties;

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement customerReference(Object customerReference) {
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

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement legalEntityReference(Object legalEntityReference) {
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

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement nomineeRegistrationInstanceReference(Object nomineeRegistrationInstanceReference) {
    this.nomineeRegistrationInstanceReference = nomineeRegistrationInstanceReference;
    return this;
  }

  /**
   * Get nomineeRegistrationInstanceReference
   * @return nomineeRegistrationInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getNomineeRegistrationInstanceReference() {
    return nomineeRegistrationInstanceReference;
  }

  public void setNomineeRegistrationInstanceReference(Object nomineeRegistrationInstanceReference) {
    this.nomineeRegistrationInstanceReference = nomineeRegistrationInstanceReference;
  }

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement nomineeRegistrationAgreementType(String nomineeRegistrationAgreementType) {
    this.nomineeRegistrationAgreementType = nomineeRegistrationAgreementType;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementType
   * @return nomineeRegistrationAgreementType
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementType() {
    return nomineeRegistrationAgreementType;
  }

  public void setNomineeRegistrationAgreementType(String nomineeRegistrationAgreementType) {
    this.nomineeRegistrationAgreementType = nomineeRegistrationAgreementType;
  }

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement inomineeRegistrationAgreementJurisdiction(String inomineeRegistrationAgreementJurisdiction) {
    this.inomineeRegistrationAgreementJurisdiction = inomineeRegistrationAgreementJurisdiction;
    return this;
  }

  /**
   * Get inomineeRegistrationAgreementJurisdiction
   * @return inomineeRegistrationAgreementJurisdiction
  */
  @ApiModelProperty(value = "")


  public String getInomineeRegistrationAgreementJurisdiction() {
    return inomineeRegistrationAgreementJurisdiction;
  }

  public void setInomineeRegistrationAgreementJurisdiction(String inomineeRegistrationAgreementJurisdiction) {
    this.inomineeRegistrationAgreementJurisdiction = inomineeRegistrationAgreementJurisdiction;
  }

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement nomineeRegistrationAgreementValidFromOrToDate(String nomineeRegistrationAgreementValidFromOrToDate) {
    this.nomineeRegistrationAgreementValidFromOrToDate = nomineeRegistrationAgreementValidFromOrToDate;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementValidFromOrToDate
   * @return nomineeRegistrationAgreementValidFromOrToDate
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementValidFromOrToDate() {
    return nomineeRegistrationAgreementValidFromOrToDate;
  }

  public void setNomineeRegistrationAgreementValidFromOrToDate(String nomineeRegistrationAgreementValidFromOrToDate) {
    this.nomineeRegistrationAgreementValidFromOrToDate = nomineeRegistrationAgreementValidFromOrToDate;
  }

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement nomineeRegistrationAgreementSignatoriesOrResponsibleParties(String nomineeRegistrationAgreementSignatoriesOrResponsibleParties) {
    this.nomineeRegistrationAgreementSignatoriesOrResponsibleParties = nomineeRegistrationAgreementSignatoriesOrResponsibleParties;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementSignatoriesOrResponsibleParties
   * @return nomineeRegistrationAgreementSignatoriesOrResponsibleParties
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementSignatoriesOrResponsibleParties() {
    return nomineeRegistrationAgreementSignatoriesOrResponsibleParties;
  }

  public void setNomineeRegistrationAgreementSignatoriesOrResponsibleParties(String nomineeRegistrationAgreementSignatoriesOrResponsibleParties) {
    this.nomineeRegistrationAgreementSignatoriesOrResponsibleParties = nomineeRegistrationAgreementSignatoriesOrResponsibleParties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement = (EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement) o;
    return Objects.equals(this.customerReference, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.customerReference) &&
        Objects.equals(this.legalEntityReference, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.legalEntityReference) &&
        Objects.equals(this.nomineeRegistrationInstanceReference, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.nomineeRegistrationInstanceReference) &&
        Objects.equals(this.nomineeRegistrationAgreementType, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.nomineeRegistrationAgreementType) &&
        Objects.equals(this.inomineeRegistrationAgreementJurisdiction, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.inomineeRegistrationAgreementJurisdiction) &&
        Objects.equals(this.nomineeRegistrationAgreementValidFromOrToDate, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.nomineeRegistrationAgreementValidFromOrToDate) &&
        Objects.equals(this.nomineeRegistrationAgreementSignatoriesOrResponsibleParties, evaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement.nomineeRegistrationAgreementSignatoriesOrResponsibleParties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, legalEntityReference, nomineeRegistrationInstanceReference, nomineeRegistrationAgreementType, inomineeRegistrationAgreementJurisdiction, nomineeRegistrationAgreementValidFromOrToDate, nomineeRegistrationAgreementSignatoriesOrResponsibleParties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    legalEntityReference: ").append(toIndentedString(legalEntityReference)).append("\n");
    sb.append("    nomineeRegistrationInstanceReference: ").append(toIndentedString(nomineeRegistrationInstanceReference)).append("\n");
    sb.append("    nomineeRegistrationAgreementType: ").append(toIndentedString(nomineeRegistrationAgreementType)).append("\n");
    sb.append("    inomineeRegistrationAgreementJurisdiction: ").append(toIndentedString(inomineeRegistrationAgreementJurisdiction)).append("\n");
    sb.append("    nomineeRegistrationAgreementValidFromOrToDate: ").append(toIndentedString(nomineeRegistrationAgreementValidFromOrToDate)).append("\n");
    sb.append("    nomineeRegistrationAgreementSignatoriesOrResponsibleParties: ").append(toIndentedString(nomineeRegistrationAgreementSignatoriesOrResponsibleParties)).append("\n");
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

