/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfourjfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Sydnee
 */
public class viewBoard extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    // Buttons for column selection
    RadioButton c1 = new RadioButton();
    RadioButton c2 = new RadioButton();
    RadioButton c3 = new RadioButton();
    RadioButton c4 = new RadioButton();
    RadioButton c5 = new RadioButton();
    RadioButton c6 = new RadioButton();
    RadioButton c7 = new RadioButton();
    
    // Buttons 
    Button exitbtn = new Button();
    Button enterbtn = new Button();
    Button randbtn = new Button();
    Button undobtn = new Button();
    Button suggestbtn = new Button();
    
    // Setting button text
    exitbtn.setText("Exit");
    enterbtn.setText("Enter");
    randbtn.setText("Random Move");
    undobtn.setText("Undo Move");
    suggestbtn.setText("Suggest A Move");
    
    // Enables user to choose only one of the buttons
    final ToggleGroup group = new ToggleGroup();
    c1.setToggleGroup(group);
    c2.setToggleGroup(group);
    c3.setToggleGroup(group);
    c4.setToggleGroup(group);
    c5.setToggleGroup(group);
    c6.setToggleGroup(group);
    c7.setToggleGroup(group);
    
    c1.setMaxWidth(Double.MAX_VALUE);
    c2.setMaxWidth(Double.MAX_VALUE);
    c3.setMaxWidth(Double.MAX_VALUE);
    c4.setMaxWidth(Double.MAX_VALUE);
    c5.setMaxWidth(Double.MAX_VALUE);
    c6.setMaxWidth(Double.MAX_VALUE);
    c7.setMaxWidth(Double.MAX_VALUE);
    
    undobtn.setMaxWidth(Double.MAX_VALUE);
    suggestbtn.setMaxWidth(Double.MAX_VALUE);
    randbtn.setMaxWidth(Double.MAX_VALUE);
    
    VBox vbButtons = new VBox();
    vbButtons.setSpacing(30);
    vbButtons.setAlignment(Pos.TOP_RIGHT);
    // y value,
    vbButtons.setPadding(new Insets(350, 0, 0, 700)); 
    vbButtons.getChildren().addAll(randbtn,undobtn,suggestbtn);
    
    HBox hbButtons = new HBox();
    hbButtons.setSpacing(70);
    hbButtons.setAlignment(Pos.TOP_LEFT);
    hbButtons.setPadding(new Insets(30, 0, 0, 70)); 
    hbButtons.getChildren().addAll(c1,c2,c3,c4,c5,c6,c7);
    
    BorderPane pane = new BorderPane();
    StackPane root = new StackPane();
    
    Image img = new Image("connectfourjfx/board.png");
    ImageView iV = new ImageView(img);
    
    pane.setLeft(iV);
    pane.setTranslateY(70);
    pane.setTranslateX(30);
    
    root.getChildren().add(pane);
    root.getChildren().add(hbButtons);
    root.getChildren().add(vbButtons);
    
    Scene scene = new Scene(root,1000,600);
    primaryStage.setTitle("Connect Four");
    primaryStage.setScene(scene);
    primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
