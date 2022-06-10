package org.joseruiz.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    double dato1 = 0, dato2 = 0, resultado = 0;

    int op = 0;

    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnPor;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnRaiz;
    @FXML
    private Button btnValorAbsoluto;
    @FXML
    private Button btnC;
    @FXML
    private Button btnCE;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnPotencia;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnSignos;
    @FXML
    private TextField txtPantalla;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn1) {
            txtPantalla.setText(txtPantalla.getText() + "1");
        } else if (event.getSource() == btn2) {
            txtPantalla.setText(txtPantalla.getText() + "2");
        } else if (event.getSource() == btn3) {
            txtPantalla.setText(txtPantalla.getText() + "3");
        } else if (event.getSource() == btn4) {
            txtPantalla.setText(txtPantalla.getText() + "4");
        } else if (event.getSource() == btn5) {
            txtPantalla.setText(txtPantalla.getText() + "5");
        } else if (event.getSource() == btn6) {
            txtPantalla.setText(txtPantalla.getText() + "6");
        } else if (event.getSource() == btn7) {
            txtPantalla.setText(txtPantalla.getText() + "7");
        } else if (event.getSource() == btn8) {
            txtPantalla.setText(txtPantalla.getText() + "8");
        } else if (event.getSource() == btn9) {
            txtPantalla.setText(txtPantalla.getText() + "9");
        } else if (event.getSource() == btn0) {
            txtPantalla.setText(txtPantalla.getText() + "0");
        } else if (event.getSource() == btnMas) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            txtPantalla.clear();

            op = 1;
        } else if (event.getSource() == btnMenos) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            txtPantalla.clear();

            op = 2;
        } else if (event.getSource() == btnPor) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            txtPantalla.clear();

            op = 3;
        } else if (event.getSource() == btnDivision) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            txtPantalla.clear();

            op = 4;
        } else if (event.getSource() == btnPotencia) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            txtPantalla.clear();

            op = 5;
        } else if (event.getSource() == btnPorcentaje) {
            dato2 = Double.parseDouble(txtPantalla.getText());

            double porcentajeNumero = (dato1 * dato2) / (100);

            txtPantalla.setText(String.valueOf(porcentajeNumero));
        } else if (event.getSource() == btnIgual) {

            if (txtPantalla.getText().equals(String.valueOf(resultado))) {
                dato1 = resultado;
                
                txtPantalla.clear();

            } else {
                dato2 = Double.parseDouble(txtPantalla.getText());

                txtPantalla.clear();
            }

            switch (op) {
                case 1:
                    resultado = dato1 + dato2;

                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 2:
                    resultado = dato1 - dato2;

                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 3:
                    resultado = dato1 * dato2;

                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 4:
                    resultado = dato1 / dato2;

                    txtPantalla.setText(String.valueOf(resultado));
                    break;

                case 5:
                    resultado = Math.pow(dato1, dato2);

                    txtPantalla.setText(String.valueOf(resultado));

                    break;
            }
        } else if (event.getSource() == btnC) {
            txtPantalla.clear();
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            op = 0;
        } else if (event.getSource() == btnCE) {
            txtPantalla.clear();
        } else if (event.getSource() == btnRaiz) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            double raiz = Math.sqrt(dato1);

            txtPantalla.setText(String.valueOf(raiz));
        } else if (event.getSource() == btnSignos) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            double signo = dato1 * (-1);

            txtPantalla.setText(String.valueOf(signo));
        } else if (event.getSource() == btnValorAbsoluto) {
            dato1 = Double.parseDouble(txtPantalla.getText());

            double absoluto = Math.abs(dato1);

            txtPantalla.setText(String.valueOf(absoluto));
        } else if (event.getSource() == btnPunto) {
            if ((txtPantalla.getText().length() == 0) && (txtPantalla.getText().contains(".")) == false) {
                txtPantalla.setText("0.");
            } else if ((txtPantalla.getText().length() > 0) && (txtPantalla.getText().contains(".")) == false) {
                txtPantalla.setText(txtPantalla.getText() + ".");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
