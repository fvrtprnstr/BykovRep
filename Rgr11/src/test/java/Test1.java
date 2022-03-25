import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import rgr.Calculator;

public class Test1 {
     public static String[] mas;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }

    @Test
    public void testGetFieldPDF() {
        Calculator testCalc = new Calculator();


      assertNotNull(testCalc.getFieldPDF("адрес"));
      assertNotNull(testCalc.getFieldPDF("фио"));
      assertNotNull(testCalc.getFieldPDF("адресфио"));

        //fail("Not yet implemented");
    }

}