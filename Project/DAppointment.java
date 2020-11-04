package Screens;

import FileUtils.DoctorFile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.ListView;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos; 
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.beans.value.ChangeListener;
import java.io.FileNotFoundException;
import javafx.scene.image.*;
import javafx.scene.control.TextArea;

public class DAppointment extends Application{
    @Override
    public void start(Stage primaryStage){
        List<String> pList = new DoctorFile().GetAppointmentList();
		
		if (pList.size() == 0){
			Label heading = new Label("No Appointments");
			heading.setStyle("-fx-font: normal bold 30px 'arial' ");
			
			Button back = new Button("Back to Menu");
			back.setStyle("-fx-background-color: #278fcc; -fx-text-fill: white;");
			
			VBox elements = new VBox(20);
			elements.setAlignment(Pos.CENTER);
			elements.getChildren().addAll(heading,back);
			
			primaryStage.setScene(new Scene(elements,700,600));
			primaryStage.show();
			primaryStage.getIcons().add(new Image("file:Images/icon.png"));
			primaryStage.setTitle("Appointment");
			primaryStage.setAlwaysOnTop(true);
			
			back.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent arg0) {
					try{
						DMenu dmenu = new DMenu();
						dmenu.start(primaryStage);
					} catch (FileNotFoundException e)
					{
						e.printStackTrace();
					}
				}
			});
		} else {
			VBox vbox = new VBox();
			vbox.setAlignment(Pos.TOP_CENTER);
			vbox.setSpacing(50);
			vbox.setStyle("-fx-background-color: LIGHTBLUE;");

			HBox hbox = new HBox();
			hbox.setAlignment(Pos.CENTER);
			hbox.setPrefWidth(400);
			hbox.setPrefWidth(500);

			VBox vbox1 = new VBox();
			vbox1.setPrefSize(300, 400);
			vbox1.setSpacing(20);
			vbox1.setAlignment(Pos.CENTER);
			vbox1.setStyle("-fx-padding: 10;" + 
			"-fx-background-color: WHITE;" +
			"-fx-border-style: solid inside;" + 
			"-fx-border-width: 2;" +
			"-fx-border-insets: 5;" + 
			"-fx-border-radius: 5;" + 
			"-fx-border-color: #5494e3;");
				
			ObservableList<String> patientsList = FXCollections.observableArrayList(pList);
			ListView<String> lv = new ListView<String>(patientsList);
			lv.setMaxSize(200, 180);

			Label head = new Label("Patient List");
			head.setStyle("-fx-font: normal bold 30px 'arial';"
							+ "-fx-text-fill: #d94364;");
			head.setAlignment(Pos.CENTER);

			Button select = new Button("Select");
			select.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white;");

			Label back = new Label("<- Back to Menu");
			back.setStyle("-fx-font: normal bold 16px 'arial';"
					+ "-fx-text-fill : black");
			
			vbox1.getChildren().add(lv);
			vbox1.getChildren().add(select);
			vbox1.getChildren().add(back);

			hbox.getChildren().add(vbox1);   

			vbox.getChildren().add(head);
			vbox.getChildren().add(hbox);

			Scene scene = new Scene(vbox, 700, 600);
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.getIcons().add(new Image("file:Images/icon.png"));
			primaryStage.setTitle("Appointment");
			primaryStage.setAlwaysOnTop(true);

			//Screen2
			HBox hbox1 = new HBox();
			hbox1.setAlignment(Pos.CENTER);
			hbox1.setPrefWidth(400);
			hbox1.setPrefWidth(500);

			VBox vbox2 = new VBox();
			vbox2.setPrefSize(600, 500);
			vbox2.setSpacing(20);
			vbox2.setStyle("-fx-padding: 10;" + 
			"-fx-background-color: WHITE;" +
			"-fx-border-style: solid inside;" + 
			"-fx-border-width: 2;" +
			"-fx-border-insets: 5;" + 
			"-fx-border-radius: 5;" + 
			"-fx-border-color: #5494e3;");

			Label head1 = new Label("Appointment");
			head1.setStyle("-fx-font: normal bold 30px 'arial';"
							+ "-fx-text-fill: #d94364;");
			head1.setAlignment(Pos.CENTER);

			Label symptoms = new Label("Symptoms");
			symptoms.setStyle("-fx-font: normal bold 20px 'arial';"
							+ "-fx-text-fill: DARKBLUE;");

			TextArea sym = new TextArea();
			sym.setPrefHeight(150);
			sym.setEditable(false);

			Label feedback = new Label("Doctor's Feedback");
			feedback.setStyle("-fx-font: normal bold 20px 'arial';"
							+ "-fx-text-fill: DARKBLUE;");

			TextArea fb = new TextArea();
			fb.setPrefHeight(150);

			HBox hbox2 = new HBox();
			hbox2.setAlignment(Pos.CENTER);
			hbox2.setSpacing(10);

			Button submit = new Button("Submit");
			submit.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white;");

			Button back1 = new Button("Back");
			back1.setStyle("-fx-background-color: lightgreen; -fx-text-fill: white;");

			hbox2.getChildren().add(back1);
			hbox2.getChildren().add(submit);

			vbox2.getChildren().add(symptoms);
			vbox2.getChildren().add(sym);
			vbox2.getChildren().add(feedback);
			vbox2.getChildren().add(fb);
			vbox2.getChildren().add(hbox2);



			//Event Handling
			back.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
				if (newValue) {
					back.setTextFill(Color.BLUEVIOLET);
				} else {
					back.setTextFill(Color.BLACK);
				}
			});

			back.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent arg0) {
					try{
						DMenu dm = new DMenu();
						dm.start(primaryStage);
					} catch (FileNotFoundException e){
						e.printStackTrace();
					}
				}
			});

			select.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent arg0) {
					vbox.getChildren().clear();
					//add the new components
					hbox1.getChildren().add(vbox2);
					vbox.getChildren().add(head1);
					vbox.getChildren().add(hbox1);
				}
			});
			back1.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent arg0) {
					vbox.getChildren().clear();
					vbox.getChildren().add(head);
					vbox.getChildren().add(hbox);
				}
			});
			submit.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent arg0) {
					//add to file
				}
			});
		}
    }

    public static void main(String args[]){
        launch(args);
    }
}