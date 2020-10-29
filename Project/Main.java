package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane; 
import javafx.scene.image.*;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.geometry.Pos; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle;
import javafx.beans.value.ChangeListener;

public class Main extends Application  {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
    	Rectangle r1 = new Rectangle();  
        r1.setWidth(100.0f); 
        r1.setHeight(200.0f); 
        Rectangle r2 = new Rectangle();  
        r2.setWidth(100.0f); 
        r2.setHeight(200.0f); 
        Rectangle r3 = new Rectangle();  
        r3.setWidth(100.0f); 
        r3.setHeight(200.0f); 
        Rectangle r4 = new Rectangle();  
        r4.setWidth(100.0f); 
        r4.setHeight(200.0f); 
        Rectangle r5 = new Rectangle();  
        r5.setWidth(100.0f); 
        r5.setHeight(200.0f); 
        Rectangle r6 = new Rectangle();  
        r6.setWidth(100.0f); 
        r6.setHeight(200.0f); 
        Rectangle r7 = new Rectangle();  
        r7.setWidth(100.0f); 
        r7.setHeight(200.0f); 
        Rectangle r8 = new Rectangle();  
        r8.setWidth(100.0f); 
        r8.setHeight(200.0f); 
        r1.setFill(Color.LIGHTBLUE);
        r2.setFill(Color.LIGHTBLUE);
        r3.setFill(Color.LIGHTBLUE);
        r4.setFill(Color.LIGHTBLUE);
        r5.setFill(Color.LIGHTBLUE);
        r6.setFill(Color.LIGHTBLUE);
        r7.setFill(Color.LIGHTBLUE);
        r8.setFill(Color.LIGHTBLUE);
        
        Label heading = new Label("Hospital Management System");
        heading.setStyle("-fx-font: normal bold 20px 'arial' "); 
        heading.setAlignment(Pos.CENTER);
        
        Label register = new Label("Not a user yet? Register");
        register.setUnderline(true);
        
        TextField user_field = new TextField();
        user_field.setPromptText("Username");
        PasswordField pass_field = new PasswordField();
        pass_field.setPromptText("Password");
        
        Button login = new Button("Login");
        
        FileInputStream inputstream1 = new FileInputStream("user.png"); 
        Image user_img = new Image(inputstream1);
        ImageView user_imv = new ImageView(user_img);
        user_imv.setFitHeight(30); 
        user_imv.setFitWidth(20); 
        
        FileInputStream inputstream2 = new FileInputStream("lock.png"); 
        Image pass_img = new Image(inputstream2);
        ImageView pass_imv = new ImageView(pass_img);
        pass_imv.setFitHeight(30); 
        pass_imv.setFitWidth(20); 
        
        GridPane gp = new GridPane();
        gp.setMinSize(490, 600);
        GridPane gridPane = new GridPane();
        
        
        gridPane.setMinSize(200, 100); 
        gridPane.setPadding(new Insets(12, 12, 12, 12));  
        gridPane.setVgap(7); 
        gridPane.setHgap(7);       
        
        gridPane.setAlignment(Pos.CENTER);  
        gridPane.add(user_imv, 0, 0); 
        gridPane.add(user_field, 1, 0);
        gridPane.add(pass_imv, 0, 1); 
        gridPane.add(pass_field, 1, 1);
        gridPane.add(login, 1, 2);
        gridPane.add(register, 1, 3);
        gridPane.setStyle("-fx-background-color: WHITE;");  
        
        
        gp.setAlignment(Pos.CENTER);
        gp.add(r1, 0, 0);
        gp.add(heading, 1, 0);
        gp.add(r3, 2, 0);
        gp.add(r4, 0, 1);
        gp.add(gridPane, 1, 1);
        gp.add(r5, 2, 1);
        gp.add(r6, 0, 2);
        gp.add(r7, 1, 2);
        gp.add(r8, 2, 2);
        gp.setStyle("-fx-background-color: LIGHTBLUE;");
        

        login.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white;");
        
        Scene scene = new Scene(gp, 490, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:icon.png"));
        primaryStage.setTitle("Login");
        primaryStage.setAlwaysOnTop(true);
        
        
        register.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
                register.setTextFill(Color.BLUEVIOLET);
            } else {
            	register.setTextFill(Color.BLACK);
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}