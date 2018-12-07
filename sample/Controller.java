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
    public Label rating;


    public void clickAction(ActionEvent actionEvent) {
        System.out.println(weight.getText());
        double w = Double.parseDouble(weight.getText());
        double h = Double.parseDouble(height.getText());
        double bmi = w / (h * h);

        result.setText("Your BMI is " + String.format("%.2f", bmi));

        if (bmi < 20)  rating.setText("Underweight");
         else
            if (bmi < 25) rating.setText("Normal");
         else
            if (bmi < 30) rating.setText("Overweight");
        else rating.setText("Obese");



    }
}
