import java.util.*;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // print list using operators
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print reverse
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // MAX NUMBER
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(max < list.get(i)){         
                max = list.get(i);
            }
        }
        System.out.println(max);

        swap(list, 0, 2);
        System.out.println(list);

        // sort
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // multidimensional list
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainlist.add(list1);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        mainlist.add(list3);

        System.out.println(mainlist);

        // print each list
        for(int i = 0; i < mainlist.size(); i++){
            ArrayList<Integer> current = mainlist.get(i);
            for(int j = 0; j < current.size(); j++){
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }

        // CONTAINER WITH MOST WATER
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Height of water: " + height);
        int maxwater = mostWater(height);
        System.out.println("Area of container to hold max water is: " + maxwater);

        // pair sum
        int target = 3;
        System.out.println(pairSum1(list1, target));

        // Lonely numbers
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(2);
        ans.add(4);
        ans.add(5);
        System.out.println(ans);
        System.out.println("lonely numbers are: " + Alone(ans));
    }

    //----------------------------------functions----------------------------------------------- 

    // swap 
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    // container with most water 
    public static int mostWater(ArrayList<Integer> height){
        int maxWater = 0;
        int rp = height.size() - 1;
        int lp = 0;

        while(lp < rp){
            int currHeight = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int current = currHeight * width;
            maxWater = Math.max(maxWater, current);

            if(height.get(lp) < height.get(rp)){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    // pair sum -1
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        int left = 0;
        int right = list.size() - 1;

        while(left != right){
            if(list.get(left) + list.get(right) == target){
                return true;
            }
            if(list.get(left) + list.get(right) < target){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    // Lonely Numbers in ArrayList
    public static ArrayList<Integer> Alone(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            int current = list.get(i);
            boolean Lonely = true;

            for(int j = 0; j < list.size(); j++){
                if(list.get(j) == current + 1 || list.get(j) == current - 1){
                    Lonely = false;
                    break;
                }
            }
            if(Lonely){
                ans.add(current);
            }
        }

        return ans;
    }

// --------------------------------------------
// Monotonic arraylist 
  public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1; i < list.size(); i++){
            if(list.get(i) > list.get(i - 1)) {
                decreasing = false;  
            }
            if(list.get(i) < list.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
