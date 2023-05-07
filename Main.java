import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        WarriorCreator warriorCreator = new WarriorCreator();
        Scene scene = new Scene(warriorCreator.create(), 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Card battle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
