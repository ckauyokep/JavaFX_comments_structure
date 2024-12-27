package gui_003_Alerts;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Alert_06 extends Application {

    public static void main(String[] args) {
        launch(args); // Запуск приложения
    }

    @Override
    public void start(Stage primaryStage) {
    	
    	// 1. Создаём диалоговое окно
        Alert alert = new Alert(Alert.AlertType.NONE, "Мне нравится программировать !");
        // 1.1 ВНИМАНИЕ. Для AlertType.NONE требуется добавить кнопку, иначе Alert невозможно закрыть никакими способами.
        alert.getDialogPane().getButtonTypes().add(ButtonType.OK);
        // 1.2 ВНИМАНИЕ. Далее эту кнопку можно скрыть.
        alert.getDialogPane().lookupButton(ButtonType.OK).setVisible(false);
        // 1.3 Создаём титульное название окна
        alert.setTitle("Привет, Мир !");
        // 1.4 Отключаем показ верхнего поля для дополнительного сообщения
        alert.setHeaderText(null);
        // 1.5 Показываем окно
        alert.show();
    }

}
