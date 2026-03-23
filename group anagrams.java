class Solution {

    public void check(String arr[]){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i].length()==arr[j].length())
                    System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}