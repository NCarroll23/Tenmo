package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {

    private int transferID;
    // 1 is request and 2 is send
    private int transferTypeId;
    // 1 is pending, 2 is approved, and 3 is rejected
    private int transferStatusID;
    private int accountTo;
    private String accountToUsername;
    private String accountFromUsername;
    private int accountFrom;
    private BigDecimal amount;
    private String transferStatus;
    private String transferType;


    public void setAccountToUsername(String accountToUsername) {
        this.accountToUsername = accountToUsername;
    }

    public void setAccountFromUsername(String accountFromUsername) {
        this.accountFromUsername = accountFromUsername;
    }

    public String getAccountToUsername() {
        return accountToUsername;
    }

    public String getAccountFromUsername() {
        return accountFromUsername;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public String getTransferType() {
        return transferType;
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

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }
}
