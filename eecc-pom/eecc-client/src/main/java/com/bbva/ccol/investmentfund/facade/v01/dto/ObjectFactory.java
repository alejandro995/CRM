
package com.bbva.ccol.investmentfund.facade.v01.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the investmentfund package. 
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

    private final static QName _ItemCondition_QNAME = new QName("urn:com:bbva:czic:dto:net", "itemCondition");
    private final static QName _OptionsList_QNAME = new QName("urn:com:bbva:czic:dto:net", "optionsList");
    private final static QName _InvestmentFundTransactionFilter_QNAME = new QName("urn:com:bbva:czic:dto:net", "InvestmentFundTransactionFilter");
    private final static QName _RelatedContract_QNAME = new QName("urn:com:bbva:czic:dto:net", "RelatedContract");
    private final static QName _Condition_QNAME = new QName("urn:com:bbva:czic:dto:net", "condition");
    private final static QName _ItemConditionValue_QNAME = new QName("urn:com:bbva:czic:dto:net", "itemConditionValue");
    private final static QName _InvestmentFundProduct_QNAME = new QName("urn:com:bbva:czic:dto:net", "InvestmentFundProduct");
    private final static QName _TransactionComment_QNAME = new QName("urn:com:bbva:czic:dto:net", "TransactionComment");
    private final static QName _Money_QNAME = new QName("urn:com:bbva:czic:dto:net", "money");
    private final static QName _Reference_QNAME = new QName("urn:com:bbva:czic:dto:net", "Reference");
    private final static QName _InvestmentFund_QNAME = new QName("urn:com:bbva:czic:dto:net", "InvestmentFund");
    private final static QName _InvestmentFundTransactionFilterStartAmount_QNAME = new QName("", "startAmount");
    private final static QName _InvestmentFundTransactionFilterEndAmount_QNAME = new QName("", "endAmount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: investmentfund
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionsList }
     * 
     */
    public OptionsList createOptionsList() {
        return new OptionsList();
    }

    /**
     * Create an instance of {@link ItemCondition }
     * 
     */
    public ItemCondition createItemCondition() {
        return new ItemCondition();
    }

    /**
     * Create an instance of {@link InvestmentFundTransactionFilter }
     * 
     */
    public InvestmentFundTransactionFilter createInvestmentFundTransactionFilter() {
        return new InvestmentFundTransactionFilter();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link RelatedContract }
     * 
     */
    public RelatedContract createRelatedContract() {
        return new RelatedContract();
    }

    /**
     * Create an instance of {@link ItemConditionValue }
     * 
     */
    public ItemConditionValue createItemConditionValue() {
        return new ItemConditionValue();
    }

    /**
     * Create an instance of {@link InvestmentFundProduct }
     * 
     */
    public InvestmentFundProduct createInvestmentFundProduct() {
        return new InvestmentFundProduct();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link TransactionComment }
     * 
     */
    public TransactionComment createTransactionComment() {
        return new TransactionComment();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link InvestmentFund }
     * 
     */
    public InvestmentFund createInvestmentFund() {
        return new InvestmentFund();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "itemCondition")
    public JAXBElement<ItemCondition> createItemCondition(ItemCondition value) {
        return new JAXBElement<ItemCondition>(_ItemCondition_QNAME, ItemCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "optionsList")
    public JAXBElement<OptionsList> createOptionsList(OptionsList value) {
        return new JAXBElement<OptionsList>(_OptionsList_QNAME, OptionsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentFundTransactionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "InvestmentFundTransactionFilter")
    public JAXBElement<InvestmentFundTransactionFilter> createInvestmentFundTransactionFilter(InvestmentFundTransactionFilter value) {
        return new JAXBElement<InvestmentFundTransactionFilter>(_InvestmentFundTransactionFilter_QNAME, InvestmentFundTransactionFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "RelatedContract")
    public JAXBElement<RelatedContract> createRelatedContract(RelatedContract value) {
        return new JAXBElement<RelatedContract>(_RelatedContract_QNAME, RelatedContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Condition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "condition")
    public JAXBElement<Condition> createCondition(Condition value) {
        return new JAXBElement<Condition>(_Condition_QNAME, Condition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemConditionValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "itemConditionValue")
    public JAXBElement<ItemConditionValue> createItemConditionValue(ItemConditionValue value) {
        return new JAXBElement<ItemConditionValue>(_ItemConditionValue_QNAME, ItemConditionValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentFundProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "InvestmentFundProduct")
    public JAXBElement<InvestmentFundProduct> createInvestmentFundProduct(InvestmentFundProduct value) {
        return new JAXBElement<InvestmentFundProduct>(_InvestmentFundProduct_QNAME, InvestmentFundProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "TransactionComment")
    public JAXBElement<TransactionComment> createTransactionComment(TransactionComment value) {
        return new JAXBElement<TransactionComment>(_TransactionComment_QNAME, TransactionComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "Reference")
    public JAXBElement<Reference> createReference(Reference value) {
        return new JAXBElement<Reference>(_Reference_QNAME, Reference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentFund }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:czic:dto:net", name = "InvestmentFund")
    public JAXBElement<InvestmentFund> createInvestmentFund(InvestmentFund value) {
        return new JAXBElement<InvestmentFund>(_InvestmentFund_QNAME, InvestmentFund.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "startAmount", scope = InvestmentFundTransactionFilter.class)
    public JAXBElement<Money> createInvestmentFundTransactionFilterStartAmount(Money value) {
        return new JAXBElement<Money>(_InvestmentFundTransactionFilterStartAmount_QNAME, Money.class, InvestmentFundTransactionFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "endAmount", scope = InvestmentFundTransactionFilter.class)
    public JAXBElement<Money> createInvestmentFundTransactionFilterEndAmount(Money value) {
        return new JAXBElement<Money>(_InvestmentFundTransactionFilterEndAmount_QNAME, Money.class, InvestmentFundTransactionFilter.class, value);
    }

}
