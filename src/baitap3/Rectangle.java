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
public class Rectangle extends Shape{
    //Flelds
    private static Rectangle Hinhchunhat;
    //constructor
    protected Rectangle() {
    }
    //Methods
    public static Rectangle SingletonHinhchunhat()
    {
        if(Hinhchunhat == null)
        {
            Hinhchunhat = new Rectangle();
        }
        return Hinhchunhat;
    }
    
    @Override
    public String Draw() {
        return "Ve Hinh Rectangle";
    }
    
    
}
