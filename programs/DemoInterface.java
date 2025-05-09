public class DemoInterface {
    public static void main(String[] args) {
        HybridCar innova = new HybridCar();
        //innova object can be created for HybridCar since it's a child class of abstract class
        innova.callThis();
        innova.dummycaller();
    }
}
//extends is for class
interface Electricar{
    public void callThis();
}
interface Petrolcar{

    public void dummycaller();
    //just declaring the method
}

class HybridCar implements Electricar,Petrolcar{
//implementing the abstract methods
//All abstract methods in the abstract class should be implemented in the child class otherwise error would occur
    @Override
    public void callThis() {
        //implementing logic or printing value of the abstract method
        System.out.println("Call this method");
        
    } 

    @Override
    public void dummycaller() {
        System.out.println("Dummy caller method");
        
    }

}
