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
    /**
     * Generates an ImageView object with the specified image, width and height
     * @param image the image to display in the ImageView
     * @param width the desired width of the ImageView
     * @param height the desired height of the ImageView
     * @return a ImageView object containing the specified image resized
     * */
    public static ImageView generateImageView(Image image,int width,int height){
        ImageView imageView=new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        return imageView;
    }
    /**
     * Return an Image object with the specified filename from the assets folder in the project directory
     * @param fileName the name of the file to retrieve
     * @return an Image object containing the specified file
     * @throws NullPointerException if the file cannot be found
     * */
    public static Image getImage(String fileName){
        return  new Image(Objects.requireNonNull(GUIController.class.getResource("../assets/" + fileName + ".png")).toString());
    }
    /**
     * Generates an HBox to display the objectList's properties
     * @param objectList an ObjectList object to generate the HBox
     * @return an HBox containing the objectList name and image
     * */
    public static HBox generateHBox(ObjectList objectList){
        Label label=new Label(objectList.getName());
        label.setFont(new Font(12));
        label.setTextFill(Color.BLACK);
        HBox hbox=new HBox(generateImageView(objectList.getFlag(),50,30),label);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER_LEFT);
        return hbox;
    }
}
