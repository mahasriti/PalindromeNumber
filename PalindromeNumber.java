class Solution {
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        int n = s.length();
        int a=0;
        for(int i=0;i<n/2;i++){
            if (s.charAt(i)== s.charAt(n - i - 1))
            {
                a++;
            }
        }
        if(a==n/2){
            return true;
        }
        else{
            return false;
        }
        
      
    }
}