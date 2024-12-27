package gui_003_Alerts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Alert_05 extends Application {

    public static void main(String[] args) {
        launch(args); // Запуск приложения
    }

    @Override
    public void start(Stage primaryStage) {
    	// Пример от GPT чат https://you.com

        // Обработка события закрытия окна
        primaryStage.setOnCloseRequest(event -> {
            event.consume(); // Отменяем стандартное закрытие
            showConfirmationDialog(primaryStage); // Показываем диалог подтверждения
        });

        // Создаем корневой контейнер
        StackPane root = new StackPane();
        // Создаем сцену
        Scene scene = new Scene(root, 800, 600);
        // Настраиваем и отображаем окно
        primaryStage.setScene(scene);
        primaryStage.setTitle("Подтверждение закрытия");
        primaryStage.show();
    }

    private void showConfirmationDialog(Stage stage) {
        // Создаем диалоговое окно для подтверждения
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Вы уверены, что хотите закрыть приложение?");
        alert.setTitle("Подтверждение");
        alert.setHeaderText(null);

        // Обработка результата диалога
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                stage.close(); // Закрываем окно, если пользователь подтвердил
            }
        });
    }
}