/*
    The Controller class.
    This class is designed to control the nodes (input fields, result fields, etc).
*/

import java.util.InputMismatchException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller {

    // connecting the fields with their specific nodes in the FXML file.
    @FXML
    private Button resetBtn;
    @FXML
    private Button addBtn;
    @FXML
    private Button subBtn;
    @FXML
    private Button multBtn;
    @FXML
    private Button divBtn;
    @FXML
    private Button reduceBtn;
    @FXML
    private TextField num1TextField;
    @FXML
    private TextField num2TextField;
    @FXML
    private TextField resultTextField;
    @FXML
    private Alert alert; // creating an Alert object to display errors.

    // to change the alert massage depending the thrown exception.
    public void showAlert(String log) {
        alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(log);
        alert.setContentText("Click on ok to reset fields");
        if (alert.showAndWait().get() == ButtonType.OK) {
            resetFields();
        }
    }

    public void resetFields() {
        num1TextField.clear();
        num2TextField.clear();
        resultTextField.clear();
    }

    // Arithmetic methods are programed to call the Fraction class and handling the
    // thrown exceptions.
    public void add() {
        try {
            Fraction num1 = new Fraction(num1TextField.getText());
            Fraction num2 = new Fraction(num2TextField.getText());
            resultTextField.setText(num1.addFraction(num2).toString());
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e) {
            showAlert(e.getMessage());
        }
    }

    public void subtract() {
        try {
            Fraction num1 = new Fraction(num1TextField.getText());
            Fraction num2 = new Fraction(num2TextField.getText());
            resultTextField.setText(num1.subtractFraction(num2).toString());
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e) {
            showAlert(e.getMessage());
        }
    }

    public void multiply() {
        try {
            Fraction num1 = new Fraction(num1TextField.getText());
            Fraction num2 = new Fraction(num2TextField.getText());
            resultTextField.setText(num1.multiplyFraction(num2).toString());
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e) {
            showAlert(e.getMessage());
        }
    }

    public void divide() {
        try {
            Fraction num1 = new Fraction(num1TextField.getText());
            Fraction num2 = new Fraction(num2TextField.getText());
            resultTextField.setText(num1.divideFraction(num2).toString());
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e) {
            showAlert(e.getMessage());
        }
    }

    /*
     * accept the input if the user decided to write the number in one of the input
     * fields, otherwise throw an error.
     */
    public void reduce() {
        try {
            if (num2TextField.getText().isBlank() && !num1TextField.getText().isBlank()) {
                Fraction num1 = new Fraction(num1TextField.getText());
                resultTextField.setText(num1.toString());
            } else if (num1TextField.getText().isBlank() && !num2TextField.getText().isBlank()) {
                Fraction num2 = new Fraction(num2TextField.getText());
                num2.reduceFraction();
                resultTextField.setText(num2.toString());
            } else {
                throw new InputMismatchException("Please Enter one fraction");
            }
        } catch (InputMismatchException | NumberFormatException | ArithmeticException e) {
            showAlert(e.getMessage());
        }
    }
}
