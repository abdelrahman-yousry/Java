/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author U3
 */
public class LifeCycleTest extends Application {

    public LifeCycleTest()
    {
        String name = Thread.currentThread().getName();
        System.out.println("constructor() The current thread is:"+name);
    }
    
    @Override
    public void init() throws Exception {
         String name = Thread.currentThread().getName();
         System.out.println("Init() The current thread is:"+name);         
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
         String name = Thread.currentThread().getName();
         System.out.println("Start() The current thread is:"+name);         
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
    public static void main(String args[])
    {
        Application.launch(args);
         String name = Thread.currentThread().getName();
         System.out.println("main()The current thread is:"+name);           
        
    }
    
    @Override
    public void stop()
    {
        
         String name = Thread.currentThread().getName();
         System.out.println("Stop() The current thread is:"+name); 
    }
    
}
