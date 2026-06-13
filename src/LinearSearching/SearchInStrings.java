package LinearSearching;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Hitesh";
        char find = 'u';
        System.out.println(search(name, find));
    }
    static boolean search(String name, char find){
        if (name.length() == 0){
            return false;
        }
        // use for loop and access index with charAt method
//        for(int i=0; i<name.length(); i++){
//            if (find == name.charAt(i))
//                return true;
//        }

        // change String to charArray
        for (char match : name.toCharArray()){
            if(match == find){
                return true;
            }
        }
        return false;
    }
}
