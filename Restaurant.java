//Question 4

import java.util.*;

class menuitem{
    private String name;
    private String category;
    private double price;

    public menuitem(String name, String category , double price){
        this.name = name;
        this.category = category;
        this.price = price;
    }


    public String getname(){
        return name;
    }

    public String getcategory(){
        return category;
    }

    public double getprice(){
        return price;
    }


    @Override
    public String toString(){
        return String.format("%-20s %-15s $%.2f", name, category, price);
    }
}



public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <menuitem> menulist = new ArrayList<>();
        System.out.println("Enter the number of items to add to the menu:");
        int itemCount = Integer.parseInt(scanner.nextLine());
    

    for (int i = 0; i < itemCount; i++) {
        System.out.println("Enter Details  item number: " + (i+1) + " (name, category(choose option) and price)");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("1.Main meal \n2.Dessert \n3.Beverages \nEnter category by inputing the number:");
        int c = Integer.parseInt(scanner.nextLine());
        String category;
        switch (c) {
            case 1:
                category = "Main meal";
                break;
            
            case 2:
                category= "Dessert";
                break;
            
            case 3:
                category= "Beverages";
                break;
            
            default:
                category= "invalid";
                break;
        }
        
        System.out.println("Enter price: ");
        Double price = Double.parseDouble(scanner.nextLine());

        menulist.add(new menuitem(name, category, price));
    }

    while (true){
        System.out.println("\n--- Menu Sorting Options ---");
        System.out.println("1. View menu (sorted naturally by category)");
        System.out.println("2. Sort menu by price");
        System.out.println("3. Sort menu by name");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        
        switch (choice){
            case 1:
            Collections.sort(menulist, Comparator.comparing(menuitem::getcategory));
            displayMenu(menulist);
            break;

            case 2:
            Collections.sort(menulist, Comparator.comparingDouble(menuitem::getprice));
            displayMenu(menulist);
            break;

            case 3:
            Collections.sort(menulist, Comparator.comparing(menuitem::getname));
            displayMenu(menulist);
            break;

            case 4:
            System.out.println("Bye bye");
            scanner.close();
            return;

            default:
                System.out.println("Invalid input, try again");
        }
        

    }
    
}
private static void displayMenu(List<menuitem> menulist) {
    System.out.println("\n--- Restaurant Menu ---");
    System.out.printf("%-20s %-15s %-10s\n", "Name", "Category", "Price");
    System.out.println("---------------------------------------------------");
    for (menuitem item : menulist) {
        System.out.println(item);
    }
}

}
