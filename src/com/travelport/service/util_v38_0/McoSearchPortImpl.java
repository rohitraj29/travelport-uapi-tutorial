
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.util_v38_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:39:24.341-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "McoService",
                      portName = "McoSearchPort",
                      targetNamespace = "http://www.travelport.com/service/util_v38_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl",
                      endpointInterface = "com.travelport.service.util_v38_0.McoSearchPortType")
                      
public class McoSearchPortImpl implements McoSearchPortType {

    private static final Logger LOG = Logger.getLogger(McoSearchPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.util_v38_0.McoSearchPortType#service(com.travelport.schema.util_v38_0.McoSearchReq  parameters )*
     */
    public com.travelport.schema.util_v38_0.McoSearchRsp service(com.travelport.schema.util_v38_0.McoSearchReq parameters) throws UtilFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.util_v38_0.McoSearchRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new UtilFaultMessage("UtilFaultMessage...");
    }

}
