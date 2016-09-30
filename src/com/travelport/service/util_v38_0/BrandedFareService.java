package com.travelport.service.util_v38_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-09-13T11:39:24.571-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "BrandedFareService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl",
                  targetNamespace = "http://www.travelport.com/service/util_v38_0") 
public class BrandedFareService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/util_v38_0", "BrandedFareService");
    public final static QName BrandedFareAdminPort = new QName("http://www.travelport.com/service/util_v38_0", "BrandedFareAdminPort");
    public final static QName BrandedFareSearchPort = new QName("http://www.travelport.com/service/util_v38_0", "BrandedFareSearchPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BrandedFareService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v38/Wsdl/util_v38_0/Util.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BrandedFareService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BrandedFareService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BrandedFareService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public BrandedFareService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BrandedFareService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BrandedFareService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns BrandedFareAdminPortType
     */
    @WebEndpoint(name = "BrandedFareAdminPort")
    public BrandedFareAdminPortType getBrandedFareAdminPort() {
        return super.getPort(BrandedFareAdminPort, BrandedFareAdminPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BrandedFareAdminPortType
     */
    @WebEndpoint(name = "BrandedFareAdminPort")
    public BrandedFareAdminPortType getBrandedFareAdminPort(WebServiceFeature... features) {
        return super.getPort(BrandedFareAdminPort, BrandedFareAdminPortType.class, features);
    }


    /**
     *
     * @return
     *     returns BrandedFareSearchPortType
     */
    @WebEndpoint(name = "BrandedFareSearchPort")
    public BrandedFareSearchPortType getBrandedFareSearchPort() {
        return super.getPort(BrandedFareSearchPort, BrandedFareSearchPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BrandedFareSearchPortType
     */
    @WebEndpoint(name = "BrandedFareSearchPort")
    public BrandedFareSearchPortType getBrandedFareSearchPort(WebServiceFeature... features) {
        return super.getPort(BrandedFareSearchPort, BrandedFareSearchPortType.class, features);
    }

}
