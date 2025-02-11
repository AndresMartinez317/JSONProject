package groceryapp;

import com.github.cliftonlabs.json_simple.JsonObject;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author sn-cm
 */
public class Product implements Serializable {
    public String name;
    public int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public JsonObject tojsonobject(){
        JsonObject j = new JsonObject();
        j.put("name", name);
        j.put("quantity", quantity);
        return j;
    }
    public static Product fromjsonobject(JsonObject j){
        String name = (String) j.get("name");
        int quantity = ((BigDecimal) j.get("quantity")).intValue();
        return new Product(name, quantity);
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", quantity=" + quantity + '}';
    }
    
}
