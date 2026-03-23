class Solution {

    public int steps(int arr[]){

        int sum=0;

        for(int i=0;i<arr.length;i++)
            sum+=arr[i];

        int half=sum/2;
        int step=0;

        while(sum>half){

            arr[0]=arr[0]/2;
            sum=0;

            for(int i=0;i<arr.length;i++)
                sum+=arr[i];

            step++;
        }

        return step;
    }
}