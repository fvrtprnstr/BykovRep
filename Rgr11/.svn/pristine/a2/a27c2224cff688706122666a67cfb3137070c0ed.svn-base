package rgr;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import javax.swing.JOptionPane;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;

import com.itextpdf.text.Document;

public class ActionListenerPDF implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
    	
    	 if (App.calc.getLabel().getText() == "Размер платы: ") {
             JOptionPane.showMessageDialog(null,"Cначала выполните рассчет");
    	 } else {
    		String[][] NameCell = new String[7][2];
    		NameCell[0][1]= App.calc.getFieldDouble("si").getText();
    		NameCell[1][1]=App.calc.getFieldDouble("vd").getText();
    		NameCell[2][1]=App.calc.getFieldDouble("sumVi").getText();
    		NameCell[3][1]=App.calc.getFieldDouble("sOb").getText();
    		NameCell[4][1]=App.calc.getFieldDouble("tT").getText();
    		NameCell[5][1]=App.calc.getFieldDouble("sInd").getText();
    		NameCell[6][1]=App.calc.getFieldDouble("sOi").getText();
    		NameCell[0][0]="Общ. S кв.";
    		NameCell[1][0]="Общ. s всех помещений";
    		NameCell[2][0]="V тепловой энергии";
    		NameCell[3][0]="Тариф на тепловую энергию";
    		NameCell[4][0]="Cум. потреб. тепловой энергии";
    		NameCell[5][0]="Общ. S помещений общ. имущества";
    		NameCell[6][0]="Общ. S неотопляемых помещений";
 
    		String[] Hat = new String[2];
    		Hat[0]="Услуга";
    		Hat[1]="Объем";
 
    		String Texthat = "Платежный документ для оплаты жилищно-коммунальных услуг";
    		String Textgeneral = "Адрес: " + App.calc.getFieldPDF("адрес").getText() + " ФИО: " + App.calc.getFieldPDF("фио").getText();
    		String TextTable = "          Таблица 1. Детализация размера платы за жилое помещение";
    		String TextNext = "               К оплате: " + ActionListenerResult.result.getOtvet() + "руб.";
    		URL Imagelink=getClass().getResource("/picture/ugatu.png");
    		String Namefile = "Document.pdf";
    		BaseFont times = null;
    		try {
    			times = BaseFont.createFont("/fonts/times.ttf", "cp1251", BaseFont.EMBEDDED);
    		} catch (DocumentException e2) {
    			e2.printStackTrace();
    		} catch (IOException e2) {
    			e2.printStackTrace();
    		}
 
    		CreatePDF pdf = new CreatePDF(Namefile,times);
    		Document document = pdf.getDocument();
    		pdf.addText(document, Texthat, 18,true);
    		pdf.addText(document, Textgeneral, 14,true);
			pdf.addText(document, TextTable, 14, true);
			pdf.InitTableAndAddHat(document,Hat);
			pdf.addRowsInTable(pdf.getTable(), NameCell);
			pdf.addTable(document,pdf.getTable());
			pdf.addText(document, TextNext, 14,true);
			pdf.addPicture(Imagelink, document, 90, 390);
			pdf.addText(document, " ", 14, true);
			pdf.addText(document, " ", 14, true);
			pdf.addText(document, "               Рис. 1 Главный логотип для размешения на официальных документах", 14, true);
			pdf.getClose();
 
			//вывод окна с сообщением о создании файла
			JOptionPane.showMessageDialog(null, "Файл " + Namefile + " создан","Create PDF", JOptionPane.PLAIN_MESSAGE);
    	 	}
    		
    	}
    }
