package lk.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label answer;


    public void devide(ActionEvent actionEvent) {
       double a = Double.parseDouble(num1.getText());
       double b = Double.parseDouble(num2.getText());
       double c = a / b;
       answer.setText(Double.toString(c));  
    }

    public void multiply(ActionEvent actionEvent) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double ans = a * b;
        answer.setText("" + ans);
    }

    public void add(ActionEvent actionEvent) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        int ans = a + b;
        answer.setText("" + ans);
    }

    public void sub(ActionEvent actionEvent) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        int ans = a - b;
        answer.setText("" + ans);
    }

    public void mod(ActionEvent actionEvent) {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        int ans = a % b;
        answer.setText("" + ans);

    }

}
