class Solution {

    public void setZero(int mat[][]){

        for(int i=0;i<mat.length;i++){

            for(int j=0;j<mat[0].length;j++){

                if(mat[i][j]==0){

                    for(int k=0;k<mat.length;k++)
                        mat[k][j]=0;

                    for(int k=0;k<mat[0].length;k++)
                        mat[i][k]=0;
                }
            }
        }
    }
}