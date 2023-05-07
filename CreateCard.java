import com.sun.javafx.menu.MenuItemBase;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import org.w3c.dom.Text;

public class CreateCard {

    private FlowPane flowPane;
    private MenuItemBase createButton;

    public CreateCard(FlowPane flowPane) {
        this.flowPane = flowPane;
    }

    public void addElements() {
        TextField nameField = new TextField();
        TextField healthPointField = new TextField();
        TextField damageField = new TextField();
        Button generateButton = new Button("Generate");
        flowPane.getChildren().addAll(nameField, healthPointField, damageField, generateButton);
    }

    public FlowPane getFlowPane() {
        return flowPane;
    }
    public static void create() {
        Label lbl = new Label();
        TextField nameField = new TextField();
        TextField healtpointField = new TextField();
        TextField damageField = new TextField();
        Button generate = new Button();
        FlowPane flowPane = new FlowPane(nameField, healtpointField, damageField, generate);
        Card card = new Card(nameField.getText(), Integer.parseInt(healtpointField.getText()), Integer.parseInt(damageField.getText()));
    }

    public void setCreateButtonHandler(EventHandler<ActionEvent> handler) {
        createButton.setOnAction(handler);
    }
    

}

