import java.util.*;

class Solution {

    public ArrayList<Integer> union(int a[], int b[]) {

        HashSet<Integer> set = new HashSet<>();

        for(int x : a){
            set.add(x);
        }

        for(int x : b){
            set.add(x);
        }

        return new ArrayList<>(set);
    }
}