class Solution {

    public long sum(int arr[]){

        long s=0;

        for(int i=0;i<arr.length;i++)
            s+=arr[i];

        return s;
    }
}