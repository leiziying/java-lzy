//链表（逻辑上有前后关系，物理上不保证前后关系）
class   Node{
	int  val;
	Node  next;//后继，下一个的引用
}
//如果next==null，表示最后一个结点
public class   NewList{
	public   static  void  main(String[]   args){
		Node  head=null;
		//head的意思是链表的第一个结点
		//通过第一个结点，就可以找到完整的链表
		//所以，链表的第一个结点往往代表整条链表
		//空的链表就是一个结点都没有的链表，也就是没有第一个结点
		//head==null表示第一个结点不存在，也就是整个链表为空
	}
}
/*头插（两种情况，空链表和非空链表，但是两种情况是一样的）
  1.如果要插入的数据没有结点，先给它装入一个结点中
     Node  node=new   Node();      node是新对象的引用
	 node.value=0;
  2.让原来的头结点称为新结点的下一个结点
	 node.next=head;
  3.更新第一个结点
     head=node
	 打印链表
	 Node cur=head;
	 while(cur!=null){
		 System.out.println(cur.val);
		 cur=cur.next;
	 }
	 for(Node  cur=head;cur!=null;cur=cur.next){
		 System.out.println(cur);
	 }
尾插：(要分情况讨论，空链表和非空链表)
    1.如果没在结点中装到结点里，让新结点的next=null
	Node   node=new   Node(val);(构造方法已经让.next=null)
	2.找到最后一个结点(子问题)找到.next==null的结点
	Node  last=head;
	while(last.next!=null){
		last=last.next;
	}
	last就是最后一个结点
	3.让原来的倒数第一个结点的下一个为新结点
	last.next=node
	对于空链表就是让新结点成为第一个结点
	对于空链表就按如上处理
	*/
	private   static   Node  pushBack(Node  head,int  val){
		Node  node =new  Node(val);
		if(head==null){
		return node;
		}else
		{
			Node last=head;
			while(last.next!=null){
				last=last.next;
			}
			last.next=node;
			return head;
		}
	}
	Node   pushFront(Node  haed,int val){
		Node  node=new  Node(val);
		node.next=head;
		return node;
	}
	
//头删
  private  Node  popFront(Node  head){
	  if(head==null)
	  {
		  System.out.println("空链表无法删除")；
		  return;
	  }
	  //原来第一个结点，会因为没有引用指向而被回收
	return  head.next;
  }	
  //尾删(分情况，只有一个结点，大于一个结点)
  //找到倒数第二个结点
  //lastSecond.next.next==null就是倒数第二个结点
  //让倒数第二个的next=null
  //原来的最后一个结点因为没有引用指向而被回收
  private   Node  popBack(Node  haed){
	  if(head==null){
		  System.out.println("空链表无法删除")；
		  return；
	  }
	  //链表中只有一个结点的情况
	  if(head.next==null){//单独讨论，如果head.next为空，那么lastSecond.next也为空，下面对lastSecond.next.next就会有空指针异常
		  return null;
	  }else{
		  Node lastSecond=head;
		  while(lastSecond.next.next!=null){
			  lastSecond=lastSecond.next;
		  }
		  lastSecond.next=null;
	  }
	  return  head;
  }
  //反转链表（不能创造新的结点）不断的从原来的链表中取出结点做头插
  /*1）需要一个新的链表，并且是一个空链表
     Node  result=null;//result新链表的第一个结点的引用
	2）遍历原来的链表
	 Node  cur=head;
	 while(cur!=null){
		 cur=cur.next;
	 }
   3)把每个遍历到的结点（cur）,头插到新链表(result代表的链表)中
   */
   public   ListNode  reverseList(ListNode  head){
	   ListNode  result=null;
	   ListNode  cur=head;
	   while(cur!=null){
		   ListNode  next=result;//后面cur.next会发生变动所以要找一个next记住这个位置
		   cur.next=result;
		   result=cur;
		   cur=next;
	   }
   }
     
	//用三个引用来进行逆置
	public   ListNode  reverseList(ListNode  head){
		if(head==null){
			return null;
		}
		List  p1=null;
		List  p2=head;
		List  p3=head.next;
		while(p2!=null){
			p2.next=p1;
			p1=p2;
			p2=p3;
			if(p3!=null){
				p3=p3.next;
			}
		}
	}
  
  
  
  
	 