
package soundhar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "chessserver", targetNamespace = "http://soundhar/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Chessserver {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://soundhar/", className = "soundhar.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://soundhar/", className = "soundhar.HelloResponse")
    @Action(input = "http://soundhar/chessserver/helloRequest", output = "http://soundhar/chessserver/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
