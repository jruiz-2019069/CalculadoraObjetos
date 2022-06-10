
package org.joseruiz.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/*
    Programador: Jose Gerardo Ruiz García-2019069-IN5AM
    Fecha de Creacion: 
        15/04/2021
    Modificaciones:
        Creación de toda la vista en Scene Builder: 15/04/2021
        Creación completa de del controlador: 16/04/2021
        Creación completa de calculadora: 22/04/2021
*/

public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        escenarioPrincipal.setTitle("CALCULADORA CIENTÍFICA");
        
        escenarioPrincipal.setScene(scene);
        
        escenarioPrincipal.show();
        
        escenarioPrincipal.getIcons().add(new Image("org/joseruiz/image/images.png"));
        
        escenarioPrincipal.setResizable(false);
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
