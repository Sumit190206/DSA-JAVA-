public class array {
    public static void subarraySum(int arr[]){
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i =0 ;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                current=0;
                for(int k = start;k<=end;k++){
                    current+=arr[k];
                }
                System.out.println(current);
                if(max<current){
                    max=current;
                }
            }
        }
        System.out.println("Sum of max sum array is ::" + max);
    }  

// kingdis algo
    public static int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int min=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            cs+=nums[i];
            if(cs<0){
                cs=0;
                if(cs==0 && i==nums.length-1){
                for(int j=0;j<nums.length;j++){
                    if(min<nums[j]){
                        min=nums[j];
                    }

                }
                if(ms<=0){
                    return min;
                }
            }
            }
            
            ms=Math.max(cs,ms);
        }
       
        return ms;
    }


    // tap water imp
     public static int trap(int[] height) {
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }


        int rightmax []= new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int tap=0;
        for(int i=0;i<n;i++){
            int water=Math.min(leftmax[i],rightmax[i]);
            tap=tap+(water-height[i]);
        }
        return tap;
    }

// area of water

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10};
        // int nums[]={-1,3,5,6,-1};
        // System.out.println(maxSubArray(nums));
        // // subarraySum(arr);    
        int height[]={5,2,3,6,2,8};
        System.out.println(trap(height));
        }  
}
