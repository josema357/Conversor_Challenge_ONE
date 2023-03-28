package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ImageView minimize;
    @FXML
    private ImageView maximize;
    @FXML
    private ImageView close;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        minimize.setOnMouseClicked(event ->{
            Stage currentStage=(Stage) minimize.getScene().getWindow();
            currentStage.setIconified(true);
        });
        close.setOnMouseClicked(event ->{
            Stage currentStage=(Stage) close.getScene().getWindow();
            currentStage.close();
        });
        maximize.setOnMouseClicked(event ->{
            
        });
    }

}
