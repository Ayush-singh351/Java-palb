class Solution {

    public int jump(int arr[]){

        int step=0;
        int i=0;

        while(i < arr.length-1){

            i = i + arr[i];
            step++;
        }

        return step;
    }
}