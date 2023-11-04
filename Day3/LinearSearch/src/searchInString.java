//Question: Find character of a string exist in string or not

public class searchInString {
    public static void main(String[] args) {
        String name = "Aditya";
        char target = 't';
        System.out.println(searchString(name,target));

    }

    static boolean searchString(String str,char target)
    {
        if(str.isEmpty()){
            return false;
        }

        for(int i = 0; i< str.length();i++)
        {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return true;
    }
}
