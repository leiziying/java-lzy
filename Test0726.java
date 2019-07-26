class  Node{
    int  val;
    Node  next;
    Node(val){
	   this.val=val;
	   this.next=null;
   }	
}
pubic  String toString()
{
	return String.format("Node(%d)",val);
}
Node  pushFront(Node  head,int  val)//头插
{
	Node  node=new  Node(val);
	node.next=head;
	head=node;
	return  head;
}
Node  pushBack(Node  head,int val)//尾插
{  
	Node  node=new  Node(val);
	Node  last=null;
	if(head==null)
	{
		head.next=node;
	}else
	{
	while(last.next!=null)
	{
		last=last.next;
	}
	last.next=node;
	}
	return head;
}
Node  popFront(Node  head,int val)//头删
{
   if(head=null){
	   System.out.println("空链表无法删除");
	   return null;
   }
   else{
	   head=head.next;
	   return head;
   }
}
Node  popBack(Node  head,int  val)//尾删
{ 
     if(head==null)
	 {
		 System.out.println("空链表无法删除");
		 return null;
	 }
	 if(head.next=null)//此链表只有一个节点
	 {
		 return  null;
	 }
	else
	{		Node  last=head;
	while(last.next.next!=null)
	{
		last=last.next;//循环完之后last就是倒数第二个节点的引用
	}
	last.next=null;//让倒数第二个节点的.next指空，就删掉了最后一个节点
	return  head;//尾删过程head没有动，仍然指向第一个节点，所以直接返回head
	}
}
class  Solution{
	public ListNode  reverseList(ListNode  head)
	{
		listNode  result=null;
		ListNode   cur=head;
		while(cur!=null)
		{
			ListNode  next=cur.next;
			cur.next=result;
			result=cur;
			cur=next;
		}
		return  result;
	}
}
class  Solution{
	public ListNode  reverseList(ListNode  head)
	{
		if(head==null)
		{
			return null;
		}
		ListNode p1=null;
		ListNode p2=head;
		ListNode p3=head.next;
		while(p2!=null)
		{
			p2.next=p1;
			p1=p2;
			p2=p3;
			if(p3!=null)
			{
				p3=p3.next;
			}
			return p1;
		}
	}
}
