/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package withoutlspprinciple;

/**
 *
 * @author My University
 */
class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // Violation: a square forces height to be equal to width
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;  // Violation: a square forces width to be equal to height
    }
}
