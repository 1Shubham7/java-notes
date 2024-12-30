import java.util.*;
class Main {
    public static void main(String[] args) {
     
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i: arr) {
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        
        for (Integer s: hm.keySet()) {
            System.out.println("Key: " + s + ", Value: " + hm.get(s));
        }
    }
}
