class Solution {

    public int even(String s){

        int c=0;

        for(int i=0;i<s.length();i++){

            int f=0;

            for(int j=0;j<s.length();j++){

                if(s.charAt(i)==s.charAt(j))
                    f++;
            }

            if(f%2==0)
                c++;
        }

        return c;
    }
}