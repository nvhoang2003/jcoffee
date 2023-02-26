/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author NGUYEN DAT
 */
public class CustomerForm {

    public static Map<String, String> validated(String name, String address, String email, String phone, String age) {
        Map<String, String> validate_message = new HashMap<>();
        if (name.isBlank()) {
            validate_message.put("name", "Name is require");
        } else if (name.length() <= 6) {
            validate_message.put("name", "Name has been long than 6 character");
        } else if (name.length() >= 255) {
            validate_message.put("name", "Name has been short than 255 character");   
        }

        if (address.isBlank()) {
            validate_message.put("address", "Address is require");
        } else if (address.length() <= 6) {
            validate_message.put("address", "Address has been long than 6 character");
        } else if (address.length() >= 255) {
            validate_message.put("address", "Address has been short than 255 character");
        }

        if (email.isBlank()) {
            validate_message.put("email", "Email is require");
        }else if (email.length() <= 6) {
            validate_message.put("email", "Email has been long than 6 character");
        }else if (email.length() >= 266) {
            validate_message.put("email", "Email has been short than 255 character");
        }
        
        if (String.valueOf(phone).isBlank()) {
            validate_message.put("phone", "Phoen number is require");
        } else if (phone.length() != 10){
            validate_message.put("phone", "Phone must be 10 characters");
        }
        
        if(age.isBlank()){
            validate_message.put("age", "Age is require");
        }else if (Integer.parseInt(age) <= 0 || Integer.parseInt(age) >= 100 ) {
            validate_message.put("age", "Invalid age");
        }
        
        return validate_message;
    }
    
}
