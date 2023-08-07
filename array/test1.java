package array;


public class test1 {
    public static void main(String[] args) {
        int [] nums={2,5,1,3,4,7};
        shuffle(nums,6);

        System.out.println(nums.getClass());
    }


    public static void shuffle(int[] nums, int n)
        {

            int [] shuffle = new int[n];

            int i=0, j= 0, k = n/2;
            while(k < n)
            {
                shuffle[i] = nums[j];
                shuffle[i+1] = nums[k];
                ++j; ++k; i+=2;
            }
            for (int p : shuffle){
            System.out.println(p);}

        }
    }
