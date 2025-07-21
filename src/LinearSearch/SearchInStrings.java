package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Jenish";
        char target = 'i';
        System.out.println(search(name, target));
    }

    static boolean search(String str , char target){
        if(str.isEmpty()){
            return false;
        }

        for(int index = 0; index<str.length(); index++){
            if(target == str.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
