/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import com.mycompany.jcafe88.models.Table;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tcom
 */
public class TableForm {

    public static Map<String, String> validated(String name, String seat_count) {
        Map<String, String> validate_message = new HashMap<>();
        if (name.isBlank()) {
            validate_message.put("name", "Name is require");
        } else if (name.length() <= 6) {
            validate_message.put("name", "Name has been long than 6 character");
        } else if (name.length() >= 255) {
            validate_message.put("name", "Name has been short than 255 character");
        }

        if (String.valueOf(seat_count).isEmpty()) {
            validate_message.put("seat_count", "seat_count is require");
        } else if (Integer.parseInt(seat_count) <= 5 ) {
            validate_message.put("seat_count", "seat_count must be more than");
        }
        return validate_message;
    }
}
