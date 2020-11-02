package Screens;

import Screens.Menu;
import Screens.Login;
import FileUtils.CurrentUser;
import FileUtils.PatientFile;
import DataModel.Patient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

public class UserDetails extends Application {
	@Override
    public void start(Stage primaryStage) throws FileNotFoundException{
		
		String sid;
		
		sid = new CurrentUser().GetUser();
		if (sid.equals("")){
			try{
				Login login = new Login();
				login.start(primaryStage);
			} catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		} else {
			Patient p = new PatientFile().GetDetails(sid);
			
			Label heading = new Label("User Details");
			heading.setStyle("-fx-font: normal bold 20px 'arial' ");
			
			FileInputStream inputstream = new FileInputStream("Images/user_profile.png"); 
			Image user_img = new Image(inputstream);
			ImageView user_imv = new ImageView(user_img);
			user_imv.setFitHeight(200); 
			user_imv.setFitWidth(200); 
			
			VBox top = new VBox(20);
			top.getChildren().addAll(user_imv, heading);
			top.setAlignment(Pos.CENTER);
			
			Label id = dlabel("Patient ID :");
			Label Pid = plabel(p.getId());
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getGender());
			System.out.println(p.getPhone());
			System.out.println(p.getAddress());
			HBox hid = new HBox(5);
			hid.getChildren().addAll(id, Pid);
			
			Label name = dlabel("Name :");
			Label Pname = plabel(p.getName());
			HBox hname = new HBox(5);
			hname.getChildren().addAll(name, Pname);
			
			Label gender = dlabel("Gender :");
			Label Pgender = plabel(p.getGender());
			HBox hgender = new HBox(5);
			hgender.getChildren().addAll(gender, Pgender);
			
			Label phone = dlabel("Phone :");
			Label Pphone = plabel(p.getPhone());
			HBox hphone = new HBox(5);
			hphone.getChildren().addAll(phone, Pphone);
			
			Label address = dlabel("Address :");
			Label Paddress = plabel(p.getAddress());
			HBox haddress = new HBox(5);
			haddress.getChildren().addAll(address, Paddress);
			
			Label state = dlabel("State :");
			Label Pstate = plabel(p.getState());
			HBox hstate = new HBox(5);
			hstate.getChildren().addAll(state, Pstate);
			
			Button ok = new Button("OK");
			ok.setStyle("-fx-background-color: #278fcc; -fx-text-fill: white;");
			
			VBox element = new VBox(20);
			element.getChildren().addAll(hid, hname, hgender, hphone, haddress, hstate, ok);
			element.setAlignment(Pos.CENTER);
			
			VBox all = new VBox(30);
			all.getChildren().addAll(top,element);
			all.setAlignment(Pos.CENTER);
			
			GridPane gp = new GridPane();
			gp.setMinSize(700, 600);
			gp.setStyle("-fx-background-color: LIGHTBLUE;");
			gp.setAlignment(Pos.CENTER);
			
			gp.add(all,0,0);
			
			primaryStage.setScene(new Scene(gp,700,600));
			primaryStage.show();
			primaryStage.getIcons().add(new Image("file:Images/icon.png"));
			primaryStage.setTitle("User Details");
			primaryStage.setAlwaysOnTop(true);
			
			ok.setOnMouseClicked(new EventHandler<MouseEvent>(){
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
	}
	
	public Label plabel(String s){
		Label label = new Label(s);
		label.setWrapText(false);
    	label.setStyle("-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 1;" + 
                "-fx-border-radius: 1;" + 
                "-fx-border-color: #5494e3;");
		return label;
	}
	
	public Label dlabel(String s){
		Label label = new Label(s);
		label.setStyle("-fx-font: normal bold 15px 'arial' ");
		return label;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}