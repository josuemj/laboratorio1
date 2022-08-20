package mainpackage;
import java.util.Scanner;
/*
Universidad del valle de Guatemala
Programación orientada a objetos
Josué Roberto Marroquin Jiménez - 22397
This is the main program class
Welcome to the DriverProgram class
 */
public class DriverProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the volunteers training!");

        //Objects
        Scanner inputReader = new Scanner(System.in);
        Person person = new Person();
        Dog dog = new Dog();

        //Controllers
        boolean personIn = false;
        boolean dogIn = false;
        int optionChoosen;
        Boolean withCookie = true;

        //Main program
        do {
            //Selection
            optionChoosen = menu();

            //options
            if (optionChoosen == 1){
                System.out.println("New person!");
                person = newPerson(inputReader);
                personIn = true;
                System.out.println("Courage settled: "+ person.getPersonConfidence());
            }

            if (optionChoosen == 2){
                System.out.println("New dog!");
                dog = newDog(inputReader);
                dogIn = true;
                System.out.println("courage settled: "+dog.getCourage()+"\n");
            }

            if (optionChoosen == 3){
                System.out.println("Take out cookie");
                    if (personIn == false){ //Verifier
                        System.out.println("No person introduced, please introduce it.\n");
                    } else{
                        if (person.getHasCookie() == true) {
                            System.out.println("You already got a cookie :)\n");
                        } else {
                            person.setHasCookie(true);
                            System.out.println("We have given you a cookie :)\n");
                        }
                    }
                }

            if (optionChoosen == 4){
                System.out.println("Dog interaction");
                if ((dogIn == false & dogIn == false) || (dogIn == false & personIn == true) || (dogIn == true & personIn == false)) { //Verifier
                    System.out.println("No dog or person introduced, please set them to interact correctly :)\n");
                } else {
                    interaction(dog,person);
                }
            }
        }while (optionChoosen != 5);

        System.out.println("Thanks so much for running the code!");
    }//Main program ends up.

    //Methods of the DriverProgram
    public static int menu(){ //Menu method, returns user selection to interact throughout the code.
        System.out.println("Menu!\n1. New friend\n2. New Dog\n3. Take out cookie\n4. Interaction with dog\n5. exit\n\nPlease Introduce the option :) ");
        Scanner optionReader = new Scanner(System.in);
        return optionReader.nextInt();
    }

    public static Person newPerson(Scanner personReader){//Method to set object Person
        Person friend = new Person();
        System.out.println("Introduce your name:");
        friend.setPersonName(personReader.nextLine());
        System.out.println("Hello "+friend.getPersonName()+"!\n");
        return friend;
    }
    public static Dog newDog(Scanner dogReader){//Method to set dog object
        Dog dog = new Dog();
        System.out.println("Introduce the dog name: ");
        dog.setDogName(dogReader.nextLine());
        System.out.println("Dog name: "+dog.getDogName());
        return dog;
    }

    public static void interaction(Dog dog,Person p) { //Inter
        System.out.println("Hello "+ p.getPersonName()+" you are interacting with "+dog.getDogName()+", good luck!");
        dog.psican(p);
        if (dog.getCourage() < -5){
            System.out.println("The dog: "+dog.getDogName()+" has bitten you, try giving him/her a cookie!");
            p.setPersonConfidence(p.getPersonConfidence()-2); //Takes out 2 points, person reaction.
            System.out.println("Your confidence has decreased to "+p.getPersonConfidence()+" :(");
        }
        if (dog.getCourage() > 0){
            System.out.println(dog.getDogName()+" has moved it's tail, looks happy!");
            p.setPersonConfidence(p.getPersonConfidence()+2); //Adds 2 points, person reaction.
            System.out.println("Your confidence has increased to "+p.getPersonConfidence()+" :)");
        }
        if (dog.getCourage() < 0 & dog.getCourage() >= -5) {
            System.out.println(dog.getDogName()+" has barked you! Try giving him/her a cookie!");
            p.setPersonConfidence(p.getPersonConfidence()-1); //Takes out 1 point, person reaction.
            System.out.println("Your confidence has decreased to "+p.getPersonConfidence()+" :)");
        }
    }
}