package gui_002_Windows;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window_03 extends Application {
	
	Stage window;

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		CheckBox checkbox = new CheckBox("Удалить всё");
		
		// 2. Создаём элемент
		Button button = new Button("Удалить");
		// 2.1 Добавляем к кнопке реакцию при нажатии
		button.setOnAction(e -> checkboxHandler(checkbox));
		
		// 3. Создаём вёрстку элементов в окне
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER); // Вариант 2. layout1.setStyle("-fx-alignment: center;");
		// 3.1 Добавляем элементы в окно
		layout.getChildren().addAll(checkbox, button);
		
		// 4. Создаём окно
		window = primaryStage;
		// 4.1 Создаём размеры окна
		Scene scene = new Scene(layout, 800, 600);
		// 4.2 Создаём внутреннее пространство
		window.setScene(scene);
		// 4.3 Показываем окно
		window.show();
		
	}
	
	// 2.2 Создаём для кнопки реакцию при нажатии
	void checkboxHandler(CheckBox checkbox) {
		if (checkbox.isSelected()) System.out.println("Всё удалено");
	}

}
