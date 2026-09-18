package prog5121_poe_part1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Login {
    private String registeredUsername; 
    private String registeredPassword;
    private String registeredCellNumber;
    private String firstName;
    private String lastName;
    
    public Login(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //Required Mehtod 1
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    //Requied Method 2
    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;
        boolean hasCapital = !password.equals(password.toLowerCase());
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
        return hasCapital && hasNumber && hasSpecial;
    }
    
    //Required Mehtod 3
    public boolean checkCellPhoneNumber (String cellNumber) {
        String regex = "^\\+27\\d{9}$";
        Pattern pattern = Pattern.compile (regex);
        Matcher matcher = pattern.matcher(cellNumber);
        return matcher.matches();
    }
    
    //Required Method 4
    public String registerUser(String username, String password, String cellNumber, LanguageManager lang) {
        if (!checkUserName(username)) {
            return lang.get("username_failed");
        }
        if (!checkPasswordComplexity(password)) {
            return lang.get("password_failed");
        }
        if (!checkCellPhoneNumber(cellNumber)) {
            return lang.get("cell_failed");
        }
        this.registeredUsername = username;
        this.registeredPassword = password;
        this.registeredCellNumber = cellNumber;
        return lang.get("register_success");
    }
    
    //Requied for Login feature
    public boolean loginUser(String username, String password) {
        return username.equals(this.registeredUsername) && password.equals(this.registeredPassword);
    }
    
    public String returnLoginStatus(String username, String password, LanguageManager lang) {
        if (loginUser(username, password)) {
            return lang.get("login_success").replace("<firstName>", firstName).replace("<lastName>", lastName);
        } else {
            return lang.get("login_failed");
        }
    }
    
    //Displaying individual checks 
    public String checkUserNameWithMessage(String username, LanguageManager lang) {
        return checkUserName(username) ? lang.get("username_success") : lang.get("username_failed");
    }
    public String checkPasswordWithMessage(String password, LanguageManager lang) {
        return checkPasswordComplexity(password) ? lang.get("password_success") : lang.get("password_failed");
    }
    public String checkCellWithMessage(String cell, LanguageManager lang) {
        return checkCellPhoneNumber(cell) ? lang.get("cell_success") : lang.get("cell_failed");
    }
}
