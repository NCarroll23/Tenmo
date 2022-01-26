package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {

    private int transferID;
    private int transferTypeId;
    private int transferStatusID;
    private int accountTo;
    private String accountToUsername;
    private String accountFromUsername;
    private int accountFrom;
    private BigDecimal amount;
    private String transferStatus;
    private String transferType;

    public String getTransferStatus() {
        return transferStatus;
    }

    public String getTransferType() {
        return transferType;
    }

    public String getAccountToUsername() {
        return accountToUsername;
    }

    public void setAccountToUsername(String accountToUsername) {
        this.accountToUsername = accountToUsername;
    }

    public String getAccountFromUsername() {
        return accountFromUsername;
    }

    public void setAccountFromUsername(String accountFromUsername) {
        this.accountFromUsername = accountFromUsername;
    }

    public int getTransferID() {
        return transferID;
    }

    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public int getTransferStatusID() {
        return transferStatusID;
    }

    public void setTransferStatusID(int transferStatusID) {
        this.transferStatusID = transferStatusID;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public int getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(int accountFrom) {
        this.accountFrom = accountFrom;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "------------------------------\n" +
                "Transfer Details\n" +
                "------------------------------\n" +
                "ID= " + transferID + "\n" +
                "Transfer Type= " + transferType + "\n" +
                "Transfer Status= " + transferStatus + "\n" +
                "From= " + accountFromUsername + "\n" +
                "To= " + accountToUsername + "\n" +
                "Amount= $" + amount;
    }
}