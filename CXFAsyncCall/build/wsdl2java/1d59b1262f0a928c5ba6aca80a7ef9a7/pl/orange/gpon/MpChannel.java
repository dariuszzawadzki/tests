package pl.orange.gpon;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-01T12:48:52.663+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://mp.channels.overlay.tp.atos.pl/", name = "MpChannel")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MpChannel {

    @WebMethod(operationName = "getInventoryData")
    public Response<pl.orange.gpon.GetInventoryDataResponse> getInventoryDataAsync(
        @WebParam(partName = "getInventoryDataRequest", name = "getInventoryDataRequest", targetNamespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/")
        GetInventoryDataRequest getInventoryDataRequest
    );

    @WebMethod(operationName = "getInventoryData")
    public Future<?> getInventoryDataAsync(
        @WebParam(partName = "getInventoryDataRequest", name = "getInventoryDataRequest", targetNamespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/")
        GetInventoryDataRequest getInventoryDataRequest,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<pl.orange.gpon.GetInventoryDataResponse> asyncHandler
    );

    @WebMethod
    @WebResult(name = "getInventoryDataResponse", targetNamespace = "http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/", partName = "getInventoryDataResponse")
    public GetInventoryDataResponse getInventoryData(
        @WebParam(partName = "getInventoryDataRequest", name = "getInventoryDataRequest", targetNamespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/")
        GetInventoryDataRequest getInventoryDataRequest
    );
}