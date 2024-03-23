module com.larrykin343.webank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
//    requires de.jensd.fontawesomefx;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.larrykin343.webank to javafx.fxml;
    exports com.larrykin343.webank;
    exports com.larrykin343.webank.Controller;
    exports com.larrykin343.webank.Controller.Admin;
    exports com.larrykin343.webank.Controller.Client;
    exports com.larrykin343.webank.Models;
    exports com.larrykin343.webank.Views;
}