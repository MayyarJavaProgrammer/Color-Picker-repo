/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColorPicker;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author mear
 */
public class Picker {

    private String colorRGBValue;
    private String colorHEXValue;
    private Color SelectedColor;
    private int redColor;
    private int greenColor;
    private int blueColor;

    public Picker() {
        this.setRedColor(127);
        this.setGreenColor(127);
        this.setBlueColor(127);
        this.setColorRGBValue("[127,127,127]");
        this.setColorHEXValue("#7F7F7F");
        this.setSelectedColor(new Color(this.getRedColor(), this.getGreenColor(), this.getBlueColor()));
    }

    public Color getSelectedColor() {
        return SelectedColor;
    }

    public void setSelectedColor(Color Selectedcolor) {
        this.SelectedColor = Selectedcolor;
    }

    public int getRedColor() {
        return redColor;
    }

    public void setRedColor(int redColor) {
        this.redColor = redColor;
    }

    public int getGreenColor() {
        return greenColor;
    }

    public void setGreenColor(int greenColor) {
        this.greenColor = greenColor;
    }

    public int getBlueColor() {
        return blueColor;
    }

    public void setBlueColor(int blueColor) {
        this.blueColor = blueColor;
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
    
    public void copyValue(String value) {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(value), null);
    }

}
