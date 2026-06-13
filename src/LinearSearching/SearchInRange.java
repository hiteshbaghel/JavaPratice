package LinearSearching;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,7,2,41,34,67,23,07,24};
        int target = 7;
        System.out.println(search(arr,target,2,8));
    }
    static int search(int arr[], int target, int start, int end ){
        if(arr.length==0){
            return -1;
        }
        for(int index = start; index<end; index ++){
            if (arr[index]==target) {
                return index;
            }
        }
        return -1;
    }
}
