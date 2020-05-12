/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author Nhan
 */
public class MyStringBuilder {
    String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder() {
    }
    
    public MyStringBuilder addString( String s)
    {
        this.str += s;
        return this;
    }
    public MyStringBuilder addFloat (float f)
    {
        this.str += f;
        return this;
    }
    public MyStringBuilder addBool(boolean b)
    {
        this.str += b;
        return this;
    }

    @Override
    public String toString() {
        return "Chuỗii của bạn là" + str;
    }
    
    
    
    
    
    
}
