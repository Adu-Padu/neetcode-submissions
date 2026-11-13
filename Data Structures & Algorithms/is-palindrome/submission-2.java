class Solution {
    public boolean isPalindrome(String s) {

        s = s.replace(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        s = s.toLowerCase();

        if(s.length() == 1){

        }

        for(int i = 0; i < ((s.length()/2) + 1); i++) {

            if(i <= (s.length() - 1 - i)){

            
                if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
                    System.out.println(s);
                    return false;
                }
            }
        }

        return true;

    }

    
}
