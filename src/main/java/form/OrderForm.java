/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;
import com.mycompany.jcafe88.dao.CustomerDAO;
import java.util.HashMap;
import java.util.Map;
import com.mycompany.jcafe88.dao.OrdersDAO;

/**
 *
 * @author NGUYEN DAT
 */
public class OrderForm {

    public static Map<String, String> validated(String name) {
        Map<String, String> validate_message = new HashMap<>();
        if (name.isBlank()) {
            validate_message.put("name", "Name is reqiure");
        } else if (name.length() <= 6) {
            validate_message.put("name", "Name has been long than 6 characters");
        } else if (name.length() >= 255) {
            validate_message.put("name", "Name has been short than 255 characters");
        } else if (!CustomerDAO.findCustomer_ID(name)) {
            validate_message.put("name", "Customer need create Customer Form first");
        }
        
        
        return validate_message;
    }
}
