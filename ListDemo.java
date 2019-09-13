import  java.util.ArrayList;
import  java.util.List;
public class ListDemo {
    public static void main(String[] args) {
        List<String>   courses=new ArrayList<>();
        courses.add("C");
        courses.add("JavaSE");
        courses.add("JavaWeb");
        courses.add("JavaEE");
        courses.add("C");
        System.out.println(courses);
        System.out.println(courses.get(1));//get（）返回此列表中指定位置的元素
        //System.out.println(courses.get(10));
        courses.set(0,"计算机基础");
        System.out.println(courses);
        List<String>  sub=courses.subList(1,3);//subList(int fromIndex, int toIndex)返回此列表中指定的 fromIndex （含）和 toIndex之间的视图  [1,3)
        System.out.println(sub);
        List<String>  list=new ArrayList<>(10);//list容量为10
        //list.get(1);size=0；因为没有元素，lenght代表容量，size代表数组元素个数，没有元素是size就是0
    }
}
