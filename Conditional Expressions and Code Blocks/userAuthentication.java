import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        // Get userName and password from the user.
        System.out.print("Please enter user name: ");
        userName = input.nextLine();
        System.out.print("Please enter password: ");
        password = input.nextLine();

        // Check the correctness of the entered userName and password.
        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Login successful. Welcome " + userName + "!");
        } else if(!password.equals("java101")){
            System.out.println("Wrong password!");
            System.out.println("Do you want to reset the password? Yes or No");
            String userChoice = input.nextLine();
            switch (userChoice){
                case "yes":
                    System.out.print("Create new password: ");
                    String newPassword = input.nextLine();
                    // Code block to be executed if the new password is the same as the old password.
                    if (!newPassword.equals("java101")){
                        System.out.print("New password is created!");
                    } else {
                        System.out.print("Failed to create new password. It should not be the same as the old password.");
                    }
                    break;
                case "no":
                    System.out.println("The program has been terminated.");
                    break;
                default:
                    System.out.println("The program has been terminated.");
                    break;
            }
        }
    }
}
