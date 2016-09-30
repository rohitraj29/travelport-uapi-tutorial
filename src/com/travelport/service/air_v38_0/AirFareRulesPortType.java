package com.travelport.service.air_v38_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:29:56.824-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/air_v38_0", name = "AirFareRulesPortType")
@XmlSeeAlso({com.travelport.schema.common_v38_0.ObjectFactory.class, com.travelport.schema.rail_v38_0.ObjectFactory.class, com.travelport.schema.air_v38_0.ObjectFactory.class, com.travelport.soa.common.security.sessioncontext_v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirFareRulesPortType {

    @WebResult(name = "AirFareRulesRsp", targetNamespace = "http://www.travelport.com/schema/air_v38_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    public com.travelport.schema.air_v38_0.AirFareRulesRsp service(
        @WebParam(partName = "parameters", name = "AirFareRulesReq", targetNamespace = "http://www.travelport.com/schema/air_v38_0")
        com.travelport.schema.air_v38_0.AirFareRulesReq parameters,
        @WebParam(partName = "sessionContext", name = "SessionContext", targetNamespace = "http://www.travelport.com/soa/common/security/SessionContext_v1", header = true)
        com.travelport.soa.common.security.sessioncontext_v1.SessionContext sessionContext
    ) throws AirFaultMessage;
}
