package bookstore;
import java.util.*;

public class Inventory {
    String name;
    double price;
    String type;
    int amount;
    
    public Inventory(String aName, double aPrice, String aType, int aAmount){
        this.name = aName;
        this.price = aPrice;
        this.type = aType;
        this.amount = aAmount;
    }
    
    public String toString(){
        return(name + " - $" + price + " (" + type + ")");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    
    public int getAmount(){
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setAmount(int amount){
        this.amount = amount;
    }
}
