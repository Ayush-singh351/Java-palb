class Solution {

    public int check(int n,int k){

        int sum=0;
        int c=0;

        for(int i=1;i<=9;i++){

            sum+=i;
            c++;

            if(sum==n && c==k)
                return 1;
        }

        return 0;
    }
}