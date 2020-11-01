import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage; 
import javafx.scene.image.*;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import javafx.geometry.Pos; 
import javafx.beans.value.ChangeListener;
import javafx.scene.paint.Color;
import java.lang.String;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class QnA extends Application  {
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException{
    	//Main Screen
    	ScrollPane scrollPane = new ScrollPane();
        
    	//Contents of scrollPane
    	VBox vbox = new VBox(3);
    	vbox.setPrefSize(850, 860);
    	vbox.setAlignment(Pos.TOP_CENTER);
    	vbox.setSpacing(50);
    	vbox.setStyle("-fx-background-color: LIGHTBLUE;");
    	scrollPane.setContent(vbox);
    	
    	//Contents of vbox
    	Label heading = new Label("Question? Look Here.");
    	heading.setStyle("-fx-font: normal bold 30px 'arial' ");
    	
    	HBox hbox = new HBox(2);
    	hbox.setAlignment(Pos.BASELINE_LEFT);
    	hbox.setSpacing(10);
    	
    	//contents of hbox
    	VBox vbox1 = new VBox();
    	vbox1.setAlignment(Pos.CENTER);
    	vbox1.setPrefWidth(180);
    	vbox1.setSpacing(20);
    	vbox1.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 5;" + 
                "-fx-border-color: #5494e3;");
    
    	VBox vbox2 = new VBox();
    	vbox2.setAlignment(Pos.TOP_CENTER);
    	vbox2.setSpacing(20);
    	vbox2.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 5;" + 
                "-fx-border-color: #5494e3;");
    	
    	//contents of vbox1
    	Label general = new Label("General ▶");
    	general.setStyle("-fx-font: normal bold 12px 'arial' ");
    	
    	Label corona = new Label("Coronavirus");
    	corona.setStyle("-fx-font: normal bold 12px 'arial';"
        		+ "-fx-text-fill : black");
    	
    	Label mv = new Label("Mission & Vision");
    	mv.setStyle("-fx-font: normal bold 12px 'arial';"
        		+ "-fx-text-fill : black");
    	
    	Label contact = new Label("Contact Us");
    	contact.setStyle("-fx-font: normal bold 12px 'arial';"
        		+ "-fx-text-fill : black");
    	
    	//contents of vbox2(general)
    	VBox vbox3 = new VBox();
    	vbox3.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vbox4 = new VBox();
    	vbox4.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vbox5 = new VBox();
    	vbox5.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vbox6 = new VBox();
    	vbox6.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	HBox hbox1 = new HBox(2);
    	hbox1.setAlignment(Pos.BASELINE_LEFT);
    	hbox1.setSpacing(10);
    	
    	HBox hbox2 = new HBox(2);
    	hbox2.setAlignment(Pos.BASELINE_LEFT);
    	hbox2.setSpacing(10);
    	
    	HBox hbox3 = new HBox(2);
    	hbox3.setAlignment(Pos.BASELINE_LEFT);
    	hbox3.setSpacing(10);
    	
    	HBox hbox4 = new HBox(2);
    	hbox4.setAlignment(Pos.BASELINE_LEFT);
    	hbox4.setSpacing(10);
    	
    	String q1 = "How are diseases prevented?";
    	Label c1q1 = new Label(q1);
    	String a1 = "Washing your hands with soap and water, thoroughly and frequently. \n"
    			+ "Covering your nose and mouth when you sneeze or cough. \n"
    			+ "Disinfecting frequently touched surfaces in your home and workplace. \n"
    			+ "Avoiding contact with sick people or sharing personal items with them.";
    	Label c1a1 = new Label(a1);
    	
    	String q2 = "How to overcome any illness?";
    	Label c1q2 = new Label(q2);
    	String a2 = "Maintain a healthy diet.\r\n"
    			+ "Get enough sleep\r\n"
    			+ "Positive thinking\r\n"
    			+ "Excercise daily\r\n"
    			+ "Get proper medication\r\n"
    			+ "Get the support you need\r\n";
    	Label c1a2 = new Label(a2);
    	
    	String q3 = "What is the best treatment for chronic disease?";
    	Label c1q3 = new Label(q3);
    	String a3 = "Treatment of chronic illness comes in many forms including surgery, physical therapy, \n"
    			+ "psychological therapy and radiotherapy. However, one of the most common treatment forms \n"
    			+ "is the use of medication.";
    	Label c1a3 = new Label(a3);
    	
    	String q4 = "How can you help someone with help problems?";
    	Label c1q4 = new Label(q4);
    	String a4 = "Ask what kind of friend the person needs you to be\r\n"
    			+ "Offer specific help\r\n"
    			+ "Make plans\r\n"
    			+ "Visit when possible\r\n"
    			+ "Send notes and cards\r\n"
    			+ "Offer to chauffeur or even attend appointments\r\n"
    			+ "";
    	Label c1a4 = new Label(a4);
    	
        FileInputStream inputstream = new FileInputStream("Images/plus.png"); 
        Image plus_img = new Image(inputstream);
        ImageView plus_imv = new ImageView(plus_img);
        plus_imv.setFitHeight(20); 
        plus_imv.setFitWidth(20); 
        ImageView plus1_imv = new ImageView(plus_img);
        plus1_imv.setFitHeight(20); 
        plus1_imv.setFitWidth(20); 
        ImageView plus2_imv = new ImageView(plus_img);
        plus2_imv.setFitHeight(20); 
        plus2_imv.setFitWidth(20); 
        ImageView plus3_imv = new ImageView(plus_img);
        plus3_imv.setFitHeight(20); 
        plus3_imv.setFitWidth(20); 
        
        FileInputStream inputstream1 = new FileInputStream("Images/minus.png"); 
        Image minus_img = new Image(inputstream1);
        
        hbox1.getChildren().add(c1q1);
        hbox1.getChildren().add(plus_imv);
        
        hbox2.getChildren().add(c1q2);
        hbox2.getChildren().add(plus1_imv);
        
        hbox3.getChildren().add(c1q3);
        hbox3.getChildren().add(plus2_imv);
        
        hbox4.getChildren().add(c1q4);
        hbox4.getChildren().add(plus3_imv);
        
        vbox3.getChildren().add(hbox1);
        vbox3.getChildren().add(c1a1);
        vbox3.setPrefHeight(80);
        vbox3.setPrefWidth(500);
        c1a1.setVisible(false);
        
        vbox4.getChildren().add(hbox2);
        vbox4.getChildren().add(c1a2);
        vbox4.setPrefHeight(80);
        vbox4.setPrefWidth(500);
        c1a2.setVisible(false);
        
        vbox5.getChildren().add(hbox3);
        vbox5.getChildren().add(c1a3);
        vbox5.setPrefHeight(80);
        vbox5.setPrefWidth(500);
        c1a3.setVisible(false);
        
        vbox6.getChildren().add(hbox4);
        vbox6.getChildren().add(c1a4);
        vbox6.setPrefHeight(80);
        vbox6.setPrefWidth(500);
        c1a4.setVisible(false);
        
        vbox2.getChildren().add(vbox3);
        vbox2.getChildren().add(vbox4);
        vbox2.getChildren().add(vbox5);
        vbox2.getChildren().add(vbox6);
        
        
        //contents of Coronavirus
        
        VBox vvboxx3 = new VBox();
    	vvboxx3.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	vvboxx3.setAlignment(Pos.CENTER);
    	
    	HBox hhbox = new HBox();
    	hhbox.setAlignment(Pos.CENTER);
    	hhbox.setSpacing(10);
    	
    	Label hhead = new Label("Coronavirus Updates");
    	hhead.setStyle("-fx-font: normal bold 18px 'arial' ");
    	hhead.setAlignment(Pos.BASELINE_CENTER);
    	
    	vvboxx3.getChildren().add(hhead);
    	vvboxx3.getChildren().add(hhbox);
    	
    	VBox cvbox3 = new VBox();
    	cvbox3.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #4a5ad9;");
    	cvbox3.setAlignment(Pos.BASELINE_LEFT);
    	Label tc = new Label("Total Cases: 46,482,200");
    	tc.setStyle("-fx-font: normal bold 12px 'arial';" + 
    			"-fx-text-fill : #4a5ad9;");
    	tc.setAlignment(Pos.CENTER);
    	cvbox3.getChildren().add(tc);
    	
    	VBox cvbox4 = new VBox();
    	cvbox4.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #53d43f;");
    	cvbox4.setAlignment(Pos.BASELINE_CENTER);
    	Label tr = new Label("Total Recovered: 33,556,292");
    	tr.setStyle("-fx-font: normal bold 12px 'arial';" + 
    			"-fx-text-fill : #53d43f;");
    	tr.setAlignment(Pos.CENTER);
    	cvbox4.getChildren().add(tr);
    	
    	VBox cvbox5 = new VBox();
    	cvbox5.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #d43a2c;");
    	cvbox5.setAlignment(Pos.BASELINE_RIGHT);
    	Label td = new Label("Total Deaths: 1,201,759");
    	td.setStyle("-fx-font: normal bold 12px 'arial';" + 
    			"-fx-text-fill : #d43a2c");
    	td.setAlignment(Pos.CENTER);
    	cvbox5.getChildren().add(td);
        
    	hhbox.getChildren().add(cvbox3);
    	hhbox.getChildren().add(cvbox4);
    	hhbox.getChildren().add(cvbox5);
    	
        VBox vvbox3 = new VBox();
    	vvbox3.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vvbox4 = new VBox();
    	vvbox4.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox vvbox5 = new VBox();
    	vvbox5.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	HBox hhbox1 = new HBox(2);
    	hhbox1.setAlignment(Pos.BASELINE_LEFT);
    	hhbox1.setSpacing(10);
    	
    	HBox hhbox2 = new HBox(2);
    	hhbox2.setAlignment(Pos.BASELINE_LEFT);
    	hhbox2.setSpacing(10);
    	
    	HBox hhbox3 = new HBox(2);
    	hhbox3.setAlignment(Pos.BASELINE_LEFT);
    	hhbox3.setSpacing(10);
    	
    	HBox hhbox4 = new HBox(2);
    	hhbox4.setAlignment(Pos.BASELINE_LEFT);
    	hhbox4.setSpacing(10);
    	
    	String cq1 = "What are the symptoms of the coronavirus?";
    	Label cc1q1 = new Label(cq1);
    	String ca1 = "Most common symptoms:\r\n"
    			+ "\tFever\r\n"
    			+ "\tdry cough\r\n"
    			+ "\ttiredness\r\n"
    			+ "Less common symptoms:\r\n"
    			+ "\taches and pains\r\n"
    			+ "\tsore throat\r\n"
    			+ "\tDiarrhoea\r\n"
    			+ "\tConjunctivitis\r\n"
    			+ "\tHeadache\r\n"
    			+ "\tloss of taste or smell\r\n";
    	Label cc1a1 = new Label(ca1);
    	
    	String cq2 = "How to prevent catching the coronavirus?";
    	Label cc1q2 = new Label(cq2);
    	String ca2 = "Clean your hands often. Use soap and water, or an alcohol-based hand rub.\r\n"
    			+ "Maintain a safe distance from anyone who is coughing or sneezing.\r\n"
    			+ "Wear a mask when physical distancing is not possible.\r\n"
    			+ "Don’t touch your eyes, nose or mouth.\r\n"
    			+ "Cover your nose and mouth with your bent elbow or a tissue when you cough or sneeze.\r\n"
    			+ "Stay home if you feel unwell.\r\n";
    	Label cc1a2 = new Label(ca2);
    	
    	String cq3 = "What are the treatments of the coronavirus?";
    	Label cc1q3 = new Label(cq3);
    	String ca3 = "If you feel sick you should rest, drink plenty of fluid, and eat nutritious food. Stay in a separate room \n" 
    			+ "fromother family members, and use a dedicated bathroom if possible. Clean and disinfect frequently \n"
    			+ "touched surfaces. Everyone should keep a healthy lifestyle at home. Maintain a healthy diet, sleep, \n"
    			+ "stay active, and make social contact  with loved ones through the phone or internet. \n"
    			+ "Children need extra love and attention from adults during difficult times. \n"
    			+ "Keep to regular routines and schedules as much as possible.\r\n";
    	Label cc1a3 = new Label(ca3);
    	
        ImageView cplus_imv = new ImageView(plus_img);
        cplus_imv.setFitHeight(20); 
        cplus_imv.setFitWidth(20); 
        ImageView cplus1_imv = new ImageView(plus_img);
        cplus1_imv.setFitHeight(20); 
        cplus1_imv.setFitWidth(20); 
        ImageView cplus2_imv = new ImageView(plus_img);
        cplus2_imv.setFitHeight(20); 
        cplus2_imv.setFitWidth(20); 
        
        hhbox1.getChildren().add(cc1q1);
        hhbox1.getChildren().add(cplus_imv);
        
        hhbox2.getChildren().add(cc1q2);
        hhbox2.getChildren().add(cplus1_imv);
        
        hhbox3.getChildren().add(cc1q3);
        hhbox3.getChildren().add(cplus2_imv);
        
        vvbox3.getChildren().add(hhbox1);
        vvbox3.getChildren().add(cc1a1);
        vvbox3.setPrefHeight(80);
        vvbox3.setPrefWidth(500);
        cc1a1.setVisible(false);
        
        vvbox4.getChildren().add(hhbox2);
        vvbox4.getChildren().add(cc1a2);
        vvbox4.setPrefHeight(80);
        vvbox4.setPrefWidth(500);
        cc1a2.setVisible(false);
        
        vvbox5.getChildren().add(hhbox3);
        vvbox5.getChildren().add(cc1a3);
        vvbox5.setPrefHeight(80);
        vvbox5.setPrefWidth(500);
        cc1a3.setVisible(false);
        
        
        //contents of Mission & Vision
        VBox mvbox3 = new VBox();
    	mvbox3.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox mvbox4 = new VBox();
    	mvbox4.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox mvbox5 = new VBox();
    	mvbox5.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	HBox mhbox1 = new HBox(2);
    	mhbox1.setAlignment(Pos.BASELINE_LEFT);
    	mhbox1.setSpacing(10);
    	
    	HBox mhbox2 = new HBox(2);
    	mhbox2.setAlignment(Pos.BASELINE_LEFT);
    	mhbox2.setSpacing(10);
    	
    	HBox mhbox3 = new HBox(2);
    	mhbox3.setAlignment(Pos.BASELINE_LEFT);
    	mhbox3.setSpacing(10);
    	
    	
    	String mq1 = "Mission";
    	Label mc1q1 = new Label(mq1);
    	String ma1 = "We share our experience serving patients that makes you happy, giving service \n" 
    			+ "that makes you smile, in passionate pursuit of our mission, showing love and caring\n" 
    			+ " in all our actions, to enrich as many lives as we possibly can. ";
    	Label mc1a1 = new Label(ma1);
    	
    	String mq2 = "Vision";
    	Label mc1q2 = new Label(mq2);
    	String ma2 = "To create and maintain a framework where health care professionals can practice their skills \n"
    			+ "in the right spirit with empathy, pride and passion. To be able to adapt to dynamic changes \n" 
    			+"in health care delivery not only in curing illnesses but also in preserving health. ";
    	Label mc1a2 = new Label(ma2);
    	
    	String mq3 = "Strength";
    	Label mc1q3 = new Label(mq3);
    	String ma3 = "Employees are recognized as the most valuable asset in the organization.\n" 
    			+ "The organization is committed to create & maintain a culture that is conducive to learning.";
    	Label mc1a3 = new Label(ma3);
    	
        ImageView mplus_imv = new ImageView(plus_img);
        mplus_imv.setFitHeight(20); 
        mplus_imv.setFitWidth(20); 
        ImageView mplus1_imv = new ImageView(plus_img);
        mplus1_imv.setFitHeight(20); 
        mplus1_imv.setFitWidth(20); 
        ImageView mplus2_imv = new ImageView(plus_img);
        mplus2_imv.setFitHeight(20); 
        mplus2_imv.setFitWidth(20); 
        ImageView mplus3_imv = new ImageView(plus_img);
        mplus3_imv.setFitHeight(20); 
        mplus3_imv.setFitWidth(20); 
        
        mhbox1.getChildren().add(mc1q1);
        mhbox1.getChildren().add(mplus_imv);
        
        mhbox2.getChildren().add(mc1q2);
        mhbox2.getChildren().add(mplus1_imv);
        
        mhbox3.getChildren().add(mc1q3);
        mhbox3.getChildren().add(mplus2_imv);
      
        mvbox3.getChildren().add(mhbox1);
        mvbox3.getChildren().add(mc1a1);
        mvbox3.setPrefHeight(80);
        mvbox3.setPrefWidth(500);
        mc1a1.setVisible(false);
        
        mvbox4.getChildren().add(mhbox2);
        mvbox4.getChildren().add(mc1a2);
        mvbox4.setPrefHeight(80);
        mvbox4.setPrefWidth(500);
        mc1a2.setVisible(false);
        
        mvbox5.getChildren().add(mhbox3);
        mvbox5.getChildren().add(mc1a3);
        mvbox5.setPrefHeight(80);
        mvbox4.setPrefWidth(500);
        mc1a3.setVisible(false);
        
        
        //Contents of Contact Us
    	Label uhead = new Label("Developors");
    	uhead.setAlignment(Pos.BASELINE_CENTER);
    	uhead.setStyle("-fx-font: normal bold 15px 'arial';"
        		+ "-fx-text-fill : black");
    	
    	HBox uhbox = new HBox(2);
    	uhbox.setAlignment(Pos.CENTER);
    	uhbox.setSpacing(10);
    	
    	VBox uvbox4 = new VBox();
    	uvbox4.setAlignment(Pos.CENTER);
    	uvbox4.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	VBox uvbox5 = new VBox();
    	uvbox5.setAlignment(Pos.CENTER);
    	uvbox5.setStyle("-fx-padding: 10;" + 
    			"-fx-background-color: WHITE;" +
                "-fx-border-style: solid inside;" + 
                "-fx-border-width: 1;" +
                "-fx-border-insets: 5;" + 
                "-fx-border-radius: 2;" + 
                "-fx-border-color: #5494e3;");
    	
    	FileInputStream inputstream2 = new FileInputStream("Images/man.png"); 
        Image man_img = new Image(inputstream2);
        ImageView man_imv = new ImageView(man_img);
        man_imv.setFitHeight(200); 
        man_imv.setFitWidth(150); 
        ImageView man1_imv = new ImageView(man_img);
        man1_imv.setFitHeight(200); 
        man1_imv.setFitWidth(150);
        
        String name1 = "\nName: Abhinav Rathi\n";
        Label n1 = new Label(name1);
        n1.setAlignment(Pos.CENTER);
        Label e1 = new Label("Email: abhinav.rathi@science.christuniversity.in");
        e1.setAlignment(Pos.CENTER);
        
        String name2 = "\nName: Vedant Mehrotra\n";
        Label n2 = new Label(name2);
        n2.setAlignment(Pos.CENTER);
        Label e2 = new Label("Email: vedant.mehrotra@science.christuniversity.in");
        e2.setAlignment(Pos.CENTER);
        
        uvbox4.getChildren().add(man_imv);
        uvbox4.getChildren().add(n1);
        uvbox4.getChildren().add(e1);
        
        uvbox5.getChildren().add(man1_imv);
        uvbox5.getChildren().add(n2);
        uvbox5.getChildren().add(e2);
        
    	uhbox.getChildren().add(uvbox4);
    	uhbox.getChildren().add(uvbox5);
    	
    	
    	
        
        
        // Adding Contents of vbox
        vbox1.getChildren().add(general);
        vbox1.getChildren().add(corona);
        vbox1.getChildren().add(mv);
        vbox1.getChildren().add(contact);
        
        hbox.getChildren().add(vbox1);
        hbox.getChildren().add(vbox2);
        
        vbox.getChildren().add(heading);
        vbox.getChildren().add(hbox);
                
        Scene scene = new Scene(scrollPane, 850, 650);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:Images/icon.png"));
        primaryStage.setTitle("Menu");
        primaryStage.setAlwaysOnTop(true);
      
        
        //event handling starts here
        plus_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(plus_imv.getImage() == plus_img) {
            		vbox3.setPrefHeight(120);
            		c1a1.setVisible(true);
            		plus_imv.setImage(minus_img);
            	}
            	else {
            		vbox3.setPrefHeight(70);
            		c1a1.setVisible(false);
            		plus_imv.setImage(plus_img);
            	}
        	}

        });
        
        plus1_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(plus1_imv.getImage() == plus_img) {
            		vbox4.setPrefHeight(160);
            		c1a2.setVisible(true);
            		plus1_imv.setImage(minus_img);
            	}
            	else {
            		vbox4.setPrefHeight(70);
            		c1a2.setVisible(false);
            		plus1_imv.setImage(plus_img);
            	}
        	}

        });
        
        plus2_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(plus2_imv.getImage() == plus_img) {
            		vbox5.setPrefHeight(120);
            		c1a3.setVisible(true);
            		plus2_imv.setImage(minus_img);
            	}
            	else {
            		vbox5.setPrefHeight(70);
            		c1a3.setVisible(false);
            		plus2_imv.setImage(plus_img);
            	}
        	}

        });
        plus3_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(plus3_imv.getImage() == plus_img) {
            		vbox6.setPrefHeight(170);
            		c1a4.setVisible(true);
            		plus3_imv.setImage(minus_img);
            	}
            	else {
            		vbox6.setPrefHeight(70);
            		c1a4.setVisible(false);
            		plus3_imv.setImage(plus_img);
            	}
        	}

        });     
        cplus_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(cplus_imv.getImage() == plus_img) {
            		vvbox3.setPrefHeight(260);
            		cc1a1.setVisible(true);
            		cplus_imv.setImage(minus_img);
            	}
            	else {
            		vvbox3.setPrefHeight(70);
            		cc1a1.setVisible(false);
            		cplus_imv.setImage(plus_img);
            	}
        	}

        });
        
        cplus1_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(cplus1_imv.getImage() == plus_img) {
            		vvbox4.setPrefHeight(170);
            		cc1a2.setVisible(true);
            		cplus1_imv.setImage(minus_img);
            	}
            	else {
            		vvbox4.setPrefHeight(70);
            		cc1a2.setVisible(false);
            		cplus1_imv.setImage(plus_img);
            	}
        	}

        });
        
        cplus2_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(cplus2_imv.getImage() == plus_img) {
            		vvbox5.setPrefHeight(170);
            		cc1a3.setVisible(true);
            		cplus2_imv.setImage(minus_img);
            	}
            	else {
            		vvbox5.setPrefHeight(70);
            		cc1a3.setVisible(false);
            		cplus2_imv.setImage(plus_img);
            	}
        	}

        });
        
        mplus_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(mplus_imv.getImage() == plus_img) {
            		mvbox3.setPrefHeight(110);
            		mc1a1.setVisible(true);
            		mplus_imv.setImage(minus_img);
            	}
            	else {
            		mvbox3.setPrefHeight(70);
            		mc1a1.setVisible(false);
            		mplus_imv.setImage(plus_img);
            	}
        	}

        });     
        
        mplus1_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(mplus1_imv.getImage() == plus_img) {
            		mvbox4.setPrefHeight(110);
            		mc1a2.setVisible(true);
            		mplus1_imv.setImage(minus_img);
            	}
            	else {
            		mvbox4.setPrefHeight(70);
            		mc1a2.setVisible(false);
            		mplus1_imv.setImage(plus_img);
            	}
        	}

        });
        
        mplus2_imv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	if(mplus2_imv.getImage() == plus_img) {
            		mvbox5.setPrefHeight(90);
            		mc1a3.setVisible(true);
            		mplus2_imv.setImage(minus_img);
            	}
            	else {
            		mvbox5.setPrefHeight(70);
            		mc1a3.setVisible(false);
            		mplus2_imv.setImage(plus_img);
            	}
        	}

        });
        
        general.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	vbox1.setPrefWidth(180);
            	general.setText("General ▶");
            	corona.setText("Coronavirus");
            	mv.setText("Mission & Vision");
            	contact.setText("Contact Us");
            	vbox2.getChildren().clear();
            	vbox2.getChildren().add(vvbox3);
                vbox2.getChildren().add(vvbox4);
                vbox2.getChildren().add(vbox5);
                vbox2.getChildren().add(vbox6);
        	}

        }); 
        general.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
                general.setStyle("-fx-font: normal bold 14px 'arial';"
                		+ "-fx-text-fill : #1487d9");

            } else {
            	general.setStyle("-fx-font: normal bold 12px 'arial';"
                		+ "-fx-text-fill : black");
            }
        });

        
        
        corona.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	vbox1.setPrefWidth(180);
            	general.setText("General");
            	corona.setText("Coronavirus ▶");
            	mv.setText("Mission & Vision");
            	contact.setText("Contact Us");
            	vbox2.getChildren().clear();
            	vbox2.getChildren().add(vvboxx3);
            	vbox2.getChildren().add(vvbox3);
                vbox2.getChildren().add(vvbox4);
                vbox2.getChildren().add(vvbox5);
        	}

        }); 
        corona.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
                corona.setStyle("-fx-font: normal bold 14px 'arial';"
                		+ "-fx-text-fill : #1487d9");

            } else {
            	corona.setStyle("-fx-font: normal bold 12px 'arial';"
                		+ "-fx-text-fill : black");
            }
        });
        mv.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	vbox1.setPrefWidth(180);
            	general.setText("General");
            	corona.setText("Coronavirus");
            	mv.setText("Mission & Vision ▶");
            	contact.setText("Contact Us");
            	vbox2.getChildren().clear();
            	vbox2.getChildren().add(mvbox3);
                vbox2.getChildren().add(mvbox4);
                vbox2.getChildren().add(mvbox5);
        	}

        }); 
        mv.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
                mv.setStyle("-fx-font: normal bold 14px 'arial';"
                		+ "-fx-text-fill : #1487d9");

            } else {
            	mv.setStyle("-fx-font: normal bold 12px 'arial';"
                		+ "-fx-text-fill : black");
            }
        });
        contact.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent arg0) {
            	vbox1.setPrefWidth(180);
            	general.setText("General");
            	corona.setText("Coronavirus");
            	mv.setText("Mission & Vision");
            	contact.setText("Contact Us ▶");
            	vbox2.getChildren().clear();
            	vbox2.getChildren().add(uhead);
            	vbox2.getChildren().add(uhbox);
        	}

        }); 
        contact.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
            if (newValue) {
                contact.setStyle("-fx-font: normal bold 14px 'arial';"
                		+ "-fx-text-fill : #1487d9");

            } else {
            	contact.setStyle("-fx-font: normal bold 12px 'arial';"
                		+ "-fx-text-fill : black");
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}