public class DivideConquer {

// Merge Sort 
        public static void mergeSort(int arr[],int st,int ed){
            if(st>=ed){
                return;
            }
            int mid = st+(ed-st)/2;
            mergeSort(arr, st, mid);//merge left side
            mergeSort(arr, mid+1, ed);   // merge right side;
            merge(arr,st,mid,ed);
        
        }

        // to merge the array
        public static void merge(int arr[],int st,int mid,int ed){
            int temp[] = new int[ed-st+1]; // temp array to store the values in proper order
            int i=st;
            int j=mid+1;
            int k=0;
            while(i<=mid && j<=ed){  
                if(arr[i]<arr[j]){    // check which element is grater right side or left
                    temp[k]=arr[i];
                    i++;
                }
                else{
                    temp[k]=arr[j];
                    j++;
                }
                k++;
            } 
            while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=ed){
                temp[k++]=arr[j++];
            }
            // copy the temp arr to original array
            for(k=0,i=st;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
        }

        //quick sort 
        public static void quickSort(int arr[],int st,int ed){
            //base case
            if(st>=ed){ 
                return;
            }
            int pivot = part(arr, st, ed);
            quickSort(arr, st, pivot-1);//left
            quickSort(arr, pivot+1, ed);//right
        }
        public static int part(int arr[],int st,int ed){
            int pivot = arr[ed];
            int i=st-1;
            for(int j =st;j<ed;j++){
                if(arr[j]<=pivot){
                    i++;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
             i++;
                    int temp=pivot;
                    arr[ed]=arr[i];
                    arr[i]=temp;
            return i;
        }
    
        public static void print(int nums[]){
            for(int i= 0;i<nums.length;i++){
                System.out.print(nums[i]+ " ");
            }
            System.out.println("");
        }
    public static void main(String[] args) {
        int nums[]={4,8,1,3,-4,7};
        int arr[]={2,7,3,9,1,5};
        mergeSort(arr, 0,arr.length-1);
        System.out.println("Using merge sort");
        print(arr);
        quickSort(nums, 0, nums.length-1);
        System.out.println("Using Quick sort");
        print(nums);
        
    }
    
}
