public  static class   BinarySearch{
	public  static   void   main(String[]   args){
		
	}
	public  static  int  binarySearch(int[] a,int   v){
		int  left=0;
		int right=a.lenght-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(v>a[mid]){
				left=mid+1;
			}else{
				if(v<a[mid]){
					right=mid-1;
				}else{
					return  mid;
				}
			}
		}
		return -1;//没找到
	}
}
/*while(left<=right){
	int  mid=(left+right)/2;
	if(v==a[mid]){
		return mid;
	}else{
		if(v>a[mid]){
			left=mid+1；
		}else{
			right=mid-1;
		}
	}
}
*/
/*时间复杂度是  O（log（n））
常见的时间复杂度(从小到大)
O（1）
O(log(n))
O(n)
O(n*log(n))
O(n^2)*/
递归方法的时间复杂度
画调用栈


