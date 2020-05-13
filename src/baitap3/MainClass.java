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
public class MainClass {
    public static void main(String[] args) {
        ShapeFactory SF = new ShapeFactory();
        Shape HinhChuNhat = SF.createShape(ShapeType.hinhchunhat);
        System.out.println(HinhChuNhat.Draw());
        
        Shape HinhTron = SF.createShape(ShapeType.hinhtron);
        System.out.println(HinhTron.Draw());
        
        Shape HinhTamGiac = SF.createShape(ShapeType.hinhtamgiac);
        System.out.println(HinhTamGiac.Draw());
        
      
        
        
        
    }
        
    }

