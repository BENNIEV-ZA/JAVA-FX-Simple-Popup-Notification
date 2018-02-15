package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Controller {


    @FXML
    private void triggerPop(ActionEvent event)
    {
        displayPopup();
    }

    public static void displayPopup()//Display popup
    {
        Stage popupwindow=new Stage();

        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Success");
        Label label1 = null;
        label1= new Label("Hi this is a test");
        Button button1= new Button("ok");
        button1.setOnAction(e -> popupwindow.close());
        VBox layout= new VBox(10);
        layout.getChildren().addAll(label1, button1);
        layout.setAlignment(Pos.CENTER);
        Scene scene1= new Scene(layout, 150, 100);
        popupwindow.setScene(scene1);
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setResizable(false);
        popupwindow.showAndWait();
    }


    @FXML
    private void triggerPop2(ActionEvent event)
    {
        displayPopup2("Hello","test");
    }

    public void displayPopup2(String Message, String message2)//Display popup with values being used from another method/class
    {
        Stage popupwindow=new Stage();

        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Success");
        Label label1 = null;
        label1= new Label(Message +" this is a "+ message2);
        Button button1= new Button("ok");
        button1.setOnAction(e -> popupwindow.close());
        VBox layout= new VBox(10);
        layout.getChildren().addAll(label1, button1);
        layout.setAlignment(Pos.CENTER);
        Scene scene1= new Scene(layout, 150, 100);
        popupwindow.setScene(scene1);
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setResizable(false);
        popupwindow.showAndWait();
    }
}

