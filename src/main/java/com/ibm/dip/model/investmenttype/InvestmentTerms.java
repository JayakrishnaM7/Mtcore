package com.ibm.dip.model.investmenttype;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InvestmentTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:51.356Z[GMT]")

public class InvestmentTerms   {
  @JsonProperty("InvestmentTypeAgreementTermType")
  private String investmentTypeAgreementTermType;

  @JsonProperty("InvestmentTypeAgreementTermDescription")
  private String investmentTypeAgreementTermDescription;

  @JsonProperty("InvestmentTypeAgreementTermConstraints")
  private String investmentTypeAgreementTermConstraints;

  public InvestmentTerms investmentTypeAgreementTermType(String investmentTypeAgreementTermType) {
    this.investmentTypeAgreementTermType = investmentTypeAgreementTermType;
    return this;
  }

  /**
   * Get investmentTypeAgreementTermType
   * @return investmentTypeAgreementTermType
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementTermType() {
    return investmentTypeAgreementTermType;
  }

  public void setInvestmentTypeAgreementTermType(String investmentTypeAgreementTermType) {
    this.investmentTypeAgreementTermType = investmentTypeAgreementTermType;
  }

  public InvestmentTerms investmentTypeAgreementTermDescription(String investmentTypeAgreementTermDescription) {
    this.investmentTypeAgreementTermDescription = investmentTypeAgreementTermDescription;
    return this;
  }

  /**
   * Get investmentTypeAgreementTermDescription
   * @return investmentTypeAgreementTermDescription
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementTermDescription() {
    return investmentTypeAgreementTermDescription;
  }

  public void setInvestmentTypeAgreementTermDescription(String investmentTypeAgreementTermDescription) {
    this.investmentTypeAgreementTermDescription = investmentTypeAgreementTermDescription;
  }

  public InvestmentTerms investmentTypeAgreementTermConstraints(String investmentTypeAgreementTermConstraints) {
    this.investmentTypeAgreementTermConstraints = investmentTypeAgreementTermConstraints;
    return this;
  }

  /**
   * Get investmentTypeAgreementTermConstraints
   * @return investmentTypeAgreementTermConstraints
  */
  @ApiModelProperty(value = "")


  public String getInvestmentTypeAgreementTermConstraints() {
    return investmentTypeAgreementTermConstraints;
  }

  public void setInvestmentTypeAgreementTermConstraints(String investmentTypeAgreementTermConstraints) {
    this.investmentTypeAgreementTermConstraints = investmentTypeAgreementTermConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentTerms investmentTerms = (InvestmentTerms) o;
    return Objects.equals(this.investmentTypeAgreementTermType, investmentTerms.investmentTypeAgreementTermType) &&
        Objects.equals(this.investmentTypeAgreementTermDescription, investmentTerms.investmentTypeAgreementTermDescription) &&
        Objects.equals(this.investmentTypeAgreementTermConstraints, investmentTerms.investmentTypeAgreementTermConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentTypeAgreementTermType, investmentTypeAgreementTermDescription, investmentTypeAgreementTermConstraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentTerms {\n");
    
    sb.append("    investmentTypeAgreementTermType: ").append(toIndentedString(investmentTypeAgreementTermType)).append("\n");
    sb.append("    investmentTypeAgreementTermDescription: ").append(toIndentedString(investmentTypeAgreementTermDescription)).append("\n");
    sb.append("    investmentTypeAgreementTermConstraints: ").append(toIndentedString(investmentTypeAgreementTermConstraints)).append("\n");
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

