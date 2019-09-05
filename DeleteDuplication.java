class Node{
	int  vai;
	Node  next=null;
	Node(int  val){
		this.val=val;
	}
}
public   class DeleteDuplication{
	public   static  Node deleteDuplication(Node  head){
		if(head==null){
			return null;
		}
		Node pre=null;
		//用两个引用来比较
		Node p1=head;
		Node p2=head.next;
		while(p2!=null)
		{
			if(p1.val!=p2.val){
				pre=p1;
				p1=p2;
				p2=p2.next;
			}else
			{
				while(p2!=null&&p1.val==p2.val){
					p2=p2.next;
				}
				if(pre==null){
					head=p2;
				}
				p1=p2;
				if(p2!=null){
					p2=p2.next;
				}
			}
		}
		return head;
	}
	
}
