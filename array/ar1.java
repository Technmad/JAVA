package array;

public class ar1 {
    public static void main(String [] args){
        int[] nums= {1,2,3,4};
        for (int i=0; i< nums.length; ++i){
            System.out.print(nums[i] +" ");
        }
       // int[] result=new int[nums.length];
       // result[0] = nums[0];
        // System.out.print("  "+result[0]+" ");

        System.out.print(" "+nums[0]+" ");
        for(int i=1; i< nums.length; ++i){

          //  result[i] = result[i-1] + nums[i];
           // System.out.print(result[i]+" ");

            nums[i] += nums[i-1];
            System.out.print(nums[i]+" ");


        }
    }
}
