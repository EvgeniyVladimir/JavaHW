// Задача. Напишите метод, который принимает на вход строку (String)
//  и определяет является ли строка палиндромом (возвращает boolean значение).
package HW2;
import java.util.Scanner;
public class HWTsk2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String name = iScanner.nextLine();
        System.out.println(isPalindrome(name));
        iScanner.close();
        isPalindrome(name);
    }
    public static Boolean isPalindrome(String name) {
        for (int i = 0; i < name.length() / 2; ++i) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
    