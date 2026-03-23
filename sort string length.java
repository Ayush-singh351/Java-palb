class Solution {

    public void sort(String a[]){

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i].length()>a[j].length()){

                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}