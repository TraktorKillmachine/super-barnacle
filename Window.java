import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Window extends Application {

    public static void runner(String args) {
        Application.launch(args);
    }

    private Label lbl;

    @Override
    public void start(Stage stage) throws Exception {


        public void start(Stage stage) throws Exception {
            Group group = new Group();

            FlowPane flowPane = new FlowPane();
            CreateCard createCard = new CreateCard(flowPane);
            createCard.addElements();

            Scene scene = new Scene(createCard.getFlowPane(), 400, 400);
            stage.setScene(scene);
            stage.setTitle("Card battle");
            stage.show();
        }
    }
}

