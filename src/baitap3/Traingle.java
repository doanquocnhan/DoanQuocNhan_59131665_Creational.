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
    private static Traingle HinhVuong;
    //constructor
    protected Traingle() {
    }
    //Methods
    public static Traingle SingletonHinhVuong()
    {
        if(HinhVuong == null)
        {
            HinhVuong = new Traingle();
        }
        return HinhVuong;
    }
    @Override
    public String Draw() {
        return "VE hinh Traingle ";
    }
    
    
}
