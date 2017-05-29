/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.bbva.eecc.war.conf;

/**
 *
 * @author Administrator
 */
public class User {

    private String ivTicketService;
    private String consumerID;
    private String userID;
    private String userType;
    private String name;

    public User(String ivTicketService, String consumerID, String userID) {
        this.ivTicketService = ivTicketService;
        this.consumerID = consumerID;
        this.userID = userID;
    }

    /**
     * @return the ivTicketService
     */
    public String getIvTicketService() {
        return ivTicketService;
    }

    /**
     * @param ivTicketService the ivTicketService to set
     */
    public void setIvTicketService(String ivTicketService) {
        this.ivTicketService = ivTicketService;
    }

    /**
     * @return the consumerID
     */
    public String getConsumerID() {
        return consumerID;
    }

    /**
     * @param consumerID the consumerID to set
     */
    public void setConsumerID(String consumerID) {
        this.consumerID = consumerID;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "User{" + "ivTicketService=" + ivTicketService + ", consumerID=" + consumerID + ", userID=" + userID + '}';
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
