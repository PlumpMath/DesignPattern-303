package factory.FactoryToBuild;

import factory.abstractFactory.Button;
import factory.abstractFactory.ComboBox;
import factory.abstractFactory.TextField;

public class Windows {
	
	private Button button;
	
	private TextField textField;
	
	private ComboBox comBox;

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public TextField getTextField() {
		return textField;
	}

	public void setTextField(TextField textField) {
		this.textField = textField;
	}

	public ComboBox getComBox() {
		return comBox;
	}

	public void setComBox(ComboBox comBox) {
		this.comBox = comBox;
	}
	
	

}
