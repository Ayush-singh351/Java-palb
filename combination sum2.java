class Solution {

    public int check(int arr[], int t){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==t)
                    return 1;
            }
        }

        return 0;
    }
}