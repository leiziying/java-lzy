package com.monkey1024;
class  Node{
    int  val;
    Node  next;
    Node  (int  val){
        this.val=val;
        this.next=null;
    }
}
public class test01 {
    public  static  Node   pushFront(Node head,int  val){
        Node   node=new  Node(val);
        if(head==null){
            return  node;
        }//判断链表是否为空链表
        node.next=head;
        head=node;
        return head;
    }
    public  static void  print(Node  head){
        Node  cur=head;
        while(cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println("null");
    }
    public  static  void  main(String[]  args){
        Node  l1=new  Node(1);
        Node head=pushFront(l1,2);
        head=pushFront(head,3);
        head=pushFront(head,4);
        print(head);
    }
}