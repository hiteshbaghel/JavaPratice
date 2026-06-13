package LinearSearching;

public class FindMin {
     static void main() {
        int [] arr = {39,41,34,67,23,24};
        System.out.println(min(arr));
    }
    static int min(int [] arr){
        if(arr.length ==0){
            return -1;
        }
        int ans = arr[0];
        for(int i =1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
