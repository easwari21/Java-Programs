public class Polymor {
    public static void main(String[] args){
        Anil anil=new Anil();
        anil.makeSound();
    }
   
}
class Animal{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}

class Anil extends Animal {
    public void makeSound(){
        System.out.println("awwwooo");
    }
}