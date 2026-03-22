import java.util.Arrays;

class Solution {

    public int getMinDiff(int arr[], int k) {

        Arrays.sort(arr);

        int n = arr.length;

        int ans = arr[n-1] - arr[0];

        int small = arr[0] + k;
        int big = arr[n-1] - k;

        if(small > big){
            int t = small;
            small = big;
            big = t;
        }

        for(int i=1;i<n-1;i++){

            int sub = arr[i] - k;
            int add = arr[i] + k;

            if(sub >= small || add <= big)
                continue;

            if(big - sub <= add - small)
                small = sub;
            else
                big = add;
        }

        return Math.min(ans, big-small);
    }
}