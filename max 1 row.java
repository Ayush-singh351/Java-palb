class Solution {

    public int maxRow(int arr[][]){

        int max = -1;
        int index = -1;

        for(int i=0;i<arr.length;i++){

            int c=0;

            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]==1)
                    c++;
            }

            if(c > max){

                max = c;
                index = i;
            }
        }

        return index;
    }
}