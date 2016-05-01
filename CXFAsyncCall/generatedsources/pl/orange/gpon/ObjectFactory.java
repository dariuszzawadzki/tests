
package pl.orange.gpon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.orange.gpon package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInventoryDataResponse_QNAME = new QName("http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/", "getInventoryDataResponse");
    private final static QName _GetInventoryDataRequest_QNAME = new QName("http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/", "getInventoryDataRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.orange.gpon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInventoryDataResponse }
     * 
     */
    public GetInventoryDataResponse createGetInventoryDataResponse() {
        return new GetInventoryDataResponse();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link GetInventoryDataCommon }
     * 
     */
    public GetInventoryDataCommon createGetInventoryDataCommon() {
        return new GetInventoryDataCommon();
    }

    /**
     * Create an instance of {@link AdditionalDataList }
     * 
     */
    public AdditionalDataList createAdditionalDataList() {
        return new AdditionalDataList();
    }

    /**
     * Create an instance of {@link ServiceOptionsData }
     * 
     */
    public ServiceOptionsData createServiceOptionsData() {
        return new ServiceOptionsData();
    }

    /**
     * Create an instance of {@link AlternativeServiceOptions }
     * 
     */
    public AlternativeServiceOptions createAlternativeServiceOptions() {
        return new AlternativeServiceOptions();
    }

    /**
     * Create an instance of {@link CfsService }
     * 
     */
    public CfsService createCfsService() {
        return new CfsService();
    }

    /**
     * Create an instance of {@link RfsService }
     * 
     */
    public RfsService createRfsService() {
        return new RfsService();
    }

    /**
     * Create an instance of {@link RfsPortDSL }
     * 
     */
    public RfsPortDSL createRfsPortDSL() {
        return new RfsPortDSL();
    }

    /**
     * Create an instance of {@link UniPort }
     * 
     */
    public UniPort createUniPort() {
        return new UniPort();
    }

    /**
     * Create an instance of {@link ReferenceBitrate }
     * 
     */
    public ReferenceBitrate createReferenceBitrate() {
        return new ReferenceBitrate();
    }

    /**
     * Create an instance of {@link CrossAndBridgeConnect }
     * 
     */
    public CrossAndBridgeConnect createCrossAndBridgeConnect() {
        return new CrossAndBridgeConnect();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link LineRun }
     * 
     */
    public LineRun createLineRun() {
        return new LineRun();
    }

    /**
     * Create an instance of {@link RfsPortVoice }
     * 
     */
    public RfsPortVoice createRfsPortVoice() {
        return new RfsPortVoice();
    }

    /**
     * Create an instance of {@link LinePassport }
     * 
     */
    public LinePassport createLinePassport() {
        return new LinePassport();
    }

    /**
     * Create an instance of {@link Port }
     * 
     */
    public Port createPort() {
        return new Port();
    }

    /**
     * Create an instance of {@link DambackData }
     * 
     */
    public DambackData createDambackData() {
        return new DambackData();
    }

    /**
     * Create an instance of {@link DambackRouter }
     * 
     */
    public DambackRouter createDambackRouter() {
        return new DambackRouter();
    }

    /**
     * Create an instance of {@link VasData }
     * 
     */
    public VasData createVasData() {
        return new VasData();
    }

    /**
     * Create an instance of {@link VasNumberList }
     * 
     */
    public VasNumberList createVasNumberList() {
        return new VasNumberList();
    }

    /**
     * Create an instance of {@link VasNumber }
     * 
     */
    public VasNumber createVasNumber() {
        return new VasNumber();
    }

    /**
     * Create an instance of {@link VasNumberListAttributes }
     * 
     */
    public VasNumberListAttributes createVasNumberListAttributes() {
        return new VasNumberListAttributes();
    }

    /**
     * Create an instance of {@link VasNumberListAttribute }
     * 
     */
    public VasNumberListAttribute createVasNumberListAttribute() {
        return new VasNumberListAttribute();
    }

    /**
     * Create an instance of {@link VasList }
     * 
     */
    public VasList createVasList() {
        return new VasList();
    }

    /**
     * Create an instance of {@link Vas }
     * 
     */
    public Vas createVas() {
        return new Vas();
    }

    /**
     * Create an instance of {@link VasAttributes }
     * 
     */
    public VasAttributes createVasAttributes() {
        return new VasAttributes();
    }

    /**
     * Create an instance of {@link VasAttribute }
     * 
     */
    public VasAttribute createVasAttribute() {
        return new VasAttribute();
    }

    /**
     * Create an instance of {@link MSOptionData }
     * 
     */
    public MSOptionData createMSOptionData() {
        return new MSOptionData();
    }

    /**
     * Create an instance of {@link AdditionalService }
     * 
     */
    public AdditionalService createAdditionalService() {
        return new AdditionalService();
    }

    /**
     * Create an instance of {@link RfsPortDSL4ResourceData }
     * 
     */
    public RfsPortDSL4ResourceData createRfsPortDSL4ResourceData() {
        return new RfsPortDSL4ResourceData();
    }

    /**
     * Create an instance of {@link RfsPortVoice4ResourceData }
     * 
     */
    public RfsPortVoice4ResourceData createRfsPortVoice4ResourceData() {
        return new RfsPortVoice4ResourceData();
    }

    /**
     * Create an instance of {@link CfsService4ResourceData }
     * 
     */
    public CfsService4ResourceData createCfsService4ResourceData() {
        return new CfsService4ResourceData();
    }

    /**
     * Create an instance of {@link ResourceData }
     * 
     */
    public ResourceData createResourceData() {
        return new ResourceData();
    }

    /**
     * Create an instance of {@link GetInventoryDataRequest }
     * 
     */
    public GetInventoryDataRequest createGetInventoryDataRequest() {
        return new GetInventoryDataRequest();
    }

    /**
     * Create an instance of {@link InvokerData }
     * 
     */
    public InvokerData createInvokerData() {
        return new InvokerData();
    }

    /**
     * Create an instance of {@link GetInventoryDataCommon2 }
     * 
     */
    public GetInventoryDataCommon2 createGetInventoryDataCommon2() {
        return new GetInventoryDataCommon2();
    }

    /**
     * Create an instance of {@link AdditionalDataList2 }
     * 
     */
    public AdditionalDataList2 createAdditionalDataList2() {
        return new AdditionalDataList2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inventorydata.rsp.dto.mp.channels.overlay.tp.atos.pl/", name = "getInventoryDataResponse")
    public JAXBElement<GetInventoryDataResponse> createGetInventoryDataResponse(GetInventoryDataResponse value) {
        return new JAXBElement<GetInventoryDataResponse>(_GetInventoryDataResponse_QNAME, GetInventoryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInventoryDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inventorydata.req.dto.mp.channels.overlay.tp.atos.pl/", name = "getInventoryDataRequest")
    public JAXBElement<GetInventoryDataRequest> createGetInventoryDataRequest(GetInventoryDataRequest value) {
        return new JAXBElement<GetInventoryDataRequest>(_GetInventoryDataRequest_QNAME, GetInventoryDataRequest.class, null, value);
    }

}
