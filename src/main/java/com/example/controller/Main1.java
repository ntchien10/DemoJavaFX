package com.example.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;



public class Main1 extends Application {

    GridPane root;
    Stage window;
    Scene sceneKT,sceneKQ;
    Label Alarm,TenCell,KhuVuc,TenCanhBao,NhomCanhBao,MucDoCanhBao,ThoiDiemBatDuoc,ThongTinChiTiet,
            CachKhacPhuc,PhongBan,NhanVienQuanLy,XacNhan,TinhTrangPhatSong,MaTuBTS,MaTuBSC,
            TinhThanh,Keyword,Vendor,ThoiGianBatDau,ThoiGianketThuc,NguyenNhan,GhiChu,DiaChi,SoDienThoai,MaTicket;

    TextField txtAlarm,txtTenCell,txtKhuVuc,txtTenCanhBao,txtNhomCanhBao,txtMucDoCanhBao,
            txtThoiDiemBatDuoc,txtPhongBan,txtNhanVienQuanLy,txtXacNhan,txtTinhTrangPhatSong,
            txtMaTuBTS,txtMaTuBSC,txtTinhThanh,txtKeyword,txtVendor,txtThoiGianBatDau,txtThoiGianketThuc,
            txtDiaChi,txtSoDienThoai,txtMaTicket;

    Button btnSubmit;

    TextArea txtThongTinChiTiet,txtCachKhacPhuc,txtNguyenNhan,txtGhiChu;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(20);
        root.setVgap(15);

        root.getStylesheets().add(getClass().getResource("main1.css").toExternalForm());

        window=stage;

        AnhXa();
        btnSubmit.setOnAction(actionEvent -> {

            window.setScene(sceneKT);
            window.show();
        });



        sceneKT=new Scene(root,300,200);

        window.setScene(sceneKT);
        window.show();
    }
    public void AnhXa(){
        Alarm=new Label("Alarm ID");
        root.add(Alarm, 0, 0);

        txtAlarm=new TextField();
        root.add(txtAlarm, 1, 0);


        TenCell=new Label("Tên Cell");
        root.add(TenCell, 0, 1);

        txtTenCell=new TextField();
        root.add(txtTenCell, 1, 1);

        KhuVuc=new Label("Khu vực");
        root.add(KhuVuc, 0, 2);

        txtKhuVuc=new TextField();
        root.add(txtKhuVuc, 1, 2);

        TenCanhBao=new Label("Tên cảnh báo");
        root.add(TenCanhBao, 0, 3);

        txtTenCanhBao=new TextField();
        root.add(txtTenCanhBao, 1, 3);

        NhomCanhBao=new Label("Nhóm cảnh báo");
        root.add(NhomCanhBao, 0, 4);

        txtNhomCanhBao=new TextField();
        root.add(txtNhomCanhBao, 1, 4);


        MucDoCanhBao=new Label("Mức độ cảnh báo");
        root.add(MucDoCanhBao, 0, 5);


        txtMucDoCanhBao=new TextField();
        root.add(txtMucDoCanhBao, 1, 5);


        ThoiDiemBatDuoc=new Label("Thời điểm bắt được");
        root.add(ThoiDiemBatDuoc, 0, 6);


        txtThoiDiemBatDuoc=new TextField();
        root.add(txtThoiDiemBatDuoc, 1, 6);


        ThongTinChiTiet=new Label("Thông tin chi tiết");
        root.add(ThongTinChiTiet, 0, 7);


        txtThongTinChiTiet=new TextArea();
        root.add(txtThongTinChiTiet, 1, 7);


        CachKhacPhuc=new Label("Cách khắc phục");
        root.add(CachKhacPhuc, 0, 8);


        txtCachKhacPhuc=new TextArea();
        root.add(txtCachKhacPhuc, 1, 8);

        PhongBan=new Label("Phòng ban");
        root.add(PhongBan, 0, 9);

        txtPhongBan=new TextField();
        root.add(txtPhongBan, 1, 9);


        NhanVienQuanLy=new Label("Nhân viên quản lý");
        root.add(NhanVienQuanLy, 0, 10);


        txtNhanVienQuanLy=new TextField();
        root.add(txtNhanVienQuanLy, 1, 10);


        XacNhan=new Label("Xác nhận");
        root.add(XacNhan, 0, 11);


        txtXacNhan=new TextField();
        root.add(txtXacNhan, 1, 11);


        TinhTrangPhatSong=new Label("Tình trạng phát sóng");
        root.add(TinhTrangPhatSong, 0, 12);


        txtTinhTrangPhatSong=new TextField();
        root.add(txtTinhTrangPhatSong, 1, 12);

        //
        MaTuBTS=new Label("Mã tủ BTS/NodeB");
        root.add(MaTuBTS, 2, 0);


        txtMaTuBTS=new TextField();
        root.add(txtMaTuBTS, 3, 0);


        MaTuBSC=new Label("Mã tủ BSC/RNC");
        root.add(MaTuBSC, 2, 1);


        txtMaTuBSC=new TextField();
        root.add(txtMaTuBSC, 3, 1);


        TinhThanh=new Label("Tỉnh thành");
        root.add(TinhThanh, 2, 2);


        txtTinhThanh=new TextField();
        root.add(txtTinhThanh, 3, 2);


        Keyword=new Label("Keyword");
        root.add(Keyword, 2, 3);


        txtKeyword=new TextField();
        root.add(txtKeyword, 3, 3);


        Vendor=new Label("Vendor");
        root.add(Vendor, 2, 4);


        txtVendor=new TextField();
        root.add(txtVendor, 3, 4);


        ThoiGianBatDau=new Label("Thời gian bắt đầu");
        root.add(ThoiGianBatDau, 2, 5);


        txtThoiGianBatDau=new TextField();
        root.add(txtThoiGianBatDau, 3, 5);


        ThoiGianketThuc=new Label("Thời gian kết thúc");
        root.add(ThoiGianketThuc, 2, 6);


        txtThoiGianketThuc=new TextField();
        root.add(txtThoiGianketThuc, 3, 6);


        NguyenNhan=new Label("Nguyên nhân");
        root.add(NguyenNhan, 2, 7);


        txtNguyenNhan=new TextArea();
        root.add(txtNguyenNhan, 3, 7);


        GhiChu=new Label("Ghi chú");
        root.add(GhiChu, 2, 8);


        txtGhiChu=new TextArea();
        root.add(txtGhiChu, 3, 8);


        DiaChi=new Label("Địa chỉ");
        root.add(DiaChi, 2, 9);


        txtDiaChi=new TextField();
        root.add(txtDiaChi, 3, 9);


        SoDienThoai=new Label("Số điện thoại");
        root.add(SoDienThoai, 2, 10);


        txtSoDienThoai=new TextField();
        root.add(txtSoDienThoai, 3, 10);


        MaTicket=new Label("Mã ticket");
        root.add(MaTicket, 2, 11);


        txtMaTicket=new TextField();
        root.add(txtMaTicket, 3, 11);

        btnSubmit =new Button("Submit");
        btnSubmit.setId("btnSubmit");
        btnSubmit.setPadding(new Insets(10,20,10,20));
        root.add(btnSubmit, 0, 13,4,1);
        GridPane.setHalignment(btnSubmit,HPos.CENTER);

    }
}
