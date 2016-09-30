package com.travelport.service.system_v32_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:35:37.425-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/system_v32_0", name = "SystemPingPortType")
@XmlSeeAlso({com.travelport.schema.system_v32_0.ObjectFactory.class, com.travelport.schema.common_v32_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SystemPingPortType {

    @WebResult(name = "PingRsp", targetNamespace = "http://www.travelport.com/schema/system_v32_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/SystemService")
    public com.travelport.schema.system_v32_0.PingRsp service(
        @WebParam(partName = "parameters", name = "PingReq", targetNamespace = "http://www.travelport.com/schema/system_v32_0")
        com.travelport.schema.system_v32_0.PingReq parameters
    ) throws SystemFaultMessage;
}
