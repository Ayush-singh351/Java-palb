class Solution {

    public int swap(String a,String b){

        int c=0;

        for(int i=0;i<a.length();i++){

            if(a.charAt(i)!=b.charAt(i))
                c++;
        }

        return c/2;
    }
}