package connectfourjfx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectFourJFX extends Application { 
    @Override
    public void start(Stage primaryStage) {
        Button startbtn = new Button();
        Button loadbtn = new Button();
        Button exitbtn = new Button();
        Button instructbtn = new Button();
        BorderPane pane = new BorderPane();
                
        startbtn.setText("Start New Game");
        loadbtn.setText("Load Game");
        exitbtn.setText("Exit");
        instructbtn.setText("How To Play");
        
        //When user clicks button, starts a new game
        startbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                viewBoard view  = new viewBoard();
                view.start(primaryStage);
            }
        });
        
        loadbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        exitbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        instructbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        
        //startbtn.setTranslateX(-270);
        // startbtn.setTranslateY(-275);
        
       // loadbtn.setTranslateX(-100);
       // loadbtn.setTranslateY(100);
        
       // exitbtn.setTranslateX(270);
       // exitbtn.setTranslateY(150);
        
       // instructbtn.setTranslateX(270);
       // instructbtn.setTranslateY(50);
        
        startbtn.setMaxWidth(Double.MAX_VALUE);
        exitbtn.setMaxWidth(Double.MAX_VALUE);
        loadbtn.setMaxWidth(Double.MAX_VALUE);
        instructbtn.setMaxWidth(Double.MAX_VALUE);

        VBox vbButtons = new VBox();
        vbButtons.setSpacing(10);
        vbButtons.setAlignment(Pos.BOTTOM_CENTER);
        vbButtons.setPadding(new Insets(20, 30, 40, 50)); 
        vbButtons.getChildren().addAll(startbtn, loadbtn, instructbtn, exitbtn);

        Image img = new Image("connectfourjfx/logo.gif");
        ImageView iV = new ImageView(img);
        pane.setTop(iV);
        pane.setTranslateX(80);
        pane.setTranslateY(150);
        root.getChildren().add(pane);
        root.getChildren().add(vbButtons);
        Scene scene = new Scene(root, 650, 600);
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