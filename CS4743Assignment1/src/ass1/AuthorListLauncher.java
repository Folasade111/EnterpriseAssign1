package ass1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AuthorListLauncher extends Application{
	private ObservableList<Author> authors;
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("AuthorListView.fxml"));
		loader.setController(new AuthorListController(authors));
		Parent rootPane = loader.load();
		Scene scene = new Scene(rootPane, 600, 400);
		stage.setScene(scene);
		stage.setTitle("Author List");
		stage.show();
	}
	public void init() throws Exception{
		super.init();
		authors =  FXCollections.observableArrayList();
		authors.add(new Author(""));
		authors.add(new Author("uguigius "));
	}
	
	public void stop() throws Exception{
		super.stop();
	}
	public static void main(String[]args){
		launch(args);
	}
	
}
