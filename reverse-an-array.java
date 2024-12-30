import java.util.*;
class Main {
    public static void main(String[] args) {
     
        int arr[] = new int[5];
        
        for (int i=0; i <5; i++){
            arr[i] = i;
        }
        
        for (int i : arr){
            System.out.println(i);
        }
        
        for (int i=0; i<5/2;i++) {
            reverse(i, 5-i-1, arr);
        }
        
        for (int i : arr){
            System.out.println(i);
        }
    }
    
    public static void reverse(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
