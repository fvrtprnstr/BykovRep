import static org.junit.Assert.*;

import org.junit.Test;

import rgr.TextFieldDouble;

public class Test2 {


    @Test
    public void testToDouble() {
        Double x;
        x = 131.0;

        TextFieldDouble field = new TextFieldDouble();
        field.setText("131");


        assertEquals(field.toDouble(),x);

    }

}