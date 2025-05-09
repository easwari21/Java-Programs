public class Encap{
    public static void main(String[] args){

        Vehicle v = new Car();
        v.concreteMethod();
        v.complyregls();
        v.capacitycheck();
    }

}
//objects cant be created for abstract class
//But for child class in abstract class we can create objects
//abstract class can contain both concrete & abstract class
abstract class Vehicle {
    int vehid;
    String name;
    public abstract void complyregls();
    public abstract void capacitycheck();
    public void concreteMethod(){
        System.out.println("This is concreteMethod");
    }
}
class Car extends Vehicle {
    public void complyregls(){
        System.out.println("Complyregls");

    }
    public void capacitycheck(){
        System.out.println("capacitycheck");
    }  
} 
//interface is another way for abstraction
//By using interface we can create abstract class without using abstract keyword
//In interface only abstract methods can be used.
interface location{
    public void cleanlocation();

    public void hourlymessage();
}
//you cannot have a method body in interface
interface  defaultUser {
public void showId();
    
}


class User implements location, defaultUser{
    @Override
    public void cleanlocation(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @Override
    public void hourlymessage(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @Override
    public void showId(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
//interface can extend another interface
//if a abstract class contains all abstract methods then,interface can be used.

