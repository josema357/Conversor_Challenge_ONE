package utilities;

import javafx.scene.control.ListCell;

public class IconCell extends ListCell<ObjectCurrency> {
    @Override
    public void updateItem(ObjectCurrency item, boolean empty){
        super.updateItem(item,empty);
        if(empty){
            setText(null);
            setGraphic(null);
        }else {
            setGraphic(GUIController.generateHBox(item));
        }
    }
}
