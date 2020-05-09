/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Nhan
 */
public class HoaDon {
    String IDOder, Date, NameCustomer;

    public HoaDon(HoaDonHeader builder) 
    {
        this.IDOder = builder.IDOder;
        this.Date = builder.Date;
        this.NameCustomer = builder.NameCustomer;
    }
    
    
    public static class HoaDonHeader
    {
        String IDOder, Date, NameCustomer;

        public HoaDonHeader() 
        {
        }
        
        public HoaDonHeader addIDOder(String IDOder)
        {
            this.IDOder = IDOder;
            return this;
        }
        public HoaDonHeader addDate(String Date)
        {
            this.Date = Date;
            return this;
        }
        public HoaDonHeader addNameCustomer(String NameCustomer)
        {
            this.NameCustomer = NameCustomer;
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
}
