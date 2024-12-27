package gui_002_Windows;

import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class Window_02 extends Application {

Stage window;
int number1;
int number2;
int randomNumber;

public static void main(String[] args) {
	launch(args);
}

	@Override
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		Label textNumber1 = new Label("Число 1");
		// 1.1 Создаём позиционирование элемента
		GridPane.setConstraints(textNumber1, 0, 0);
		
		// 2. Создаём элемент
		TextField inputNumber1 = new TextField("1");
		// 2.1 Создаём позиционирование элемента
		GridPane.setConstraints(inputNumber1, 1, 0);
		
		// 3. Создаём элемент
		Label textNumber2 = new Label("Число 2");
		// 3.1 Создаём позиционирование элемента
		GridPane.setConstraints(textNumber2, 0, 1);
		
		// 4. Создаём элемент
		TextField inputNumber2 = new TextField("6");
		// 4.1 Создаём позиционирование элемента
		GridPane.setConstraints(inputNumber2, 1, 1);
		
		// 5. Создаём элемент
		Button button = new Button("Число");
		// 5.1 Создаём позиционирование элемента
		GridPane.setConstraints(button, 1, 2);
		// 5.1 Добавляем к кнопке реакцию при нажатии
		// 5.1 Используем обработчик ошибки при введении чего либо, кроме целых чисел
		button.setOnAction(e -> {
			try {
			number1 = Integer.parseInt(inputNumber1.getText());
			number2 = Integer.parseInt(inputNumber2.getText());
			randomNumber = new Random().nextInt(number1, number2 + 1);
			System.out.println(randomNumber);
			} catch(IllegalArgumentException exception) {
				System.out.println("Что-то пошло не так (");
			}
		});
		
		// 6. Создаём вёрстку элементов в окне
		GridPane table = new GridPane();
		table.setPadding(new Insets(10, 10, 10, 10));
		table.setVgap(8);
		table.setHgap(8);
		// 6.1 Добавляем элементы в окно
		table.getChildren().addAll(textNumber1, inputNumber1, textNumber2, inputNumber2, button);
		
		// 7. Создаём окно
		window = primaryStage;
		// 7.1 Создаём титульное название окна
		window.setTitle("Случайное число");
		// 7.2 Создаём размеры окна
		Scene scene = new Scene(table, 800, 600);
		// 7.3 Создаём внутреннее пространство
		window.setScene(scene);
		// 7.4 Показываем окно
		window.show();
		
	}
}
