/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Gurpreet Singh
 */
class Animal
{
    public void breed()
    {
        System.out.println("Breed Function of animal class");
    }
    public void color()
    {
        System.out.println("color function of animal class");
    }
    public void speak()
    {
        System.out.println("speak function of animal class");
    }
    
}
class Dog extends Animal
{
  @Override
  public void speak()
  {
       System.out.println("speak function of Dog class");
    
  }
}
class Cat extends Animal
{
    @Override
    public void speak()
  {
       System.out.println("speak function of Cat class");
    
  }
}
public class Program2 {
    public static void main(String a[])
    {
        Animal animal=new Animal();
        animal.speak();
        Dog dog=new Dog();
        dog.speak();
        Cat cat=new Cat();
        cat.speak();
    }
    
}
