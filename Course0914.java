import  java.util.Arrays;
public   class  Course0914{
	public   static  void  swap(int[]  a,int  i,int j){
		int  t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	//a.length获取数组长度
	public  static  void  int  indexOf(int[]  a,int v){
		for(int i=0;i<a.length;i++){
			if(a[i]==v){
				return i;
			}
		}
		return -1;	
	}
	public  static void  fill(int[]  a,int v){
		for(int i=0;i<a.length;i++){
			a[i]=v;
		}
	}
	public  static  int[]  copyOf(int[]  original,int  newLength){
		new[]  dest=new  int[newLength];//dest本身就是int类型的数组
		int  length=original.length<=newLength?original.length:newLength;//在original.length和newLength之间取最短的
		for(int i=0;i<newLength;i++){
			dest[i]=original[i];//下标越界
		}
		return dest;
	}
	public   static  void main(String[]   args){
		int[]   a={1,2,3,4,5};
		//交换下标0和下标3的数据
		//swap(a[0],a[3]);    不能实现交换，形参的改变不能影响实参,java中没有任何形参影响实参的方法只能通过引用的方法
		swap(a,0,3);
		copyOf(a,10);
		System.out.println(a);//[I@4554617c 
		  System.out.println(Arrays.toString(a));
		fill(a,2);//使用自己的fill
		Arrays.fill(a,1);//使用Arrays的fill方法
}
//编译错误  javac
//运行错误