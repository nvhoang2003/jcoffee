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
public class PickDrinksForm {

    public static Map<String, String> validated(String quantity) {
        Map<String, String> validate_message = new HashMap<>();
        if(Integer.parseInt(quantity) <= 0){
            validate_message.put("quantity", "Number of drinks must be greater than or equal to 1");
        }
        
        return validate_message;
    }
}
