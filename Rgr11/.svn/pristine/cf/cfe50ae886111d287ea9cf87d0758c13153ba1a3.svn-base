package rgr;

import javax.swing.*;

import java.math.BigDecimal;

public class Result {
    private double pI = 0;
    private String pIs;
    public Result()
    {

    }

    public void raschet(Double vd,Double si,Double sOb,Double tT,Double sOi,Double sumVi,Double sInd){

        try {

            //Общая формула для вычисления               vi :  si * (vd / ( sOb - sInd + sOi ));
            //Общая формула для вычисления суммы платежа pI : (vi + ( ( si * ( vd - sumVi ) ) / sOb ) ) *tT ;
            BigDecimal vdB = new BigDecimal(vd);
            BigDecimal siB = new BigDecimal(si);
            BigDecimal sObB = new BigDecimal(sOb);
            BigDecimal tTB = new BigDecimal(tT);

            BigDecimal bd01 = new BigDecimal(sOb -sInd + sOi);                      // ( sOb - sInd + sOi )

            BigDecimal b1 = vdB.divide(bd01, 5, BigDecimal.ROUND_HALF_UP);          //  vd / ( sOb - sInd + sOi )
            BigDecimal b2 = b1.multiply(siB);                                       //  si * (vd / ( sOb - sInd + sOi ))

            BigDecimal b3 = new BigDecimal( vd - sumVi);                             //( vd - sumVi )
            BigDecimal b4 = siB.multiply(b3);                                       //si * ( vd - sumVi )
            BigDecimal b5 = b4.divide(sObB, 5, BigDecimal.ROUND_HALF_UP);           //(si * ( vd - sumVi ) ) / sOb
            BigDecimal b6 = b2.add(b5);                                            //vi + ( ( si * ( vd - sumVi ) ) / sOb )
            BigDecimal b7 = b6.multiply(tTB);                                     //(vi + ( ( si * ( vd - sumVi ) ) / sOb ) )* tT
                                                                                  


            pI = Double.parseDouble(b7.toString());
            pIs = b7.setScale(2, BigDecimal.ROUND_CEILING).toString();


        } catch (ArithmeticException e) {

            System.err.println("Error: Деление на ноль");
            JOptionPane.showMessageDialog(null,"Деление на ноль");

        }
    }

    public String getOtvet(){

        return pIs;
    }

    public Double getResult(){
        return pI;
    }

}