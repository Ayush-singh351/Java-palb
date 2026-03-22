class Solution {

    public void spiral(int mat[][]) {

        int top=0,bottom=mat.length-1;
        int left=0,right=mat[0].length-1;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++)
                System.out.print(mat[top][i]+" ");

            top++;

            for(int i=top;i<=bottom;i++)
                System.out.print(mat[i][right]+" ");

            right--;

            for(int i=right;i>=left;i--)
                System.out.print(mat[bottom][i]+" ");

            bottom--;

            for(int i=bottom;i>=top;i--)
                System.out.print(mat[i][left]+" ");

            left++;
        }
    }
}