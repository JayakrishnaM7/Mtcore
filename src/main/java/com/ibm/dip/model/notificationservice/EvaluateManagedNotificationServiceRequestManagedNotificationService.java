package com.ibm.dip.model.notificationservice;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluateManagedNotificationServiceRequestManagedNotificationService
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:58.850Z[GMT]")

public class EvaluateManagedNotificationServiceRequestManagedNotificationService   {
  @JsonProperty("CustomerReference")
  private Object customerReference;

  public EvaluateManagedNotificationServiceRequestManagedNotificationService customerReference(Object customerReference) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluateManagedNotificationServiceRequestManagedNotificationService evaluateManagedNotificationServiceRequestManagedNotificationService = (EvaluateManagedNotificationServiceRequestManagedNotificationService) o;
    return Objects.equals(this.customerReference, evaluateManagedNotificationServiceRequestManagedNotificationService.customerReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluateManagedNotificationServiceRequestManagedNotificationService {\n");
    
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
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

