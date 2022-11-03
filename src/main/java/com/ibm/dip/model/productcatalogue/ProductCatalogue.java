package com.ibm.dip.model.productcatalogue;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductCatalogue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:47.154Z[GMT]")

public class ProductCatalogue   {
  @JsonProperty("ProductCatalogueDetails")
  private String productCatalogueDetails;

  @JsonProperty("CustomerProductsAndServicesDirectoryEntrySchedule")
  private Object customerProductsAndServicesDirectoryEntrySchedule;

  @JsonProperty("ProductCatalogueVersion")
  private String productCatalogueVersion;

  @JsonProperty("ProductCatalogueStatus")
  private String productCatalogueStatus;

  @JsonProperty("ProductCatalogueUsageLog")
  private String productCatalogueUsageLog;

  @JsonProperty("ProductCatalogueUpdateLog")
  private String productCatalogueUpdateLog;

  @JsonProperty("ProductCatalogueConfiguration")
  private String productCatalogueConfiguration;

  @JsonProperty("ProductCatalogueReference")
  private String productCatalogueReference;

  public ProductCatalogue productCatalogueDetails(String productCatalogueDetails) {
    this.productCatalogueDetails = productCatalogueDetails;
    return this;
  }

  /**
   * Get productCatalogueDetails
   * @return productCatalogueDetails
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueDetails() {
    return productCatalogueDetails;
  }

  public void setProductCatalogueDetails(String productCatalogueDetails) {
    this.productCatalogueDetails = productCatalogueDetails;
  }

  public ProductCatalogue customerProductsAndServicesDirectoryEntrySchedule(Object customerProductsAndServicesDirectoryEntrySchedule) {
    this.customerProductsAndServicesDirectoryEntrySchedule = customerProductsAndServicesDirectoryEntrySchedule;
    return this;
  }

  /**
   * Get customerProductsAndServicesDirectoryEntrySchedule
   * @return customerProductsAndServicesDirectoryEntrySchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerProductsAndServicesDirectoryEntrySchedule() {
    return customerProductsAndServicesDirectoryEntrySchedule;
  }

  public void setCustomerProductsAndServicesDirectoryEntrySchedule(Object customerProductsAndServicesDirectoryEntrySchedule) {
    this.customerProductsAndServicesDirectoryEntrySchedule = customerProductsAndServicesDirectoryEntrySchedule;
  }

  public ProductCatalogue productCatalogueVersion(String productCatalogueVersion) {
    this.productCatalogueVersion = productCatalogueVersion;
    return this;
  }

  /**
   * Get productCatalogueVersion
   * @return productCatalogueVersion
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueVersion() {
    return productCatalogueVersion;
  }

  public void setProductCatalogueVersion(String productCatalogueVersion) {
    this.productCatalogueVersion = productCatalogueVersion;
  }

  public ProductCatalogue productCatalogueStatus(String productCatalogueStatus) {
    this.productCatalogueStatus = productCatalogueStatus;
    return this;
  }

  /**
   * Get productCatalogueStatus
   * @return productCatalogueStatus
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueStatus() {
    return productCatalogueStatus;
  }

  public void setProductCatalogueStatus(String productCatalogueStatus) {
    this.productCatalogueStatus = productCatalogueStatus;
  }

  public ProductCatalogue productCatalogueUsageLog(String productCatalogueUsageLog) {
    this.productCatalogueUsageLog = productCatalogueUsageLog;
    return this;
  }

  /**
   * Get productCatalogueUsageLog
   * @return productCatalogueUsageLog
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueUsageLog() {
    return productCatalogueUsageLog;
  }

  public void setProductCatalogueUsageLog(String productCatalogueUsageLog) {
    this.productCatalogueUsageLog = productCatalogueUsageLog;
  }

  public ProductCatalogue productCatalogueUpdateLog(String productCatalogueUpdateLog) {
    this.productCatalogueUpdateLog = productCatalogueUpdateLog;
    return this;
  }

  /**
   * Get productCatalogueUpdateLog
   * @return productCatalogueUpdateLog
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueUpdateLog() {
    return productCatalogueUpdateLog;
  }

  public void setProductCatalogueUpdateLog(String productCatalogueUpdateLog) {
    this.productCatalogueUpdateLog = productCatalogueUpdateLog;
  }

  public ProductCatalogue productCatalogueConfiguration(String productCatalogueConfiguration) {
    this.productCatalogueConfiguration = productCatalogueConfiguration;
    return this;
  }

  /**
   * Get productCatalogueConfiguration
   * @return productCatalogueConfiguration
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueConfiguration() {
    return productCatalogueConfiguration;
  }

  public void setProductCatalogueConfiguration(String productCatalogueConfiguration) {
    this.productCatalogueConfiguration = productCatalogueConfiguration;
  }

  public ProductCatalogue productCatalogueReference(String productCatalogueReference) {
    this.productCatalogueReference = productCatalogueReference;
    return this;
  }

  /**
   * Get productCatalogueReference
   * @return productCatalogueReference
  */
  @ApiModelProperty(value = "")


  public String getProductCatalogueReference() {
    return productCatalogueReference;
  }

  public void setProductCatalogueReference(String productCatalogueReference) {
    this.productCatalogueReference = productCatalogueReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCatalogue productCatalogue = (ProductCatalogue) o;
    return Objects.equals(this.productCatalogueDetails, productCatalogue.productCatalogueDetails) &&
        Objects.equals(this.customerProductsAndServicesDirectoryEntrySchedule, productCatalogue.customerProductsAndServicesDirectoryEntrySchedule) &&
        Objects.equals(this.productCatalogueVersion, productCatalogue.productCatalogueVersion) &&
        Objects.equals(this.productCatalogueStatus, productCatalogue.productCatalogueStatus) &&
        Objects.equals(this.productCatalogueUsageLog, productCatalogue.productCatalogueUsageLog) &&
        Objects.equals(this.productCatalogueUpdateLog, productCatalogue.productCatalogueUpdateLog) &&
        Objects.equals(this.productCatalogueConfiguration, productCatalogue.productCatalogueConfiguration) &&
        Objects.equals(this.productCatalogueReference, productCatalogue.productCatalogueReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCatalogueDetails, customerProductsAndServicesDirectoryEntrySchedule, productCatalogueVersion, productCatalogueStatus, productCatalogueUsageLog, productCatalogueUpdateLog, productCatalogueConfiguration, productCatalogueReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCatalogue {\n");
    
    sb.append("    productCatalogueDetails: ").append(toIndentedString(productCatalogueDetails)).append("\n");
    sb.append("    customerProductsAndServicesDirectoryEntrySchedule: ").append(toIndentedString(customerProductsAndServicesDirectoryEntrySchedule)).append("\n");
    sb.append("    productCatalogueVersion: ").append(toIndentedString(productCatalogueVersion)).append("\n");
    sb.append("    productCatalogueStatus: ").append(toIndentedString(productCatalogueStatus)).append("\n");
    sb.append("    productCatalogueUsageLog: ").append(toIndentedString(productCatalogueUsageLog)).append("\n");
    sb.append("    productCatalogueUpdateLog: ").append(toIndentedString(productCatalogueUpdateLog)).append("\n");
    sb.append("    productCatalogueConfiguration: ").append(toIndentedString(productCatalogueConfiguration)).append("\n");
    sb.append("    productCatalogueReference: ").append(toIndentedString(productCatalogueReference)).append("\n");
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

