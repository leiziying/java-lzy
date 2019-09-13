class Node{
    int val;
    Node  next;
}
//利用链表的头删和尾插实现队列
public class MyQueue {
   private  Node  head=null;
   private  Node  tail=null;
   private int size;
   public  void  offer(int v){
       Node  node  =new  Node();
       node.val=v;
       if(tail==null){
           head=tail=node;
       }else{
           tail.next=node;
           tail=node;//尾插
       }
   }
}
