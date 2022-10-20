public class Palondromes {
    public static void main(String[] args) {
       // palindrome("lol");
        //palindrome1("ill");
        isPalindrome("lol");

    }

    // reverse iteration
    public static String palindrome(String checkIfPalindrome) {
        char testWord[] = checkIfPalindrome.toCharArray();
        String testWordStr = String.valueOf(testWord); // convert char to string
        String reversed = "";
        for (int index = testWord.length - 1; index >= 0; index--) {
            reversed += testWord[index];
        }
        if (testWordStr.equals(reversed)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("not palindrome");
        }
        return reversed;
    }

    // string builder
    public static void palindrome1(String isItPalindrome) {

        StringBuilder testString = new StringBuilder(isItPalindrome);
        testString.append(isItPalindrome);

        StringBuilder reversed = testString.reverse();
        if (isItPalindrome.equals(reversed.toString())) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not");
        }

    }


    // pointer system
    public static boolean isItPalindrome3(String checkPalindrome) {
        int leftPointer = 0;
        int rightPointer = checkPalindrome.length() - 1;
        while (leftPointer < rightPointer) {
            if (checkPalindrome.charAt(leftPointer) != checkPalindrome.charAt(rightPointer))
                return false;
            leftPointer++;
            rightPointer--;
        }
        return true;

    }
//         // Method 1
//     // Returns true if string is a palindrome
//     static boolean isPalindrome(String str)
//     {
 
//         // Pointers pointing to the beginning
//         // and the end of the string
//         int i = 0, j = str.length() - 1;
 
//         // While there are characters to compare
//         while (i < j) {
 
//             // If there is a mismatch
//             if (str.charAt(i) != str.charAt(j))
//                 return false;
 
//             // Increment first pointer and
//             // decrement the other
//             i++;
//             j--;
//         }
//  `
//         // Given string is a palindrome
//         return true;
//     }
}
