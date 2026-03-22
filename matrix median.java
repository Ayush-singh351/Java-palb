class Solution {

    public int median(int mat[][]){

        int n = mat.length;
        int m = mat[0].length;

        int arr[] = new int[n*m];
        int k=0;

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                arr[k++] = mat[i][j];

        java.util.Arrays.sort(arr);

        return arr[arr.length/2];
    }
}