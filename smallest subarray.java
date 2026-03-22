class Solution {

    public int smallestSub(int arr[], int x) {

        int min = arr.length+1;

        for(int i=0;i<arr.length;i++){

            int sum = 0;

            for(int j=i;j<arr.length;j++){

                sum += arr[j];

                if(sum > x){

                    if(j-i+1 < min)
                        min = j-i+1;

                    break;
                }
            }
        }

        if(min == arr.length+1)
            return 0;

        return min;
    }
}