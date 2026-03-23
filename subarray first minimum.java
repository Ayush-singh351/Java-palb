class Solution {

    public int count(int arr[]){

        int c=0;

        for(int i=0;i<arr.length;i++){

            int min = arr[i];

            for(int j=i;j<arr.length;j++){

                if(arr[j] < min)
                    break;

                c++;
            }
        }

        return c;
    }
}