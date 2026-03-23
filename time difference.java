class Solution {

    public int diff(int a[],int b[]){

        int s1 = a[0]*3600 + a[1]*60 + a[2];
        int s2 = b[0]*3600 + b[1]*60 + b[2];

        if(s1>s2)
            return s1-s2;

        return s2-s1;
    }
}