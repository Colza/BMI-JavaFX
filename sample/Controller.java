package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class Controller {
    public TextField weight;
    public TextField height;
    public Button calculate;
    public Label result;


    public void clickAction(ActionEvent actionEvent) {
        System.out.println(weight.getText());
       double w = Double.parseDouble(weight.getText());
       double h = Double.parseDouble(height.getText());
       double bmi = w / (h * h);
       result.setText("Your BMI is " + bmi);
    }
}
