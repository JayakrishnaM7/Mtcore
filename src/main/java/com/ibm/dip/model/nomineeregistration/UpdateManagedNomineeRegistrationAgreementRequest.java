package com.ibm.dip.model.nomineeregistration;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.nomineeregistration.EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateManagedNomineeRegistrationAgreementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:53.958Z[GMT]")

public class UpdateManagedNomineeRegistrationAgreementRequest   {
  @JsonProperty("ManagedNomineeRegistrationAgreement")
  private EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement managedNomineeRegistrationAgreement;

  public UpdateManagedNomineeRegistrationAgreementRequest managedNomineeRegistrationAgreement(EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement managedNomineeRegistrationAgreement) {
    this.managedNomineeRegistrationAgreement = managedNomineeRegistrationAgreement;
    return this;
  }

  /**
   * Get managedNomineeRegistrationAgreement
   * @return managedNomineeRegistrationAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement getManagedNomineeRegistrationAgreement() {
    return managedNomineeRegistrationAgreement;
  }

  public void setManagedNomineeRegistrationAgreement(EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement managedNomineeRegistrationAgreement) {
    this.managedNomineeRegistrationAgreement = managedNomineeRegistrationAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateManagedNomineeRegistrationAgreementRequest updateManagedNomineeRegistrationAgreementRequest = (UpdateManagedNomineeRegistrationAgreementRequest) o;
    return Objects.equals(this.managedNomineeRegistrationAgreement, updateManagedNomineeRegistrationAgreementRequest.managedNomineeRegistrationAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedNomineeRegistrationAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateManagedNomineeRegistrationAgreementRequest {\n");
    
    sb.append("    managedNomineeRegistrationAgreement: ").append(toIndentedString(managedNomineeRegistrationAgreement)).append("\n");
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

