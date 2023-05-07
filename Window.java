public class CreateWarriorCard {

    public static WarriorCard create() {
        // Создаем компоненты для ввода информации о карточке
        Label nameLabel = new Label("Имя:");
        TextField nameField = new TextField();
        Label healthLabel = new Label("Здоровье:");
        TextField healthField = new TextField();
        Label damageLabel = new Label("Урон:");
        TextField damageField = new TextField();
        Button createButton = new Button("Создать");

        // Создаем контейнер для компонентов
        VBox container = new VBox(nameLabel, nameField, healthLabel, healthField, damageLabel, damageField, createButton);
        container.setSpacing(10);
        container.setPadding(new Insets(10));

        // Создаем окно для контейнера
        Stage stage = new Stage();
        stage.setScene(new Scene(container));

        // Создаем обработчик событий для кнопки создания карточки
        createButton.setOnAction(event -> {
            // Получаем введенные значения из полей ввода
            String name = nameField.getText();
            int health = Integer.parseInt(healthField.getText());
            int damage = Integer.parseInt(damageField.getText());

            // Создаем карточку воина
            WarriorCard card = new WarriorCard(name, health, damage);

            // Закрываем окно
            stage.close();
        });

        // Показываем окно для ввода информации о карточке
        stage.showAndWait();

        return card;
    }
}
