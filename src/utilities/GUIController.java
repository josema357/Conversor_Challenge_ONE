package utilities;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.Objects;

public class GUIController {
    public static ImageView generateImageView(Image image,int width,int height){
        ImageView imageView=new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        return imageView;
    }
    public static Image getImage(String fileName){
        return  new Image(Objects.requireNonNull(GUIController.class.getResource("../assets/" + fileName + ".png")).toString());
    }
    public static HBox generateHBox(ObjectCurrency from){
        Label label=new Label(from.getCoin());
        label.setFont(new Font(12));
        label.setTextFill(Color.BLACK);
        HBox hbox=new HBox(generateImageView(from.getFlag(),50,30),label);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER_LEFT);
        return hbox;
    }
}
