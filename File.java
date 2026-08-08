import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String s = sc.nextLine();

        int dot = s.lastIndexOf('.');
        String ext = s.substring(dot + 1);

        if (ext.equalsIgnoreCase("pdf") ||
            ext.equalsIgnoreCase("docx") ||
            ext.equalsIgnoreCase("zip"))
            System.out.println("Accepted");
        else
            System.out.println("Rejected");
    }
}
    

