package bookstore;
import java.util.*;

public class Membership {
    String memberName;
    int typeOfMember;
    double totalAmount;
    
    public Membership(String name, int memberType, double amount){
        this.typeOfMember = memberType;
        this.memberName =  name;
        this.totalAmount = amount;
    }
    
    public String getMemberName(){
        return memberName;
    }
    
    public int getTypeOfMember(){
        return typeOfMember;
    }
    
    public double getTotalAmount(){
        return totalAmount;
    }
    
    public void setMemberName(String name){
        this.memberName = name;
    }
    
    public void setTypeOfMember(int memberType){
        this.typeOfMember = memberType;
    }
    
    public void setTotalAmount(double amount){
        this.totalAmount = amount;
    }
}