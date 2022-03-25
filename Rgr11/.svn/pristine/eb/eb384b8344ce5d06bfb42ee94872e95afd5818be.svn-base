import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import rgr.Result;

public class Test4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testRaschet() {
		
		Double vd, si, sOb, tT, sOi, sumVi, sInd, x;
		vd = 56.52;
		si = 43.6;
		sOb = 3851.8;
		tT = 2198.18;
		sOi = 925.8;
		sumVi = 45.56;
		sInd = 0.0;
		x = 1406.51;
		
		Result test = new Result();
		test.raschet(vd, si, sOb, tT, sOi, sumVi, sInd);
		assertEquals(test.getOtvet(),x.toString());
		
	}

}
