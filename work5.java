class Vehicle{
Vehicle(){System.out.println("Vehicle is created");
} 
}
class Bike5 extends Vehicle{
Bike5(){
super();//will invoke parent class constructor
System.out.println("Bike is created");
}
}
class work5 
{
public static void main(String args[])
{
Bike5 b = new Bike5(); 
}
}

