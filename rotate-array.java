import java.util.*;
class Main {
    public static void main(String[] args) {
     
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        reverse(0, arr.length-1, arr);
        reverse(0, k-1, arr);
        reverse(k, arr.length-1, arr);
        
        for ( int i : arr) {
            System.out.print(i+  ", ");
        }
    }
    
    public static void reverse(int i, int j, int[] arr) {
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
