package app;

import app.converters.CurrencyConverter;
import app.converters.TemperatureConverter;
import utilities.ObjectList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import utilities.IconCell;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utilities.CreateCollections.*;

public class MainController implements Initializable {
    @FXML
    private ComboBox<String> comboBoxConverter;
    @FXML
    private ComboBox<ObjectList> comboBoxFrom;
    @FXML
    private ComboBox<ObjectList> comboBoxTo;
    @FXML
    private TextField inputAmount;
    @FXML
    private TextField outputAmount;
    @FXML
    private Label errorMessage;
    @FXML
    private ImageView errorIcon;

    /**
     * A string array containing the conversion types available to the user
     * */
    private final String[] converterType={"Currency Converter","Temperature Converter"};
    /**
     * A regular expression used to validate user input in the user interface
     * */
    Pattern patternCurrency = Pattern.compile("\\d*(\\.\\d*)?$");
    Pattern patternTemperature= Pattern.compile("^-?\\d*(\\.\\d*)?$");
    Pattern currentPattern=patternCurrency;

    private String myType="Currency Converter";
    private double inputString;
    private String myOptionOne;
    private String myOptionTwo;

    /**
     * Initializes the user interface and adds options to the ComboBox. It also sets event listeners on the input and output objects
     * @param url a URL object representing the URL used to resolve relative paths
     * @param resourceBundle a ResourceBundle object represents the user interfaces resources
     * */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBoxConverter.setValue("Choice an option");
        comboBoxConverter.getItems().addAll(converterType);
        comboBoxConverter.setOnAction(this::getConverterType);
        addListCurrency();
        errorMessage.setVisible(false);
        errorIcon.setVisible(false);
        inputAmount.setEditable(false);
        inputAmount.textProperty().addListener(((observableValue, oldValue, newValue) -> {
            Matcher matcher= currentPattern.matcher(newValue);
            inputString=0;
            if(matcher.matches()){
                outputAmount.setText(newValue);
                errorMessage.setVisible(false);
                errorIcon.setVisible(false);
                if(!newValue.isEmpty() && !newValue.equals("-")){
                    inputString=Double.parseDouble(newValue);
                }else{
                    inputString=0;
                }
                switch (myOptionOne) {
                    case "1" -> {
                        if (inputString != 0) {
                            if (myOptionTwo != null) {
                                outputAmount.setText(String.format("%.4g", CurrencyConverter.convertToCoins(myOptionTwo, inputString)));
                            }
                        }
                    }
                    case "2", "3", "4", "5", "6" -> {
                        if (inputString != 0) {
                            outputAmount.setText(String.format("%.4g", CurrencyConverter.convertToPEN(myOptionOne, inputString)));
                        }
                    }
                    case "7", "8", "9" -> {
                        if (myOptionTwo!=null) {
                                if (inputString!=0) {
                                    outputAmount.setText(String.format("%.4g", TemperatureConverter.convertTo(myOptionOne,myOptionTwo,inputString)));
                                }
                        } else {
                            outputAmount.clear();
                        }
                    }
                }
            }else{
                outputAmount.clear();
                switch (myType){
                    case "Temperature Converter" -> errorMessage.setText("You must enter only positive or negative integers");
                    case "Currency Converter" -> errorMessage.setText("You must enter only positive integers");
                }
                errorMessage.setVisible(true);
                errorIcon.setVisible(true);
            }

        }));
    }
    /**
     * Initializes the "comboBoxFrom" in the currency converter with a list of available currencies
     * Attaches an event handler for when a coin is selected
     * */
    private void addListCurrency(){
        comboBoxFrom.getItems().addAll(createCollection());
        comboBoxFrom.setCellFactory(convertFromListView -> new IconCell());
        comboBoxFrom.setButtonCell(new IconCell());
        comboBoxFrom.setOnAction(this::getCoinType);
    }
    /**
     * Set converter type
     * @param event the action event that triggers the method call
     * */
    private void getConverterType(ActionEvent event){
        myType = comboBoxConverter.getValue();
        if(myType.equals("Temperature Converter")){
            comboBoxFrom.getItems().clear();
            comboBoxTo.getItems().clear();
            inputAmount.clear();
            inputAmount.setEditable(false);
            outputAmount.clear();
            addListTemperature();
            currentPattern=patternTemperature;

        } else if (myType.equals("Currency Converter")) {
            comboBoxFrom.getItems().clear();
            comboBoxTo.getItems().clear();
            inputAmount.clear();
            inputAmount.setEditable(false);
            outputAmount.clear();
            addListCurrency();
            currentPattern=patternCurrency;
        }
    }
    /**
     * Get the type of currency selected in the "comboBoxFrom". Once a currency type has been selected, updates the "comboBoxTo" with the options
     * It also updates the "outputAmount" text field with the value converted
     * @param event the action event that triggers the method call
     * */
    private void getCoinType(ActionEvent event){
        inputAmount.setEditable(true);
        myOptionOne = String.valueOf(comboBoxFrom.getValue());
        if(myOptionOne.equals("1")){
            comboBoxTo.getItems().clear();
            comboBoxTo.getItems().addAll(createCollectionFrom());
            comboBoxTo.setCellFactory(convertFromListView -> new IconCell());
            comboBoxTo.setButtonCell(new IconCell());
            comboBoxTo.setOnAction(this::getCoinTypeTo);
        } else {
            comboBoxTo.getItems().clear();
            comboBoxTo.getItems().addAll(createCollectionTo());
            comboBoxTo.setCellFactory(convertFromListView -> new IconCell());
            comboBoxTo.setButtonCell(new IconCell());
            comboBoxTo.setValue(comboBoxTo.getItems().get(0));
            comboBoxTo.setOnAction(this::getCoinTypeTo);
        }
        if(inputString!=0){
            outputAmount.setText(String.format("%.4g",CurrencyConverter.convertToPEN(myOptionOne,inputString)));
        }
    }
    /**
     * Updates the conversion when the currency is selected en the "comboBoxTo"
     * @param event the action event that triggers the method call
     * */
    private void getCoinTypeTo(ActionEvent event){
        myOptionTwo =String.valueOf(comboBoxTo.getValue());
        if(inputString!=0){
            outputAmount.setText(String.format("%.4g", CurrencyConverter.convertToCoins(myOptionTwo, inputString)));
        }
    }
    /**
     * Fills the "comboBoxFrom" with a collection of temperature values
     * Adds an event handler to detect when the user selects a temperature type
     * */
    private void addListTemperature(){
        comboBoxFrom.getItems().clear();
        comboBoxFrom.getItems().addAll(createCollectionTemp());
        comboBoxFrom.setCellFactory(convertFromListView -> new IconCell());
        comboBoxFrom.setButtonCell(new IconCell());
        comboBoxFrom.setOnAction(this::getTemperatureType);
    }
    /**
     * Enables the user to select a temperature unit and updates the available options for conversion.
     * @param event the action event that triggers the method call
     * */
    public void getTemperatureType(ActionEvent event){
        inputAmount.setEditable(true);
        myOptionOne=String.valueOf(comboBoxFrom.getValue());
        comboBoxTo.getItems().clear();
        comboBoxTo.getItems().addAll(createCollectionTemp().stream().filter(temp -> !temp.toString().equalsIgnoreCase(myOptionOne)).toList());
        comboBoxTo.setCellFactory(convertFromListView -> new IconCell());
        comboBoxTo.setButtonCell(new IconCell());
        comboBoxTo.setOnAction(this::getTemperatureTypeTwo);
        if (myOptionTwo!=null) {
            if (inputString!=0) {
                outputAmount.setText(String.format("%.4g", TemperatureConverter.convertTo(myOptionOne,myOptionTwo,inputString)));
            }
        } else {
            outputAmount.clear();
        }
    }
    /**
     * Update the conversion when the temperature is selected in the "comboBoxTo"
     * @param event the action event that triggers the method call
     * */
    private void getTemperatureTypeTwo(ActionEvent event){
        myOptionTwo=String.valueOf(comboBoxTo.getValue());
        if (myOptionTwo!=null) {
            if (inputString!=0) {
                outputAmount.setText(String.format("%.4g", TemperatureConverter.convertTo(myOptionOne,myOptionTwo,inputString)));
            }
        } else {
            outputAmount.clear();
        }
    }

}
