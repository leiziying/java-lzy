import  java.util.LinkedList;
import  java.util.Deque;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();//用链表模拟实现双向队列
        deque.addFirst("学习");//addFirst(E e)插入此双端队列的前面，如果它是立即可行且不会违反容量限制，抛出一个指定的元素 IllegalStateException如果当前没有空间可用。
        deque.offerFirst("睡觉");//offerFirst(E e)在此deque的前面插入指定的元素，除非它会违反容量限制。
        deque.addLast("打豆豆");//addLast(E e)在插入如果它是立即可行且不会违反容量限制，抛出此双端队列的末尾指定元素 IllegalStateException如果当前没有空间可用。
        System.out.println(deque.getFirst());//getFirst()检索，但不删除，这个deque的第一个元素    睡觉
        System.out.println(deque.getLast());//getLast()检索，但不删除，这个deque的最后一个元素    打豆豆
    }
    }

