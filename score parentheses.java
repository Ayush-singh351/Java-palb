class Solution {

    public int score(String s){

        int c=0;

        for(int i=0;i<s.length()-1;i++){

            if(s.charAt(i)=='(' && s.charAt(i+1)==')')
                c++;
        }

        return c;
    }
}