package form;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Tcom
 */
public class DrinksForm {

    public static Map<String, String> validated(String name, String Price, String Description) {
        Map<String, String> validate_message = new HashMap<>();
        if (name.isBlank()) {
            validate_message.put("name", "Name is require");
        } else if (name.length() <= 3) {
            validate_message.put("name", "Name has been long than 3 character");
        } else if (name.length() >= 255) {
            validate_message.put("name", "Name has been short than 255 character");
        }
        
        if (String.valueOf(Price).isEmpty()) {
            validate_message.put("Price", "Price is require");
        } else if (Integer.parseInt(Price) <= 5 ) {
            validate_message.put("Price", "Price must be more than 5$");
        }

        if (Description.isBlank()) {
            validate_message.put("Description", "Description is require");
        } else if (Description.length() <= 6) {
            validate_message.put("Description", "Description has been long than 6 character");
        } else if (Description.length() >= 255) {
            validate_message.put("Description", "Description has been short than 255 character");
        }
        
        return validate_message;
    }
}
