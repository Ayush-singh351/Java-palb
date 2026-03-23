class Solution {

    public boolean check(String t,String p){

        for(int i=0;i<t.length();i++){

            if(t.charAt(i)==p.charAt(0))
                return true;
        }

        return false;
    }
}