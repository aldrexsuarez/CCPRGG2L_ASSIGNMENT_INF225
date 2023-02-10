public class App {
    public static void main(String[] args) throws Exception {


            GroceryItem item1 = new GroceryItem();

            item1.name = "Tissue";

            item1.showItemName();


            // item in a form of a toothbrush
            GroceryItem item2 = new Toothbrush();
            item2.name = "Colgate";
            item2.showItemName();

            // item in a form of a toothpaste
            GroceryItem item3 = new Toothpaste();
            item3.name = "Pepsodent";
            item3.showItemName();

            // Cashier object
            Cashier c1 = new Cashier();
            
            // Polymorphic parameter
            c1.checkOut(item2);
            c1.checkOut(item3);

            // Polymorphic array
            GroceryItem[] itemArray = new GroceryItem[2];
            itemArray[0] = item2;
            itemArray[1] = item3;

            // Loop through all items
            for (int i = 0; i < itemArray.length; i++) {
                itemArray[i].showItemName();


            // Pet mypet = new Pet();
            Dog myDog = new Dog();
            myDog.eat();
            
            Lion myLion = new Lion();
            myLion.walk();
            myLion.run();
            }
    }
    
}
