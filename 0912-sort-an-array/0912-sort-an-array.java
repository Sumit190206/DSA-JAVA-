class Solution {
    public int[] sortArray(int[] nums) {
       return margeSort(nums,0,nums.length-1);
    }
    public int[] margeSort(int nums[],int si,int ei){
        if(si >=ei){
            return nums;
        }

        int mid = si+(ei - si) / 2;
        margeSort(nums,si,mid);
        margeSort(nums,mid+1,ei);
       return  marge(nums,si,mid,ei);
    }
    public int[] marge(int nums[] , int si,int mid,int ei){
        int i=si;
        int j= mid+1;
        int temp[] = new int[ei-si+1];
        int k =0;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k] = nums[i];
                i++;
            }
            else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=ei){
            temp[k++] = nums[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i] = temp[k];
        }
        return nums;
    } 
}