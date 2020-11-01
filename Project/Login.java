package Screens;

import Screens.Register;
import Screens.Menu;
import FileUtils.CurrentUser;
import FileUtils.PatientFile;

import javafx.application.Application;
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
import javafx.beans.value.ChangeListener;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.*; 
import javafx.beans.value.*; 
import java.lang.String;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Login extends Application  {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
    	VBox vbox = new VBox(3);
    	vbox.setAlignment(Pos.TOP_CENTER);
    	vbox.setSpacing(150);
    	vbox.setStyle("-fx-background-color: LIGHTBLUE;");
    	
    	HBox hbox = new HBox();
    	hbox.setAlignment(Pos.CENTER);
    	hbox.setSpacing(10);
        
        ToggleGroup role = new ToggleGroup();
        
        RadioButton doctor = new RadioButton("Doctor");
        doctor.setToggleGroup(role);
        RadioButton patient = new RadioButton("Patient");
        patient.setToggleGroup(role);
        
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
        
        FileInputStream inputstream1 = new FileInputStream("Images/user.png"); 
        Image user_img = new Image(inputstream1);
        ImageView user_imv = new ImageView(user_img);
        user_imv.setFitHeight(30); 
        user_imv.setFitWidth(20); 
        
        FileInputStream inputstream2 = new FileInputStream("Images/lock.png"); 
        Image pass_img = new Image(inputstream2);
        ImageView pass_imv = new ImageView(pass_img);
        pass_imv.setFitHeight(30); 
        pass_imv.setFitWidth(20); 
       
        GridPane gridPane = new GridPane();
        gridPane.setMinSize(300, 300);
        
        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER);
        gp1.add(doctor, 0, 0);
        gp1.add(patient, 1, 0);
        gp1.setHgap(7);
        gp1.setStyle("-fx-background-color: LIGHTSKYBLUE;"); 
        
        gridPane.setVgap(7); 
        gridPane.setHgap(7);       
        
        gridPane.setAlignment(Pos.CENTER);  
        gridPane.add(gp1, 1, 0);
        gridPane.add(user_imv, 0, 1); 
        gridPane.add(user_field, 1, 1);
        gridPane.add(pass_imv, 0, 2); 
        gridPane.add(pass_field, 1, 2);
        gridPane.add(login, 1, 3);
        gridPane.add(register, 1, 4);
        gridPane.setStyle("-fx-background-color: WHITE;");  
        
        hbox.getChildren().add(gridPane);
        
        vbox.getChildren().add(heading);
        vbox.getChildren().add(hbox);
        

        login.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white;");
        
        Scene scene = new Scene(vbox, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:Images/icon.png"));
        primaryStage.setTitle("Login");
        primaryStage.setAlwaysOnTop(true);
        
        
        register.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
                register.setTextFill(Color.BLUEVIOLET);
            } else {
            	register.setTextFill(Color.BLACK);
            }
        });
        
        role.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){ 
            public void changed(ObservableValue<? extends Toggle> ob, Toggle o, Toggle n){ 
            	String s = "";
                RadioButton rb = (RadioButton)role.getSelectedToggle(); 
  
                if (rb != null) { 
                    s = rb.getText(); 
                } 
                if(s.equals("Doctor")) {
                	register.setVisible(false);
                }
                else {
                	register.setVisible(true);
                }
            } 
        }); 
        
		register.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					Register register = new Register();
					register.start(primaryStage);
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		login.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
				Alert a = new Alert(AlertType.ERROR);
				a.setHeaderText("Invalid Input");
				a.initOwner(primaryStage);
				
				if (user_field.getText().isEmpty()) {
					a.setContentText("Enter Username/ID");
					a.showAndWait();
				} else if (pass_field.getText().isEmpty()) {
					a.setContentText("Enter Password");
					a.show();
				} else  {
					String s = "";
					RadioButton rb = (RadioButton)role.getSelectedToggle(); 
					if (rb != null) { 
						s = rb.getText();
						if(s.equals("Doctor")) {
							//Doctor sign in
						}
						else {
							boolean authentic;
							authentic = new PatientFile().IsAuthenticatePatient(user_field.getText(),pass_field.getText());
							if(authentic){
								new CurrentUser().UpdateUser(user_field.getText());
								try{
									Menu menu = new Menu();
									menu.start(primaryStage);
								} catch (FileNotFoundException e)
								{
									e.printStackTrace();
								}
							} else {
								a.setHeaderText("Login Unsuccessful");
								a.setContentText("Incorrect Username/Password");
								a.showAndWait();
							}
						}
					} else {
						a.setContentText("Select Role (Doctor/Patient)");
						a.showAndWait();
					}
				}
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}