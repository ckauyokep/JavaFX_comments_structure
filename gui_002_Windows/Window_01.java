package gui_002_Windows;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class Window_01 extends Application {

Stage window;
Scene scene1, scene2;
Button button;

public static void main(String[] args) {
	launch(args);
}

	@Override
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		Label label1 = new Label("Welcome to the first scene");
		
		// 2. Создаём элемент
		Button button1 = new Button("Go to scene 2");
		// 2.1 Добавляем к кнопке реакцию при нажатии
		button1.setOnAction(e -> window.setScene(scene2));
		
		// 3. Создаём вёрстку элементов в окне
		VBox layout1 = new VBox(20);
		layout1.setAlignment(Pos.CENTER); // Вариант 2. layout1.setStyle("-fx-alignment: center;");
		// 3.1 Добавляем элементы в окно
		layout1.getChildren().addAll(label1, button1);
		
		// 4. Создаём элемент
		Button button2 = new Button("Go to scene 1");
		// 4.1 Добавляем к кнопке реакцию при нажатии
		button2.setOnAction(e -> window.setScene(scene1));
		
		// 5. Создаём вёрстку элементов в окне
		StackPane layout2 = new StackPane();
		// 5.1 Добавляем элементы в окно
		layout2.getChildren().add(button2);
		
		// 6. Создаём окно
		window = primaryStage;
		// 6.1 Создаём титульное название окна
		window.setTitle("Sync My Data");
		// 6.2 Создаём размеры окна
		scene1 = new Scene(layout1, 800, 600);
		scene2 = new Scene(layout2, 800, 600);
		// 6.3 Создаём внутреннее пространство
		window.setScene(scene1);
		// 6.4 Показываем окно
		window.show();
		
	}
}
