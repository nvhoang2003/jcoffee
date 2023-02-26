/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NGUYEN DAT
 */
public class UpdateAdminForm {

    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static Map<String, String> validated(String name, String user_name, String old_password, String new_password, String confirm_new_password) {
        Matcher matcher = pattern.matcher(new_password);
        Map<String, String> validate_message = new HashMap<>();
        if (name.isBlank()) {
            validate_message.put("name", "Name is required");
        } else if (name.length() <= 6) {
            validate_message.put("name", "Name has been long than 6 character");
        } else if (name.length() >= 255) {
            validate_message.put("name", "Name has been short than 255 character");
        }

        if (new_password == null ? confirm_new_password == null : !confirm_new_password.equals(new_password)) {
        } else {
            validate_message.put("new_password", "New password must a same as confirm password");
            validate_message.put("confirm_new_password", "Confirm password must a same as password");
        }

        if (user_name.isBlank()) {
            validate_message.put("user_name", "User name is require");
        } else if (user_name.length() <= 6) {
            validate_message.put("user_name", "User name has been long than 6 character");
        } else if (user_name.length() >= 255) {
            validate_message.put("user_name", "User name has been short than 255 character");
        }
        
        if (old_password.isBlank()) {
            validate_message.put("old_password", "Old password is require");
        }
        
        if (new_password.isBlank()) {
            validate_message.put("new_password", "New password is require");
        }
        
        if (old_password == null ? new_password == null : !old_password.equals(new_password)) {
        } else {
            validate_message.put("new_password", "New password must be different form the old password");
        }
        
        return  validate_message;
    }
}
