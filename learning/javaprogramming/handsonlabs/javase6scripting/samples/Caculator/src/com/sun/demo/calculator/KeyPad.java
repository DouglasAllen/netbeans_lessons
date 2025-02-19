/*
 * KeyPad.java
 *
 * Copyright 2006 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html .
 *
 */

package com.sun.demo.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;

/**
 *
 * @author  John O'Conner
 */
public class KeyPad extends javax.swing.JPanel {
  
  /**
   * Creates new form KeyPad
   */
  public KeyPad() {
    initComponents();
    listeners = new ArrayList<KeyPadListener>();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents() {
    btnDigit1 = new javax.swing.JButton();
    btnDigit2 = new javax.swing.JButton();
    btnDigit3 = new javax.swing.JButton();
    btnDigit4 = new javax.swing.JButton();
    btnDigit5 = new javax.swing.JButton();
    btnDigit6 = new javax.swing.JButton();
    btnDigit7 = new javax.swing.JButton();
    btnDigit8 = new javax.swing.JButton();
    btnDigit9 = new javax.swing.JButton();
    btnOpSign = new javax.swing.JButton();
    btnDigit0 = new javax.swing.JButton();
    btnOpDecimal = new javax.swing.JButton();
    btnMem1 = new javax.swing.JButton();
    btnMem2 = new javax.swing.JButton();
    btnMem3 = new javax.swing.JButton();
    btnOpAdd = new javax.swing.JButton();
    btnOpSubtract = new javax.swing.JButton();
    btnOpMultiply = new javax.swing.JButton();
    btnOpDivide = new javax.swing.JButton();
    btnFunc1 = new javax.swing.JButton();
    btnFunc2 = new javax.swing.JButton();
    btnFunc3 = new javax.swing.JButton();
    btnFunc4 = new javax.swing.JButton();
    btnOpEnter = new javax.swing.JButton();
    btnOpClear = new javax.swing.JButton();

    btnDigit1.setText("1");
    btnDigit1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit1ActionPerformed(evt);
      }
    });

    btnDigit2.setText("2");
    btnDigit2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit2ActionPerformed(evt);
      }
    });

    btnDigit3.setText("3");
    btnDigit3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit3ActionPerformed(evt);
      }
    });

    btnDigit4.setText("4");
    btnDigit4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit4ActionPerformed(evt);
      }
    });

    btnDigit5.setText("5");
    btnDigit5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit5ActionPerformed(evt);
      }
    });

    btnDigit6.setText("6");
    btnDigit6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit6ActionPerformed(evt);
      }
    });

    btnDigit7.setText("7");
    btnDigit7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit7ActionPerformed(evt);
      }
    });

    btnDigit8.setText("8");
    btnDigit8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit8ActionPerformed(evt);
      }
    });

    btnDigit9.setText("9");
    btnDigit9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit9ActionPerformed(evt);
      }
    });

    btnOpSign.setText("+/-");
    btnOpSign.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpSignActionPerformed(evt);
      }
    });

    btnDigit0.setText("0");
    btnDigit0.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDigit0ActionPerformed(evt);
      }
    });

    btnOpDecimal.setText(".");
    btnOpDecimal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpDecimalActionPerformed(evt);
      }
    });

    btnMem1.setText("M1");
    btnMem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMem1ActionPerformed(evt);
      }
    });

    btnMem2.setText("M2");
    btnMem2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMem2ActionPerformed(evt);
      }
    });

    btnMem3.setText("M3");
    btnMem3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnMem3ActionPerformed(evt);
      }
    });

    btnOpAdd.setText("+");
    btnOpAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpAddActionPerformed(evt);
      }
    });

    btnOpSubtract.setText("-");
    btnOpSubtract.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpSubtractActionPerformed(evt);
      }
    });

    btnOpMultiply.setText("*");
    btnOpMultiply.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpMultiplyActionPerformed(evt);
      }
    });

    btnOpDivide.setText("/");
    btnOpDivide.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpDivideActionPerformed(evt);
      }
    });

    btnFunc1.setText("F1");
    btnFunc1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFunc1ActionPerformed(evt);
      }
    });

    btnFunc2.setText("F2");
    btnFunc2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFunc2ActionPerformed(evt);
      }
    });

    btnFunc3.setText("F3");
    btnFunc3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFunc3ActionPerformed(evt);
      }
    });

    btnFunc4.setText("F4");
    btnFunc4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnFunc4ActionPerformed(evt);
      }
    });

    btnOpEnter.setText("Enter");
    btnOpEnter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpEnterActionPerformed(evt);
      }
    });

    btnOpClear.setText("Clear");
    btnOpClear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnOpClearActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnDigit7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDigit8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDigit9))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnDigit4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDigit5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDigit6))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnDigit1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDigit2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDigit3))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnDigit0)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnOpSign)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnOpDecimal))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnMem1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnMem2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnMem3)))
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnOpDivide)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnFunc1))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnOpMultiply)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnFunc2))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnOpAdd)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnFunc3))
          .addComponent(btnOpEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnOpSubtract)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnFunc4))
          .addComponent(btnOpClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnFunc1, btnFunc2, btnFunc3, btnFunc4, btnOpAdd, btnOpDivide, btnOpMultiply, btnOpSubtract});

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDigit0, btnDigit1, btnDigit2, btnDigit3, btnDigit4, btnDigit5, btnDigit6, btnDigit7, btnDigit8, btnDigit9, btnMem1, btnMem2, btnMem3, btnOpDecimal, btnOpSign});

    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnDigit7)
              .addComponent(btnDigit8)
              .addComponent(btnDigit9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnDigit4)
              .addComponent(btnDigit5)
              .addComponent(btnDigit6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnDigit1)
              .addComponent(btnDigit2)
              .addComponent(btnDigit3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnDigit0)
              .addComponent(btnOpSign)
              .addComponent(btnOpDecimal))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnMem1)
              .addComponent(btnMem2)
              .addComponent(btnMem3)
              .addComponent(btnOpEnter)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnFunc1)
              .addComponent(btnOpDivide))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnFunc2)
              .addComponent(btnOpMultiply))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnFunc3)
              .addComponent(btnOpAdd))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnFunc4)
              .addComponent(btnOpSubtract))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnOpClear))
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFunc1, btnFunc2, btnFunc3, btnFunc4, btnOpAdd, btnOpDivide, btnOpMultiply, btnOpSubtract});

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDigit0, btnDigit1, btnDigit2, btnDigit3, btnDigit4, btnDigit5, btnDigit6, btnDigit7, btnDigit8, btnDigit9, btnMem1, btnMem2, btnMem3, btnOpDecimal, btnOpSign});

  }// </editor-fold>//GEN-END:initComponents

  private void btnFunc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunc4ActionPerformed
    setSelectedKey(Key.KEY_F4);
  }//GEN-LAST:event_btnFunc4ActionPerformed

  private void btnFunc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunc3ActionPerformed
    setSelectedKey(Key.KEY_F3);
  }//GEN-LAST:event_btnFunc3ActionPerformed

  private void btnFunc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunc2ActionPerformed
    setSelectedKey(Key.KEY_F2);
  }//GEN-LAST:event_btnFunc2ActionPerformed

  private void btnFunc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFunc1ActionPerformed
    setSelectedKey(Key.KEY_F1);
  }//GEN-LAST:event_btnFunc1ActionPerformed

  private void btnOpClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpClearActionPerformed
    setSelectedKey(Key.KEY_CLEAR);
  }//GEN-LAST:event_btnOpClearActionPerformed

  private void btnOpEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpEnterActionPerformed
    setSelectedKey(Key.KEY_ENTER);
  }//GEN-LAST:event_btnOpEnterActionPerformed

  private void btnOpDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpDivideActionPerformed
    setSelectedKey(Key.KEY_DIVIDE);
  }//GEN-LAST:event_btnOpDivideActionPerformed

  private void btnOpMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpMultiplyActionPerformed
    setSelectedKey(Key.KEY_MULTIPLY);
  }//GEN-LAST:event_btnOpMultiplyActionPerformed

  private void btnOpSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpSubtractActionPerformed
    setSelectedKey(Key.KEY_SUBTRACT);
  }//GEN-LAST:event_btnOpSubtractActionPerformed

  private void btnOpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpAddActionPerformed
    setSelectedKey(Key.KEY_ADD);
  }//GEN-LAST:event_btnOpAddActionPerformed

  private void btnMem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMem3ActionPerformed
    setSelectedKey(Key.KEY_M3);
  }//GEN-LAST:event_btnMem3ActionPerformed

  private void btnMem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMem2ActionPerformed
    setSelectedKey(Key.KEY_M2);
  }//GEN-LAST:event_btnMem2ActionPerformed

  private void btnMem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMem1ActionPerformed
    setSelectedKey(Key.KEY_M1);
  }//GEN-LAST:event_btnMem1ActionPerformed

  private void btnOpDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpDecimalActionPerformed
    setSelectedKey(Key.KEY_DECIMAL);
  }//GEN-LAST:event_btnOpDecimalActionPerformed

  private void btnOpSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpSignActionPerformed
    setSelectedKey(Key.KEY_SIGN);
  }//GEN-LAST:event_btnOpSignActionPerformed

  private void btnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit0ActionPerformed
    setSelectedKey(Key.KEY_ZERO);
  }//GEN-LAST:event_btnDigit0ActionPerformed

  private void btnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit9ActionPerformed
    setSelectedKey(Key.KEY_NINE);
  }//GEN-LAST:event_btnDigit9ActionPerformed

  private void btnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit8ActionPerformed
    setSelectedKey(Key.KEY_EIGHT);
  }//GEN-LAST:event_btnDigit8ActionPerformed

  private void btnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit7ActionPerformed
    setSelectedKey(Key.KEY_SEVEN);
  }//GEN-LAST:event_btnDigit7ActionPerformed

  private void btnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit6ActionPerformed
    setSelectedKey(Key.KEY_SIX);
  }//GEN-LAST:event_btnDigit6ActionPerformed

  private void btnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit5ActionPerformed
    setSelectedKey(Key.KEY_FIVE);
  }//GEN-LAST:event_btnDigit5ActionPerformed

  private void btnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit4ActionPerformed
    setSelectedKey(Key.KEY_FOUR);
  }//GEN-LAST:event_btnDigit4ActionPerformed

  private void btnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit3ActionPerformed
    setSelectedKey(Key.KEY_THREE);
  }//GEN-LAST:event_btnDigit3ActionPerformed

  private void btnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit1ActionPerformed
    setSelectedKey(Key.KEY_ONE);
  }//GEN-LAST:event_btnDigit1ActionPerformed
  
  private void btnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigit2ActionPerformed
    setSelectedKey(Key.KEY_TWO);
  }//GEN-LAST:event_btnDigit2ActionPerformed
  
  
  
  public Key getSelectedKey() {
    return selectedKey;
  }
  
  public void setSelectedKey(Key key) {
    selectedKey = key;
    fireKeyPadEvent(selectedKey);
    
    
  }
  
  public void addKeyPadListener(KeyPadListener listener) {
    listeners.add(listener);
  }
  
  public void removeKeyPadListener(KeyPadListener listener) {
    listeners.remove(listener);
  }
  
  private void fireKeyPadEvent(Key key) {
    KeyPadEvent evt = new KeyPadEvent(this, key);
    for(KeyPadListener listener: listeners) {
      listener.keySelected(evt);
    }
  }
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDigit0;
  private javax.swing.JButton btnDigit1;
  private javax.swing.JButton btnDigit2;
  private javax.swing.JButton btnDigit3;
  private javax.swing.JButton btnDigit4;
  private javax.swing.JButton btnDigit5;
  private javax.swing.JButton btnDigit6;
  private javax.swing.JButton btnDigit7;
  private javax.swing.JButton btnDigit8;
  private javax.swing.JButton btnDigit9;
  private javax.swing.JButton btnFunc1;
  private javax.swing.JButton btnFunc2;
  private javax.swing.JButton btnFunc3;
  private javax.swing.JButton btnFunc4;
  private javax.swing.JButton btnMem1;
  private javax.swing.JButton btnMem2;
  private javax.swing.JButton btnMem3;
  private javax.swing.JButton btnOpAdd;
  private javax.swing.JButton btnOpClear;
  private javax.swing.JButton btnOpDecimal;
  private javax.swing.JButton btnOpDivide;
  private javax.swing.JButton btnOpEnter;
  private javax.swing.JButton btnOpMultiply;
  private javax.swing.JButton btnOpSign;
  private javax.swing.JButton btnOpSubtract;
  // End of variables declaration//GEN-END:variables
  
    private List<KeyPadListener> listeners;
  private Key selectedKey;
  
}
