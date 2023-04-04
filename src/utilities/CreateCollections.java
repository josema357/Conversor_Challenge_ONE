package utilities;

import java.util.ArrayList;

public class CreateCollections {

    public static ArrayList<ConvertFrom> createCollection(){
        ArrayList<ConvertFrom> convertFrom=new ArrayList<>();

        convertFrom.add(new ConvertFrom(1, "Sol", GUIController.getImage("PEN")));
        convertFrom.add(new ConvertFrom(2, "American Dollar",GUIController.getImage("USD")));
        convertFrom.add(new ConvertFrom(3, "Pounds Sterling",GUIController.getImage("GBP")));
        convertFrom.add(new ConvertFrom(4, "Japanese Yen",GUIController.getImage("JPY")));
        convertFrom.add(new ConvertFrom(5, "South Korean Won",GUIController.getImage("KRW")));
        return convertFrom;
    }
    public static ArrayList<ConvertFrom> createCollectionFrom(){
        ArrayList<ConvertFrom> convertFrom=new ArrayList<>();

        convertFrom.add(new ConvertFrom(2, "American Dollar",GUIController.getImage("USD")));
        convertFrom.add(new ConvertFrom(3, "Pounds Sterling",GUIController.getImage("GBP")));
        convertFrom.add(new ConvertFrom(4, "Japanese Yen",GUIController.getImage("JPY")));
        convertFrom.add(new ConvertFrom(5, "South Korean Won",GUIController.getImage("KRW")));
        return convertFrom;
    }
    public static ArrayList<ConvertFrom> createCollectionTo(){
        ArrayList<ConvertFrom> convertFrom=new ArrayList<>();
        convertFrom.add(new ConvertFrom(1, "Sol", GUIController.getImage("PEN")));
        return convertFrom;
    }
}
