
import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q: 1
        /*
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.print("Enter Char: ");
        char c = input.nextLine().charAt(0);
        System.out.println("The Count Of Char " + c + " is: " + countChar(str, c));
         */

        // Q: 2
        /*
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.print("Enter Old Char: ");
        char oldChar = input.nextLine().charAt(0);
        System.out.print("Enter New Char: ");
        char newChar = input.nextLine().charAt(0);
        System.out.println("New String: " + replaceFirst(str, oldChar, newChar));
        */

        // Q: 3
        /*
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.print("Enter Old Char: ");
        char oldChar = input.nextLine().charAt(0);
        System.out.print("Enter New Char: ");
        char newChar = input.nextLine().charAt(0);
        System.out.println("New String: " + replaceLast(str, oldChar, newChar));
        */

        // Q: 4
        /*
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.print("Enter Old Char: ");
        char oldChar = input.nextLine().charAt(0);
        System.out.print("Enter New Char: ");
        char newChar = input.nextLine().charAt(0);
        System.out.println("New String: " + replaceAll(str, oldChar, newChar));
        */

        // Q: 5
        /*
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.print("Enter Old Char: ");
        char oldChar = input.nextLine().charAt(0);
        System.out.print("Enter New Char: ");
        char newChar = input.nextLine().charAt(0);
        System.out.println("New String: " + replaceOddIndex(str, oldChar, newChar));
        */

        // Q: 6
        /*
        System.out.print("Enter String: ");
        String str = input.nextLine();
        System.out.print("Enter Old Char: ");
        char oldChar = input.nextLine().charAt(0);
        System.out.print("Enter New Char: ");
        char newChar = input.nextLine().charAt(0);
        System.out.println("New String: " + replaceEvenIndex(str, oldChar, newChar));
         */

        // Q: 7
        /*
        System.out.print("Enter First String: ");
        String s1 = input.nextLine();
        System.out.print("Enter Second String: ");
        String s2 = input.nextLine();
        System.out.println("Concate s1 and s2 is: " + concate(s1, s2));
         */

        // Q: 8
        /*
        System.out.print("Enter First String: ");
        String s1 = input.nextLine();
        System.out.print("Enter Second String: ");
        String s2 = input.nextLine();
        System.out.println("Concate s1 and Reverse s2 is: " + concateReverse(s1, s2));
        */

        // Q: 9
        /*
        System.out.print("Enter First String: ");
        String s1 = input.nextLine();
        System.out.print("Enter Second String: ");
        String s2 = input.nextLine();
        System.out.println("Concate s1 and s2 is: " + concateSpecial(s1, s2));
        */

        // Q: 10
        /*
        System.out.print("Enter String: ");
        String s = input.nextLine();
        System.out.println("Reverse String Is: " + reverseString(s));
        */

        // Q: 11
        /*
        System.out.print("Enter String: ");
        String s = input.nextLine();
        System.out.println("Reverse String Is: " + reverseFirstWord(s));
        */

        // Q: 12
        /*
        System.out.print("Enter String: ");
        String s = input.nextLine();
        System.out.println("Reverse String Is: " + reverseLastWord(s));
        */

        // Q: 13
        /*
        System.out.print("Enter Any String: ");
        String str = input.nextLine();
        char c[] = stringToCharArray(str);
        printArray(c);
        */

        // Q: 14
        /*
        char c[] = new char[5];
        inputArray(c);
        System.out.println("String: " + charArrayToString(c));
        */

        // Q: 15
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.print("Enter specific char: ");
        char specificChar = input.nextLine().charAt(0);
        System.out.print("Array Is: ");
        printArray(split(str, specificChar));
        */

        // Q: 16
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.print("Enter sub string: ");
        String sub = new String(input.nextLine());
        System.out.println(startWith(str, sub));
         */

        // Q: 17
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.print("Enter sub string: ");
        String sub = new String(input.nextLine());
        System.out.println(endWith(str, sub));
        */

        // Q: 18
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.print("specified char: ");
        char c = input.nextLine().charAt(0);
        System.out.println("index: " + lastIndex(str, c));
        */

        // Q: 19
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.println("New String: " + trimString(str));
         */

        // Q: 20
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.print("Enter Char: ");
        char c = input.nextLine().charAt(0);
        System.out.println("New String: " + removeChar(str, c));
         */

        // Q: 21
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.println("New String: " + duplicateAllChar(str));
         */

        // Q: 22
        /*
        System.out.print("Enter String: ");
        String str = new String(input.nextLine());
        System.out.print("Enter Char: ");
        char c = input.nextLine().charAt(0);
        System.out.println("New String: " + duplicateChar(str, c));
        */
    }
    // Q: 1
    public static int countChar(String str, char c)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == c)
                count ++;
        }
        return count;
    }

    // Q: 2
    public static String replaceFirst(String str, char oldChar, char newChar)
    {
        String newStr = "";
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldChar && check) {
                newStr += newChar;
                check = false;
            }
            else newStr += str.charAt(i);
        }
        return newStr;
    }

    // Q: 3
    public static String replaceLast(String str, char oldChar, char newChar)
    {
        String newStr = "";
        boolean check = true;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == oldChar && check) {
                newStr += newChar;
                check = false;
            }
            else newStr += str.charAt(i);
        }
        return reverseString(newStr);
    }

    // Q: 4
    public static String replaceAll(String str, char oldChar, char newChar)
    {
        String newStr = "";
        for (int i = 0; i < str.length(); i++)
        {
            newStr += oldChar == str.charAt(i) ? newChar : str.charAt(i);
        }
        return newStr;
    }

    // Q: 5
    public static String replaceOddIndex(String str, char oldChar, char newChar)
    {
        String newStr = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (oldChar == str.charAt(i) && i % 2 != 0 && i != 0)
                newStr += newChar;
            else
                newStr += str.charAt(i);
        }
        return newStr;
    }

    // Q: 6
    public static String replaceEvenIndex(String str, char oldChar, char newChar)
    {
        String newStr = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (oldChar == str.charAt(i) && i % 2 == 0 && i != 0)
                newStr += newChar;
            else
                newStr += str.charAt(i);
        }
        return newStr;
    }

    // Q: 7
    public static String concate(String s1, String s2)
    {
        String str = s1 + ' ' + s2;
        return str;
    }

    // Q: 8
    public static String concateReverse(String s1, String s2)
    {
        String str = concate(s1, reverseString(s2));
        return str;
    }

    // Q: 9
    public static String concateSpecial(String s1, String s2)
    {
        String str = "";
        for (int i = 0; i < s2.length(); i++) {
            str = str + s1.charAt(i) + s2.charAt(i);
            if (i == s2.length() - 1){
                for (int j = i+1; j < s1.length(); j++)
                    str += s1.charAt(j);
                break;
            }
            if (i == s1.length() - 1) {
                for (int j = i+1; j < s2.length(); j++)
                    str += s2.charAt(j);
                break;
            }
        }
        return str;
    }

    // Q: 10
    public static String reverseString(String s)
    {
        String revStr = "";
        for (int i = s.length() - 1; i >= 0; i--)
            revStr += s.charAt(i);
        return revStr;
    }

    // Q: 11
    public static String reverseFirstWord(String s)
    {
        String firstWord = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i; j < s.length(); j++)
                    str += s.charAt(j);
                break;
            }
            firstWord += s.charAt(i);
        }
        str = reverseString(firstWord) + str;
        return str;
    }

    // Q: 12
    public static String reverseLastWord(String s)
    {
        String revLastWord = "";
        String word = "";
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                revLastWord += s.charAt(i);
            else {
                for (int j = 0; j <= i; j++)
                    word += s.charAt(j);
                break;
            }
        }
        String str = word + revLastWord;
        return str;
    }

    // Q: 13
    public static char[] stringToCharArray(String s)
    {
        char c[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            c[i] = s.charAt(i);
        return c;
    }

    // Q: 14
    public static String charArrayToString(char c[])
    {
        String str = "";
        for (int i = 0; i < c.length; i++)
            str += c[i];
        return str;
    }

    // Q: 15
    public static String[] split(String s, char c)
    {
        s = trimString(s);
        int lengthArr = countChar(s, c);
        String stringArray[] = new String[lengthArr+1];
        String str = "";
        int j = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                stringArray[j] = str;
                j++;
                str = "";
            }
            else str += s.charAt(i);
        }
        stringArray[lengthArr] = str;
        return stringArray;
    }

    // Q: 16
    public static boolean startWith(String s, String sub)
    {
        boolean check = false;
        if (sub.length() <= s.length()){
            for (int i = 0; i < sub.length(); i++) {
                if (s.charAt(i) == sub.charAt(i))
                    check = true;
                else return false;
            }
        }
        return check;
    }

    // Q: 17
    public static boolean endWith(String s, String sub)
    {
        boolean check = false;
        int j = s.length()-1;
        if (sub.length() <= s.length()){
            for (int i = sub.length()-1; i >= 0; i--) {
                if (s.charAt((j)) == sub.charAt(i)){
                    check = true;
                    j--;
                }
                else return false;
            }
        }
        return check;
    }

    // Q: 18
    public static int lastIndex(String s, char c)
    {
        for (int i = s.length()-1; i >= 0; i--)
            if (s.charAt(i) == c)
                return i;
        return -1;
    }

    // Q: 19
    public static String trimString(String s)
    {
        String newStr = "";
        int firstIndex = 0, lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                firstIndex = i;
                break;
            }
        }
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                lastIndex = i;
                break;
            }
        }
        for (int i = firstIndex; i <= lastIndex; i++)
            newStr += s.charAt(i);
        return newStr;
    }

    // Q: 20
    public static String removeChar(String s, char c)
    {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c)
                newStr += s.charAt(i);
        }
        return newStr;
    }

    // Q: 21
    public static String duplicateAllChar(String s)
    {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
                newStr = newStr + s.charAt(i) + s.charAt(i);
        }
        return newStr;
    }

    // Q: 22
    public static String duplicateChar(String s, char c)
    {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                newStr = newStr + s.charAt(i) + s.charAt(i);
            else newStr += s.charAt(i);
        }
        return newStr;
    }

    //=============================================================

    public static void printArray(char arr[])
    {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'" + arr[i] + "'");
            if (i+1 != arr.length)
                System.out.print(",");
        }
        System.out.print("}");
    }
    public static void printArray(String arr[])
    {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("'" + arr[i] + "'");
            if (i+1 != arr.length)
                System.out.print(",");
        }
        System.out.print("}");
    }
    public static void inputArray(char arrayChar[])
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print("c[" + i + "] = ");
            arrayChar[i] = input.nextLine().charAt(0);
        }
    }
}