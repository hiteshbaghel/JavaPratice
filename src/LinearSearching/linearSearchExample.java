package LinearSearching;

public class linearSearchExample {
    public static void main(String... args) {
        int []Num ={11, 67, 34, 62, 79, 41, 4, 8};
        int target = 79;
        // IF EXPECTED INDEX OR ELEMENT
       // int indexOfNumber = LinearSearch(Num, target);

        //if want boolean true false
        boolean indexOfNumber = LinearSearch(Num, target);
        System.out.println(indexOfNumber);
    }

    static boolean LinearSearch(int arr[], int target){
        //check the length of array if length is zero return -1
//        if(arr.length == 0) {
//            return -1;
//        }

        if(arr.length == 0) {
            return false;
        }

        // Return the Element (Enhanced for loop)
//        for(int element : arr){
//            if(element == target){
//                return element;
//            }
//        }

        // if return boolean true/false
        for(int element : arr){
            if(element == target){
                return true;
            }
        }

//        //Check the array if element foud return index
//        for(int Index = 0; Index<=arr.length-1; Index++){
//            int element = arr[Index];
//            if(element == target){
//                return Index;
//            }
//        }

        // if the loop ends and element not found return -1
        //return -1;

        //we use Integer.MAX_VALUE in return because -1
        //would be the part of element stored in array
        //return Integer.MAX_VALUE;

        // Return Boolean if not want MAX_VALUE
        return false;
    }
}
