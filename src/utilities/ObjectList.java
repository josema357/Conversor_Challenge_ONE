package utilities;

import javafx.scene.image.Image;

public class ObjectList {
    private final int id;
    private final String name;
    private final Image flag;

    public ObjectList(int id, String name, Image flag) {
        this.id = id;
        this.name = name;
        this.flag = flag;
    }

    public Image getFlag() {
        return flag;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
