/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ColorPicker;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author mear
 */
public class ColorPicker extends javax.swing.JFrame {

    /**
     * Creates new form ColorChooser
     */
    public ColorPicker() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        blueColor = new java.awt.Scrollbar();
        greenColor = new java.awt.Scrollbar();
        redColor = new java.awt.Scrollbar();
        jLabel3 = new javax.swing.JLabel();
        selectedColor = new javax.swing.JPanel();
        selectedColorRGBValue = new javax.swing.JLabel();
        selectedColorHaxValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Color Picker");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Red");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Green");

        blueColor.setBackground(new java.awt.Color(19, 161, 255));
        blueColor.setMaximum(256);
        blueColor.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        blueColor.setValue(127);
        blueColor.setVisibleAmount(1);
        blueColor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                blueColorAdjustmentValueChanged(evt);
            }
        });

        greenColor.setBackground(new java.awt.Color(37, 254, 89));
        greenColor.setMaximum(256);
        greenColor.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        greenColor.setValue(127);
        greenColor.setVisibleAmount(1);
        greenColor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                greenColorAdjustmentValueChanged(evt);
            }
        });

        redColor.setBackground(new java.awt.Color(255, 42, 42));
        redColor.setMaximum(256);
        redColor.setOrientation(java.awt.Scrollbar.HORIZONTAL);
        redColor.setValue(127);
        redColor.setVisibleAmount(1);
        redColor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                redColorAdjustmentValueChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Blue");

        selectedColor.setBackground(new java.awt.Color(127, 127, 127));

        javax.swing.GroupLayout selectedColorLayout = new javax.swing.GroupLayout(selectedColor);
        selectedColor.setLayout(selectedColorLayout);
        selectedColorLayout.setHorizontalGroup(
            selectedColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        selectedColorLayout.setVerticalGroup(
            selectedColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        selectedColorRGBValue.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        selectedColorRGBValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedColorRGBValue.setText("RGB : [127, 127, 127]");

        selectedColorHaxValue.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        selectedColorHaxValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedColorHaxValue.setText("HEX : #7F7F7F");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(greenColor, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(blueColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectedColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedColorRGBValue, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(selectedColorHaxValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(redColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(greenColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(blueColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(selectedColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedColorRGBValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedColorHaxValue)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redColorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_redColorAdjustmentValueChanged
        getColor();
    }//GEN-LAST:event_redColorAdjustmentValueChanged

    private void greenColorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_greenColorAdjustmentValueChanged
        getColor();
    }//GEN-LAST:event_greenColorAdjustmentValueChanged

    private void blueColorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_blueColorAdjustmentValueChanged
        getColor();
    }//GEN-LAST:event_blueColorAdjustmentValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ColorPicker().setVisible(true);
        });

    }

    private void getColor() {
        Color color = new Color(redColor.getValue(), greenColor.getValue(), blueColor.getValue());
        selectedColor.setBackground(color);
        String colorRGBValue = "[" + redColor.getValue() + "," + greenColor.getValue() + "," + blueColor.getValue() + "]";
        String colorHEXValue = "#" + Integer.toHexString(color.getRGB()).substring(2);
        selectedColorRGBValue.setText("RGB : " + colorRGBValue);
        selectedColorHaxValue.setText("HEX : " + colorHEXValue.toUpperCase());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Scrollbar blueColor;
    private java.awt.Scrollbar greenColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Scrollbar redColor;
    private javax.swing.JPanel selectedColor;
    private javax.swing.JLabel selectedColorHaxValue;
    private javax.swing.JLabel selectedColorRGBValue;
    // End of variables declaration//GEN-END:variables
}
