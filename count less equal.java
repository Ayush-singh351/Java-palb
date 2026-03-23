class Solution {

    public int count(int arr[], int x){

        int c=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i] <= x)
                c++;
        }

        return c;
    }
}