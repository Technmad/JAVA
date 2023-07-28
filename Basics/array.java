

public class array {
        public static void main(String[] args) {
            int[] arr = {
                    1,
                    2,
                    3,
                    4,
                    5
            }; //initialize
            System.out.println("The Values before calling the method are:");
            for (int i=0; i< arr.length; i++) {
                System.out.print(arr[i] + " "); //printing the com.FP.array before calling method

            }
            int[] returnedArr = multiply(arr, 3); //storing the returned com.FP.array
            System.out.println();
            System.out.println("The Values from the returned Array are:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(returnedArr[i] + " "); //printing the returned com.FP.array

            }
        } //end of main()

        static int[] multiply(int[] arr, int num) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * num;
            }
            return arr; //returning Array
        }
    }

