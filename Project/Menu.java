package Screens;

import Screens.Appointment;
import Screens.UserDetails;
import Screens.Login;
import Screens.AboutUs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage; 
import javafx.scene.image.*;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.geometry.Pos; 
import javafx.beans.value.ChangeListener;
import java.lang.String;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class Menu extends Application  {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
    	VBox vbox = new VBox(3);
    	vbox.setAlignment(Pos.TOP_CENTER);
    	vbox.setSpacing(50);
    	vbox.setStyle("-fx-background-color: LIGHTBLUE;");
    	
    	Label heading = new Label("Menu");
    	heading.setStyle("-fx-font: normal bold 30px 'arial' ");
    	
    	String det = "Hospital Management System allows patients to remotely interact with doctors\nHospital Management System allows patients to remotely interact with doctors\n";
    	Label details = new Label(det);
		details.setWrapText(false);
    	details.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 1;" + 
                "-fx-border-radius: 1;" + 
                "-fx-border-color: #5494e3;");
    	
    	HBox hbox = new HBox();
    	hbox.setAlignment(Pos.CENTER);
    	hbox.setSpacing(30);
    	
    	VBox vbox1 = new VBox(3);
    	vbox1.setAlignment(Pos.CENTER);
    	vbox1.setSpacing(30);
    	vbox1.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 5;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vbox2 = new VBox(3);
    	vbox2.setAlignment(Pos.CENTER);
    	vbox2.setSpacing(30);
    	vbox2.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 5;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vbox3 = new VBox(3);
    	vbox3.setAlignment(Pos.CENTER);
    	vbox3.setSpacing(30);
    	vbox3.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 5;" + 
                "-fx-border-color: #5494e3;");
    	
    	Label user = new Label("User Profile");
    	user.setStyle("-fx-text-fill: #67d0eb;" +
    			"-fx-font: normal bold 23px 'arial' ");
    	Label app = new Label("Appointment");
    	app.setStyle("-fx-text-fill: #ed615c;" +
    			"-fx-font: normal bold 23px 'arial' ");
    	Label qa = new Label("About Us");
    	qa.setStyle("-fx-text-fill: #677feb;" +
    			"-fx-font: normal bold 23px 'arial' ");
        
        FileInputStream inputstream = new FileInputStream("Images/user_profile.png"); 
        Image user_img = new Image(inputstream);
        ImageView user_imv = new ImageView(user_img);
        user_imv.setFitHeight(180); 
        user_imv.setFitWidth(130); 
        
        FileInputStream inputstream1 = new FileInputStream("Images/appointment.png"); 
        Image app_img = new Image(inputstream1);
        ImageView app_imv = new ImageView(app_img);
        app_imv.setFitHeight(180); 
        app_imv.setFitWidth(130); 
        
        FileInputStream inputstream2 = new FileInputStream("Images/q&a.png"); 
        Image qa_img = new Image(inputstream2);
        ImageView qa_imv = new ImageView(qa_img);
        qa_imv.setFitHeight(180); 
        qa_imv.setFitWidth(130); 
        
        vbox1.getChildren().add(user_imv);
        vbox1.getChildren().add(user);
        
        vbox2.getChildren().add(app_imv);
        vbox2.getChildren().add(app);
        
        vbox3.getChildren().add(qa_imv);
        vbox3.getChildren().add(qa);
        
        hbox.getChildren().add(vbox1);
        hbox.getChildren().add(vbox2);
        hbox.getChildren().add(vbox3);
        
        vbox.getChildren().add(heading);
        vbox.getChildren().add(details);
        vbox.getChildren().add(hbox);
        
                
        Scene scene = new Scene(vbox, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:Images/icon.png"));
        primaryStage.setTitle("Menu");
        primaryStage.setAlwaysOnTop(true);
        
        vbox1.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	vbox1.setMinSize(200, 300);
            } else {
            	vbox1.setMinSize(150, 150);
            }
        });
        
        vbox2.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	vbox2.setMinSize(200, 300);
            } else {
            	vbox2.setMinSize(150, 150);
            }
        });
        
        vbox3.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	vbox3.setMinSize(200, 300);
            } else {
            	vbox3.setMinSize(150, 150);
            }
        });
        
        vbox1.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					UserDetails user = new UserDetails();
					user.start(primaryStage);
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
        
        vbox2.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					Appointment appointment = new Appointment();
					appointment.start(primaryStage);
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
        
        vbox3.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					AboutUs aboutus = new AboutUs();
					aboutus.start(primaryStage);
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}