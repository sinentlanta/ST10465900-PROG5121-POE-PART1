package prog5121_poe_part1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        LanguageManager lang = new LanguageManager();
        
        //Language Selection
        System.out.println(lang.get("select_lang"));
        System.out.println("1. English 2. Afrikaans 3. Xhosa 4. Zulu 5. Sepedi 6. Setswana");
        System.out.print("Choice (1-6): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
            case 1 -> lang.setLanguage("1");
            case 2 -> lang.setLanguage("2");
            case 3 -> lang.setLanguage("3");
            case 4 -> lang.setLanguage("4");
            case 5 -> lang.setLanguage("5");
            case 6 -> lang.setLanguage("6");
            default -> lang.setLanguage("1");
        }
        System.out.println("\nLanguage: "+ lang.getCurrent() + "\n");
        
        System.out.println(lang.get("enter_firstname"));
        String firstName = scanner.nextLine();
        System.out.println(lang.get("enter_lastname"));
        String lastName = scanner.nextLine();
        
        Login loginSystem = new Login (firstName, lastName);
        
        System.out.println(lang.get("enter_username"));
        String username = scanner.nextLine();
        System.out.println(loginSystem.checkUserNameWithMessage(username, lang));
        
        System.out.println(lang.get("enter_password"));
        String password = scanner.nextLine();
        System.out.println(loginSystem.checkPasswordWithMessage(password, lang));
        
        System.out.println(lang.get("enter_cell"));
        String cellNumber = scanner.nextLine();
        System.out.println(loginSystem.checkCellWithMessage(cellNumber, lang));
        
        String regResult = loginSystem.registerUser(username, password, cellNumber, lang);
        System.out.println("\n>> " + regResult);
        
        if (!regResult.equals(lang.get("register_success"))) {
            System.out.println("Please fix the errors indicated abpve and try again.");
            return;
        }
        
        System.out.println("\n" + lang.get("login_prompt"));
        System.out.println(lang.get("login_username"));
        String loginUsername = scanner.nextLine();
        System.out.println(lang.get("login_password"));
        String loginPassword = scanner.nextLine();
        
        String loginStatus = loginSystem.returnLoginStatus(loginUsername, loginPassword, lang);
        System.out.println("\n>> " + loginStatus);
        scanner.close();
}
    
}
