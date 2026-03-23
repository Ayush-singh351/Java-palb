class Solution {

    public int[] find(int arr[], int x){

        int f=-1,l=-1;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==x){

                if(f==-1)
                    f=i;

                l=i;
            }
        }

        return new int[]{f,l};
    }
}