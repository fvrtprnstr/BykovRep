package rgr;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class ActionListenerResult implements ActionListener {
	protected static Result result;
    @Override
    public void actionPerformed(ActionEvent arg0) {
    	result = new Result();
        if (
                App.calc.getFieldDouble("si").toDouble() == null ||
                App.calc.getFieldDouble("vd").toDouble() == null ||
                App.calc.getFieldDouble("sumVi").toDouble() == null ||
                App.calc.getFieldDouble("sOb").toDouble() == null ||
                App.calc.getFieldDouble("tT").toDouble() == null ||
                App.calc.getFieldDouble("sOi").toDouble() == null ||
                App.calc.getFieldDouble("sInd").toDouble() == null 
        ) {
        } else
        	result.raschet(
        			App.calc.getFieldDouble("vd").toDouble(),
        			App.calc.getFieldDouble("si").toDouble(),
        			App.calc.getFieldDouble("sOb").toDouble(),
        			App.calc.getFieldDouble("tT").toDouble(),
        			App.calc.getFieldDouble("sOi").toDouble(),
        			App.calc.getFieldDouble("sumVi").toDouble(),	
        			App.calc.getFieldDouble("sInd").toDouble()
        			);
        
        if (result.getResult() <=0 ||result.getResult() >100000 ){

        	App.calc.getLabel().setText("Размер платы: " + "");

        } else {

            App.calc.getLabel().setText("Размер платы: " + result.getOtvet() +" руб");
        }
    }
}
