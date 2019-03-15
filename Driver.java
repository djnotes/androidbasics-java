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
public class Driver extends Human {
    
    private Integer experience;
    
    public Driver(String name, Integer age, Integer experience) {
        super(name, age);
        this.experience = experience;
    }

    public Integer getExperience() {
        return experience;
    }
    
    
}
