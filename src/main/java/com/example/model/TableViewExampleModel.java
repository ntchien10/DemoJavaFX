package com.example.model;

import javafx.scene.control.CheckBox;

public class TableViewExampleModel {
    private CheckBox CheckBox;
    public int STT;
    public String Severity;
    public String NE;
    public String LoaiThietBi;
    public String NgayBatDau;
    public String NgayTao;
    public String Mien;
    public String CanhBao;
    public String Dai;
    public String To;
    public String Tinh;
    public String Huyen;
    public TableViewExampleModel(){}

    public TableViewExampleModel( int STT, String severity, String NE, String loaiThietBi, String ngayBatDau, String ngayTao, String mien, String canhBao, String dai, String to, String tinh, String huyen) {
        CheckBox=new CheckBox();
        this.STT = STT;
        Severity = severity;
        this.NE = NE;
        LoaiThietBi = loaiThietBi;
        NgayBatDau = ngayBatDau;
        NgayTao = ngayTao;
        Mien = mien;
        CanhBao = canhBao;
        Dai = dai;
        To = to;
        Tinh = tinh;
        Huyen = huyen;
    }

    public CheckBox getCheckBox() {
        return CheckBox;
    }

    public void setCheckBox(CheckBox CheckBox) {
        this.CheckBox = CheckBox;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public String getNE() {
        return NE;
    }

    public void setNE(String NE) {
        this.NE = NE;
    }

    public String getLoaiThietBi() {
        return LoaiThietBi;
    }

    public void setLoaiThietBi(String loaiThietBi) {
        LoaiThietBi = loaiThietBi;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        NgayBatDau = ngayBatDau;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String ngayTao) {
        NgayTao = ngayTao;
    }

    public String getMien() {
        return Mien;
    }

    public void setMien(String mien) {
        Mien = mien;
    }

    public String getCanhBao() {
        return CanhBao;
    }

    public void setCanhBao(String canhBao) {
        CanhBao = canhBao;
    }

    public String getDai() {
        return Dai;
    }

    public void setDai(String dai) {
        Dai = dai;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getTinh() {
        return Tinh;
    }

    public void setTinh(String tinh) {
        Tinh = tinh;
    }

    public String getHuyen() {
        return Huyen;
    }

    public void setHuyen(String huyen) {
        Huyen = huyen;
    }
}
