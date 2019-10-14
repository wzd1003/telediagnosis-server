
package cn.edu.service.userwebService;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "org.apache.openmeetings.webservice.UserWebService", targetNamespace = "http://webservice.openmeetings.apache.org/", wsdlLocation = "http://localhost:5080/openmeetings/services/UserService?wsdl")
public class OrgApacheOpenmeetingsWebserviceUserWebService
    extends Service
{

    private final static URL ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_EXCEPTION;
    private final static QName ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_QNAME = new QName("http://webservice.openmeetings.apache.org/", "org.apache.openmeetings.webservice.UserWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5080/openmeetings/services/UserService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_WSDL_LOCATION = url;
        ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_EXCEPTION = e;
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService() {
        super(__getWsdlLocation(), ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_QNAME);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_QNAME, features);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation) {
        super(wsdlLocation, ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_QNAME);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_QNAME, features);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrgApacheOpenmeetingsWebserviceUserWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserService")
    public UserWebService getUserService() {
        return super.getPort(new QName("http://webservice.openmeetings.apache.org/", "UserService"), UserWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserWebService
     */
    @WebEndpoint(name = "UserService")
    public UserWebService getUserService(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.openmeetings.apache.org/", "UserService"), UserWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_EXCEPTION!= null) {
            throw ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_EXCEPTION;
        }
        return ORGAPACHEOPENMEETINGSWEBSERVICEUSERWEBSERVICE_WSDL_LOCATION;
    }

}