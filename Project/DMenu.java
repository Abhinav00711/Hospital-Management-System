package Screens;

import Screens.DUserDetails;
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
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class DMenu extends Application  {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
    	Label heading = new Label("Menu");
    	heading.setStyle("-fx-font: normal bold 30px 'arial' ");

        Label user = new Label("User Profile");
    	user.setStyle("-fx-text-fill: #67d0eb;" +
    			"-fx-font: normal bold 23px 'arial' ");
        ImageView user_imv = ImgVw("Images/user_profile.png");
        HBox hbox1 = BHBox();
        hbox1.getChildren().addAll(user_imv,user);

        Label app = new Label("  Check Up  ");
    	app.setStyle("-fx-text-fill: #4ea5d2;" +
    			"-fx-font: normal bold 23px 'arial' ");
        ImageView app_imv = ImgVw("Images/checkup.png");
        HBox hbox2 = BHBox();
        hbox2.getChildren().addAll(app_imv,app);
		
		HBox hboxa = new HBox();
    	hboxa.setAlignment(Pos.CENTER);
    	hboxa.setSpacing(30);
		hboxa.getChildren().addAll(hbox1,hbox2);

        Label qa = new Label("  About Us  ");
    	qa.setStyle("-fx-text-fill: #677feb;" +
    			"-fx-font: normal bold 23px 'arial' ");
        ImageView qa_imv = ImgVw("Images/q&a.png");
        HBox hbox3 = BHBox();
        hbox3.getChildren().addAll(qa_imv,qa);
		
		Label logout = new Label("   Logout   ");
    	logout.setStyle("-fx-text-fill: #677feb;" +
    			"-fx-font: normal bold 23px 'arial' ");
        ImageView logout_imv = ImgVw("Images/logout.png");
        HBox hbox4 = BHBox();
        hbox4.getChildren().addAll(logout_imv,logout);
		
		HBox hboxb = new HBox();
    	hboxb.setAlignment(Pos.CENTER);
    	hboxb.setSpacing(30);
		hboxb.getChildren().addAll(hbox3,hbox4);

        VBox vbox = new VBox(3);
    	vbox.setAlignment(Pos.TOP_CENTER);
    	vbox.setSpacing(50);
    	vbox.setStyle("-fx-background-color: LIGHTBLUE;");

        vbox.getChildren().addAll(heading,hboxa,hboxb);
        
        Scene scene = new Scene(vbox, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:Images/icon.png"));
        primaryStage.setTitle("Menu");
        primaryStage.setAlwaysOnTop(true);
		
		hbox1.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	hbox1.setMinSize(200, 200);
            } else {
            	hbox1.setMinSize(150, 150);
            }
        });
		
		hbox2.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	hbox2.setMinSize(250, 200);
            } else {
            	hbox2.setMinSize(150, 150);
            }
        });
		
		hbox3.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	hbox3.setMinSize(250, 200);
            } else {
            	hbox3.setMinSize(150, 150);
            }
        });
		
		hbox4.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
            	hbox4.setMinSize(250, 200);
            } else {
            	hbox4.setMinSize(150, 150);
            }
        });
		
		hbox1.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					DUserDetails duser = new DUserDetails();
					duser.start(primaryStage);
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
		
		hbox2.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	//Check UP
            }
        });
		
		hbox3.setOnMouseClicked(new EventHandler<MouseEvent>(){
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
		
		hbox4.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	try{
					Login login = new Login();
					login.start(primaryStage);
				} catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
            }
        });
    }

    private ImageView ImgVw(String s) throws FileNotFoundException{
        FileInputStream inputstream = new FileInputStream(s); 
        Image img = new Image(inputstream);
        ImageView imv = new ImageView(img);
        imv.setFitHeight(180); 
        imv.setFitWidth(130);

        return imv;
    }

    private HBox BHBox(){
        HBox hbox = new HBox(20);
    	hbox.setAlignment(Pos.CENTER);
    	hbox.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 5;" + 
                "-fx-border-color: #5494e3;");

        return hbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}