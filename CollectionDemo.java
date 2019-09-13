import java.sql.SQLOutput;
import  java.util.ArrayList;
import   java.util.Collection;
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String>  list=new ArrayList<>();
        System.out.println(list);//[]
        System.out.println(list.size());//size()返回此集合中的元素数。
        System.out.println(list.isEmpty());//true
        System.out.println("=========================");
        list.add("我");
        list.add("爱");
        list.add("Java");
        System.out.println(list);//[我,爱,Java]
        System.out.println(list.size());//3
        System.out.println(list.isEmpty());//false
    }
}
