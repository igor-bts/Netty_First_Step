
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.cse.APILk.Service1c;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-09-21T18:27:34.470+03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "SorterExchange",
                      portName = "SorterExchangeSoap",
                      targetNamespace = "http://www.cse-cargo.ru/client",
                      wsdlLocation = "http://web.cse.ru/cse82_AlexSt/ws/SorterExchange?wsdl",
                      endpointInterface = "ru.cse.APILk.Service1c.SorterExchangePortType")
                      
public class SorterExchangeSoapImpl implements SorterExchangePortType {

    private static final Logger LOG = Logger.getLogger(SorterExchangeSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#getDataPushExit(java.lang.String inParametrs, java.lang.String sendExitNumber)*
     */
    public java.lang.String getDataPushExit(java.lang.String inParametrs, javax.xml.ws.Holder<java.lang.String> sendExitNumber) { 
        LOG.info("Executing operation getDataPushExit");
        System.out.println(inParametrs);
        try {
            java.lang.String sendExitNumberValue = "";
            sendExitNumber.value = sendExitNumberValue;
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
