package com.liyifei.math;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.rank.Median;



class mathmodule extends math{ 
	int Samplesize(double[] a)
	{
		return 6;
	}
}
public class math {
    int Samplesize(double[] a)
    {
    	int result=0;
    	result =a.length;//注入错误
    	return result;
    }
    double geometricmean(double[] a)
    {
    	double result;
    	result=StatUtils.geometricMean(a);
    	return result;
    }
    double summation(double[] a)
    {
    	double result;
    	result=StatUtils.sum(a);
    	return result;
    }
    double extremum(double[] a,int choice)
    {
    	double result=0;
    	int size;
    	size=a.length;
    	if(size==0)
    	{
    		System.out.println("提示：样本为空，无最值");
    	}
    	else
    	{
    		if(choice==1)//计算最小值
    		{
    			result=StatUtils.min(a);
    		}
    		else if(choice==2)
    		{
    			result=StatUtils.max(a);//计算最大值
    		}
    		else
    		{
    			System.out.println("提示：选择参数错误");
    		}
    	}
    	return result;
    }
    double distribution(double[] a,int choice)
    {
    	StandardDeviation standardDeviation =new StandardDeviation();
    	int size;
    	double result=0;
    	size=a.length;
    	if(size==0)
    	{
    		System.out.println("提示：样本为空");
    	}
    	else
    	{
    		if(choice==1)//计算标准差
    		{
    			result=standardDeviation.evaluate(a);
    		}
    		else if(choice==2)
    		{
    			result=StatUtils.variance(a);//计算方差
    		}
    		else
    		{
    			System.out.println("提示：选择参数错误");
    		}
    	}
    	return result;
    }
    double numerical(double[] a,int choice)
    {
    	int size;
    	double result=0;
    	Median median= new Median();
    	size=a.length;
    	if(size==0)
    	{
    		System.out.println("提示：样本为空");
    	}
    	else
    	{
    		if(choice==1)//计算中位数
    		{
    			result=median.evaluate(a);
    		}
    		else if(choice==2)
    		{
    			result=StatUtils.mean(a);//计算平均数
    		}
    		else
    		{
    			System.out.println("提示：选择参数错误");
    		}
    	}
    	return result;
    }
    void app(math m,double[] a)
    {
    	System.out.print("样本个数"+m.Samplesize(a));
    	System.out.print("\n");
    	System.out.print("样本几何平均数："+m.geometricmean(a));
    	System.out.print("\n");
    	System.out.print("样本求和："+m.summation(a));
    	System.out.print("\n");
    	System.out.print("样本最小值"+m.extremum(a,1));
    	System.out.print("\n");
    	System.out.print("样本最大值"+m.extremum(a,2));
    	System.out.print("\n");
    	System.out.print("样本标准差"+m.distribution(a,1));
    	System.out.print("\n");
    	System.out.print("样本方差"+m.distribution(a,2));
    	System.out.print("\n");
    	System.out.print("样本中位数"+m.distribution(a,1));
    	System.out.print("\n");
    	System.out.print("样本平均数"+m.distribution(a,2));
    	System.out.print("\n");
    }
}

