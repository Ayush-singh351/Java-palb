class Solution {

    public int maxSee(int arr[]){

        int max=0;

        for(int i=0;i<arr.length;i++){

            int c=1;

            for(int j=i+1;j<arr.length;j++){

                if(arr[j] < arr[i])
                    c++;
            }

            if(c>max)
                max=c;
        }

        return max;
    }
}