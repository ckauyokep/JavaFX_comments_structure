package gui_002_Windows;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window_06 extends Application {
	
	Stage window;

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		
		
		// 3. Создаём вёрстку элементов в окне
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER); // Вариант 2. layout1.setStyle("-fx-alignment: center;");
		layout.setPadding(new Insets(50, 100, 50, 100));
		// 3.1 Добавляем элементы в окно
		layout.getChildren().addAll(listview, button, treeview);
		
		// 4. Создаём окно
		window = primaryStage;
		// 4.1 Создаём размеры окна
		Scene scene = new Scene(layout, 800, 600);
		// 4.2 Создаём внутреннее пространство
		window.setScene(scene);
		// 4.3 Показываем окно
		window.show();
		
	}

}
