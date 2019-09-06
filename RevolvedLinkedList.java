class  Node{
	int  val;
    Node  next=null;
	Node(int val){
		this.val=val;
	}
}
//链表逆置
public   class  RevolvedLinkedList{
	//遍历链表，将每一个结点头插到新链表上
	public   static  Node revolvedLinkedList(Node   head){
		Node  cur=head;
		Node  newHead=null;//定义一个新的结点
		while(cur!=null)
		{
			Node  next=cur.next;
			cur.next=newHead;//将每一个结点头插到新链表上
			newHead=cur;//更新头结点
			cur=next;//头插一次，cur往后移一个
		}
		//头插完所有的结点，返回链表的头结点
		return  newHead;
	}
	//递归思路
	public  static  Node revolvedLinkedList2(Node  haed){
		//递归方法需要一个终止条件
		if(head==null||head.next==null){
			return  haed;
		}
		Node  result=revolvedLinkedList2(head.next);
		head.next.next=head;
		head.next=null;
		return result;
	}
	//打印链表
	public static void  print(Node  haed){
		for(Node   cur=head;cur!=null;cur=cur.next)
		{
			System.out.print(cur.val+"-->");
		}
			System.out.println("null");
			System.out.println();
	}
	public  static  void  main(String[]   args){
		//创建一条新链表
		Node  l1=new   Node(1);
		Node  l2=new   Node(2);
		Node  l3=new   Node(3);
		Node  l4=new   Node(4);
		Node  l5=null;
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		print(revolvedLinkedList(l1));//调用打印方法，看链表是否逆置
	}
}