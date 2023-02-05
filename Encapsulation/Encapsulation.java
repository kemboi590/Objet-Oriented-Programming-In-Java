
package Encapsulation;

/**
 *
 * @author KEMBOI
 */
public class Encapsulation {
   private String name;
   private int age;
   private String address;
//by adding the private identifier to the class properties, you limit the access of the properties to the outside world

   //this is the constructor method
public Encapsulation(String name, int age, String address) {
this.name = name;
this.age = age;
this.address = address;
}
//the setters allows us set out properties in anyway we want to be set
public void setName(String name) {
this.name = name;
}

public void setAge(int age) {
this.age = age;
}

public void setAddress(String address) {
this.address = address;
}

//the getters allows us be able present our properties in a manner we world want the world to view it
 public String getName() {
return name;
}

 public int getAge() {
return age;
}

 public String getAddress() {
return address;
}

 @Override
public String toString() {
    return ("Student name is " + this.getName() +
", age is: " + this.getAge() + "and address is: " + 
this.getAddress());
}

public static void main(String[] args) {
Encapsulation john = new Encapsulation("John", 25, "616 East, California");
System.out.println(john.getName());
System.out.println(john.getAge());
System.out.println(john.getAddress());
}

}

//by encapusulation we are able to have control of our properties.
