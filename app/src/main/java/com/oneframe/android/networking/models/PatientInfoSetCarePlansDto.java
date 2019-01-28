/*
 * ECare API
 * ECare Core Web API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.oneframe.android.networking.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * PatientInfoSetCarePlansDto
 */
public class PatientInfoSetCarePlansDto {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("patientInformationId")
  private Integer patientInformationId = null;

  @SerializedName("carePlansId")
  private Integer carePlansId = null;

  @SerializedName("checkedNurisngApplicationIndex")
  private String checkedNurisngApplicationIndex = null;

  @SerializedName("isInserted")
  private Boolean isInserted = null;

  public PatientInfoSetCarePlansDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PatientInfoSetCarePlansDto patientInformationId(Integer patientInformationId) {
    this.patientInformationId = patientInformationId;
    return this;
  }

   /**
   * Get patientInformationId
   * @return patientInformationId
  **/
  public Integer getPatientInformationId() {
    return patientInformationId;
  }

  public void setPatientInformationId(Integer patientInformationId) {
    this.patientInformationId = patientInformationId;
  }

  public PatientInfoSetCarePlansDto carePlansId(Integer carePlansId) {
    this.carePlansId = carePlansId;
    return this;
  }

   /**
   * Get carePlansId
   * @return carePlansId
  **/
  public Integer getCarePlansId() {
    return carePlansId;
  }

  public void setCarePlansId(Integer carePlansId) {
    this.carePlansId = carePlansId;
  }

  public PatientInfoSetCarePlansDto checkedNurisngApplicationIndex(String checkedNurisngApplicationIndex) {
    this.checkedNurisngApplicationIndex = checkedNurisngApplicationIndex;
    return this;
  }

   /**
   * Get checkedNurisngApplicationIndex
   * @return checkedNurisngApplicationIndex
  **/
  public String getCheckedNurisngApplicationIndex() {
    return checkedNurisngApplicationIndex;
  }

  public void setCheckedNurisngApplicationIndex(String checkedNurisngApplicationIndex) {
    this.checkedNurisngApplicationIndex = checkedNurisngApplicationIndex;
  }

  public PatientInfoSetCarePlansDto isInserted(Boolean isInserted) {
    this.isInserted = isInserted;
    return this;
  }

   /**
   * Get isInserted
   * @return isInserted
  **/
  public Boolean isIsInserted() {
    return isInserted;
  }

  public void setIsInserted(Boolean isInserted) {
    this.isInserted = isInserted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatientInfoSetCarePlansDto patientInfoSetCarePlansDto = (PatientInfoSetCarePlansDto) o;
    return Objects.equals(this.id, patientInfoSetCarePlansDto.id) &&
        Objects.equals(this.patientInformationId, patientInfoSetCarePlansDto.patientInformationId) &&
        Objects.equals(this.carePlansId, patientInfoSetCarePlansDto.carePlansId) &&
        Objects.equals(this.checkedNurisngApplicationIndex, patientInfoSetCarePlansDto.checkedNurisngApplicationIndex) &&
        Objects.equals(this.isInserted, patientInfoSetCarePlansDto.isInserted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, patientInformationId, carePlansId, checkedNurisngApplicationIndex, isInserted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatientInfoSetCarePlansDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    patientInformationId: ").append(toIndentedString(patientInformationId)).append("\n");
    sb.append("    carePlansId: ").append(toIndentedString(carePlansId)).append("\n");
    sb.append("    checkedNurisngApplicationIndex: ").append(toIndentedString(checkedNurisngApplicationIndex)).append("\n");
    sb.append("    isInserted: ").append(toIndentedString(isInserted)).append("\n");
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
