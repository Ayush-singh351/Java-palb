class Solution {

    public int[] pge(int arr[]){

        int res[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){

            res[i] = -1;

            for(int j=i-1;j>=0;j--){

                if(arr[j] > arr[i]){

                    res[i]=arr[j];
                    break;
                }
            }
        }

        return res;
    }
}