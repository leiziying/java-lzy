class  Person{
	public  String name=null;
	public  int  gender=0;
	public  int  age=0;

	public  String toString()
	{
		return String.format("Person(%S,%d,%d)",name,gender,age);
	}
	public Person(String  n,int g,int a)
	{
		name=n;
		gender=g;
		age=a;
		
	}
}
public  class Course0720{
	public  static  void main(String[]   args)
	{
		Person p=new  Person("小比特",2,4);
		System.out.println(p.toString());
	}
}
