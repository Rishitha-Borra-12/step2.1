import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        s = s.substring(0, 3).toUpperCase() + s.substring(3);

        if (s.length() != 14) {
            System.out.println("Invalid: wrong length");
            return;
        }

        boolean valid = true;

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(s.charAt(i))) {
                valid = false;
            }
        }

        if (!valid) {
            System.out.println("Invalid: bank code must be 3 letters");
            return;
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                valid = false;
            }
        }

        if (!valid) {
            System.out.println("Invalid: body must contain digits");
            return;
        }

        String bank = s.substring(0, 3);
        String date = s.substring(3, 9);
        String seq = s.substring(9);

        System.out.println("[" + bank + "] DATE: "
                + date.substring(0, 2) + "/"
                + date.substring(2, 4) + "/"
                + date.substring(4) +
                " | SEQ: " + seq);
    }
}