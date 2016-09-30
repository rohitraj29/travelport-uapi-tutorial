
package com.travelport.service.system_v32_0;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:35:37.275-06:00
 * Generated source version: 3.1.5
 * 
 */
public final class ExternalCacheAccessPortType_ExternalCacheAccessPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.travelport.com/service/system_v32_0", "ExternalCacheAccessService");

    private ExternalCacheAccessPortType_ExternalCacheAccessPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ExternalCacheAccessService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ExternalCacheAccessService ss = new ExternalCacheAccessService(wsdlURL, SERVICE_NAME);
        ExternalCacheAccessPortType port = ss.getExternalCacheAccessPort();  
        
        {
        System.out.println("Invoking service...");
        com.travelport.schema.system_v32_0.ExternalCacheAccessReq _service_parameters = new com.travelport.schema.system_v32_0.ExternalCacheAccessReq();
        try {
            com.travelport.schema.system_v32_0.ExternalCacheAccessRsp _service__return = port.service(_service_parameters);
            System.out.println("service.result=" + _service__return);

        } catch (SystemFaultMessage e) { 
            System.out.println("Expected exception: SystemFaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
