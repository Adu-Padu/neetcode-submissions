class Solution {
    public boolean isValid(String s) {
        List<Character> openBrackets = new ArrayList<Character>();
        String validOpenings = "{([";
        for(int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                openBrackets.add(s.charAt(i));
            }else{
                if(openBrackets.size() == 0){
                    return false;
                }else if(openBrackets.getLast() == '{'){
                    if(s.charAt(i) !='}'){
                        return false;
                    }
                    openBrackets.removeLast();
                }else if(openBrackets.getLast() == '('){
                    if(s.charAt(i) !=')'){
                        return false;
                    }
                    openBrackets.removeLast();
                }else if(openBrackets.getLast() == '['){
                    if(s.charAt(i) !=']'){
                        return false;
                    }
                    openBrackets.removeLast();
                }
            }
        }

        if(openBrackets.size()>0){
            return false;
        }

        return true;

    }
}
