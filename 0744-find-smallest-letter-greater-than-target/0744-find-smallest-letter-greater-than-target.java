class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int curr=0;
        int t = target-'a';
        char result = letters[0];
        for(int i =0;i<letters.length;i++){
            char ch = letters[i];
            curr = ch - 'a';
            if(curr > t){
                    return letters[i];
            }
        }
        return result;
    }
}