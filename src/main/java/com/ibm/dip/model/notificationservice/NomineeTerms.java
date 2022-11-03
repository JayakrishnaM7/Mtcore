package com.ibm.dip.model.notificationservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NomineeTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:58.850Z[GMT]")

public class NomineeTerms   {
  @JsonProperty("NomineeRegistrationAgreementTermType")
  private String nomineeRegistrationAgreementTermType;

  @JsonProperty("NomineeRegistrationAgreementTermDescription")
  private String nomineeRegistrationAgreementTermDescription;

  @JsonProperty("NomineeRegistrationAgreementTermConstraints")
  private String nomineeRegistrationAgreementTermConstraints;

  public NomineeTerms nomineeRegistrationAgreementTermType(String nomineeRegistrationAgreementTermType) {
    this.nomineeRegistrationAgreementTermType = nomineeRegistrationAgreementTermType;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementTermType
   * @return nomineeRegistrationAgreementTermType
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementTermType() {
    return nomineeRegistrationAgreementTermType;
  }

  public void setNomineeRegistrationAgreementTermType(String nomineeRegistrationAgreementTermType) {
    this.nomineeRegistrationAgreementTermType = nomineeRegistrationAgreementTermType;
  }

  public NomineeTerms nomineeRegistrationAgreementTermDescription(String nomineeRegistrationAgreementTermDescription) {
    this.nomineeRegistrationAgreementTermDescription = nomineeRegistrationAgreementTermDescription;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementTermDescription
   * @return nomineeRegistrationAgreementTermDescription
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementTermDescription() {
    return nomineeRegistrationAgreementTermDescription;
  }

  public void setNomineeRegistrationAgreementTermDescription(String nomineeRegistrationAgreementTermDescription) {
    this.nomineeRegistrationAgreementTermDescription = nomineeRegistrationAgreementTermDescription;
  }

  public NomineeTerms nomineeRegistrationAgreementTermConstraints(String nomineeRegistrationAgreementTermConstraints) {
    this.nomineeRegistrationAgreementTermConstraints = nomineeRegistrationAgreementTermConstraints;
    return this;
  }

  /**
   * Get nomineeRegistrationAgreementTermConstraints
   * @return nomineeRegistrationAgreementTermConstraints
  */
  @ApiModelProperty(value = "")


  public String getNomineeRegistrationAgreementTermConstraints() {
    return nomineeRegistrationAgreementTermConstraints;
  }

  public void setNomineeRegistrationAgreementTermConstraints(String nomineeRegistrationAgreementTermConstraints) {
    this.nomineeRegistrationAgreementTermConstraints = nomineeRegistrationAgreementTermConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NomineeTerms nomineeTerms = (NomineeTerms) o;
    return Objects.equals(this.nomineeRegistrationAgreementTermType, nomineeTerms.nomineeRegistrationAgreementTermType) &&
        Objects.equals(this.nomineeRegistrationAgreementTermDescription, nomineeTerms.nomineeRegistrationAgreementTermDescription) &&
        Objects.equals(this.nomineeRegistrationAgreementTermConstraints, nomineeTerms.nomineeRegistrationAgreementTermConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomineeRegistrationAgreementTermType, nomineeRegistrationAgreementTermDescription, nomineeRegistrationAgreementTermConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NomineeTerms {\n");
    
    sb.append("    nomineeRegistrationAgreementTermType: ").append(toIndentedString(nomineeRegistrationAgreementTermType)).append("\n");
    sb.append("    nomineeRegistrationAgreementTermDescription: ").append(toIndentedString(nomineeRegistrationAgreementTermDescription)).append("\n");
    sb.append("    nomineeRegistrationAgreementTermConstraints: ").append(toIndentedString(nomineeRegistrationAgreementTermConstraints)).append("\n");
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

