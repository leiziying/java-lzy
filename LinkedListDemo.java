import  java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>   linkedList=new LinkedList<>();
        linkedList.addLast("吃饭");//add(E e)将指定的元素追加到此列表的末尾
        linkedList.addLast("吃晚饭");
        linkedList.addLast("吃宵夜");
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());//pollFirst()检索并删除此列表的第一个元素，如果此列表为空，则返回 null
    }
}
