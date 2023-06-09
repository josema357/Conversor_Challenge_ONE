package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import utilities.CoinService;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("../resources/Main.fxml"));
        Image icon=new Image(Objects.requireNonNull(getClass().getResourceAsStream("../assets/motherboard.png")));
        stage.getIcons().add(icon);
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Converter");
        stage.setScene(scene);
        stage.show();
        CoinService.initialize();
    }
    public static void main(String[] args) {
        launch(args);
    }
}