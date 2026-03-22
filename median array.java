class Solution {

    public double median(int arr[]) {

        java.util.Arrays.sort(arr);

        int n = arr.length;

        if(n%2==1)
            return arr[n/2];

        return (arr[n/2] + arr[n/2-1]) / 2.0;
    }
}