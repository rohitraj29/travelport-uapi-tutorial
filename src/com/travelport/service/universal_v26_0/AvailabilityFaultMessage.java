
package com.travelport.service.universal_v26_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T11:02:25.214-06:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "AvailabilityErrorInfo", targetNamespace = "http://www.travelport.com/schema/air_v26_0")
public class AvailabilityFaultMessage extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.travelport.schema.air_v26_0.AvailabilityErrorInfo availabilityErrorInfo;

    public AvailabilityFaultMessage() {
        super();
    }
    
    public AvailabilityFaultMessage(String message) {
        super(message);
    }
    
    public AvailabilityFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public AvailabilityFaultMessage(String message, com.travelport.schema.air_v26_0.AvailabilityErrorInfo availabilityErrorInfo) {
        super(message);
        this.availabilityErrorInfo = availabilityErrorInfo;
    }

    public AvailabilityFaultMessage(String message, com.travelport.schema.air_v26_0.AvailabilityErrorInfo availabilityErrorInfo, Throwable cause) {
        super(message, cause);
        this.availabilityErrorInfo = availabilityErrorInfo;
    }

    public com.travelport.schema.air_v26_0.AvailabilityErrorInfo getFaultInfo() {
        return this.availabilityErrorInfo;
    }
}