public class App {
   
    public static void main(String[] args) throws Exception {
        
        Person friend = new Person("Kervie", 18);
        
        Myself me = new Myself("Aldrex", 20);

        me.addFriend(friend);

        Pet Dog = new Pet("Jerry", friend);
        Dog.showOwnerName();

        Car Ferrari = new Car("Ferrari", me);
        Ferrari.showOwnerName();
        

    }
}
