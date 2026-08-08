import java.util.*;

public class Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phone = sc.nextLine();

        if (phone.length() == 10) {
            String last = phone.substring(6);
            System.out.println("XXXXXX-" + last);
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
    

