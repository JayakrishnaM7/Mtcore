package com.ibm.dip.model.nomineeregistration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ManagedNomineeRegistrationAgreement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:58.850Z[GMT]")

public class ManagedNomineeRegistrationAgreement   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("LegalEntityReference")
  private Object legalEntityReference;

  @JsonProperty("NomineeRegistrationInstanceReference")
  private Object nomineeRegistrationInstanceReference;

  @JsonProperty("NomineeRegistrationAgreementType")
  private String nomineeRegistrationAgreementType;

  @JsonProperty("NomineeRegistrationAgreementJurisdiction")
  private String nomineeRegistrationAgreementJurisdiction;

  @JsonProperty("NomineeRegistrationAgreementValidFromOrToDate")
  private String nomineeRegistrationAgreementValidFromOrToDate;

  @JsonProperty("NomineeRegistrationAgreementSignatoriesOrResponsibleParties")
  private String nomineeRegistrationAgreementSignatoriesOrResponsibleParties;

  public ManagedNomineeRegistrationAgreement customerReference(Object customerReference) {
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

  public ManagedNomineeRegistrationAgreement legalEntityReference(Object legalEntityReference) {
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

  public ManagedNomineeRegistrationAgreement nomineeRegistrationInstanceReference(Object nomineeRegistrationInstanceReference) {
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

  public ManagedNomineeRegistrationAgreement nomineeRegistrationAgreementType(String nomineeRegistrationAgreementType) {
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

  public ManagedNomineeRegistrationAgreement nomineeRegistrationAgreementJurisdiction(String nomineeRegistrationAgreementJurisdiction) {
    this.nomineeRegistrationAgreementJurisdiction = nomineeRegistrationAgreementJurisdiction;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementJurisdiction
   * @return nomineeRegistrationAgreementJurisdiction
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementJurisdiction() {
    return nomineeRegistrationAgreementJurisdiction;
  }

  public void setNomineeRegistrationAgreementJurisdiction(String nomineeRegistrationAgreementJurisdiction) {
    this.nomineeRegistrationAgreementJurisdiction = nomineeRegistrationAgreementJurisdiction;
  }

  public ManagedNomineeRegistrationAgreement nomineeRegistrationAgreementValidFromOrToDate(String nomineeRegistrationAgreementValidFromOrToDate) {
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

  public ManagedNomineeRegistrationAgreement nomineeRegistrationAgreementSignatoriesOrResponsibleParties(String nomineeRegistrationAgreementSignatoriesOrResponsibleParties) {
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
    ManagedNomineeRegistrationAgreement managedNomineeRegistrationAgreement = (ManagedNomineeRegistrationAgreement) o;
    return Objects.equals(this.customerReference, managedNomineeRegistrationAgreement.customerReference) &&
        Objects.equals(this.legalEntityReference, managedNomineeRegistrationAgreement.legalEntityReference) &&
        Objects.equals(this.nomineeRegistrationInstanceReference, managedNomineeRegistrationAgreement.nomineeRegistrationInstanceReference) &&
        Objects.equals(this.nomineeRegistrationAgreementType, managedNomineeRegistrationAgreement.nomineeRegistrationAgreementType) &&
        Objects.equals(this.nomineeRegistrationAgreementJurisdiction, managedNomineeRegistrationAgreement.nomineeRegistrationAgreementJurisdiction) &&
        Objects.equals(this.nomineeRegistrationAgreementValidFromOrToDate, managedNomineeRegistrationAgreement.nomineeRegistrationAgreementValidFromOrToDate) &&
        Objects.equals(this.nomineeRegistrationAgreementSignatoriesOrResponsibleParties, managedNomineeRegistrationAgreement.nomineeRegistrationAgreementSignatoriesOrResponsibleParties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference, legalEntityReference, nomineeRegistrationInstanceReference, nomineeRegistrationAgreementType, nomineeRegistrationAgreementJurisdiction, nomineeRegistrationAgreementValidFromOrToDate, nomineeRegistrationAgreementSignatoriesOrResponsibleParties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedNomineeRegistrationAgreement {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    legalEntityReference: ").append(toIndentedString(legalEntityReference)).append("\n");
    sb.append("    nomineeRegistrationInstanceReference: ").append(toIndentedString(nomineeRegistrationInstanceReference)).append("\n");
    sb.append("    nomineeRegistrationAgreementType: ").append(toIndentedString(nomineeRegistrationAgreementType)).append("\n");
    sb.append("    nomineeRegistrationAgreementJurisdiction: ").append(toIndentedString(nomineeRegistrationAgreementJurisdiction)).append("\n");
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

