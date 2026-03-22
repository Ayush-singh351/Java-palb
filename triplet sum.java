import java.util.Arrays;

class Solution {

    public boolean triplet(int arr[], int target) {

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){

            int l=i+1;
            int r=arr.length-1;

            while(l<r){

                int sum = arr[i]+arr[l]+arr[r];

                if(sum==target)
                    return true;

                if(sum<target)
                    l++;
                else
                    r--;
            }
        }

        return false;
    }
}