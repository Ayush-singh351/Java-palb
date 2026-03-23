class Solution {

    public int count(int arr[]){

        int c=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=-1)
                c++;
        }

        return c;
    }
}