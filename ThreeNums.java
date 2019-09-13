import  java.util.*;
public class ThreeNums {
    public  static  List<List<Integer>>  threeSum(int []  nums){//Integer是int类型的包装类
        Arrays.sort(nums);//按照数字顺序排列指定的数组
        List<List<Integer>>   result=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;//定义三个下标用i，j,k用于比较
            while (j<k){//i不动，
                while (j<k&&nums[i]+nums[j]+nums[k]<0){//<0的时候只需让j往后走
                    j++;
                }//三种可能 j>=k或者nums[i]+nums[j]+nums[k]>=0
                if(j>=k){//走到这里说明，nums[i]+nums[j]+nums[k]>=0,对k的范围进行判断
                    break;//j已经到k了，说明没有在j的合法范围内找到满足条件的三个数，所以结束循环，让i++
                }
                if(nums[i]+nums[j]+nums[k]==0){//走到这里说明j<k,满足j的合法范围，分两种情况讨论，即=0或者>0
                    List<Integer>  e=new ArrayList<>();//new一个ArrayList对象
                    e.add(nums[i]);//尾插
                    e.add(nums[j]);
                    e.add(nums[k]);
                    result.add(e);
                    while (j<k&&nums[j]==nums[j+1]){//去重，j下标和j+1下标所指的元素相等的情况，j往后走直至不相等
                        j++;
                    }
                    j++;//j继续往后走，进行下一次判断
                }
                while (j<k&&nums[i]+nums[j]+nums[k]>0){//走到这里对>0的情况进行比较，只用移动k（前移）进行比较了
                    k--;
                }
                if (nums[i] + nums[j]+nums[k]==0) {//满足条件，尾插
                    List<Integer>   e=new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    result.add(e);
                    while (j<k&&nums[k]==nums[k-1]){//去重
                        k--;
                    }
                    k--;//继续判断下一个
                }
            }
            while (i<nums.length-2&&nums[i]==nums[i+1]){//去重
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []   nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
