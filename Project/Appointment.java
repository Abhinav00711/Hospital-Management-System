package Screens;

import Screens.Menu;
import Screens.Login;
import FileUtils.CurrentUser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.*;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class Appointment extends Application {
	
	String id;
	
	@Override
	public void init() throws NullPointerException
	{
	
	}

	@Override
    public void start(Stage primaryStage) throws FileNotFoundException{
		Label heading = new Label("Appointment Form");
    	heading.setStyle("-fx-font: normal bold 20px 'arial' ");
		
		
		VBox elements = new VBox(15);
		elements.setAlignment(Pos.TOP_CENTER);
		
        HBox e1 = new HBox(2);
		Label symptom = new Label("Symptom :");
		symptom.setStyle("-fx-font: normal bold 15px 'arial' ");
		TextArea symptoms = new TextArea("Mention symptoms in seperate line");
        symptoms.setWrapText(true);
		symptoms.setPrefHeight(100);
		e1.getChildren().addAll(symptom, symptoms);
		
		HBox e2 = new HBox(2);
		Label specialization = new Label("Specialization :");
		specialization.setStyle("-fx-font: normal bold 15px 'arial' ");
		ChoiceBox<String> specializations = new ChoiceBox<String>();
        specializations.getItems().addAll("General", "ENT", "Cardiologists", "Dermatologists", "Endocrinologists");
		e2.getChildren().addAll(specialization, specializations);
		
		VBox e3 = new VBox(2);
		Label p1 = new Label("I would like :");
		p1.setStyle("-fx-font: normal bold 15px 'arial' ");
		ToggleGroup choice1 = new ToggleGroup();
        RadioButton op1 = new RadioButton("New patient appointment");
        op1.setToggleGroup(choice1);
        RadioButton op2 = new RadioButton("Routine Checkup");
        op2.setToggleGroup(choice1);
		RadioButton op3 = new RadioButton("Comprehensive Health Exam");
        op3.setToggleGroup(choice1);
		e3.getChildren().addAll(p1, op1, op2, op3);
		
		VBox e4 = new VBox(2);
		Label p = new Label("Have you previously attended our facility :");
		p.setStyle("-fx-font: normal bold 15px 'arial' ");
		ToggleGroup choice = new ToggleGroup();
        RadioButton yes = new RadioButton("Yes");
        yes.setToggleGroup(choice);
        RadioButton no = new RadioButton("No");
        no.setToggleGroup(choice);
		e4.getChildren().addAll(p, yes, no);
		
		VBox e5 = new VBox(2);
		Label p2 = new Label("Best time to call you :");
		p2.setStyle("-fx-font: normal bold 15px 'arial' ");
		ToggleGroup choice2 = new ToggleGroup();
        RadioButton morning = new RadioButton("Morning");
        morning.setToggleGroup(choice2);
        RadioButton noon = new RadioButton("Afternoon");
        noon.setToggleGroup(choice2);
		RadioButton eve = new RadioButton("Evening");
        eve.setToggleGroup(choice2);
		e5.getChildren().addAll(p2, morning, noon, eve);
		
		Button confirm = new Button("Confirm");
        confirm.setStyle("-fx-background-color: #278fcc; -fx-text-fill: white;");
		
		Button cancel = new Button("Cancel");
        cancel.setStyle("-fx-background-color: #278fcc; -fx-text-fill: white;");
		
		Region region1 = new Region();
        HBox.setHgrow(region1, Priority.ALWAYS);

        Region region2 = new Region();
        HBox.setHgrow(region2, Priority.ALWAYS);
		
		HBox btn = new HBox(10);
		btn.getChildren().addAll(region1,confirm,cancel,region2);
		
		elements.getChildren().addAll(e2,e3,e4,e5);
		
		FileInputStream inputstream1 = new FileInputStream("Images/appointment.png"); 
        Image app_img = new Image(inputstream1);
        ImageView app_imv = new ImageView(app_img);
        app_imv.setFitHeight(250); 
        app_imv.setFitWidth(250);
		
		GridPane gp1 = new GridPane();
		gp1.add(elements,0,0);
		gp1.add(app_imv,1,0);
		gp1.setAlignment(Pos.CENTER);
		
		VBox c = new VBox(15);
		c.getChildren().addAll(gp1,btn);
		c.setAlignment(Pos.CENTER);
		
		VBox all = new VBox(25);
		all.getChildren().addAll(heading,e1,c);
		all.setAlignment(Pos.TOP_CENTER);
		
		GridPane gp = new GridPane();
        gp.setMinSize(700, 600);
		gp.setAlignment(Pos.CENTER);
		gp.setStyle("-fx-background-color: LIGHTBLUE;");
		gp.add(all,0,0);
		
		primaryStage.setScene(new Scene(gp,700,600));
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:Images/icon.png"));
        primaryStage.setTitle("Appointment");
        primaryStage.setAlwaysOnTop(true);
		
		confirm.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	//Validate and confirm
            }
        });
		
		cancel.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					Menu menu = new Menu();
					menu.start(primaryStage);
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