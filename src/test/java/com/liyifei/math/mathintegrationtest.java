package com.liyifei.math;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mathintegrationtest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void apptest()
	{
		mathmodule m=new mathmodule();
    	double[] a=new double[] {1,2,3,4,5,6};
    	m.app(m,a);
	}

}
