 CNode  complexCopy(CNode haed){
        if(head==null)
            return null;
        CNode  p1=head;
        while(p1!=null)
        {
            CNode  p2=new  CNode(p1.val);
            p2.random=null;
            p2.next=p1.next;
            p1.next=p2;
        }
        p1=head;
        while(p1!=null)
        {
            if(p1.random!=null)
                p1.next.random=p1.random.next;
            p1=p1.next;
        }
        p1=head;
        CNode  newHead=head.next;
        while(p1!=null)
        {
            CNode   p2=p1.next;
            p1.next=p2;
            if(p2!=null)
            {
                return newHead
                        ;
            }
            
        }
        
    }