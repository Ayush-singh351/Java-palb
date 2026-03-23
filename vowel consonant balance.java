class Solution {

    public int count(String a[]){

        int c=0;

        for(int i=0;i<a.length;i++){

            int v=0;
            int co=0;

            for(int j=0;j<a[i].length();j++){

                char ch=a[i].charAt(j);

                if("aeiou".indexOf(ch)>=0)
                    v++;
                else
                    co++;
            }

            if(v==co)
                c++;
        }

        return c;
    }
}