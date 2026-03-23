class Solution {

    public int sum(int a[][], int r1,int c1,int r2,int c2){

        int s=0;

        for(int i=r1;i<=r2;i++){

            for(int j=c1;j<=c2;j++){

                s += a[i][j];
            }
        }

        return s;
    }
}