
package com.bbva.czic.dto.non_canonical_model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.czic.dto.non_canonical_model package. 
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

    private final static QName _ReferenceDetail_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "referenceDetail");
    private final static QName _Operation_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "operation");
    private final static QName _OperationSenderContract_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "operationSenderContract");
    private final static QName _Function_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "function");
    private final static QName _OperationComment_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "operationComment");
    private final static QName _NotificationSchedule_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "notificationSchedule");
    private final static QName _ContractSender_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "contractSender");
    private final static QName _Notification_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "notification");
    private final static QName _DistributionChannelTemplate_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "distributionChannelTemplate");
    private final static QName _OperationReceiverAgreement_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "operationReceiverAgreement");
    private final static QName _ExternalReference_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "externalReference");
    private final static QName _Message_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "message");
    private final static QName _NotificationTriggerImpl_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "notificationTriggerImpl");
    private final static QName _Offer_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "offer");
    private final static QName _Agreement_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "agreement");
    private final static QName _Executor_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "executor");
    private final static QName _SchemeAgreement_QNAME = new QName("urn:com:bbva:czic:dto:non_canonical_model", "SchemeAgreement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.czic.dto.non_canonical_model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SchemeAgreement }
     * 
     */
    public SchemeAgreement createSchemeAgreement() {
        return new SchemeAgreement();
    }

    /**
     * Create an instance of {@link ExternalReference }
     * 
     */
    public ExternalReference createExternalReference() {
        return new ExternalReference();
    }

    /**
     * Create an instance of {@link Executor }
     * 
     */
    public Executor createExecutor() {
        return new Executor();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link NotificationSchedule }
     * 
     */
    public NotificationSchedule createNotificationSchedule() {
        return new NotificationSchedule();
    }

    /**
     * Create an instance of {@link ContractSender }
     * 
     */
    public ContractSender createContractSender() {
        return new ContractSender();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link OperationReceiverAgreement }
     * 
     */
    public OperationReceiverAgreement createOperationReceiverAgreement() {
        return new OperationReceiverAgreement();
    }

    /**
     * Create an instance of {@link OperationComment }
     * 
     */
    public OperationComment createOperationComment() {
        return new OperationComment();
    }

    /**
     * Create an instance of {@link NotificationTriggerImpl }
     * 
     */
    public NotificationTriggerImpl createNotificationTriggerImpl() {
        return new NotificationTriggerImpl();
    }

    /**
     * Create an instance of {@link OperationSenderContract }
     * 
     */
    public OperationSenderContract createOperationSenderContract() {
        return new OperationSenderContract();
    }

    /**
     * Create an instance of {@link Function }
     * 
     */
    public Function createFunction() {
        return new Function();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ReferenceDetail }
     * 
     */
    public ReferenceDetail createReferenceDetail() {
        return new ReferenceDetail();
    }

    /**
     * Create an instance of {@link DistributionChannelTemplate }
     * 
     */
    public DistributionChannelTemplate createDistributionChannelTemplate() {
        return new DistributionChannelTemplate();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link OfferPaymentSimulator }
     * 
     */
    public OfferPaymentSimulator createOfferPaymentSimulator() {
        return new OfferPaymentSimulator();
    }

    /**
     * Create an instance of {@link OperationReceiverContract }
     * 
     */
    public OperationReceiverContract createOperationReceiverContract() {
        return new OperationReceiverContract();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "referenceDetail")
    public JAXBElement<ReferenceDetail> createReferenceDetail(ReferenceDetail value) {
        return new JAXBElement<ReferenceDetail>(_ReferenceDetail_QNAME, ReferenceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationSenderContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "operationSenderContract")
    public JAXBElement<OperationSenderContract> createOperationSenderContract(OperationSenderContract value) {
        return new JAXBElement<OperationSenderContract>(_OperationSenderContract_QNAME, OperationSenderContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Function }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "function")
    public JAXBElement<Function> createFunction(Function value) {
        return new JAXBElement<Function>(_Function_QNAME, Function.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "operationComment")
    public JAXBElement<OperationComment> createOperationComment(OperationComment value) {
        return new JAXBElement<OperationComment>(_OperationComment_QNAME, OperationComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "notificationSchedule")
    public JAXBElement<NotificationSchedule> createNotificationSchedule(NotificationSchedule value) {
        return new JAXBElement<NotificationSchedule>(_NotificationSchedule_QNAME, NotificationSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractSender }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "contractSender")
    public JAXBElement<ContractSender> createContractSender(ContractSender value) {
        return new JAXBElement<ContractSender>(_ContractSender_QNAME, ContractSender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "notification")
    public JAXBElement<Notification> createNotification(Notification value) {
        return new JAXBElement<Notification>(_Notification_QNAME, Notification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionChannelTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "distributionChannelTemplate")
    public JAXBElement<DistributionChannelTemplate> createDistributionChannelTemplate(DistributionChannelTemplate value) {
        return new JAXBElement<DistributionChannelTemplate>(_DistributionChannelTemplate_QNAME, DistributionChannelTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationReceiverAgreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "operationReceiverAgreement")
    public JAXBElement<OperationReceiverAgreement> createOperationReceiverAgreement(OperationReceiverAgreement value) {
        return new JAXBElement<OperationReceiverAgreement>(_OperationReceiverAgreement_QNAME, OperationReceiverAgreement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "externalReference")
    public JAXBElement<ExternalReference> createExternalReference(ExternalReference value) {
        return new JAXBElement<ExternalReference>(_ExternalReference_QNAME, ExternalReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationTriggerImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "notificationTriggerImpl")
    public JAXBElement<NotificationTriggerImpl> createNotificationTriggerImpl(NotificationTriggerImpl value) {
        return new JAXBElement<NotificationTriggerImpl>(_NotificationTriggerImpl_QNAME, NotificationTriggerImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Offer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "offer")
    public JAXBElement<Offer> createOffer(Offer value) {
        return new JAXBElement<Offer>(_Offer_QNAME, Offer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "agreement")
    public JAXBElement<Agreement> createAgreement(Agreement value) {
        return new JAXBElement<Agreement>(_Agreement_QNAME, Agreement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "executor")
    public JAXBElement<Executor> createExecutor(Executor value) {
        return new JAXBElement<Executor>(_Executor_QNAME, Executor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchemeAgreement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:non_canonical_model", name = "SchemeAgreement")
    public JAXBElement<SchemeAgreement> createSchemeAgreement(SchemeAgreement value) {
        return new JAXBElement<SchemeAgreement>(_SchemeAgreement_QNAME, SchemeAgreement.class, null, value);
    }

}
