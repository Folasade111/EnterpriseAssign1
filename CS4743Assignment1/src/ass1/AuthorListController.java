package ass1;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class AuthorListController implements Initializable {
    @FXML
    private ListView<Author> authorList;
    private ObservableList <Author> authors;
    
    public AuthorListController(ObservableList <Author> authors){
    	this.authors = authors;
    }
    @FXML void onAuthorListClicked(MouseEvent event){
    	try {

    		Author author = authorList.getSelectionModel().getSelectedItem();
    		if(event.getClickCount() == 2){ // this is to check for double click not sure
    		if(author != null) {
    			//display detail of clicked dog
    			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("AuthorDetailView.fxml"));
    			loader.setController(new AuthorDetailController(author));
    			GridPane rootPane = loader.load();
    			Scene scene = new Scene(rootPane, 400, 200);
    			Stage stage = new Stage();
    			stage.setScene(scene);
    			stage.setTitle("Detail View for " + author.getAuthorName());
    			stage.show();
    			
    			logger.info(author.getAuthorName() + " Double clicked");
    		}
    		}
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    
}
