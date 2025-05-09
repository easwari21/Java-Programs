public class Inherit {
    public static void main(String[] args) {
        
        wooberUser woo =new wooberUser(34,"Anu",23,"1234567890","India");
        woo.name="Abc";
        woo.age=40;
    }
}
class wooberUser{
    int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String phnNo;
    int id;
    String name;
    String address;

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    wooberUser(int id,String name,int age,String phnNo,String address){
        this.name=name;
        this.id=id;
        this.age=age;
        this.phnNo=phnNo;
        this.address=address;
    }

///Constructor
wooberUser(){
    System.out.println("Constructor is called");
}

public void welcome(){
        System.out.println("welcome woober user");
    }
}
class User extends wooberUser{
     String petname;
     String petId;
}
class Driver extends wooberUser{
    String vehiclename;
    String vehicleno;

    public void welcome(){
        System.out.println("Welcome,Driver!");
    }
    public void parentwelcome(){
        super.welcome();
    }
}
 