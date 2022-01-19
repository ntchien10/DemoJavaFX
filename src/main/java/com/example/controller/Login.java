package com.example.controller;

import com.example.dao.LoginDao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.CustomPasswordField;
import org.controlsfx.control.textfield.CustomTextField;
import java.io.FileInputStream;

public class Login extends Application {
    VBox root=new VBox();
    ImageView anhBia,anhChu,iconUser,imageViewMatKShow;
    public Button btnLogin;
    Text footer;
    String pass;
    private Scene tableViewScene;

    private static final  Image iconUsername=new Image("F:\\Intelij\\HelloWorld\\src\\main\\resources\\images\\iconUser.png");
    private static final  Image iconPassword=new Image("F:\\Intelij\\HelloWorld\\src\\main\\resources\\images\\iconPass.png");
    Image iconMatShow=new Image("F:\\Intelij\\HelloWorld\\src\\main\\resources\\images\\showpass.png",20,18,false,true);
    Image iconMatKShow=new Image("F:\\Intelij\\HelloWorld\\src\\main\\resources\\images\\dontshow.png",20,18,false,true);
    @Override
    public void start(Stage stage) throws Exception {
        root.setAlignment(Pos.TOP_CENTER);
        //anh bìa
        FileInputStream input = new FileInputStream("F://Intelij//HelloWorld//src//main//resources//images//careerbiulder1.png");
        Image image = new Image(input, 436, 231, false, true);
        anhBia = new ImageView(image);
        anhBia.setId("anhBia");
        Pane pane_Bia_Chu=new Pane();
        pane_Bia_Chu.setPrefHeight(8);
        //ảnh chữ
        FileInputStream input2 = new FileInputStream("F://Intelij//HelloWorld//src//main//resources//images//10241.png");
        Image image2 = new Image(input2, 186, 39, false, true);
        anhChu = new ImageView(image2);
        anhChu.setId("anhChu");

        Pane pane_Chu_username=new Pane();
        pane_Chu_username.setPrefHeight(50);

        CustomTextField username = new CustomTextField();
        iconUser = new ImageView(iconUsername);
        iconUser.setId("iconUser");
        Pane paneUser=new Pane();
        paneUser.setPrefWidth(10);
        paneUser.setMinWidth(10);
        HBox hBox1=new HBox();
        hBox1.setMaxHeight(username.getHeight());
        hBox1.getChildren().addAll(paneUser,iconUser);

        username.setLeft(hBox1);

//        username.setLeft(iconUser);
        username.setPromptText("Tên đăng nhập");
        username.setId("username");

        //tên đăng nhập
//        username=new TextField();
//        username.setPromptText("Tên đăng nhập");
//        username.setId("username");

        Pane pane_username_pass=new Pane();
        pane_username_pass.setPrefHeight(15);

//        //mật khẩu
        CustomPasswordField password=new CustomPasswordField();
        imageViewMatKShow=new ImageView(iconMatKShow);

        imageViewMatKShow.setId("iconMat");
        password.setPromptText("Mật khẩu");

        Pane panePass=new Pane();
        panePass.setPrefWidth(10);
        panePass.setMinWidth(10);
        HBox hBox2=new HBox();
        hBox2.setMaxHeight(password.getHeight());
        hBox2.getChildren().addAll(panePass,new ImageView(iconPassword));

        password.setLeft(hBox2);

        password.setRight(imageViewMatKShow);
        password.setId("password");
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
        Pane pane_pass_btn=new Pane();
        pane_pass_btn.setPrefHeight(49);

        //button đăng nhập
        btnLogin=new Button("ĐĂNG NHẬP");
        btnLogin.setId("btnLogin");
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

        Pane pane_btn_footer=new Pane();
        pane_btn_footer.setPrefHeight(125);

        //footer
        footer=new Text("Trung tâm NOC - Mobifone");
        footer.setId("footer");
        root.getChildren().addAll(anhBia,pane_Bia_Chu,anhChu,pane_Chu_username,username,pane_username_pass,password,pane_pass_btn,btnLogin,pane_btn_footer,footer);
        root.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
        stage.setTitle("Login");

        root.setPadding(new Insets(5));
        Scene scene = new Scene(root,  501,700);
        stage.setScene(scene);
        stage.show();
    }

}

