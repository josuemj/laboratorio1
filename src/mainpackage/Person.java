package mainpackage;
import java.util.Random;
public class Person {
    Random rnd = new Random();//Random method to set confidence
    public float personConfidence; //Don't know how to use this one yet...
    public String personName;
    public Boolean hasCookie;

    //Methods of Person Class

    //1---Has and Give cookie methods
    public Boolean hasCookie(Boolean withCookie) {
        if (withCookie == true){
            return true;
        } else{
            System.out.println("You don't have cookies, take one in the menu :)");
            return false;
        }
    }
    public void giveCookie(){
        hasCookie = false;
        System.out.println("You have given a cookie to the dog :)");
    }


    //2---Setter and getter for personName.
    public String getPersonName() {return personName;}
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    //3---Setter and getter for confidence

    public float getPersonConfidence() {return personConfidence;}
    public void setPersonConfidence(float confidence) {this.personConfidence = confidence;}

    public Boolean getHasCookie() {
        return hasCookie;
    }
    public void setHasCookie(Boolean hasCookie) {
        this.hasCookie = hasCookie;
    }

    //Constructor for person
    public Person(){
        personConfidence = rnd.nextInt(0,11);
        hasCookie = true; //The person will have default 1 cookie
    }
}
