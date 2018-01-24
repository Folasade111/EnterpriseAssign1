package ass1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class AuthorDetailController {
	private static Logger logger = LogManager.getLogger();
	  @FXML
	    private Label lastNameLabel;

	    @FXML
	    private TextField webField;

	    @FXML
	    private TextField DOBField;

	    @FXML
	    private Label DOBLabel;

	    @FXML
	    private Label genderLabel;

	    @FXML
	    private Label webLabel;

	    @FXML
	    private TextField lastNameField;

	    @FXML
	    private Button saveButton;

	    @FXML
	    private TextField firstNameField;

	    @FXML
	    private TextField genderField;

	    @FXML
	    private Label firstNameLabel;
	    private Author author;

	    public AuthorDetailController(Author author){
	    	this();
	    	this.author = author;
	    }
	    public AuthorDetailController() {
			// TODO Auto-generated constructor stub
	    	logger.info("Author's name is " + author.getAuthorName());
		}
		@FXML
	    void onSave(ActionEvent event) {

	    }
}
