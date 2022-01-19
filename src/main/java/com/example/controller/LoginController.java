package com.example.controller;

import com.example.dao.LoginDao;
import com.example.view.LoginView;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LoginController extends LoginView {
    static String pass;
    public static void loginController(Stage stage){
        imageViewMatKShow.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageViewMatKShow.setImage(iconMatShow);
                pass=password.getText();
                password.clear();
                password.setPromptText(pass);
            }
        });
        imageViewMatKShow.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                imageViewMatKShow.setImage(iconMatKShow);
                password.setPromptText("Mật khẩu");
                password.setText(pass);
            }
        });

        btnLogin.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                if(LoginDao.Authentication(username.getText(),password.getText())){
                    System.out.println("Success");
                    TableViewExample tableViewExample=new TableViewExample();
                    try {
                        tableViewExample.start(stage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else System.out.println("Failure");
            }
        });
    }
}

