package com.ibm.dip.model.notificationservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.notificationservice.EvaluateManagedNotificationServiceRequestManagedNotificationService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateManagedNotificationServiceRequestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:58.850Z[GMT]")

public class EvaluateManagedNotificationServiceRequestResponse   {
  @JsonProperty("ManagedInvestmentPortfolioAgreement")
  private EvaluateManagedNotificationServiceRequestManagedNotificationService managedInvestmentPortfolioAgreement;

  public EvaluateManagedNotificationServiceRequestResponse managedInvestmentPortfolioAgreement(EvaluateManagedNotificationServiceRequestManagedNotificationService managedInvestmentPortfolioAgreement) {
    this.managedInvestmentPortfolioAgreement = managedInvestmentPortfolioAgreement;
    return this;
  }

  /**
   * Get managedInvestmentPortfolioAgreement
   * @return managedInvestmentPortfolioAgreement
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluateManagedNotificationServiceRequestManagedNotificationService getManagedInvestmentPortfolioAgreement() {
    return managedInvestmentPortfolioAgreement;
  }

  public void setManagedInvestmentPortfolioAgreement(EvaluateManagedNotificationServiceRequestManagedNotificationService managedInvestmentPortfolioAgreement) {
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
    EvaluateManagedNotificationServiceRequestResponse evaluateManagedNotificationServiceRequestResponse = (EvaluateManagedNotificationServiceRequestResponse) o;
    return Objects.equals(this.managedInvestmentPortfolioAgreement, evaluateManagedNotificationServiceRequestResponse.managedInvestmentPortfolioAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedInvestmentPortfolioAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateManagedNotificationServiceRequestResponse {\n");
    
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

