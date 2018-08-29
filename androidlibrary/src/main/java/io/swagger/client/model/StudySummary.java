/**
 * BrAPI
 * The Breeding API (BrAPI) is a Standardized RESTful Web Service API Specification for communicating Plant Breeding Data. BrAPI allows for easy data sharing between databases and tools involved in plant breeding.  <strong>General Reference Documentation</strong> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/URL_Structure.md\">URL Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Response_Structure.md\">Response Structure</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Date_Time_Encoding.md\">Date/Time Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Location_Encoding.md\">Location Encoding</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Error_Handling.md\">Error Handling</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Search_Services.md\">Search Services</a> <a href=\"https://github.com/plantbreeding/API/blob/master/Specification/GeneralInfo/Asychronous_Processing.md\">Asynchronous Processing</a>
 *
 * OpenAPI spec version: 1.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.*;
import java.util.Date;
import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class StudySummary implements Serializable {
  
  @SerializedName("active")
  private String active = null;
  @SerializedName("additionalInfo")
  private Map<String, String> additionalInfo = null;
  @SerializedName("endDate")
  private Date endDate = null;
  @SerializedName("locationDbId")
  private String locationDbId = null;
  @SerializedName("locationName")
  private String locationName = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("programDbId")
  private String programDbId = null;
  @SerializedName("programName")
  private String programName = null;
  @SerializedName("seasons")
  private List<String> seasons = null;
  @SerializedName("startDate")
  private Date startDate = null;
  @SerializedName("studyDbId")
  private String studyDbId = null;
  @SerializedName("studyType")
  private String studyType = null;
  @SerializedName("trialDbId")
  private String trialDbId = null;
  @SerializedName("trialName")
  private String trialName = null;

  /**
   * Is this study currently active
   **/
  @ApiModelProperty(value = "Is this study currently active")
  public String getActive() {
    return active;
  }
  public void setActive(String active) {
    this.active = active;
  }

  /**
   * Additional arbitrary info
   **/
  @ApiModelProperty(value = "Additional arbitrary info")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * The date the study ends
   **/
  @ApiModelProperty(value = "The date the study ends")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   * The ID which uniquely identifies a location
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies a location")
  public String getLocationDbId() {
    return locationDbId;
  }
  public void setLocationDbId(String locationDbId) {
    this.locationDbId = locationDbId;
  }

  /**
   * The human readable name for a location
   **/
  @ApiModelProperty(value = "The human readable name for a location")
  public String getLocationName() {
    return locationName;
  }
  public void setLocationName(String locationName) {
    this.locationName = locationName;
  }

  /**
   * The humane readable name of a study
   **/
  @ApiModelProperty(value = "The humane readable name of a study")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The ID which uniquely identifies a program within the given database server
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies a program within the given database server")
  public String getProgramDbId() {
    return programDbId;
  }
  public void setProgramDbId(String programDbId) {
    this.programDbId = programDbId;
  }

  /**
   * The humane readable name of a program
   **/
  @ApiModelProperty(value = "The humane readable name of a program")
  public String getProgramName() {
    return programName;
  }
  public void setProgramName(String programName) {
    this.programName = programName;
  }

  /**
   * List of seasons over which this study was performed.
   **/
  @ApiModelProperty(value = "List of seasons over which this study was performed.")
  public List<String> getSeasons() {
    return seasons;
  }
  public void setSeasons(List<String> seasons) {
    this.seasons = seasons;
  }

  /**
   * The date this study started
   **/
  @ApiModelProperty(value = "The date this study started")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   * The ID which uniquely identifies a study within the given database server
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies a study within the given database server")
  public String getStudyDbId() {
    return studyDbId;
  }
  public void setStudyDbId(String studyDbId) {
    this.studyDbId = studyDbId;
  }

  /**
   * The type of study being performed. ex. \"Yeald Trial\", etc
   **/
  @ApiModelProperty(value = "The type of study being performed. ex. \"Yeald Trial\", etc")
  public String getStudyType() {
    return studyType;
  }
  public void setStudyType(String studyType) {
    this.studyType = studyType;
  }

  /**
   * The ID which uniquely identifies a trial
   **/
  @ApiModelProperty(value = "The ID which uniquely identifies a trial")
  public String getTrialDbId() {
    return trialDbId;
  }
  public void setTrialDbId(String trialDbId) {
    this.trialDbId = trialDbId;
  }

  /**
   * The human readable name of a trial
   **/
  @ApiModelProperty(value = "The human readable name of a trial")
  public String getTrialName() {
    return trialName;
  }
  public void setTrialName(String trialName) {
    this.trialName = trialName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudySummary studySummary = (StudySummary) o;
    return (this.active == null ? studySummary.active == null : this.active.equals(studySummary.active)) &&
        (this.additionalInfo == null ? studySummary.additionalInfo == null : this.additionalInfo.equals(studySummary.additionalInfo)) &&
        (this.endDate == null ? studySummary.endDate == null : this.endDate.equals(studySummary.endDate)) &&
        (this.locationDbId == null ? studySummary.locationDbId == null : this.locationDbId.equals(studySummary.locationDbId)) &&
        (this.locationName == null ? studySummary.locationName == null : this.locationName.equals(studySummary.locationName)) &&
        (this.name == null ? studySummary.name == null : this.name.equals(studySummary.name)) &&
        (this.programDbId == null ? studySummary.programDbId == null : this.programDbId.equals(studySummary.programDbId)) &&
        (this.programName == null ? studySummary.programName == null : this.programName.equals(studySummary.programName)) &&
        (this.seasons == null ? studySummary.seasons == null : this.seasons.equals(studySummary.seasons)) &&
        (this.startDate == null ? studySummary.startDate == null : this.startDate.equals(studySummary.startDate)) &&
        (this.studyDbId == null ? studySummary.studyDbId == null : this.studyDbId.equals(studySummary.studyDbId)) &&
        (this.studyType == null ? studySummary.studyType == null : this.studyType.equals(studySummary.studyType)) &&
        (this.trialDbId == null ? studySummary.trialDbId == null : this.trialDbId.equals(studySummary.trialDbId)) &&
        (this.trialName == null ? studySummary.trialName == null : this.trialName.equals(studySummary.trialName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.active == null ? 0: this.active.hashCode());
    result = 31 * result + (this.additionalInfo == null ? 0: this.additionalInfo.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.locationDbId == null ? 0: this.locationDbId.hashCode());
    result = 31 * result + (this.locationName == null ? 0: this.locationName.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.programDbId == null ? 0: this.programDbId.hashCode());
    result = 31 * result + (this.programName == null ? 0: this.programName.hashCode());
    result = 31 * result + (this.seasons == null ? 0: this.seasons.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.studyDbId == null ? 0: this.studyDbId.hashCode());
    result = 31 * result + (this.studyType == null ? 0: this.studyType.hashCode());
    result = 31 * result + (this.trialDbId == null ? 0: this.trialDbId.hashCode());
    result = 31 * result + (this.trialName == null ? 0: this.trialName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudySummary {\n");
    
    sb.append("  active: ").append(active).append("\n");
    sb.append("  additionalInfo: ").append(additionalInfo).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  locationDbId: ").append(locationDbId).append("\n");
    sb.append("  locationName: ").append(locationName).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  programDbId: ").append(programDbId).append("\n");
    sb.append("  programName: ").append(programName).append("\n");
    sb.append("  seasons: ").append(seasons).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  studyDbId: ").append(studyDbId).append("\n");
    sb.append("  studyType: ").append(studyType).append("\n");
    sb.append("  trialDbId: ").append(trialDbId).append("\n");
    sb.append("  trialName: ").append(trialName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}