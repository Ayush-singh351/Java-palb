class Solution {

    public int count(String s){

        int c=0;

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }

        return c;
    }
}