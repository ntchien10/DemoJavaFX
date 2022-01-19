module com.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.example.controller to javafx.fxml;
    opens com.example.model;
    opens com.example.dao;
    opens com.example.view to javafx.fxml;
    exports com.example.controller;
    exports com.example.view;
}