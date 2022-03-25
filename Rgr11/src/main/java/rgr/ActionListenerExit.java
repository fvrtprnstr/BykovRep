package rgr;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExit implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {

        System.exit(1);

    }
}