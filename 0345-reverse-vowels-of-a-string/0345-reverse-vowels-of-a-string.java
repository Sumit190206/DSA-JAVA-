class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] arr = s.toCharArray();

        while(left < right){
            char ch =  arr[left];
            char ed = arr[right];

            if(ch != 'a' && ch !='e' && ch !='i' && ch !='o' && ch != 'u' && ch != 'A' && ch !='E' && ch !='I' && ch !='O' && ch !='U'){
                left++;
            }
            else if(ed != 'a' && ed !='e' && ed !='i' && ed !='o' && ed != 'u' && ed != 'A' && ed!='E' && ed !='I' &&ed!='O' && ed !='U'){
                right--;
             }
             else{
                char temp =arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
                left++;
                right--;
             }


        }
        return new String(arr);
    }
}