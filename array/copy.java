package array;

public class copy {
    public static void main(String[] args) {
        char [] arr1={'d','a','n','u','r','a','g','t','p'};

        char [] arr2=new char[6];
        System.arraycopy(arr1,1,arr2,0,6 );

        System.out.println(String.valueOf(arr2));
    }
}
