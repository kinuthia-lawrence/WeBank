package com.larrykin343.webank.Models;

import com.larrykin343.webank.Views.AccountType;
import com.larrykin343.webank.Views.ViewFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;
    private AccountType loginAccountType =AccountType.CLIENT;

    //Client Section
    private Client client;
    private boolean clientLoginSuccessFlag;
    //Admin Section

    private Model() {
        this.databaseDriver = new DatabaseDriver();
        this.viewFactory = new ViewFactory();
        //Client Data Section
     this.clientLoginSuccessFlag = false;
     this.client = new Client("", "", "", null, null,null);

        //Admin Data Section
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabaseDriver() {
        return databaseDriver;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    //! Client Methods
    public boolean getClientLoginSuccessFlag() {
        return this.clientLoginSuccessFlag;
    }
    public void setClientLoginSuccessFlag(boolean flag) {
        this.clientLoginSuccessFlag = flag;
    }
    public Client getClient() {
        return client;
    }

    public void  evaluateClientCredentials(String pAddress, String password) {
        CheckingAccount checkingAccount;
        SavingsAccount savingsAccount;
        ResultSet resultSet =databaseDriver.getClientData(pAddress, password);
        try {
            if (resultSet.isBeforeFirst()) {
                this.client.firstNameProperty().set(resultSet.getString("FirstName"));
                this.client.lastNameProperty().set(resultSet.getString("LastName"));
                this.client.payeeAddressProperty().set(resultSet.getString("PayeeAddress"));
                String[] dateParts = resultSet.getString("Date").split("-");
                LocalDate date = LocalDate.of(Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[2]));
                this.client.dateCreatedProperty().set(date);
                this.clientLoginSuccessFlag = true;

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
