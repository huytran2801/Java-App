package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label lb = new Label("Siêu Máy Tính");
        Label lb1 = new Label(" + ");
        Label lb2 = new Label(" = ");
        Label lb3 = new Label(" ");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Button btn = new Button("Tính tổng");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String text1 = tf1.getText();
                String text2 = tf2.getText();
                int num1 = Integer.parseInt(text1);
                int num2 = Integer.parseInt(text2);
                int sum = num1 + num2;
                lb3.setText(String.valueOf(sum));
            }
        });

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 400,400);
        root.addRow(0, lb);
        root.addRow(1, tf1,lb1,tf2,lb2,lb3);
        root.addRow(2, btn);

        stage.setTitle("My Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}