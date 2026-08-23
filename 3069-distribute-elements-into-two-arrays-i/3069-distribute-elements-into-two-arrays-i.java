class Solution {
    public int[] resultArray(int[] arr) {
          int num1[]=new int[arr.length];
            int num2[]=new int[arr.length];
            int left = 0;
            int right = 0;
            int i=2;
            num1[left]=arr[0];
            num2[right]=arr[1];
            while(i != arr.length){
                if(num1[left] >= num2[right]){
                    num1[++left] = arr[i];
                }
                else{
                    num2[++right] = arr[i];
                }
                i++;
            }
            int n=0;
            for(int j =left+1; j<num1.length;j++ ){
                num1[j]=num2[n];
                n++;
            }
            return num1;
    }
}