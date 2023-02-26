/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import com.mycompany.jcafe88.models.CodeSale;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author ACER
 */
public class CodeSaleForm extends CodeSale {
    public static Map<String, String> validated(String Name, String Sale_Off, String Code){
        Map<String, String> validate_message = new HashMap<>();
        if (Name.isBlank()) {
            validate_message.put("Name", "Require a Name of Sale Event");
        } else if (Name.length() <= 4) {
            validate_message.put("Name", "Name must long than 4 character");        
        }
        
        if (Sale_Off.isBlank()){
            validate_message.put("Sale_Off", "Please put sale off number");
        } else if(!String.valueOf(Integer.parseInt(Sale_Off)).equals(Sale_Off)){
            validate_message.put("Sale_Off", "Sale off must be integer");
        }
        
        if (Code.isBlank()){
            validate_message.put("Code", "Please input Code");
        }       
        return validate_message;
    }    
}
