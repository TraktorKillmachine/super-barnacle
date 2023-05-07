import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class WarriorCreator {
    private TextField nameField;
    private TextField healthPointsField;
    private TextField damageField;
    private Label nameLabel;
    private Label healthPointsLabel;
    private Label damageLabel;

    public VBox create() {
        nameField = new TextField();
        healthPointsField = new TextField();
        damageField = new TextField();
        nameLabel = new Label("Name: ");
        healthPointsLabel = new Label("Health points: ");
        damageLabel = new Label("Damage: ");
        Button generate = new Button("Generate");

        FlowPane flowPane = new FlowPane(nameLabel, nameField, healthPointsLabel, healthPointsField, damageLabel, damageField, generate);
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setAlignment(Pos.CENTER);

        VBox vbox = new VBox(flowPane);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        generate.setOnAction(event -> {
            String name = nameField.getText();
            int healthPoints = Integer.parseInt(healthPointsField.getText());
            int damage = Integer.parseInt(damageField.getText());
            Warrior warrior = new Hero(name, healthPoints, damage);
            WarriorCard warriorCard = new WarriorCard(warrior);
            Scene scene = new Scene(warriorCard.create(), 400, 400);
            vbox.getScene().getWindow().setScene(scene);
        });

        return vbox;
    }
}
