import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String validPassword = "Coded123";
        String validUsername = "Coded";

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Enter Username: ");
                String username = in.nextLine();
                System.out.print("Enter Password: ");
                String password = in.nextLine();

                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    if (i == 4)
                        throw new Exception("Maximum attemps exceeded");
                    else
                        throw new Exception("Invalid credentials");
                } else {
                    System.out.println("Logged in!");
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
