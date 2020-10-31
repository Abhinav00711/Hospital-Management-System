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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ChoiceBox;

public class Register extends Application  {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
    	
    	Label heading = new Label("Register Your Details");
    	heading.setStyle("-fx-font: normal bold 20px 'arial' ");
    	
    	TextField id = new TextField();
    	id.setPromptText("Patient ID");
    	TextField name = new TextField();
    	name.setPromptText("Name");
    	PasswordField password = new PasswordField();
    	password.setPromptText("Password");
    	PasswordField confirmPassword = new PasswordField();
    	confirmPassword.setPromptText("Confirm Password");
    	TextField phone = new TextField();
    	phone.setPromptText("Phone");
    	TextField address = new TextField();
    	address.setPromptText("Address");
    	
    	Label gen = new Label("Gender: ");
    	ToggleGroup gender = new ToggleGroup();
        RadioButton male = new RadioButton("Male");
        male.setToggleGroup(gender);
        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(gender);
        
        ChoiceBox<String> state = new ChoiceBox<String>();
        state.getItems().addAll("Karnataka", "Maharashtra", "West Bengal", "Uttar Pradesh", "Kerala");
        state.setValue("State");
    	
        FileInputStream inputstream1 = new FileInputStream("Images/file.png"); 
        Image file_img = new Image(inputstream1);
        ImageView file_imv = new ImageView(file_img);
        file_imv.setFitHeight(200); 
        file_imv.setFitWidth(150); 
        
        Button confirm = new Button("Confirm");
        confirm.setStyle("-fx-background-color: #278fcc; -fx-text-fill: white;");
        
        GridPane gp = new GridPane();
        gp.setMinSize(700, 600);
        gp.setStyle("-fx-background-color: LIGHTBLUE;");
        
        GridPane gp1 = new GridPane();
        gp1.setMinSize(300, 600);
        gp1.setAlignment(Pos.CENTER);
        gp1.setHgap(7);
        gp1.setVgap(25);
        gp1.setStyle("-fx-background-color: WHITE;");
        
        GridPane gp2 = new GridPane();
        gp2.setMinSize(400, 600);
        gp2.setAlignment(Pos.CENTER);
        gp2.setStyle("-fx-background-color: LIGHTBLUE;");
        gp2.add(file_imv, 0, 0);
        
        GridPane gp3 = new GridPane();
        gp3.setAlignment(Pos.CENTER);
        gp3.setHgap(7);
        gp3.add(gen, 0, 0);
        gp3.add(male, 1, 0);
        gp3.add(female, 2, 0);
        
        gp.add(gp1, 0, 0);
        gp.add(gp2, 1, 0);        
        
        gp1.add(heading, 0, 0);
        gp1.add(id, 0, 2);
        gp1.add(name, 0, 3);
        gp1.add(gp3, 0, 4);
        gp1.add(password, 0, 5);
        gp1.add(confirmPassword, 0, 6);
        gp1.add(phone, 0, 7);
        gp1.add(address, 0, 8);
        gp1.add(state, 0, 9);
        gp1.add(confirm, 0, 11);
        
        
        Scene scene = new Scene(gp, 700, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:Images/icon.png"));
        primaryStage.setTitle("Register");
        primaryStage.setAlwaysOnTop(true);
 
    }


    public static void main(String[] args) {
        launch(args);
    }
}
