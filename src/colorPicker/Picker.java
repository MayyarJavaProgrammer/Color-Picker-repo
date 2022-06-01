/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorPicker;

import java.awt.Color;

/**
 *
 * @author mear
 */
public class Picker {
    
    String colorRGBValue;
    String colorHEXValue;
    Color color;
    
    public Picker() {
        this.setColorRGBValue("[127,127,127]");
        this.setColorHEXValue("#7F7F7F");
        this.setColor(new Color(127, 127, 127));
    }
    
    public String getColorRGBValue() {
        return colorRGBValue;
    }
    
    public void setColorRGBValue(String colorRGBValue) {
        this.colorRGBValue = colorRGBValue;
    }
    
    public String getColorHEXValue() {
        return colorHEXValue;
    }
    
    public void setColorHEXValue(String colorHEXValue) {
        this.colorHEXValue = colorHEXValue;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
}
