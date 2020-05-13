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
public class Traingle extends Shape{
    
    //Flelds
    private static Traingle hinhtamgiac;
    //constructor
    protected Traingle() {
    }
    //Methods
    public static Traingle Singletonhinhtamgiac()
    {
        if(hinhtamgiac == null)
        {
            hinhtamgiac = new Traingle();
        }
        return hinhtamgiac;
    }
    @Override
    public String Draw() {
        return "Vẽ hình Tam Giác ";
    }
    
    
}
