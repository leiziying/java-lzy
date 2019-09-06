class  Node{
	int  val;
	Node  next=null;
	Node(int  val){
		this.val=val;
		this.next=next;
	}
}
//合并有序链表，难点：尾插
//思路：两个链表中的结点，进行结点值的比较，然后将值小的结点尾插到新链表上，再把剩余链表接到新链表后边
/*尾插
      分情况：1.链表为空
	          2.链表不为空
*/
public  class  MergeTwoLists{
	public   static  Node mergeTwoLists(Node  head1,Node  head2){
		if(head1==null){
			return head2;
		}
		if(head2==null){
			return head1;
		}
		if(head1<=head2){
			head1.next=mergeTwoLists(head1.next,haed2);
			return head1;
		}else{
			head2.next=mergeTwoLists(head1,head2.next);
			return haed2;
		}
	}
	public  static  Node  mergeTwoLists2(Node  haed1,Node  haed2){
		if(haed1==null){
			return haed2;
		}
		if(head2==null){
			return head1;
		}
		Node  result=null;//尾插需要一个新链表
		Node  last=null;
		Node  cur1=head1;
		Node  cur2=head2;
		while(cur!=null&&cur2!=null){//遍历过程中只要两个链表还有值就继续往下走
			if(cur1.val<=cur2.val){
				Node  next=cur1.next;
				if(result==null){
					result.next=cur1;
				}else{
					last.next=cur1;
				}
				last=cur1;
				cur1=next;
			}
			else{//走到这里说明cur.val>cur1.val
				Node  next=cur2.next;
				if(result==null){
					result.next=cur2;
				}else{
					last.next=cur2;
				}
				last=cur2;
				cur2=next;
			}
			if(cur1==null){
				last.next=cur2;
			}
			else{
				last.next=cur1;
			}
			return result;
		}
	}
	public  static  Node  mergeTwoLists3(Node  haed1,Node  haed2){
		Node  cur1=head1;
		Node  cur2=head2;
		Node  result=new  Node();
		Node last=result;
		while(cur1!=null&&cur2!=null){
			if(cur1.val<=cur2.val){
				last.next=cur1;
				cur1=cur1.next;
			}else
			{
				last.next=cur2;
				cur2=cur.next;
			}
			last=last.next;
		}
		if(cur1!=null){
			last.next=cur1;
		}
		else
		{
			last.next=cur2;
		}
		return result.next;//result只是为了使新链表不为空，实际的有用的头结点是result.next
	}
	
}