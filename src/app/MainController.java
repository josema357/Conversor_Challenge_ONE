package app;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;



import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ImageView minimize;
    @FXML
    private ImageView maximize;
    @FXML
    private ImageView close;
    @FXML
    private HBox customTitleBar;

    private double xOffset;
    private double yOffset;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
