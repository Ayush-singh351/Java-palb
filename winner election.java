class Solution {

    public String win(String a[]){

        int max=0;
        String w="";

        for(int i=0;i<a.length;i++){

            int c=0;

            for(int j=0;j<a.length;j++){

                if(a[i].equals(a[j]))
                    c++;
            }

            if(c>max){

                max=c;
                w=a[i];
            }
        }

        return w;
    }
}