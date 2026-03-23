class Solution {

    public String big(String s,int k){

        for(int i=0;i<k;i++){

            s = s.substring(1);
        }

        return s;
    }
}