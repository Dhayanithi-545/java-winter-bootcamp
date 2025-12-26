import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 5, 6, 7, 8};

        ArrayList<Integer> ans = unionCreator(arr1,arr2);
        for(int i : ans){
            System.out.print(i+" ");
        }

        
        
    }

    public static ArrayList<Integer> unionCreator(int[] arr1, int[] arr2){
        
        Set<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int j : arr2){
            set.add(j);
        }

        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
    
}
