package utilities;

import java.util.ArrayList;

public class CreateCollections {

    public static ArrayList<ObjectCurrency> createCollection(){
        ArrayList<ObjectCurrency> objectCurrency =new ArrayList<>();

        objectCurrency.add(new ObjectCurrency(1, "Sol", GUIController.getImage("PEN")));
        objectCurrency.add(new ObjectCurrency(2, "American Dollar",GUIController.getImage("USD")));
        objectCurrency.add(new ObjectCurrency(3, "Euro",GUIController.getImage("EUR")));
        objectCurrency.add(new ObjectCurrency(4, "Pounds Sterling",GUIController.getImage("GBP")));
        objectCurrency.add(new ObjectCurrency(5, "Japanese Yen",GUIController.getImage("JPY")));
        objectCurrency.add(new ObjectCurrency(6, "South Korean Won",GUIController.getImage("KRW")));
        return objectCurrency;
    }
    public static ArrayList<ObjectCurrency> createCollectionFrom(){
        ArrayList<ObjectCurrency> objectCurrency =new ArrayList<>();

        objectCurrency.add(new ObjectCurrency(2, "American Dollar",GUIController.getImage("USD")));
        objectCurrency.add(new ObjectCurrency(3, "Euro",GUIController.getImage("EUR")));
        objectCurrency.add(new ObjectCurrency(4, "Pounds Sterling",GUIController.getImage("GBP")));
        objectCurrency.add(new ObjectCurrency(5, "Japanese Yen",GUIController.getImage("JPY")));
        objectCurrency.add(new ObjectCurrency(6, "South Korean Won",GUIController.getImage("KRW")));
        return objectCurrency;
    }
    public static ArrayList<ObjectCurrency> createCollectionTo(){
        ArrayList<ObjectCurrency> objectCurrency =new ArrayList<>();
        objectCurrency.add(new ObjectCurrency(1, "Sol", GUIController.getImage("PEN")));
        return objectCurrency;
    }
}
