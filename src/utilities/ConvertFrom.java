package utilities;

import javafx.scene.image.Image;

public class ConvertFrom {
    private int id;
    private String coin;
    private Image flag;

    public ConvertFrom(int id, String coin, Image flag) {
        this.id = id;
        this.coin = coin;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Image getFlag() {
        return flag;
    }

    public void setFlag(Image flag) {
        this.flag = flag;
    }

    public String getCoin() {
        return coin;
    }
    public void setCoin(String coin) {
        this.coin = coin;
    }
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
