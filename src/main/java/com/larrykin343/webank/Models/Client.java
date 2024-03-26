package com.larrykin343.webank.Models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Client {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty<Account> checkingAccount;
    private final ObjectProperty<Account> savingsAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String firstName, String lastName, String payeeAddress, Account checkingAccount, Account savingsAccount, LocalDate dateCreated) {
        this.firstName = new SimpleStringProperty(this, "firstName", firstName);
        this.lastName = new SimpleStringProperty(this, "lastName", lastName);
        this.payeeAddress = new SimpleStringProperty(this, "payeeAddress", payeeAddress);
        this.checkingAccount = new SimpleObjectProperty(this, "checkingAccount", checkingAccount);
        this.savingsAccount = new SimpleObjectProperty(this, "savingsAccount", savingsAccount);
        this.dateCreated = new SimpleObjectProperty(this, "dateCreated", dateCreated);
    }

    public StringProperty firstNameProperty() {
        return this.firstName;
    }

    public StringProperty lastNameProperty() {
        return this.lastName;
    }

    public StringProperty payeeAddressProperty() {
        return this.payeeAddress;
    }

    public ObjectProperty<Account> checkingAccountProperty() {
        return this.checkingAccount;
    }

    public ObjectProperty<Account> savingsAccountProperty() {
        return this.savingsAccount;
    }

    public ObjectProperty<LocalDate> dateCreatedProperty() {
        return this.dateCreated;
    }

}
