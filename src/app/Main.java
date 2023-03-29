package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("../resources/MainWindow.fxml"));
        Image icon=new Image(getClass().getResourceAsStream("../assets/motherboard-fill.png"));
        stage.getIcons().add(icon);
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Converter");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}