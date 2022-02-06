package helloWorld;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Abdelrahman Yousry
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Text t = new Text("Hello world");
        t.setId("t1");
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        t.setEffect(r);
        Rectangle r1 = new Rectangle(0,0,300,255);
        r1.setId("r1");
        StackPane root = new StackPane();
        root.getChildren().add(r1);
        root.getChildren().add(t);
        Scene scene = new Scene(root, 300, 250);     

//        scene.getStylesheets().clear();
//        scene.getStylesheets().add(getClass().getResource("/csspckg/css_style.css").toString());
        File file = new File("src/csspckg/css_style.css");
        scene.getStylesheets().add("file:///" +file.getAbsolutePath().replace("\\", "/"));
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     * this main function have a method called launch which 
     * is method in the 
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
