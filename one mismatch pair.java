class Solution {

    public int count(String a[]){

        int c=0;

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                int d=0;

                for(int k=0;k<a[i].length();k++){

                    if(a[i].charAt(k)!=a[j].charAt(k))
                        d++;
                }

                if(d==1)
                    c++;
            }
        }

        return c;
    }
}