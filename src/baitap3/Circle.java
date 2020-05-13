/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Nhan
 */
public class Circle extends Shape{
    
    private static Shape circle;

    public Circle() 
    {
    
    }
    
     public static Shape SingletonCircle() 
     {
        if (circle == null) 
        {
            circle = new Circle();
        }
        return circle;
    }
            
            
            
    @Override
    public String Draw() {
       return "Ve hinh Tron";
    }
    
    
}
