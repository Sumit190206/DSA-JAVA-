public class sorting {
    public static void bubbleSort(int nums[]){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int swaped=0;
            for (int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swaped++;
                }
            }
            if(swaped==0){
                break;
            }
            System.out.println(swaped+ " ");
        }
    }


    public static void SelectionSort(int nums[]){
        for (int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){
                    min=j;
                }
            }
            int temp = nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
    }

    public static void print(int nums[]){
        for(int i= 0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int nums[]={3,6,7,2,1,3};
        SelectionSort(nums);
        // bubbleSort(nums);
        print(nums);
    }
    
}
