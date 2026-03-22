class Solution {

    boolean isPal(int n){

        int r=0,t=n;

        while(n>0){

            r = r*10 + n%10;
            n/=10;
        }

        return r==t;
    }

    public boolean check(int arr[]){

        for(int i=0;i<arr.length;i++){

            if(!isPal(arr[i]))
                return false;
        }

        return true;
    }
}