package rgr;
import javax.swing.*;
import java.awt.*;


public class TextFieldDouble extends TextField {

    public  Double toDouble(){

        try {
            if ( this.getName() == "sInd" && Double.parseDouble(this.getText()) == 0) {
                return null;
            } else return Double.parseDouble(this.getText());
        } catch (NumberFormatException e) {
            System.err.println("Error: Not number ");
            JOptionPane.showMessageDialog(null,"Введите число");
            this.setText("");
        	

        }
        return null;

    }

}