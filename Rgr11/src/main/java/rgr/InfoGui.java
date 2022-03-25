package rgr;

import javax.swing.*;

public class InfoGui {
private JFrame info;
private JLabel studInfo;
public InfoGui(){

	info = new JFrame();
	info.setTitle("Team Project 11 ");
	info.setBounds(500, 400, 400, 300);
	info.setResizable(false);

	JPanel infoPanel = new JPanel();
	infoPanel.setLayout(null);
	info.add(infoPanel);

	//ФИО и номера зачетных книжек участников команды
	studInfo = new JLabel("ФИО и номера зачетных книжек участников команды");
	studInfo.setBounds(10,0,400,30);
	infoPanel.add(studInfo);

	JLabel studInfo1 = new JLabel("Ившин В.A. : 20130830");
	studInfo1.setBounds(10,30,200,30);
	infoPanel.add(studInfo1);

	JLabel studInfo2 = new JLabel("Галяшкин А.С. : 20130505");
	studInfo2.setBounds(10,60,200,30);
	infoPanel.add(studInfo2);

	JLabel studInfo3 = new JLabel("Быков В.О. : 20130821");
	studInfo3.setBounds(10,90,200,30);
	infoPanel.add(studInfo3);

	JLabel studInfo4 = new JLabel("Белоглазов Н.А. : 20131012");
	studInfo4.setBounds(10,120,200,30);
	infoPanel.add(studInfo4);

	JButton button_back = new JButton("Назад");
	button_back.setBounds(270, 200, 100, 40);
	ActionListenerBack infoListener = new ActionListenerBack();
	button_back.addActionListener(infoListener);
	infoPanel.add(button_back);

	info.setVisible(true);


}

public JFrame getFrame() {
	return info;
}

public JLabel getStudInfo() {
	return studInfo;
}

}