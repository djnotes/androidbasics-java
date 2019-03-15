/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author johndoe
 */
public class HelloWorld {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Java");
        Human steve = new Human("Steve", 31);
        System.out.println("Hello " + steve.getName());
        
        Driver john = new Driver("John", 35, 10);
        System.out.println("Hello " + john.getName() + ", you have " + john.getExperience() + " years of experience");
        
        if(steve.getName() == john.getName()) {
            System.out.println("Steve and John are the same");
        }
        else {
            System.out.println("Names differ");
        }
        
        switch(steve.getAge()){
            case 20:
                System.out.println("You are pretty young");
                break;
            case 31: 
                System.out.println("You are pretty mature");
                break;
            default: 
                System.out.println("Your age does not matter");
        }
        
        String message = steve.getAge() < 25 ? "You are under 25" : "You are above 25";
        System.out.println(message);
        
        Human group[] = {steve, john};
        String names[] = {"David", "Jason", "Jack"};
        
        for(int i = 0; i < group.length; i++) {
            System.out.println("Person: " + group[i].getName() + ", " + group[i].getAge());
        }
        
        int i = 0;
        while(i < names.length) {
            System.out.println("Name: " + names[i]);
            i++;
        }
        
        //For-each loop in Java
        for(String name: names){
            System.out.println(name);
        }
        
    }
    
}

