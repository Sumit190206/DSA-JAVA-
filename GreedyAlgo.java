import java.util.*;
public class GreedyAlgo {
   
    public static int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);   
     int last = intervals[0][1];
        int count = 0;
        for(int i= 1;i<intervals.length;i++){
            if(intervals[i][0]< last){
                count++;
            }else{
                last = intervals[i][1];
            }
        }
        return count;
    }
//     public static void main(String[] args) {
//         int intervals[][] = {{1,2},{2,3},{3,4},{2,4}};
//         System.out.println(eraseOverlapIntervals(intervals));
//     }
// }
