package test;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Abdelrahman Yousry
 */
public class MyWind extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     * this main function have a method called launch which 
     * is method in the Application class
     * so I can call the function directly 
     * or calling it by the name of the class
     * Application.launch
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * we have two methods to launch our app in javafx
     * one of them is to put the main method in the class which 
     * will extend from the application class
     * and the other is to have two classes seperated so we will 
     * write this     
     * public static void main(MyWind.class,String[] args) {
     *   launch(args);
     * }
     * so i should pass the class MyWind.class which extend 
     * from the application class ,, and I couldn't pass obj from
     * this class because by this I took part from the life cycle 
     * and the runtime should do this by itself
     * 
     */
}
