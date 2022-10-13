public class Palondromes {
    public static void main(String[] args) {
        palindrome("lol");
        palindrome1("lol");
        
       
    }

    // reverse iteration
    public static String palindrome(String checkIfPalindrome){
        char testWord[] = checkIfPalindrome.toCharArray();
        String testWordStr = String.valueOf(testWord); //convert char to string
        String reversed = "";
        for(int index = testWord.length-1;index>=0;index--){
            reversed+=testWord[index];
        }
        if(testWordStr.equals(reversed)){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not palindrome");
              }
        return reversed;
    }
    // string builder
    public static void palindrome1(String isItPalindrome) {
        
        StringBuilder testString = new StringBuilder(isItPalindrome);
        testString.append(isItPalindrome);

        StringBuilder reversed = testString.reverse();
        if(isItPalindrome.equals(reversed.toString())){
            System.out.println("is palindrome");
        }else{
            System.out.println("not");
        }
        
    }
}
