class Solution {

    public int trap(int arr[]) {

        int n = arr.length;

        int leftMax = 0;
        int rightMax = 0;

        int l = 0;
        int r = n-1;

        int water = 0;

        while(l <= r){

            if(arr[l] <= arr[r]){

                if(arr[l] >= leftMax)
                    leftMax = arr[l];
                else
                    water += leftMax - arr[l];

                l++;
            }

            else{

                if(arr[r] >= rightMax)
                    rightMax = arr[r];
                else
                    water += rightMax - arr[r];

                r--;
            }
        }

        return water;
    }
}