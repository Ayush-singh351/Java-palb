class Solution {

    public void sort(char a[]){

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]>a[j]){

                    char t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}