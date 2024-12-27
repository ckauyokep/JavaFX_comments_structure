package gui_001_Buttons;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Button_01 extends Application implements EventHandler<ActionEvent> {

Button button;

public static void main(String[] args) {
	launch(args);
}

	@Override
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		button = new Button("Click me");
		// 1.1 Добавляем к кнопке реакцию при нажатии
		button.setOnAction(this);
		
		// 2. Создаём вёрстку элементов в окне
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		// 3. Создаём окно
		primaryStage.setTitle("Sync My Data");
		Scene scene = new Scene(layout, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	// 1.2 Создаём для кнопки реакцию при нажатии
	public void handle(ActionEvent event) {
		if(event.getSource() == button) {
			System.out.println("Click me");
		}
	}
}
