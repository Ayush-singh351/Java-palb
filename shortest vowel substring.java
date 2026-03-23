class Solution {

    public int len(String s){

        int min=1000;

        for(int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){

                String sub=s.substring(i,j+1);

                if(sub.contains("a") &&
                   sub.contains("e"))
                {
                    if(sub.length()<min)
                        min=sub.length();
                }
            }
        }

        return min;
    }
}