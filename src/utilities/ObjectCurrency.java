package utilities;

import javafx.scene.image.Image;

public class ObjectCurrency {
    private final int id;
    private final String coin;
    private final Image flag;

    public ObjectCurrency(int id, String coin, Image flag) {
        this.id = id;
        this.coin = coin;
        this.flag = flag;
    }

    public Image getFlag() {
        return flag;
    }
    public String getCoin() {
        return coin;
    }

    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
