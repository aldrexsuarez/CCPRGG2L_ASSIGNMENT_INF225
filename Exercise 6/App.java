public class App {

    public static void main (String [] args) throws Exception{

        GroceryItem item1 = new GroceryItem();


        item1.name = "Tissue";
        item1.Price=80.00;
        item1.showItemName();
        item1.showItemPrice();


        GroceryItem item2 = new Toothbrush();
        item2.name="Colgate ";
        item2.Price=247.00;
        item2.showItemName();
        item2.showItemPrice();

        GroceryItem item3= new Toothpaste();
        item3.name="Pepsodent ";
        item3.Price=600.00;
        item3.showItemName();
        item3.showItemPrice();

        Cashier c1= new Cashier();
        c1.showPrice(item1);
        c1.showPrice(item2);
        c1.showPrice(item3);
        double total=item1.Price+item2.Price+item3.Price;
        System.out.println(total);
        c1.checkout(item1);
        c1.checkout(item2);
        c1.checkout(item3);


        GroceryItem[] itemarray= new GroceryItem[2];
        itemarray[0]=item2;
        itemarray[1]=item3;
            
        // Loop through all items
            
        for (int i = 0; i < itemArray.length; i++) {
                
            itemArray[i].showItemName();
        }


            
         // Pet mypet = new Pet();
         Dog myDog = new Dog();
         myDog.eat();
            
         Lion myLion = new Lion();
         myLion.walk();
         myLion.run();
            
        }
    }
    
}
