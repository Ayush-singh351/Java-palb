class Solution {

    public int sum(int arr[], int t){

        int s=0;

        for(int i=0;i<arr.length;i++){

            s += arr[i];

            if(s == t)
                return 1;
        }

        return 0;
    }
}