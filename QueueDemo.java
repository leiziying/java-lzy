import  java.util.LinkedList;
import  java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String>  queue=new LinkedList<>();//链表模拟实现队列
        queue.add("学习");
        queue.add("睡觉");
        queue.add("吃饭");
        queue.add("打豆豆");
        System.out.println(queue.isEmpty());//false
        System.out.println(queue.element());//学习 element()检索，但不删除，这个队列的头
        System.out.println(queue.peek());//学习   peek()检索但不删除此队列的头，如果此队列为空，则返回 null 。
        System.out.println("======================");
        System.out.println(queue.poll());//学习  检索并删除此队列的头，如果此队列为空，则返回 null
        System.out.println(queue.remove());//睡觉   检索并删除此队列的头
        System.out.println(queue.remove());//吃饭
        System.out.println("======================");
        System.out.println(queue.poll());//打豆豆
        System.out.println(queue.poll());
    }

}
