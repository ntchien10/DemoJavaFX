package com.example.controller;

import com.example.model.TableViewExampleModel;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;

public class TableViewExample extends Application {
    List<TableViewExampleModel> list = new ArrayList<>();
    CheckBox checkBox = new CheckBox();
    CheckBox subCheckBox = new CheckBox();
    TableView table = new TableView<>();
    Scene scene;
    StackPane root = new StackPane();

    @Override
    public void start(Stage stage) throws Exception {
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.setPlaceholder(new Label("No rows to display"));

        TableColumn<TableViewExampleModel, CheckBox> ChonCol = new TableColumn<TableViewExampleModel, CheckBox>();

        TableColumn<TableViewExampleModel, Integer> SttCol = new TableColumn<TableViewExampleModel, Integer>("STT");
        TableColumn<TableViewExampleModel, String> SeverityCol = new TableColumn<TableViewExampleModel, String>("Severity");
        TableColumn<TableViewExampleModel, String> NeCol = new TableColumn<TableViewExampleModel, String>("NE");
        TableColumn<TableViewExampleModel, String> LoaiThietBiCol = new TableColumn<TableViewExampleModel, String>("Loại thiết bị");
        TableColumn<TableViewExampleModel, String> NgayBatDauCol = new TableColumn<TableViewExampleModel, String>("Ngày bắt đầu");
        TableColumn<TableViewExampleModel, String> NgayTaoCol = new TableColumn<TableViewExampleModel, String>("Ngày tạo");
        TableColumn<TableViewExampleModel, String> MienCol = new TableColumn<TableViewExampleModel, String>("Miền");
        TableColumn<TableViewExampleModel, String> CanhBaoCol = new TableColumn<TableViewExampleModel, String>("Cảnh báo");
        TableColumn<TableViewExampleModel, String> DaiCol = new TableColumn<TableViewExampleModel, String>("Đài");
        TableColumn<TableViewExampleModel, String> ToCol = new TableColumn<TableViewExampleModel, String>("Tổ");
        TableColumn<TableViewExampleModel, String> TinhCol = new TableColumn<TableViewExampleModel, String>("Tỉnh");
        TableColumn<TableViewExampleModel, String> HuyenCol = new TableColumn<TableViewExampleModel, String>("Huyện");

        ChangeListener ChooseAll = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> ov,
                                Boolean old_val, Boolean new_val) {
                if (checkBox.isSelected()) {
                    list.removeAll(list);
                    for (int i = 0; i < table.getItems().size(); i++) {
                        TableViewExampleModel model = (TableViewExampleModel) table.getItems().get(i);
//                        subCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
//                            @Override
//                            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
//                                System.out.println("changed " + aBoolean + "->" + t1);
//
//                            }
//                        });
                        model.getCheckBox().setSelected(true);
                        model.setCheckBox(model.getCheckBox());
                        table.getItems().set(i, model);
                        if (!list.contains(model)) list.add(model);
                    }
                } else {
                    for (int i = 0; i < table.getItems().size(); i++) {
                        TableViewExampleModel model = (TableViewExampleModel) table.getItems().get(i);

//                        subCheckBox.selectedProperty().addListener(new ChangeListener<Boolean>() {
//                            @Override
//                            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
//                                System.out.println("changed " + aBoolean + "->" + t1);
//                            }
//                        });
                        model.getCheckBox().setSelected(false);
                        model.setCheckBox(model.getCheckBox());
                        table.getItems().set(i, model);
                    }
                    list.removeAll(list);
                }
            }
        };

        ChonCol.setGraphic(checkBox);
        checkBox.selectedProperty().addListener(ChooseAll);

//        ChonCol.setCellFactory(CheckBoxTableCell.forTableColumn(ChonCol));

        ChonCol.setCellValueFactory(new PropertyValueFactory<>("CheckBox"));
        SttCol.setCellValueFactory(new PropertyValueFactory<>("STT"));
        SeverityCol.setCellValueFactory(new PropertyValueFactory<>("Severity"));
        NeCol.setCellValueFactory(new PropertyValueFactory<>("NE"));
        LoaiThietBiCol.setCellValueFactory(new PropertyValueFactory<>("LoaiThietBi"));
        NgayBatDauCol.setCellValueFactory(new PropertyValueFactory<>("NgayBatDau"));
        NgayTaoCol.setCellValueFactory(new PropertyValueFactory<>("NgayTao"));
        MienCol.setCellValueFactory(new PropertyValueFactory<>("Mien"));
        CanhBaoCol.setCellValueFactory(new PropertyValueFactory<>("CanhBao"));
        DaiCol.setCellValueFactory(new PropertyValueFactory<>("Dai"));
        ToCol.setCellValueFactory(new PropertyValueFactory<>("To"));
        TinhCol.setCellValueFactory(new PropertyValueFactory<>("Tinh"));
        HuyenCol.setCellValueFactory(new PropertyValueFactory<>("Huyen"));


        table.getColumns().addAll(ChonCol, SttCol, SeverityCol, NeCol, LoaiThietBiCol, NgayBatDauCol, NgayTaoCol, MienCol, CanhBaoCol, DaiCol, ToCol, TinhCol, HuyenCol);


        table.getItems().addAll(
                new TableViewExampleModel(1, "A1", "ne", "Loại 1", "NgayBatDau", "NgayTao", "Mien", "CanhBao", "Dai", "To", "Tinh", "Huyen"),
                new TableViewExampleModel(1, "A2", "ne", "Loại 2", "NgayBatDau", "NgayTao", "Mien", "CanhBao", "Dai", "To", "Tinh", "Huyen"),
                new TableViewExampleModel(1, "A3", "ne", "Loại 3", "NgayBatDau", "NgayTao", "Mien", "CanhBao", "Dai", "To", "Tinh", "Huyen"),
                new TableViewExampleModel(1, "A4", "ne", "Loại 4", "NgayBatDau", "NgayTao", "Mien", "CanhBao", "Dai", "To", "Tinh", "Huyen")
        );


        for (int i = 0; i < table.getItems().size(); i++) {
            TableViewExampleModel model = (TableViewExampleModel) table.getItems().get(i);
            model.STT = i + 1;

            model.getCheckBox().selectedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
//                    subCheckBox.setSelected(t1);
                    model.getCheckBox().setSelected(t1);
                    if (list.contains(model)) list.remove(model);
                    else list.add(model);
                }
            });

            SeverityCol.setCellFactory(column -> {
                return new TableCell<TableViewExampleModel, String>() {
                    @Override
                    protected void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);

                        if (item == null || empty) {
                            setText(null);
                            setStyle("");
                        } else {
                            setText(item);
                            switch (item) {
                                case "A1":
                                    setTextFill(Color.BLACK);
                                    setStyle("-fx-background-color: red");
                                    break;
                                case "A2":
                                    setTextFill(Color.BLACK);
                                    setStyle("-fx-background-color: #EFA110");
                                    break;
                                case "A3":
                                    setTextFill(Color.BLACK);
                                    setStyle("-fx-background-color: #EFEF4F");
                                    break;
                                case "A4":
                                    setTextFill(Color.BLACK);
                                    setStyle("-fx-background-color: #455FC6");
                                    break;
                            }

                        }
                    }
                };
            });


            String a = ((TableViewExampleModel) table.getItems().get(i)).getSeverity();

            LoaiThietBiCol.setCellFactory(tableViewExampleModelStringTableColumn -> {
                return new TableCell<TableViewExampleModel, String>() {
                    @Override
                    protected void updateItem(String item2, boolean empty) {
                        super.updateItem(item2, empty);

                        if (item2 == null || empty) {
                            setText(null);
                            setStyle("");
                        } else {
                            setText(item2);
                            if (a.equals("A1")) {
                                setTextFill(Color.GREEN);

                            }
                        }
                    }
                };
            });
        }


        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem1 = new MenuItem("Chi tiết");

        menuItem1.setOnAction((event) -> {
            Label secondLabel = new Label("Các dòng đã chọn:");
            for (TableViewExampleModel model1 : list) {
                secondLabel.setText(secondLabel.getText() + "\n" + model1.STT + " " + model1.Severity + "\n");
                ;
            }
            StackPane secondaryLayout = new StackPane();
            secondaryLayout.getChildren().add(secondLabel);
            Scene secondScene = new Scene(secondaryLayout, 600, 400);
            Stage newWindow = new Stage();
            newWindow.setTitle("Chi tiết");
            newWindow.setScene(secondScene);

            // Sét đặt vị trí cho cửa sổ thứ 2.
            // Có vị trí tương đối đối với cửa sổ chính.
            newWindow.setX(stage.getX() + 200);
            newWindow.setY(stage.getY() + 100);

            newWindow.show();
        });
        contextMenu.getItems().add(menuItem1);
        table.setContextMenu(contextMenu);
//        clickItem(event);

        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        root.getStylesheets().add(getClass().getResource("tableViewExample.css").toExternalForm());

        stage.setTitle("TableView Example");

        scene = new Scene(root, 900, 600);
        stage.setScene(scene);
        stage.show();
    }
}

