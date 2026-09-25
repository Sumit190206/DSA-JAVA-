class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int curr=0;
        int min = Integer.MAX_VALUE;
        int t;
        char result = letters[0];
        t=target-'a';
        for(int i =0;i<letters.length;i++){
            char ch = letters[i];
            curr = ch - 'a';
            if(curr > t){
                if(min > curr){
                    min = curr;
                    result=letters[i];
                }
            }
        }
        return result;
    }
}