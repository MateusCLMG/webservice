
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package br.ufrpe.dc.soa;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-04-01T18:01:20.090-03:00
 * Generated source version: 3.5.1
 *
 */
public class Calculadora_PortTypeClient {

    public static void main(String[] args) throws Exception {
        QName serviceName = new QName("http://soa.dc.ufrpe.br/", "CalculadoraService");
        QName portName = new QName("http://soa.dc.ufrpe.br/", "CalculadoraPort");

        Service service = Service.create(serviceName);
        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING,
                        "http://localhost:9090/CalculadoraPort");
        br.ufrpe.dc.soa.Calculadora_PortType client = service.getPort(portName,  br.ufrpe.dc.soa.Calculadora_PortType.class);

        float total = client.somar(5, 7);
        
        
        
        System.out.println("A soma eh: " + total);
        
        // Insert code to invoke methods on the client here
    }

}