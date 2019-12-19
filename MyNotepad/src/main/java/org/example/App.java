package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        MenuBar menubar = new MenuBar();
        Menu File = new Menu("File");
        MenuItem filemenu1 = new MenuItem("Open");
        MenuItem filemenu2 = new MenuItem("Save");
        MenuItem filemenu3 = new MenuItem("Exit");
        Menu Edit = new Menu("Edit");
        Menu Format = new Menu("Format");
        Menu View = new Menu("View");
        Menu Help = new Menu("Help");

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 600, 400);
        root.setTop(menubar);
        File.getItems().addAll(filemenu1, filemenu2, filemenu3);
        menubar.getMenus().addAll(File, Edit, Format, View, Help);

        stage.setTitle("My Notepad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}