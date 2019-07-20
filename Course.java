import java.util.Arrays;
public   class  Course{
	public  static  void  swap(int[]  a,int i,int j )//交换方法
	{
		int  t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	/*public static void bubbleSort(int[] a)//冒泡排序优化版
	{
		for(int i=0;i<a.length;i++)
		{
			boolean  sorted=true;
			//无序区间[0,a.length-i)
			//有序区间[a.length-i,a.length)
			//冒泡过程
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					swap(a,j-1,j);
			     sorted =false;
				}
			}
		 if(sorted==true)
		 {
			return;
		 }
		}
	}*/
	public static void bubbleSort1(int[] a)//大的往后换
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					swap(a,j-1,j);
				}
			}
		}
	}
	public  static  void bubbleSort2(int[] a)//小的往前换
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[j]<a[j-1])
				{
					swap(a,j,j-1);
				}
			}
		}
	}
	public  static  void main(String[]  args)
	{
		int[]   a={1,5,7,6,3,4,2};
		bubbleSort2(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}
	
}