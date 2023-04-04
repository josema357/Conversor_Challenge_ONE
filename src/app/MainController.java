package app;

import utilities.ConvertFrom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.util.Callback;
import utilities.IconCell;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utilities.CreateCollections.createCollectionFrom;
import static utilities.CreateCollections.createCollection;
import static utilities.CreateCollections.createCollectionTo;

public class MainController implements Initializable {
    @FXML
    private ComboBox<String> comboBoxConverter;
    @FXML
    private ComboBox<ConvertFrom> comboBoxFrom;
    @FXML
    private ComboBox<ConvertFrom> comboBoxTo;
    @FXML
    private TextField inputAmount;
    @FXML
    private TextField outputAmount;
    @FXML
    private Label errorMessage;
    @FXML
    private ImageView errorIcon;

    private final String[] converterType={"Currency Converter","Temperature Converter"};
    Pattern pattern=Pattern.compile("\\d*(\\.\\d*)?$");
    private double inputString;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBoxConverter.setValue("Choice an option");
        comboBoxConverter.getItems().addAll(converterType);
        comboBoxConverter.setOnAction(this::getConverterType);
        addListCurrency();
        errorMessage.setVisible(false);
        errorIcon.setVisible(false);
        inputAmount.textProperty().addListener(((observableValue, oldValue, newValue) -> {
            Matcher matcher=pattern.matcher(newValue);
            if(matcher.matches()){
                outputAmount.setText(newValue);
                errorMessage.setVisible(false);
                errorIcon.setVisible(false);
                if(!newValue.isEmpty()){
                    inputString=Double.parseDouble(newValue);
                }
                System.out.println(inputString);
            }else{
                outputAmount.clear();
                errorMessage.setVisible(true);
                errorIcon.setVisible(true);
            }

        }));
    }
    private void getConverterType(ActionEvent event){
        String myType = comboBoxConverter.getValue();
        if(myType.equals("Temperature Converter")){
            System.out.println("Temperature");
            comboBoxFrom.getItems().clear();
            comboBoxTo.getItems().clear();

        } else if (myType.equals("Currency Converter")) {
            System.out.println("Currency");
            comboBoxFrom.getItems().clear();
            comboBoxTo.getItems().clear();
            addListCurrency();
        }
    }
    private void getCoinType(ActionEvent event){
        String myCoin = String.valueOf(comboBoxFrom.getValue());
        System.out.println(myCoin);
        if(myCoin.equals("1")){
            comboBoxTo.getItems().clear();
            comboBoxTo.getItems().addAll(createCollectionFrom());
            comboBoxTo.setCellFactory(new Callback<ListView<ConvertFrom>, ListCell<ConvertFrom>>() {
                @Override
                public ListCell<ConvertFrom> call(ListView<ConvertFrom> convertFromListView) {
                    return new IconCell();
                }
            });
            comboBoxTo.setButtonCell(new IconCell());
        } else if (myCoin.equals("1")==false) {
            comboBoxTo.getItems().clear();
            comboBoxTo.getItems().addAll(createCollectionTo());
            comboBoxTo.setCellFactory(new Callback<ListView<ConvertFrom>, ListCell<ConvertFrom>>() {
                @Override
                public ListCell<ConvertFrom> call(ListView<ConvertFrom> convertFromListView) {
                    return new IconCell();
                }
            });
            comboBoxTo.setButtonCell(new IconCell());
            comboBoxTo.setValue(comboBoxTo.getItems().get(0));
        }
    }
    private void addListCurrency(){
        comboBoxFrom.getItems().addAll(createCollection());
        comboBoxFrom.setCellFactory(new Callback<ListView<ConvertFrom>, ListCell<ConvertFrom>>() {
            @Override
            public ListCell<ConvertFrom> call(ListView<ConvertFrom> convertFromListView) {
                return new IconCell();
            }
        });
        comboBoxFrom.setButtonCell(new IconCell());
        comboBoxFrom.setOnAction(this::getCoinType);
    }
}
