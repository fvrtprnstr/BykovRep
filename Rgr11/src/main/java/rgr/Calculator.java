package rgr;

import javax.swing.*;

import java.awt.*;

public class Calculator {
	
	private  TextFieldDouble si;
    private  TextFieldDouble vd;
    private  TextFieldDouble sumVi;
    private  TextFieldDouble sOb;
    private  TextFieldDouble tT;
    private  TextFieldDouble sOi;
    private  TextFieldDouble sInd;
    protected static JPanel main_panel;
    private JLabel resultLabel;
    private JTextField fioField;
    private JTextField addsField;


    public Calculator(){

        JFrame main_frame = new JFrame();
        main_frame.setTitle("Калькулятор ");
        main_frame.setBounds(670,250,600,450);


        main_panel = new JPanel();
        main_panel.setLayout(null);
        main_frame.add(main_panel);
        main_panel.setBackground(Color.orange);
        JLabel mainLabel = new JLabel("Рассчет стоимости отопления");
        mainLabel.setBounds(190,0,250,30);
        mainLabel.setFont(new Font("Times New Roman",Font.PLAIN, 18));
        main_panel.add(mainLabel);

        JLabel secondLabel = new JLabel("Данные для рассчета:");
        secondLabel.setBounds(10,30,250,30);
        secondLabel.setFont(new Font("Times New Roman",Font.PLAIN, 16));
        main_panel.add(secondLabel);

        // Общая площадь квартиры                       Si
        JLabel s1 = new JLabel   ("Общ. S кв.                                                             Si");
        // Общая площадь всех жилых и нежилых помещений Sоб
        JLabel s2 = new JLabel   ("Общ. s всех помещений                               Sоб");
        // Объем тепловой энергии                       Vд
        JLabel vTE = new JLabel  ("V тепловой энергии                                        Vд");
        // Тариф на тепловую энергию                    Tт
        JLabel tarif = new JLabel("Тариф на тепловую энергию                       Tт");
        // Cуммарное потребление тепловой энергии по всем жилым и нежилым помещениям ƩVi
        JLabel sumTE = new JLabel(" Cум. потреб. тепловой энергии                 ƩVi ");
        // Общая площадь помещений общего имущества     Sои
        JLabel s3 = new JLabel   ("Общ. S помещений общ. имущества         Sои");
        // Общая площадь неотопляемых помещений         Sинд
        JLabel s4 = new JLabel   (" Общ. S неотопляемых помещений       Sинд");

        s1.setBounds(10,60,270,30);
        main_panel.add(s1);
        s2.setBounds(10,90,270,30);
        main_panel.add(s2);
        vTE.setBounds(10,120,270,30);
        main_panel.add(vTE);
        tarif.setBounds(10,150,270,30);
        main_panel.add(tarif);
        sumTE.setBounds(10,180,270,30);
        main_panel.add(sumTE);
        s3.setBounds(10,210,270,30);
        main_panel.add(s3);
        s4.setBounds(10,240,270,30);
        main_panel.add(s4);

        si = new TextFieldDouble();
        si.setBounds(300,60,70,30);
        main_panel.add(si);
        si.setText("43.6");

        sOb = new TextFieldDouble();
        sOb.setBounds(300,90,70,30);
        main_panel.add(sOb);
        sOb.setText("3851.8");

        vd = new TextFieldDouble();
        vd.setBounds(300,120,70,30);
        main_panel.add(vd);
        vd.setText("56.52");

        tT = new TextFieldDouble();
        tT.setBounds(300,150,70,30);
        main_panel.add(tT);
        tT.setText("2198.18");

        sumVi = new TextFieldDouble();
        sumVi.setBounds(300,180,70,30);
        main_panel.add(sumVi);
        sumVi.setText("45.56");

        sOi = new TextFieldDouble();
        sOi.setBounds(300,210,70,30);
        main_panel.add(sOi);
        sOi.setText("925.8");

        sInd = new TextFieldDouble();
        sInd.setBounds(300,240,70,30);
        main_panel.add(sInd);
        sInd.setText("0");

        resultLabel = new JLabel();
        resultLabel.setBounds(10,270,200,30);
        main_panel.add(resultLabel);
        resultLabel.setText("Размер платы: ");

        JLabel ld = new JLabel();
        ld.setBounds(10,300,200,30);
        main_panel.add(ld);
        ld.setText("Личные данные:");
        ld.setFont(new Font("Times New Roman",Font.PLAIN, 16));

        JLabel fio = new JLabel();
        fio.setBounds(10,330,200,30);
        main_panel.add(fio);
        fio.setText("   ФИО:");

        JLabel adds = new JLabel();
        adds.setBounds(10,370,200,30);
        main_panel.add(adds);
        adds.setText("Адрес:");

        fioField = new JTextField();
        fioField.setBounds(70,330,200,30);
        main_panel.add(fioField);
        fioField.setText("Иванов Иван Иванович");

        addsField = new JTextField();
        addsField.setBounds(70,370,200,30);
        main_panel.add(addsField);
        addsField.setText("ул.Ленина 1/2");

        JButton button_result = new JButton("Рассчитать");
        button_result.setBounds(380, 85, 200, 40);
        ActionListenerResult actionListener2 = new ActionListenerResult();
        button_result.addActionListener(actionListener2);
        button_result.setBackground(Color.YELLOW);
        main_panel.add(button_result);

        JButton button_PDF = new JButton("Конвертировать в PDF");
        button_PDF.setBounds(380, 145, 200, 40);
        ActionListenerPDF actionListener = new ActionListenerPDF();
        button_PDF.addActionListener(actionListener);
        button_PDF.setBackground(Color.YELLOW);
        main_panel.add(button_PDF);

        JButton button_info = new JButton("Информация");
        button_info.setBounds(380, 205, 200, 40);
        ActionListenerInfo actionListener4 = new ActionListenerInfo();
        button_info.addActionListener(actionListener4);
        button_info.setBackground(Color.YELLOW);
        main_panel.add(button_info);


        JButton button_exit = new JButton("Выход");
        button_exit.setBounds(380, 350, 200, 40);
        ActionListenerExit actionListener1 = new ActionListenerExit();
        button_exit.addActionListener(actionListener1);
        button_exit.setBackground(Color.PINK);
        main_panel.add(button_exit);

        main_frame.setVisible(true);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public TextFieldDouble getFieldDouble(String name){
        TextFieldDouble x = new TextFieldDouble();
        switch (name){
            case ("si"):

                x = si;
                break;
            case ("vd"):

                x = vd;
            break;
            case ("sumVi"):

                x = sumVi;
            break;
            case ("sOb"):

                x = sOb;
            break;
            case ("tT"):
                x = tT;
            break;
            case ("sOi"):

                x = sOi;
            break;
            case ("sInd"):

                x = sInd;
            break;
            default:

            	x.setText("Null");
                break;
        }
      return x;
    }


    public JLabel getLabel() {
        return resultLabel;
    }
    
    public JTextField getFieldPDF(String name){
    	JTextField y = fioField;
        switch (name){
            case ("адрес"):

                y = addsField;
                break;
            case ("фио"):

                y = fioField;
            break;
            default:
            	y.setText("");
                break;
        }
      return y;
    }
}