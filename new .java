private Node  popBack(Node   head)
{if(head==null)
  {
      System.out.println("空链表无法删除");
	  return ;
  }
   if(head.next==null)
   {
      return null;
   }
   else
   {
     Node  lastSecond=head;
	 while(lastSecond.next.next!=null)
	 {
	    lastSecond=lastSecond.next;
	 }
	 lastSecond.next=null;
	 return head;
   }
}