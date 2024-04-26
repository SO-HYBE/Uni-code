/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sohai
 */
public class Calculate {
    private double width,side,length;
    double perResult=0, areaResult=0;
    String shape;
    
    public Calculate (double num, String shape){
        this.side = num;
        this.shape = shape;
    }
    public Calculate (double num1, double num2,String shape){
        this.length = num1;
        this.width = num2;
        this.shape = shape;
    }
    
    public double Area (){
        if("Square".equals(shape)){
                areaResult = side * side;
        } else if("Rectangle".equals(shape)){
                areaResult = length * width;
            }
        return areaResult;
    }
    public double Perimeter (){
        if("Square".equals(shape)){
                perResult = 4 * side;
        } else if("Rectangle".equals(shape)){
                perResult = 2 * length + 2 * width;
            }
        return  perResult;
    }
}
