class Solution {

    public int cost(int a[][]){

        int min = a[0][0];

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){

                if(a[i][j] < min)
                    min = a[i][j];
            }
        }

        return min;
    }
}