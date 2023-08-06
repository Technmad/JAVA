package array;

public class cloning {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        System.out.println("Original array");
        for(int i: arr1){
            System.out.println(i);
        }

        int[] arr2= arr1.clone();
        System.out.println("Cloned array");
        for(int i: arr2){
            System.out.println(i);
        }

        System.out.println("are both equal");
        System.out.println(arr1 == arr2);

        // cloning 1D array creates deep copy by copying values
        // cloning 2D array creates hard copy by creating a array and proving reference to original array

    }
}
