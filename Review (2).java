//后台开发
//安卓系统开发
//大数据开发（计算要求较高）
public   class  HelloWorld{
	public  static  void  main(String[]   args){//程序入口函数
		System.out.println("你好世界")；
	}
}
/*
面向对象的语言
类是一组蓝图，设计图稿
对象拿着蓝图制造出一组实例
类名称，重要：类名称必须和文件名一样
*/
public   class  Course0716{
	public  static  void main(String[]  args){
		//不用\n代表换行  %n代表换行
		System.out.printf("%s%n",a[0])//第0个位置，没有指定参数就会越界
	}
}
/*
变量的定义(variable可变的)
    标识符    identifier）
   语法规则：变量类型    变量名称;
   变量类型  变量名称=初始化值；
                      1.字面量           int   a=10;
					  2.另一个字面量     int   b=a;
					  3.方法的返回值     int  m=max(a,b);
变量类型
1.基本类型（primarity   type）
   1）数值类型
      整型
	   byte    一个字节   跟C语言不一样，在C语言中会根据机器的不一样所占字节数会不一样，但在java中是规定死了的
	   short   两个字节
	   int     四个字节
	   long    八个字节
	   浮点型   float-->四个字节     double-->八个字节
	   字符类型 char-->两个字节（Unicode    码点）
	2）布尔类型   boolean    true/false
2.引用类型（reference   type）
   1)数组引用
   2）类引用
   3）接口引用
3.什么是Unicode
     ASCII    7bit     A-Z
	 Unicode
	 GB(国标)
	 UTF-8
标识符（包含变量名，方法名，类名）的规定
1）必须以字母,或者$或者_开头（不能以数字或者特殊字符开头）
       int  中国=10；
2）可以跟字母，数字，下划线_,美元符$
3)长度理论上可以无限长
规范：
1.永远不要用中文作为标识符
2.不要出现$
3.不要出现下划线_,除了定义不可变的变量
4.变量（名词）
5.方法（动词）
类名称（每个单词首字都大写）
*/
//定义方法：
  public   static    返回值类型   方法名称（形参裂变）{
	  //java中没有方法的声明只有定义
  }
  public   static void  main(String[]   args){
	  
  }
  public   static  int   max(int  a,int  b){
	  if(a>b){
		  return a;
	  }else
	  {
		  return b;
	  }
  }
  /*字面量
    int          a=10;
	10           int类型
	10L/10l      long类型
	四种进制的表示：
	二进制       0b001/0B001       0B001L
	八进制       010
	十进制       10
	十六进制     0xFF/0XFF
	1.0          double类型
	1.0F/1.0f    float类型
	instanceof  判断变量是否指定类型
	*/
	
	1.方法的定义语句
	标识符           返回值类型     方法名称（形参列表）
	public static    void           main(String[]   args){
		
	}
	2.方法的调用
	
  
  
   