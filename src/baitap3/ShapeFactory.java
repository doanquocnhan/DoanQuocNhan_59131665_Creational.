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
public class ShapeFactory {
     public Shape createShape(ShapeType shapeType) {
        if (null != shapeType) switch (shapeType) {
            case hinhchunhat:
                return Rectangle.Singletonhinhchunhat();
            case hinhtron:
                return Circle.SingletonCircle();
            case hinhtamgiac:
                return Traingle.Singletonhinhtamgiac();
            default:
                break;
        }
        return null;
    }
//    ShapeType type;
//
//    public void setType(ShapeType type) {
//        this.type = type;
//    }
//    
//    
//    public ShapeFactory() {
//    }
//
//    public Shape createShape() {
//        switch(type)
//        {
//           case circle: return new Circle();
//            case HinhVuong: return new Traingle();
//            case Hinhchunhat: return new Rectangle();
//        }
//        return null;
//    }
    
    
}

//public class ShapeFactory {
//    ShapeType type;
//
//    public ShapeFactory(ShapeType type) {
//        this.type = type;
//    }
//    
//    
//    
//    public Shape createShape(ShapeType shapeType)
//    {
//        
//    }
//    
//    
//}
