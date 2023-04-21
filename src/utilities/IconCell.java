package utilities;

import javafx.scene.control.ListCell;

public class IconCell extends ListCell<ObjectList> {
    /**
     *updates the appearance of a cell in the ListView to display the passed object as an item
     * @param item the object to display in the cell
     * @param empty a boolean value indicating whether the cell is empty or not
     * */
    @Override
    public void updateItem(ObjectList item, boolean empty){
        super.updateItem(item,empty);
        if(empty){
            setText(null);
            setGraphic(null);
        }else {
            setGraphic(GUIController.generateHBox(item));
        }
    }
}
