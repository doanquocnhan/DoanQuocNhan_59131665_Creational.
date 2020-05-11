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
public class BuildMain2 {
    public static void main(String[] args) {
        MyStringBuilder chuoi = new MyStringBuilder("Hôm Nay là ")
                .addString("Thứ 4 \n")
                .addFloat(22.5f)
                .addBool(true);
        System.out.println(chuoi.toString());
        
    }
}
