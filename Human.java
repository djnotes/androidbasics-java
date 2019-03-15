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
public class Human {
    
    private String name;
    private Integer age;
    
    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
}
