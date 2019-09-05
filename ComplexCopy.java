
 class  Node {
	int  val;
	Node  next=null;
	Node random=null;
	Node(int  val){
		this.val=val;
	}
}
public  class ComplexCopy{
    //将链表进行拷贝，链表的每一个结点都有一个随机指向，将链表进行深拷贝
	//1.先将val和next拷贝再拷贝每一个结点的随机指向（random）
	public  static  Node complexCopy(Node  head){
		if(head==null){
			return null;
		}
			//判断链表是否为空，若是空链表直接返回null
			//下一步将两条链表糅合
			Node  p1=head;
			while(p1!=null){
				Node p2=new  Node(p1.val);
				p2.next=p1.next;
				p1.next=p2;
				p1=p2.next;
			}
			//走到这里，两条链表糅合在一起，但是random并没有复制过来，下一步进行random的拷贝
			p1=head;
			while(p1!=null){
				Node  p2=p1.next;
				if(p1.random!=null)
				{
					p2.random=p1.random.next;
				}
				p1=p2.next;
			}
			//走到这里，val,next,random都已经拷贝完成，下一步将两条糅合在一起的链表分开
			p1=head;
			Node  newHead=head.next;
			while(p1!=null){
				Node p2=p1.next;
				p1.next=p2.next;
				if(p2.next!=null){
					p2.next=p2.next.next;
				}
				p1=p1.next;
			}
			return newHead;
		}
		//打印链表的方法
		public  static void  print(Node  head){
			Node cur=head;
			while(cur!=null){
				System.out.print(cur.val+"-->");
				cur=cur.next;
			}
			System.out.print("null");
			System.out.println();
		}
       public	static  void  main(String[]  args){
		   Node l1=new  Node(3);
		   Node l2=new  Node(4);
		   Node l3=new  Node(5);
		   Node l4=new  Node(6);
		   l1.next=l2;
		   l2.next=l3;
		   l3.next=l4;
		   l4.next=null;
		   l1.random=l2;
		   l2.random=l1;
		   l3.random=l3;
		   l4.random=null;
		   print(complexCopy(l1));
		   System.out.println((complexCopy(l1).random).val);
	   }	
		
	}