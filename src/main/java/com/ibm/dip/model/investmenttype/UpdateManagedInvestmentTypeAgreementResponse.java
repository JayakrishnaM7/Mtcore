package com.ibm.dip.model.investmenttype;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.investmenttype.EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateManagedInvestmentTypeAgreementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:51.356Z[GMT]")

public class UpdateManagedInvestmentTypeAgreementResponse   {
  @JsonProperty("ManagedInvestmentTypeAgreement")
  private EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement managedInvestmentTypeAgreement;

  public UpdateManagedInvestmentTypeAgreementResponse managedInvestmentTypeAgreement(EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement managedInvestmentTypeAgreement) {
    this.managedInvestmentTypeAgreement = managedInvestmentTypeAgreement;
    return this;
  }

  /**
   * Get managedInvestmentTypeAgreement
   * @return managedInvestmentTypeAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement getManagedInvestmentTypeAgreement() {
    return managedInvestmentTypeAgreement;
  }

  public void setManagedInvestmentTypeAgreement(EvaluateManagedInvestmentTypeAgreementRequestManagedInvestmentTypeAgreement managedInvestmentTypeAgreement) {
    this.managedInvestmentTypeAgreement = managedInvestmentTypeAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateManagedInvestmentTypeAgreementResponse updateManagedInvestmentTypeAgreementResponse = (UpdateManagedInvestmentTypeAgreementResponse) o;
    return Objects.equals(this.managedInvestmentTypeAgreement, updateManagedInvestmentTypeAgreementResponse.managedInvestmentTypeAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedInvestmentTypeAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateManagedInvestmentTypeAgreementResponse {\n");
    
    sb.append("    managedInvestmentTypeAgreement: ").append(toIndentedString(managedInvestmentTypeAgreement)).append("\n");
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

