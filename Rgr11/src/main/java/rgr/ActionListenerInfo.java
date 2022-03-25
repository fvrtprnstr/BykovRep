package rgr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerInfo implements ActionListener {
    protected static InfoGui guiInfo;
    @Override
    public void actionPerformed(ActionEvent arg0) {

        guiInfo = new InfoGui();

    }
}
