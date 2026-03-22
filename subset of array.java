import java.util.HashSet;

class Solution {

    public boolean subset(int a[], int b[]) {

        HashSet<Integer> set = new HashSet<>();

        for(int x : a)
            set.add(x);

        for(int x : b)
            if(!set.contains(x))
                return false;

        return true;
    }
}