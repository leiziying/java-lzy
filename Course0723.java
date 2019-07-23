public   class  Course0723
{
	public  static int  BinerySearch(int[]   a,int  k)
	{
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{  int mid=(left+right)/2;
        	if(a[mid]==k)
			{
				return mid;
			}
		  else if(a[mid]<k)
		   {
			   left=mid+1;
		   }
         else   
		 {
			 right=mid-1;
		 }			 
		}
		return -1;
	}
	public  static   void main(String[]  args)
	{
		int[]   a={1,2,3,4,5,6,7,8,9};
		System.out.print(	BinerySearch(a,6));
	}	
}