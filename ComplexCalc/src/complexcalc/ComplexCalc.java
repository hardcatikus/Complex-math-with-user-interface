
package complexcalc;


public class ComplexCalc extends javax.swing.JFrame {


    public ComplexCalc() {
        initComponents();
    }
float FirstValueReal=0;//реальная часть первого числа
float FirstValueMnim=0;//мнимая часть первого числа
float SecondValueReal=0;//реальная часть второго числа
float SecondValueMnim=0;//мнимая часть второго числа
String operation;//в operation хранится какое дейтвие над числами было выбрано(+-*/)
int act=1;//используется act, чтобы показать какое текстовое поле активно, в данный момент(при нажатии на первое=1, при нажатии на второе=2)

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldReal = new javax.swing.JTextField();
        jTextFieldMnim = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonSubtract = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonDeleteCC = new javax.swing.JButton();
        jButtonQuality = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setFocusable(false);

        jTextFieldReal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldRealMouseClicked(evt);
            }
        });
        jTextFieldReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRealActionPerformed(evt);
            }
        });

        jTextFieldMnim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldMnimMouseClicked(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButtonDot.setText(",");
        jButtonDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDotMouseClicked(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton0MouseClicked(evt);
            }
        });

        jButtonDivide.setText("/");
        jButtonDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDivideMouseClicked(evt);
            }
        });

        jButtonMultiply.setText("*");
        jButtonMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMultiplyMouseClicked(evt);
            }
        });

        jButtonSubtract.setText("-");
        jButtonSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubtractMouseClicked(evt);
            }
        });

        jButtonAdd.setText("+");
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });

        jButtonDelete.setText("C");
        jButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteMouseClicked(evt);
            }
        });

        jButtonDeleteCC.setText("CC");
        jButtonDeleteCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeleteCCMouseClicked(evt);
            }
        });

        jButtonQuality.setText("=");
        jButtonQuality.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonQualityMouseClicked(evt);
            }
        });

        jLabel1.setText("Действительная часть");

        jLabel2.setText("Мнимая часть");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldReal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDeleteCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonQuality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMnim, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldReal, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jTextFieldMnim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButtonDivide))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButtonMultiply))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonDot)
                                    .addComponent(jButton0)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSubtract)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdd))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonQuality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRealActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"1");}//по нажатию на кнопку с цифрой проверяется какое окно активно, и записывается в него эта цифра
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"1");}
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"2");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"2");}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"3");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"3");}
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"4");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"4");}
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"5");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"5");}
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"6");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"6");}
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"7");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"7");}
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"8");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"8");}
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"9");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"9");}
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton0MouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+"0");}
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+"0");}
    }//GEN-LAST:event_jButton0MouseClicked

    private void jButtonDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDotMouseClicked
if (act==1){jTextFieldReal.setText(jTextFieldReal.getText()+".");}//по нажатию на кнопку "." проверяется какое окно активно, и записывается в него "."
else{jTextFieldMnim.setText(jTextFieldMnim.getText()+".");}
    }//GEN-LAST:event_jButtonDotMouseClicked

    private void jButtonDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteMouseClicked
if (act==1){String tmpr = jTextFieldReal.getText();//по нажатию на кнопку "C" проверяется какое окно активно, и в нем стирается последний символ
jTextFieldReal.setText(tmpr.substring(0, tmpr.length()-1));}
else{String tmpi = jTextFieldMnim.getText();
jTextFieldMnim.setText(tmpi.substring(0, tmpi.length()-1));}
    }//GEN-LAST:event_jButtonDeleteMouseClicked

    private void jButtonDeleteCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeleteCCMouseClicked
jTextFieldReal.setText("");//по нажатию на кнопку "CС" очищаются оба поля
jTextFieldMnim.setText("");  
    }//GEN-LAST:event_jButtonDeleteCCMouseClicked

    private void jTextFieldRealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRealMouseClicked
act=1;//активируется первое поле по нажатию на него
    }//GEN-LAST:event_jTextFieldRealMouseClicked

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
FirstValueReal=Float.valueOf(jTextFieldReal.getText());//по нажатию на кнопку с доперацией(+-*/)
FirstValueMnim=Float.valueOf(jTextFieldMnim.getText());//запоминаются значения первого комплексного числа
jTextFieldReal.setText("");//очищаются поля
jTextFieldMnim.setText("");
operation="+";//и запоминается выбранное действие
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButtonSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubtractMouseClicked
FirstValueReal=Float.valueOf(jTextFieldReal.getText());
FirstValueMnim=Float.valueOf(jTextFieldMnim.getText());
jTextFieldReal.setText("");
jTextFieldMnim.setText("");
operation="-";
    }//GEN-LAST:event_jButtonSubtractMouseClicked

    private void jButtonMultiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMultiplyMouseClicked
FirstValueReal=Float.valueOf(jTextFieldReal.getText());
FirstValueMnim=Float.valueOf(jTextFieldMnim.getText());
jTextFieldReal.setText("");
jTextFieldMnim.setText("");
operation="*";
    }//GEN-LAST:event_jButtonMultiplyMouseClicked

    private void jButtonDivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDivideMouseClicked
FirstValueReal=Float.valueOf(jTextFieldReal.getText());
FirstValueMnim=Float.valueOf(jTextFieldMnim.getText());
jTextFieldReal.setText("");
jTextFieldMnim.setText("");
operation="/";
    }//GEN-LAST:event_jButtonDivideMouseClicked

    private void jTextFieldMnimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldMnimMouseClicked
act=2;//активируется второе поле по нажатию на него
    }//GEN-LAST:event_jTextFieldMnimMouseClicked

    private void jButtonQualityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQualityMouseClicked
SecondValueReal=Float.valueOf(jTextFieldReal.getText());//по нажатию на "="
SecondValueMnim=Float.valueOf(jTextFieldMnim.getText());//запоминаются значения второго комплесного числа
if("+".equals(operation)){//проверяется какая операция была выбрана до этого
jTextFieldReal.setText((FirstValueReal+SecondValueReal)+"");//выполняет это действие и выводит в результаты в соответствующие поля
jTextFieldMnim.setText((FirstValueMnim+SecondValueMnim)+"");
}
if("-".equals(operation)){
jTextFieldReal.setText((FirstValueReal-SecondValueReal)+"");
jTextFieldMnim.setText((FirstValueMnim-SecondValueMnim)+"");
}
if("*".equals(operation)){
jTextFieldReal.setText((FirstValueReal*SecondValueReal-FirstValueMnim*SecondValueMnim)+"");
jTextFieldMnim.setText((SecondValueMnim*SecondValueReal+FirstValueReal*SecondValueMnim)+"");
}
if("/".equals(operation)){
jTextFieldReal.setText((FirstValueReal*SecondValueReal+FirstValueMnim*SecondValueMnim)*(SecondValueReal*SecondValueReal+SecondValueMnim*SecondValueMnim)+"");
jTextFieldMnim.setText((FirstValueMnim*SecondValueReal-FirstValueReal*SecondValueMnim)/(SecondValueReal*SecondValueReal+SecondValueMnim*SecondValueMnim)+"");


}
    }//GEN-LAST:event_jButtonQualityMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComplexCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplexCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplexCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplexCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplexCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDeleteCC;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonQuality;
    private javax.swing.JButton jButtonSubtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldMnim;
    private javax.swing.JTextField jTextFieldReal;
    // End of variables declaration//GEN-END:variables
}
