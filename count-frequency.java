import java.util.*;
class Main {
    public static void main(String[] args) {
     
        int arr[] = {1,1,2,2,2,3,3,3,3,4,4,5,5,6,6,7};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i: arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        
        System.out.println(hm);
    }
}
