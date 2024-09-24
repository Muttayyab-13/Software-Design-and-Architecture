/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package withlspprinciple;

/**
 *
 * @author My University
 */
class Square implements Shape {
    private int side;

    public void setSide(int side) { this.side = side; }
    @Override
    public int getArea() { return side * side; }
}
