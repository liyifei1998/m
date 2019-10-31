package com.liyifei.math;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class mathtest2 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Samplesizetest() 
    {
    	math m= new math();
    	double[] a=new double[] {1,2,3,4,5,6};
    	System.out.print(" 样本个数"+m.Samplesize(a));
    	System.out.print("\n");
    }
	@Test
    public void averagetest()
    {
    	math m=new math();
    	double[] a=new double[] {1,2,3,4,5,6};
    	System.out.print("样本几何平均数："+m.geometricmean(a));
    	System.out.print("\n");
    }
	@Test
    public void summationtest()
    {
    	math m=new math();
    	double[] a=new double[] {1,2,3,4,5,6};
    	System.out.print("样本求和："+m.summation(a));
    	System.out.print("\n");
    }
	@Test
    public void extremumtest()
    {
    	math m=new math();
    	double[] a=new double[] {1,2,3,4,5,6};
    	System.out.print("样本最小值"+m.extremum(a,1));
    	System.out.print("\n");
    	System.out.print("样本最大值"+m.extremum(a,2));
    	System.out.print("\n");
    }
	@Test
    public void distributiontest()
    {
    	math m=new math();
    	double[] a=new double[] {1,2,3,4,5,6};
    	System.out.print("样本标准差"+m.distribution(a,1));
    	System.out.print("\n");
    	System.out.print("样本方差"+m.distribution(a,2));
    	System.out.print("\n");
    }
	@Test
    public void numericaltest()
    {
    	math m=new math();
    	double[] a=new double[] {1,2,3,4,5,6};
    	System.out.print("样本中位数"+m.distribution(a,1));
    	System.out.print("\n");
    	System.out.print("样本平均数"+m.distribution(a,2));
    	System.out.print("\n");
    }
}
