class Solution {

    public boolean find(char a[][], char x){

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){

                if(a[i][j]==x)
                    return true;
            }
        }

        return false;
    }
}