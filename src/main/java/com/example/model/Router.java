package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Router {

	
	@Id
	private String RPD;
	
	//@Column(name = "MAC")
	private String MAC;
	//@Column(name = "Segmentation")
	private String Segmentation;
	//@Column(name = "ServiceDefinition")
	private String ServiceDefinition;
	//@Column(name = "PrincipalCore")
	private String PrincipalCore;
	//@Column(name = "PrincipalCoreInterface")
	private String PrincipalCoreInterface;
	//@Column(name = "DSPort")
      private String	DSPort;
	//@Column(name = "USPort")
      private String USPort;
	//@Column(name = "EnhancedControllerAlignment")
      private String EnhancedControllerAlignment;
	//@Column(name = "Shelf")
      private String Shelf;
	//@Column(name = "DSDataServiceGroup")
      private String DSDataServiceGroup;
    //@Column(name = "USDataServiceGroup")
      private String USDataServiceGroup;
    //@Column(name = "DisableNetworkDelay")
      private String DisableNetworkDelay;
    //@Column(name = "Latitude")
      private String Latitude;
    //@Column(name = "Longitude")
      private String Longitude;
    //@Column(name = "Status")
     private String Status;
    //@Column(name = "Description")
     private String Description;
     public Router() {
    	 super();
     }
	public String getRPD() {
		return RPD;
	}
	public void setRPD(String rPD) {
		RPD = rPD;
	}
	public String getMAC() {
		return MAC;
	}
	public void setMAC(String mAC) {
		MAC = mAC;
	}
	public String getSegmentation() {
		return Segmentation;
	}
	public void setSegmentation(String segmentation) {
		Segmentation = segmentation;
	}
	public String getServiceDefinition() {
		return ServiceDefinition;
	}
	public void setServiceDefinition(String serviceDefinition) {
		ServiceDefinition = serviceDefinition;
	}
	public String getPrincipalCore() {
		return PrincipalCore;
	}
	public void setPrincipalCore(String principalCore) {
		PrincipalCore = principalCore;
	}
	public String getPrincipalCoreInterface() {
		return PrincipalCoreInterface;
	}
	public void setPrincipalCoreInterface(String principalCoreInterface) {
		PrincipalCoreInterface = principalCoreInterface;
	}
	public String getDSPort() {
		return DSPort;
	}
	public void setDSPort(String dSPort) {
		DSPort = dSPort;
	}
	public String getUSPort() {
		return USPort;
	}
	public void setUSPort(String uSPort) {
		USPort = uSPort;
	}
	public String getEnhancedControllerAlignment() {
		return EnhancedControllerAlignment;
	}
	public void setEnhancedControllerAlignment(String enhancedControllerAlignment) {
		EnhancedControllerAlignment = enhancedControllerAlignment;
	}
	public String getShelf() {
		return Shelf;
	}
	public void setShelf(String shelf) {
		Shelf = shelf;
	}
	public String getDSDataServiceGroup() {
		return DSDataServiceGroup;
	}
	public void setDSDataServiceGroup(String dSDataServiceGroup) {
		DSDataServiceGroup = dSDataServiceGroup;
	}
	public String getUSDataServiceGroup() {
		return USDataServiceGroup;
	}
	public void setUSDataServiceGroup(String uSDataServiceGroup) {
		USDataServiceGroup = uSDataServiceGroup;
	}
	public String getDisableNetworkDelay() {
		return DisableNetworkDelay;
	}
	public void setDisableNetworkDelay(String disableNetworkDelay) {
		DisableNetworkDelay = disableNetworkDelay;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}









}




