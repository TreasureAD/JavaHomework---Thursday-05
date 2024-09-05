package what_Is_Your_Name;

import java.util.Scanner;

public class What_Is_Your_Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        // While the name is NOT Hakeem or Aliyah with cases ignored
        while (!name.equalsIgnoreCase("hakeem") && !name.equalsIgnoreCase("aliyah")) {

            System.out.println("What's your name again?");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("hakeem")) {
                System.out.println("Welcome Hakeem");

            } else if (name.equalsIgnoreCase("aliyah")) {
                System.out.println("Welcome Aliyah");

            }
        }
    }
}
