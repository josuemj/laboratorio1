package mainpackage;
import java.util.Random; //Imported random

public class Dog {
    //Attributes of the dog class
    public float courage; // Courage (-5 - 5)
    public Integer biteCourage; // Courage to bite (0 - 20)
    public String dogName;
    Random rand = new Random(); //The dog has an attribute of the random type.

    public void psican(Person p) { //Method given
        System.out.println("PSICAN FUNCTIOPN WORKING....");
        this.courage = (float) ((1.0 / p.getPersonConfidence()) * (rand.nextFloat() - 0.5)*10 + this.courage);
        if (p.getHasCookie()) { // If true...
            p.giveCookie();
            this.courage += (1.0 / p.getPersonConfidence()) * (rand.nextInt(2));
        System.out.println("My new state mind is: "+courage+"\n");
        }
    }
    //Constructor method, default.
    public Dog(){
        courage = rand.nextInt(-5,6);
        biteCourage = rand.nextInt(-20, 1); //Sets default value for both attributes
    }

    //Setter and getter for dogName
    public String getDogName() {return dogName;}
    public void setDogName(String dogName) {this.dogName = dogName;}

    //Setter and getter for biteCourage and Courage
    public float getCourage() {return courage;}
    public void setCourage(float courage) {this.courage = courage;}
    public double getBiteCourage() {return biteCourage;}
    public void setBiteCourage(Integer biteCourage) {this.biteCourage = biteCourage;}
}
