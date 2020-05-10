/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.util.ArrayList;

/**
 *
 * @author Nhan
 */
public class HoaDon {
    HoaDonHeader Hearder;
    ArrayList<CTHD> CTHD;
    
   protected HoaDon (HoaDonBulder Builder)
   {
       this.CTHD = Builder.CTHD;
       this.Hearder = Builder.Hearder; 
   }

    @Override
    public String toString() {
        return "HoaDon{" + "Hearder=" + Hearder + ", CTHD=" + CTHD + '}';
    }
   
   public static class HoaDonBulder
   {
    HoaDonHeader Hearder;
    ArrayList<CTHD> CTHD;

        
    public HoaDonBulder() 
    {
       this.CTHD = new ArrayList<>();
    }
    
    public HoaDonBulder addHoaDonHearder(HoaDonHeader Hearder)
   {
        this.Hearder = Hearder;
        return this;
   }
    public HoaDonBulder addCTHD(CTHD CTHd)
   {
       this.CTHD.add(CTHd) ;
       return this;
   }
    public HoaDon Build()
   {
       return new HoaDon(this);
   }
   }

}
