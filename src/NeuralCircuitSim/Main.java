package NeuralCircuitSim;

import Controllers.visualizerSceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.applet.Applet;

//todo: Simplify the creation of Neurons. (It would seem there is unecissary memory usage).

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Resources/visualizerScene.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Neural Circuit Simulator");
        primaryStage.setScene(scene);
        visualizerSceneController.initMouseControl(scene, primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

