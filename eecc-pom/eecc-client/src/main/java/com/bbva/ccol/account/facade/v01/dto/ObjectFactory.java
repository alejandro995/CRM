
package com.bbva.ccol.account.facade.v01.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bbva.ccol.account.facade.v02.dto package.
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

    private final static QName _OptionsList_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "optionsList");
    private final static QName _Money_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "money");
    private final static QName _Status_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "status");
    private final static QName _Account_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "account");
    private final static QName _NumberType_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "numberType");
    private final static QName _DTOOutListAccounts_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "dTOOutListAccounts");
    private final static QName _AccountType_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "accountType");
    private final static QName _Contract_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "contract");
    private final static QName _FacadeOutAccount_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "facadeOutAccount");
    private final static QName _AvailableBalance_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "availableBalance");
    private final static QName _RelatedContract_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "relatedContract");
    private final static QName _Title_QNAME = new QName("urn:com:bbva:ccol:account:facade:v02:dto", "title");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bbva.ccol.account.facade.v02.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTOOutListAccounts }
     * 
     */
    public DTOOutListAccounts createDTOOutListAccounts() {
        return new DTOOutListAccounts();
    }

    /**
     * Create an instance of {@link NumberType }
     * 
     */
    public NumberType createNumberType() {
        return new NumberType();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link OptionsList }
     * 
     */
    public OptionsList createOptionsList() {
        return new OptionsList();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link FacadeOutAccount }
     * 
     */
    public FacadeOutAccount createFacadeOutAccount() {
        return new FacadeOutAccount();
    }

    /**
     * Create an instance of {@link RelatedContract }
     * 
     */
    public RelatedContract createRelatedContract() {
        return new RelatedContract();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link AvailableBalance }
     * 
     */
    public AvailableBalance createAvailableBalance() {
        return new AvailableBalance();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "optionsList")
    public JAXBElement<OptionsList> createOptionsList(OptionsList value) {
        return new JAXBElement<OptionsList>(_OptionsList_QNAME, OptionsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "money")
    public JAXBElement<Money> createMoney(Money value) {
        return new JAXBElement<Money>(_Money_QNAME, Money.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "numberType")
    public JAXBElement<NumberType> createNumberType(NumberType value) {
        return new JAXBElement<NumberType>(_NumberType_QNAME, NumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTOOutListAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "dTOOutListAccounts")
    public JAXBElement<DTOOutListAccounts> createDTOOutListAccounts(DTOOutListAccounts value) {
        return new JAXBElement<DTOOutListAccounts>(_DTOOutListAccounts_QNAME, DTOOutListAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "accountType")
    public JAXBElement<AccountType> createAccountType(AccountType value) {
        return new JAXBElement<AccountType>(_AccountType_QNAME, AccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "contract")
    public JAXBElement<Contract> createContract(Contract value) {
        return new JAXBElement<Contract>(_Contract_QNAME, Contract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacadeOutAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "facadeOutAccount")
    public JAXBElement<FacadeOutAccount> createFacadeOutAccount(FacadeOutAccount value) {
        return new JAXBElement<FacadeOutAccount>(_FacadeOutAccount_QNAME, FacadeOutAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvailableBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "availableBalance")
    public JAXBElement<AvailableBalance> createAvailableBalance(AvailableBalance value) {
        return new JAXBElement<AvailableBalance>(_AvailableBalance_QNAME, AvailableBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "relatedContract")
    public JAXBElement<RelatedContract> createRelatedContract(RelatedContract value) {
        return new JAXBElement<RelatedContract>(_RelatedContract_QNAME, RelatedContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Title }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com:bbva:ccol:account:facade:v02:dto", name = "title")
    public JAXBElement<Title> createTitle(Title value) {
        return new JAXBElement<Title>(_Title_QNAME, Title.class, null, value);
    }

}
