import java.util.*;


class firstclass {
  public static void Reversnumber(int nums[]){
  int first =0 ;
  int last =nums.length-1;
  while(first<last){
    int temp = nums[last];
    nums[last] = nums[first];
    nums[first] = temp;
    first++;
    last--;
  }
  }
  public static void main(String[] args) {
    int nums []={1,2,6,57,8,5,4,4,5,8,60};
    Reversnumber(nums);
    for(int i=0; i<nums.length;i++){
      System.out.print(nums[i]+" ");

    }
    System.out.println();
    
  }

  }




