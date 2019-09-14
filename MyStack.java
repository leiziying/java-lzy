public class  MyStack{//一段插入删除
	/*属性
	存数据的空间
	int[]  array;
	当前栈元素个数
	int  top;在栈里写作top，表示栈顶元素
	方法（公开）
	构造方法
	插入数据（尾插）                      void  push(int  val);
	删除数据 （尾删）                     void  pop();
	查看栈顶数据[top-1]                   int  top();
	返回栈内数据元素个数  top             int  size();
	判断栈是否为空        top==0          boolean  isEmpty();
	*/
	private  int[]  array;
	private  int  top;
	public  Stack(int  deFaultCapacity){
		array=new  int[deFaultCapacity];
		top=0;
	}
	public Stack(){
		this(20);//没有传入，就用20作为默认的大小
	}
	public  void  push(int val){
		//扩容
		if(top==array.length){
			array=Arrays.copyOf(array,array.length*2);
		}
		array[top++]=val;
	}
	public  void pop(){
		if(top<=0){
			System.out.println("栈为空无法删除");
			return;
		}
		top--;
		array[top]=0;//可加可不加，把所有空的位置保持为0
	}
	public  int top(){
		if(top<=0){
			System.out.println("栈为空，无法返回栈顶元素");
			return -1;
		}
		return array[top-1];
	}
	public  int  size(){
		return top;
	}
	public  boolean  isEmpty(){
		return  top==0;
	}
}