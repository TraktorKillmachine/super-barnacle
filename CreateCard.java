import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import org.w3c.dom.Text;

public class CreateCard {
    public static void create() {
        Label lbl = new Label();
        TextField nameField = new TextField();
        TextField healtpointField = new TextField();
        TextField damageField = new TextField();
        Button generate = new Button();
        FlowPane flowPane = new FlowPane(nameField, healtpointField, damageField, generate);
        Card card = new Card(nameField.getText(), Integer.parseInt(healtpointField.getText()), Integer.parseInt(damageField.getText()));
    }

}

