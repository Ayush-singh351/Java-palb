class Solution {

    public int check(int arr[], int t){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                for(int k=j+1;k<arr.length;k++){

                    for(int l=k+1;l<arr.length;l++){

                        if(arr[i]+arr[j]+arr[k]+arr[l]==t)
                            return 1;
                    }
                }
            }
        }

        return 0;
    }
}