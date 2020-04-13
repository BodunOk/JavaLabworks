package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;

import javax.swing.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Head head = hinitialization();
        Tail tail = tinitialization();
        Brain brains = (Brain)head.getBodies(2);

        Label brain = new Label();
        brain.setText("Moзг: " + brains.getKPD() + " %");
        RadioButton nouse = new RadioButton("Нос");
        RadioButton mouse = new RadioButton("Рот");
        RadioButton ear = new RadioButton("Ухо");
        Button getdata = new Button("   Получить данные\nот выбраных органов");
        getdata.setPrefSize(170,100);

        Label result = new Label("Результат");
        TextArea outputres = new TextArea();
        outputres.setPromptText("Тут будет результат");
        outputres.setPrefRowCount(9);
        outputres.setPrefColumnCount(20);

        VBox left = new VBox();
        left.getChildren().addAll(brain,nouse,mouse,ear,getdata);
        left.setSpacing(15);

        VBox right= new VBox();
        right.getChildren().addAll(result,outputres);
        right.setSpacing(15);

        HBox group = new HBox();
        group.getChildren().addAll(left,right);
        group.setSpacing(10);

        group.translateXProperty().set(15);
        group.translateYProperty().set(15);


        getdata.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                outputres.clear();

                if(nouse.isSelected() || mouse.isSelected() || ear.isSelected()) {

                    if (nouse.isSelected()) {
                        Nose nose = (Nose) head.getBodies(1);
                        String str = brains.getData(nose, 0);
                        outputres.appendText("Нос(" + nose.getForm().getCode() + "):\n" + str + "\n\n");
                    }
                    if (mouse.isSelected()) {
                        Mouth mous = (Mouth) head.getBodies(3);
                        String str = brains.getData(mous, 1);
                        outputres.appendText("Рот:\n" + str + "\n\n");
                    }
                    if (ear.isSelected()) {
                        Ear ear = (Ear) head.getBodies(4);
                        String str = brains.getData(ear, 2);
                        String str1 = ear.isEarring() ? "Eсть серьга" : "Нет серьги";
                        outputres.appendText("Уши(" + str1 + "):\n" + str + "\n\n");
                    }
                } else {

                    outputres.setText("Ничего не выбранно!");

                }
            }
        });



        Scene scene = new Scene(group,520,285);
        primaryStage.setResizable(false);
        scene.setFill(Color.rgb(244,244,244));
        primaryStage.setScene(scene);
        primaryStage.setTitle("lab3(4)_JavaFX");
        primaryStage.show();
    }


    private Head hinitialization() {
        Head head = new Head();
        head.setBodies(new HeadOrgan(0.0));
        head.setBodies(new Nose(0.0,FormNose.CROOKED));
        head.setBodies(new Brain(0.0,45));
        head.setBodies(new Mouth(0.0,0.0));
        head.setBodies(new Ear(0.0,false));
        return head;
    }

    private Tail tinitialization()
    {
        Tail tail = new Tail();
        tail.setBodies(new TailOrgan(0.0));
        tail.setBodies(new Stomach(0.0,10.6));
        return  tail;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
