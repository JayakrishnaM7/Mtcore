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
 * EvaluateManagedNomineeRegistrationAgreementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:53.958Z[GMT]")

public class EvaluateManagedNomineeRegistrationAgreementRequest   {
  @JsonProperty("ManagedInvestmentPortfolioAgreement")
  private EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement managedInvestmentPortfolioAgreement;

  public EvaluateManagedNomineeRegistrationAgreementRequest managedInvestmentPortfolioAgreement(EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement managedInvestmentPortfolioAgreement) {
    this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    return this;
  }

  /**
   * Get managedInvestmentPortfolioAgreement
   * @return managedInvestmentPortfolioAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement getManagedInvestmentPortfolioAgreement() {
    return managedInvestmentPortfolioAgreement;
  }

  public void setManagedInvestmentPortfolioAgreement(EvaluateManagedNomineeRegistrationAgreementRequestManagedNomineeRegistrationAgreement managedInvestmentPortfolioAgreement) {
    this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateManagedNomineeRegistrationAgreementRequest evaluateManagedNomineeRegistrationAgreementRequest = (EvaluateManagedNomineeRegistrationAgreementRequest) o;
    return Objects.equals(this.managedInvestmentPortfolioAgreement, evaluateManagedNomineeRegistrationAgreementRequest.managedInvestmentPortfolioAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedInvestmentPortfolioAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateManagedNomineeRegistrationAgreementRequest {\n");
    
    sb.append("    managedInvestmentPortfolioAgreement: ").append(toIndentedString(managedInvestmentPortfolioAgreement)).append("\n");
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

