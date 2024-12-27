package gui_003_Alerts;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class Alert_01 extends Application {

Stage window;
Scene scene1, scene2;
Button button;

public static void main(String[] args) {
	launch(args);
}

	@Override
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		button = new Button("Click me");
		// 1.1 Добавляем к кнопке реакцию при нажатии
		button.setOnAction(e -> AlertBox.display("Sync My Data", "Message for you"));
		
		// 2. Создаём вёрстку элементов в окне
		StackPane layout = new StackPane();
		// 2.1 Добавляем элементы в окно
		layout.getChildren().add(button);
		
		// 3. Создаём титульное название окна
		primaryStage.setTitle("Sync My Data");
		// 3.1 Создаём размеры окна
		Scene scene = new Scene(layout, 800, 600);
		// 3.2 Создаём внутреннее пространство
		primaryStage.setScene(scene);
		// 3.3 Показываем окно
		primaryStage.show();
		
	}
	
	class AlertBox {
		public static void display(String title, String message) {
			// 1. Создаём окно
			Stage window = new Stage();
			
			// 2. Создаём элемент
			Label label = new Label();
			label.setText(message);
			
			// 3. Создаём элемент
			Button closeButton = new Button("Close the window");
			// 3.1 Добавляем к кнопке реакцию при нажатии
			closeButton.setOnAction(e -> window.close());
			
			// 4. Создаём вёрстку элементов в окне
			VBox layout = new VBox(10);
			layout.setAlignment(Pos.CENTER);
			// 4.1 Добавляем элементы в окно
			layout.getChildren().addAll(label, closeButton);
			
			// 1.1 Создаём тип окна
			window.initModality(Modality.APPLICATION_MODAL);
			// 1.2 Создаём титульное название окна
			window.setTitle(title);
			// 1.3 Создаём размеры окна
			window.setMinWidth(320);
			window.setMinHeight(240);
			// 1.4 Создаём внутреннее пространство
			Scene scene = new Scene(layout);
			window.setScene(scene);
			// 1.5 Показываем окно
			window.showAndWait();
		}
	}
}
