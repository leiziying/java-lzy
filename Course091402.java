import java.util.Arrays;
public  class  Course091402{
	public  static  void  swap(int[]  a,int  i,int j){
		int  t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public  static  void  bubbleSort(int[]  a){//冒泡排序

//前后两个数比较，每一次比较能保证最大的数在最后面
//减治算法
//在无序的部分不停的交换，有序部分不用冒泡排序
   for(int i=0;i<a.length;i++){
	   boolean  sorted=true;//假设数组已经有序
	   //无序：[0,a.length-i)
	   //有序: [a.length-i,a.length)
	   //冒泡过程
	   for(int j=1;j<a.length-i;j++){
		   if(a[j-1]>a[j]){
		   swap(a,j-1,j);
		   sorted=false;//如果发生交换了sorted就变成false，如果没发生交换就是a[j]一直比a[j-1]大，直到跳出for循环，此时的sorted依然是true
	     }
       }
	   if(sorted==true){//一次交换都没有发生说明数组本来就是有序的，直接返回
		   return ;
	   }
	}
	}
	public  static  double  average(int[]  a){
		int  max=a[0];
		int  min=a[];
		int sum=0;
		double  average=0;
		for(int  i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		
			if(a[i]<min){
				min=a[i];
			}
			min=a[0];
		}
		for(int  i=0;i<a.length;i++){
			sum+=a[i];
		}
		average=(sum-max-min)/(a.length-2);
		return average;
	}
	public  static void  bubbleSort2(int[]  a){
		//从后往前冒泡，小的往前冒
	//有序：[0,i)
	//无序：[i,a.length)
	for(int i=0;i<a.length;i++){
		for(int j=a,length-1;j>i;j--){
			if(a[j-1]>a[j]){
				swap(a,j-1,j);
			}
		}
	}
	}
	public  static void  testbubbleSort(int[]  a){
		System.out.println("排序前");
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println("排序后");
		System.out.println(Arrays.toString(a));
		
	}
    public static void  main(String[]  args){
		   int[]  a=new  int[] {1，3，4，5，6，2，8，9};
		   int[]  b=new  int[] {2,4,6,7,4,7,9,4,9,6};
		  testbubbleSort(a);
	   }
}