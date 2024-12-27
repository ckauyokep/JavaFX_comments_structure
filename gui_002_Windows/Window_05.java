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

public class Window_05 extends Application {
	
	Stage window;
	ListView<String> listview;
	TreeView<String> treeview;

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		
		// 1. Создаём элемент
		listview = new ListView<>();
		listview.getItems().addAll("Архивы", "Видео", "Документы", "Картинки", "Музыка", "Образы");
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		// 2. Создаём элемент
		Button button = new Button("Найти");
		// 2.1 Добавляем к кнопке реакцию при нажатии
		button.setOnAction(e -> listviewHandler(listview));
		
		// 3. Создаём элемент
		TreeItem<String> root, files;
		root = new TreeItem<>();
		root.setExpanded(true);
		files = makeBranch("Files", root);
		makeBranch("Архивы", files);
		makeBranch("Видео", files);
		makeBranch("Документы", files);
		makeBranch("Картинки", files);
		makeBranch("Музыка", files);
		makeBranch("Образы", files);
		treeview = new TreeView<>(root);
		treeview.setShowRoot(false);
		treeview.getSelectionModel().selectedItemProperty().addListener((value, oldValue, newValue) -> { 
			if (newValue != null && newValue.getValue() != "Files" ) 
			{ System.out.println("Найдено: " + newValue.getValue()); }});
		
		// 4. Создаём вёрстку элементов в окне
		VBox layout = new VBox(20);
		layout.setAlignment(Pos.CENTER); // Вариант 2. layout1.setStyle("-fx-alignment: center;");
		layout.setPadding(new Insets(50, 100, 50, 100));
		// 3.1 Добавляем элементы в окно
		layout.getChildren().addAll(listview, button, treeview);
		
		// 5. Создаём окно
		window = primaryStage;
		// 5.1 Создаём размеры окна
		Scene scene = new Scene(layout, 800, 600);
		// 5.2 Создаём внутреннее пространство
		window.setScene(scene);
		// 5.3 Показываем окно
		window.show();
	}
	
	// 2.2 Создаём для кнопки реакцию при нажатии
	void listviewHandler(ListView<String> listview) {
		String message = "";
		ObservableList<String> files;
		files = listview.getSelectionModel().getSelectedItems();
		
		for(String i: files) {
			message += i;
		}
		
		System.out.println("Не найдено: " + message);
	}
	
	// 3.8 Создаём для элемента реакцию при нажатии
	TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}

}

