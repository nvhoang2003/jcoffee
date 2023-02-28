/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import com.mycompany.jcafe88.models.Admin;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tcom
 */
public class AdminForm extends Admin {

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static Map<String, String> validated(String name, String user_name, String password, String confirm_password) {
        Matcher matcherpwd = pattern.matcher(password);
        Matcher cmatcherpwd = pattern.matcher(confirm_password);
        Map<String, String> validate_message = new HashMap<>();
        if (name.isBlank()) {
            validate_message.put("name", "Name is require");
        } else if (name.length() <= 6) {
            validate_message.put("name", "Name has been long than 6 character");
        } else if (name.length() >= 255) {
            validate_message.put("name", "Name has been short than 255 character");
        }

        if (user_name.isBlank()) {
            validate_message.put("user_name", "User name is require");
        } else if (user_name.length() <= 6) {
            validate_message.put("user_name", "User name has been long than 6 character");
        } else if (user_name.length() >= 255) {
            validate_message.put("user_name", "User name has been short than 255 character");
        }

        if (password.isBlank()) {
            validate_message.put("password", "Password is require");
        } else if (!matcherpwd.find()) {
            validate_message.put("password", "Invalid password");
        }

        if (confirm_password.isBlank()) {
            validate_message.put("confirm_password", "Confirm password is require");
        } else if (!cmatcherpwd.find()) {
            validate_message.put("confirm_password", "Invalid confirm password");
        }

        if (!confirm_password.equals(password)) {
            validate_message.put("password", "Password must a same as confirm password");
            validate_message.put("confirm_password", "Confirm password must a same as password");
        }

        return validate_message;
    }
}
