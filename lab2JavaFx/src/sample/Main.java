package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.layout.*;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;



public class Main extends Application {

    Head head = new Head();
    TextArea answer = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Label nose = new Label("Нос:");
        Label mouse = new Label("Рот:");

        Button toSniff  = new Button("Нюхать");
        toSniff.setMinSize(125,10);
        Button toEat = new Button("Есть");
        toEat.setMinSize(125,10);
        Button itch = new Button("Чесаться");
        itch.setMinSize(125,10);
        Button toSay = new Button("Сказать");
        toSay.setMinSize(125,10);

        answer = new TextArea();
        answer.setEditable(false);
        answer.setMaxWidth(250);
        answer.setMaxHeight(100);

        HBox labels  = new HBox(125,nose,mouse);
        HBox buttonSet1 = new HBox(30,toSniff,toEat);
        HBox buttonSet2 = new HBox(30,itch,toSay);
        FlowPane textArea = new FlowPane(Orientation.HORIZONTAL,10,10,answer);

        action(toSniff,2);
        action(toEat,0);
        action(itch,1);
        action(toSay,3);

        VBox root = new VBox(5,labels,buttonSet1,buttonSet2,textArea);

        Scene scene = new Scene(root,280,220);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LAB2(4)");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    private void action(Button btn,int id)
    {
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                head.brain.manageOrgan(id);
                answer.setText(head.brain.result);
            }

        });
    }

}
