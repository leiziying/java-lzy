public class ArrayDemo//定义一个类
{
	public  static void  main(String[]   args)//主方法
	{
		//int[]    x=new   int[3];//开辟了一个长度为3的数组
		int[]   x=null;
		x=new   int[3]; 
		System.out.println(x.length);//3
		x[0]=1;//数组第一个元素
		x[1]=2;//数组第二个元素
		x[2]=3;//数组第三个元素
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);//通过循环控制引用下标更改
		}//3   1   2   3
	}
}