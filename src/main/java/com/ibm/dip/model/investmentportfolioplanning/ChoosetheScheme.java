package com.ibm.dip.model.investmentportfolioplanning;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChoosetheScheme
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T05:09:48.951Z[GMT]")

public class ChoosetheScheme   {
  @JsonProperty("ChoosetheScheme")
  private String choosetheScheme;

  @JsonProperty("ChoosetheSchemeSchedule")
  private Object choosetheSchemeSchedule;

  @JsonProperty("ChoosetheSchemeVersion")
  private String choosetheSchemeVersion;

  @JsonProperty("ChoosetheSchemeStatus")
  private String choosetheSchemeStatus;

  @JsonProperty("ChoosetheSchemeUsageLog")
  private String choosetheSchemeUsageLog;

  @JsonProperty("ChoosetheSchemeUpdateLog")
  private String choosetheSchemeUpdateLog;

  @JsonProperty("ChoosetheSchemeConfiguration")
  private String choosetheSchemeConfiguration;

  @JsonProperty("ChoosetheSchemeReference")
  private String choosetheSchemeReference;

  public ChoosetheScheme choosetheScheme(String choosetheScheme) {
    this.choosetheScheme = choosetheScheme;
    return this;
  }

  /**
   * Get choosetheScheme
   * @return choosetheScheme
  */
  @ApiModelProperty(value = "")


  public String getChoosetheScheme() {
    return choosetheScheme;
  }

  public void setChoosetheScheme(String choosetheScheme) {
    this.choosetheScheme = choosetheScheme;
  }

  public ChoosetheScheme choosetheSchemeSchedule(Object choosetheSchemeSchedule) {
    this.choosetheSchemeSchedule = choosetheSchemeSchedule;
    return this;
  }

  /**
   * Get choosetheSchemeSchedule
   * @return choosetheSchemeSchedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getChoosetheSchemeSchedule() {
    return choosetheSchemeSchedule;
  }

  public void setChoosetheSchemeSchedule(Object choosetheSchemeSchedule) {
    this.choosetheSchemeSchedule = choosetheSchemeSchedule;
  }

  public ChoosetheScheme choosetheSchemeVersion(String choosetheSchemeVersion) {
    this.choosetheSchemeVersion = choosetheSchemeVersion;
    return this;
  }

  /**
   * Get choosetheSchemeVersion
   * @return choosetheSchemeVersion
  */
  @ApiModelProperty(value = "")


  public String getChoosetheSchemeVersion() {
    return choosetheSchemeVersion;
  }

  public void setChoosetheSchemeVersion(String choosetheSchemeVersion) {
    this.choosetheSchemeVersion = choosetheSchemeVersion;
  }

  public ChoosetheScheme choosetheSchemeStatus(String choosetheSchemeStatus) {
    this.choosetheSchemeStatus = choosetheSchemeStatus;
    return this;
  }

  /**
   * Get choosetheSchemeStatus
   * @return choosetheSchemeStatus
  */
  @ApiModelProperty(value = "")


  public String getChoosetheSchemeStatus() {
    return choosetheSchemeStatus;
  }

  public void setChoosetheSchemeStatus(String choosetheSchemeStatus) {
    this.choosetheSchemeStatus = choosetheSchemeStatus;
  }

  public ChoosetheScheme choosetheSchemeUsageLog(String choosetheSchemeUsageLog) {
    this.choosetheSchemeUsageLog = choosetheSchemeUsageLog;
    return this;
  }

  /**
   * Get choosetheSchemeUsageLog
   * @return choosetheSchemeUsageLog
  */
  @ApiModelProperty(value = "")


  public String getChoosetheSchemeUsageLog() {
    return choosetheSchemeUsageLog;
  }

  public void setChoosetheSchemeUsageLog(String choosetheSchemeUsageLog) {
    this.choosetheSchemeUsageLog = choosetheSchemeUsageLog;
  }

  public ChoosetheScheme choosetheSchemeUpdateLog(String choosetheSchemeUpdateLog) {
    this.choosetheSchemeUpdateLog = choosetheSchemeUpdateLog;
    return this;
  }

  /**
   * Get choosetheSchemeUpdateLog
   * @return choosetheSchemeUpdateLog
  */
  @ApiModelProperty(value = "")


  public String getChoosetheSchemeUpdateLog() {
    return choosetheSchemeUpdateLog;
  }

  public void setChoosetheSchemeUpdateLog(String choosetheSchemeUpdateLog) {
    this.choosetheSchemeUpdateLog = choosetheSchemeUpdateLog;
  }

  public ChoosetheScheme choosetheSchemeConfiguration(String choosetheSchemeConfiguration) {
    this.choosetheSchemeConfiguration = choosetheSchemeConfiguration;
    return this;
  }

  /**
   * Get choosetheSchemeConfiguration
   * @return choosetheSchemeConfiguration
  */
  @ApiModelProperty(value = "")


  public String getChoosetheSchemeConfiguration() {
    return choosetheSchemeConfiguration;
  }

  public void setChoosetheSchemeConfiguration(String choosetheSchemeConfiguration) {
    this.choosetheSchemeConfiguration = choosetheSchemeConfiguration;
  }

  public ChoosetheScheme choosetheSchemeReference(String choosetheSchemeReference) {
    this.choosetheSchemeReference = choosetheSchemeReference;
    return this;
  }

  /**
   * Get choosetheSchemeReference
   * @return choosetheSchemeReference
  */
  @ApiModelProperty(value = "")


  public String getChoosetheSchemeReference() {
    return choosetheSchemeReference;
  }

  public void setChoosetheSchemeReference(String choosetheSchemeReference) {
    this.choosetheSchemeReference = choosetheSchemeReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChoosetheScheme choosetheScheme = (ChoosetheScheme) o;
    return Objects.equals(this.choosetheScheme, choosetheScheme.choosetheScheme) &&
        Objects.equals(this.choosetheSchemeSchedule, choosetheScheme.choosetheSchemeSchedule) &&
        Objects.equals(this.choosetheSchemeVersion, choosetheScheme.choosetheSchemeVersion) &&
        Objects.equals(this.choosetheSchemeStatus, choosetheScheme.choosetheSchemeStatus) &&
        Objects.equals(this.choosetheSchemeUsageLog, choosetheScheme.choosetheSchemeUsageLog) &&
        Objects.equals(this.choosetheSchemeUpdateLog, choosetheScheme.choosetheSchemeUpdateLog) &&
        Objects.equals(this.choosetheSchemeConfiguration, choosetheScheme.choosetheSchemeConfiguration) &&
        Objects.equals(this.choosetheSchemeReference, choosetheScheme.choosetheSchemeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choosetheScheme, choosetheSchemeSchedule, choosetheSchemeVersion, choosetheSchemeStatus, choosetheSchemeUsageLog, choosetheSchemeUpdateLog, choosetheSchemeConfiguration, choosetheSchemeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoosetheScheme {\n");
    
    sb.append("    choosetheScheme: ").append(toIndentedString(choosetheScheme)).append("\n");
    sb.append("    choosetheSchemeSchedule: ").append(toIndentedString(choosetheSchemeSchedule)).append("\n");
    sb.append("    choosetheSchemeVersion: ").append(toIndentedString(choosetheSchemeVersion)).append("\n");
    sb.append("    choosetheSchemeStatus: ").append(toIndentedString(choosetheSchemeStatus)).append("\n");
    sb.append("    choosetheSchemeUsageLog: ").append(toIndentedString(choosetheSchemeUsageLog)).append("\n");
    sb.append("    choosetheSchemeUpdateLog: ").append(toIndentedString(choosetheSchemeUpdateLog)).append("\n");
    sb.append("    choosetheSchemeConfiguration: ").append(toIndentedString(choosetheSchemeConfiguration)).append("\n");
    sb.append("    choosetheSchemeReference: ").append(toIndentedString(choosetheSchemeReference)).append("\n");
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

