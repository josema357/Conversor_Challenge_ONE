package utilities;

import java.util.ArrayList;

public class CreateCollections {

    public static ArrayList<ObjectList> createCollection(){
        ArrayList<ObjectList> objectList =new ArrayList<>();

        objectList.add(new ObjectList(1, "Sol", GUIController.getImage("PEN")));
        objectList.add(new ObjectList(2, "American Dollar",GUIController.getImage("USD")));
        objectList.add(new ObjectList(3, "Euro",GUIController.getImage("EUR")));
        objectList.add(new ObjectList(4, "Pounds Sterling",GUIController.getImage("GBP")));
        objectList.add(new ObjectList(5, "Japanese Yen",GUIController.getImage("JPY")));
        objectList.add(new ObjectList(6, "South Korean Won",GUIController.getImage("KRW")));
        return objectList;
    }
    public static ArrayList<ObjectList> createCollectionFrom(){
        ArrayList<ObjectList> objectList =new ArrayList<>();

        objectList.add(new ObjectList(2, "American Dollar",GUIController.getImage("USD")));
        objectList.add(new ObjectList(3, "Euro",GUIController.getImage("EUR")));
        objectList.add(new ObjectList(4, "Pounds Sterling",GUIController.getImage("GBP")));
        objectList.add(new ObjectList(5, "Japanese Yen",GUIController.getImage("JPY")));
        objectList.add(new ObjectList(6, "South Korean Won",GUIController.getImage("KRW")));
        return objectList;
    }
    public static ArrayList<ObjectList> createCollectionTo(){
        ArrayList<ObjectList> objectList =new ArrayList<>();
        objectList.add(new ObjectList(1, "Sol", GUIController.getImage("PEN")));
        return objectList;
    }

    public static ArrayList<ObjectList> createCollectionTemp(){
        ArrayList<ObjectList> objectList =new ArrayList<>();

        objectList.add(new ObjectList(7, "Degrees Celsius", GUIController.getImage("thermometer")));
        objectList.add(new ObjectList(8, "Degrees Fahrenheit",GUIController.getImage("thermometer")));
        objectList.add(new ObjectList(9, "Kelvin",GUIController.getImage("thermometer")));
        return objectList;
    }
}
