public class MyArrayList
{
public int indexOf(int element)//找到element出现位置的下标
{
	for(int  i=0;i<size;i++)
	{
		if(array[i]==elemnet)
			return i;
	}
	return -1;
}
public  void  removeAll(int  element)//删除所有的element
{      int index;
	while((index=indexOf(element))!=-1)//先将element的下标赋值给index然后跟-1比较
		earse(index);
}//时间复杂度为O（n*n）
/*时间 O（n）   空间  O（n）
  int[]   newArray=new  int[array.length];
  int j=0;
  for(int i=0;i<size;i++)
  {
	  newArray[j++]=array[i];
  }
  newArray.length=j;
  */
}