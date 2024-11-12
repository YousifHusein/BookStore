package bookstore;
import java.util.*;

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        double total = 0.0;
        ArrayList<Membership> membership = new ArrayList<Membership>();
        ArrayList<Inventory> cart = new ArrayList<Inventory>();
        int answer;
        String name;
        
        
        inventory.add(new Inventory("To Kill A Mocking Bird by Harper Lee", 9.99, "Book", 10));
        inventory.add(new Inventory("Charlotte's Web by K. B. White", 7.99, "Book", 2));
        inventory.add(new Inventory("Cuz I Love You by Lizzo", 7.99, "CD", 1));
        inventory.add(new Inventory("How To Train Your Dragon", 15.99, "DVD", 5));
        
        while(true){
            System.out.println("Welcome to the Bookstore!!");
            System.out.println("Select from the following options:");
            System.out.println("\t1. Make a purchase:");
            System.out.println("\t2. Check membership status");
            System.out.println("\t3. Upgrade membership");
            System.out.println("\t4. Exit");
            
            switch(input.nextInt()){
                case 1:
                    while(true){
                        System.out.println("Which would you like to purchase: ");
                        for(int i = 0; i < inventory.size(); i++){
                            System.out.println("\t" + (i + 1) + ". " + inventory.get(i));
                        }
                        answer = input.nextInt() - 1;
                        cart.add(inventory.get(answer));
                        total += inventory.get(answer).getPrice();
                        inventory.get(answer).setAmount(inventory.get(answer).getAmount() - 1);
                        if(inventory.get(answer).getAmount() == 0){
                            inventory.remove(answer);
                        }
                        System.out.println("You have " + cart.size() + " items in your cart. Are you done shopping?");
                        System.out.println("\t1. Yes");
                        System.out.println("\t2. No");
                        answer = input.nextInt();
                        if(answer == 1){
                            System.out.println("Your total comes to $" + total);
                            System.out.println("Please select which member is making this purchase: ");
                            for(int i = 0; i < membership.size(); i++){
                                System.out.println("\t" + (i + 1) + ". " + membership.get(i).getMemberName());
                            }
                            System.out.println("\t" + (membership.size() + 1) + ". Register a new member");
                            answer = input.nextInt();
                            if(answer == membership.size() + 1){
                                System.out.println("Let's get you registered as a new member!");
                                System.out.println("Would you like to register as a free-tier or premium member?");
                                System.out.println("\t 1. Free-tier");
                                System.out.println("\t 2. Premium");
                                answer = input.nextInt();
                                if(answer == 1){
                                    System.out.println("Please enter your name: ");
                                    name = input.next();
                                    membership.add(new Membership(name, answer, total));
                                    System.out.println("Your purchase total was: $" + total);
                                    System.out.println("Congrats on your purchase " + name);
                                    cart.clear();
                                    break;
                                }
                                else if(answer == 2){
                                    System.out.println("Please enter your name: ");
                                    name = input.next();
                                    membership.add(new Membership(name, answer, total));
                                    System.out.println("Your purchase total was: $" + total);
                                    System.out.println("Congrats on your purchase " + name);
                                    cart.clear();
                                    break;
                                }
                            }
                            else{
                                System.out.println("Your purchase total was $" + total);
                                membership.get(answer + 1).setTotalAmount(membership.get(answer + 1).getTotalAmount() + total);
                            }
                        }
                    }
                }
                //case 2:
                    //j
                //case 3:
                    //h
                //case 4:
                    //break;
                //default:
                    //System.out.println("Please enter a number on the list!");
        }
 
    }

}
