package gui_002_Windows;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window_04 extends Application {
	
	Stage window;

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		ChoiceBox<String> choicebox1 = new ChoiceBox<>();
		choicebox1.getItems().addAll("Архивы", "Видео", "Документы", "Картинки", "Музыка", "Образы");
		
		// 2. Создаём элемент
		ChoiceBox<String> choicebox2 = new ChoiceBox<>();
		choicebox2.getItems().addAll("Архивы", "Видео", "Документы", "Картинки", "Музыка", "Образы");
		// 3.1 Добавляем к элементу реакцию при выборе
		choicebox2.getSelectionModel().selectedItemProperty().addListener(
				(value, oldValue, newValue) -> System.out.println("Выбрано: " + newValue));
		
		// 3. Создаём элемент
		Button button1 = new Button("Найти");
		// 3.1 Добавляем к кнопке реакцию при нажатии
		button1.setOnAction(e -> choiceboxHandler(choicebox1));
		
		// 4. Создаём элемент
		ComboBox<String> combobox = new ComboBox<>();
		combobox.getItems().addAll("640 x 480", "800 x 600", "1024 x 768", "1280 x 1024");
		combobox.setPromptText("Выберите разрешение окна");
		// 4.1 Добавляем к элементу реакцию при выборе
		combobox.setOnAction(e -> System.out.println(combobox.getValue()));
		
		// 5. Создаём элемент
		Button button2 = new Button("Выбрать");
		// 5.1 Добавляем к кнопке реакцию при нажатии
		button2.setOnAction(e -> comboboxHandler(combobox));

		// 6. Создаём вёрстку элементов в окне
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER); // Вариант 2. layout1.setStyle("-fx-alignment: center;");
		// 6.1 Добавляем элементы в окно
		layout.getChildren().addAll(choicebox1, button1, choicebox2, combobox, button2);
		
		// 7. Создаём окно
		window = primaryStage;
		// 7.1 Создаём размеры окна
		Scene scene = new Scene(layout, 800, 600);
		// 7.2 Создаём внутреннее пространство
		window.setScene(scene);
		// 7.3 Показываем окно
		window.show();
		
	}
	
	// 3.2 Создаём для кнопки реакцию при нажатии
	void choiceboxHandler(ChoiceBox<String> choicebox) {
		String value = choicebox.getValue();
		System.out.println("Не найдено: " + value);
	}
	
	// 5.2 Создаём для кнопки реакцию при нажатии
	void comboboxHandler(ComboBox<String> combobox) {
		System.out.println(combobox.getValue());
	}

}

