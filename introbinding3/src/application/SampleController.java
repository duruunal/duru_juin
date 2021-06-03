package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;

public class SampleController implements Initializable{

    @FXML
    private Slider mSlider;

    @FXML
    private ProgressIndicator mIndicator;

    @FXML
    private ProgressBar mProgress;
    
    private Nombre num=new Nombre();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		num.setNombre(0);
		mProgress.progressProperty().bind(num.nombrePropery());
		mIndicator.progressProperty().bind(num.nombrePropery());
		mSlider.valueProperty().bindBidirectional(num.nombrePropery());
		
	}

	@FXML
	private void ajouter()
	{
		num.setNombre(num.getNombre()+0.1);
	}
	
	@FXML
	private void diminuer()
	{
		num.setNombre(num.getNombre()-0.1);
	}
	
}
