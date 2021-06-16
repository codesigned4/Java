package calculator2;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculator extends javax.swing.JFrame {
    private double answer=0;
    private int control=0;
  
    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelScreen = new javax.swing.JPanel();
        jTextMainScreen = new javax.swing.JTextField();
        jTextSubscreen = new javax.swing.JTextField();
        jRadioButtonOn = new javax.swing.JRadioButton();
        jRadioButtonOff = new javax.swing.JRadioButton();
        jPanelOperations = new javax.swing.JPanel();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnDivison = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnMultiply = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnMinus = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnClear = new javax.swing.JButton();
        jBtnEquals = new javax.swing.JButton();
        jBtnSum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanelScreen.setFont(new java.awt.Font("Tahoma", 1, 24)); 

        jTextMainScreen.setEditable(false);
        jTextMainScreen.setBackground(new java.awt.Color(211, 227, 227));
        jTextMainScreen.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jTextMainScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextMainScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextSubscreen.setEditable(false);
        jTextSubscreen.setBackground(new java.awt.Color(224, 216, 216));
        jTextSubscreen.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jTextSubscreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(jRadioButtonOn);
        jRadioButtonOn.setFont(new java.awt.Font("Tahoma", 1, 14));
        jRadioButtonOn.setSelected(true);
        jRadioButtonOn.setText("ON");
        jRadioButtonOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOnActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonOff);
        jRadioButtonOff.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jRadioButtonOff.setText("OFF");
        jRadioButtonOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelScreenLayout = new javax.swing.GroupLayout(jPanelScreen);
        jPanelScreen.setLayout(jPanelScreenLayout);
        jPanelScreenLayout.setHorizontalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScreenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextSubscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButtonOn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButtonOff, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanelScreenLayout.setVerticalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScreenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jRadioButtonOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOff))
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jTextSubscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        jPanelOperations.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOperations.setLayout(new java.awt.GridLayout(4, 4, 15, 15));

        jBtn7.setBackground(new java.awt.Color(240, 200, 131));
        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn7);

        jBtn8.setBackground(new java.awt.Color(240, 200, 131));
        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn8);

        jBtn9.setBackground(new java.awt.Color(240, 200, 131));
        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn9);

        jBtnDivison.setBackground(new java.awt.Color(240, 200, 131));
        jBtnDivison.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtnDivison.setText("%");
        jBtnDivison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisonActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtnDivison);

        jBtn4.setBackground(new java.awt.Color(240, 200, 131));
        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn4);

        jBtn5.setBackground(new java.awt.Color(240, 200, 131));
        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn5);

        jBtn6.setBackground(new java.awt.Color(240, 200, 131));
        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn6);

        jBtnMultiply.setBackground(new java.awt.Color(240, 200, 131));
        jBtnMultiply.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtnMultiply.setText("*");
        jBtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplyActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtnMultiply);

        jBtn1.setBackground(new java.awt.Color(240, 200, 131));
        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn1);

        jBtn2.setBackground(new java.awt.Color(240, 200, 131));
        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn2);

        jBtn3.setBackground(new java.awt.Color(240, 200, 131));
        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn3);

        jBtnMinus.setBackground(new java.awt.Color(240, 200, 131));
        jBtnMinus.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtnMinus.setText("-");
        jBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMinusActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtnMinus);

        jBtn0.setBackground(new java.awt.Color(240, 200, 131));
        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtn0);

        jBtnClear.setBackground(new java.awt.Color(240, 200, 131));
        jBtnClear.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtnClear.setText("C");
        jBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClearActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtnClear);

        jBtnEquals.setBackground(new java.awt.Color(240, 200, 131));
        jBtnEquals.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtnEquals.setText("=");
        jBtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEqualsActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtnEquals);

        jBtnSum.setBackground(new java.awt.Color(240, 200, 131));
        jBtnSum.setFont(new java.awt.Font("Tahoma", 1, 30)); 
        jBtnSum.setText("+");
        jBtnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumActionPerformed(evt);
            }
        });
        jPanelOperations.add(jBtnSum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelOperations, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {
                addInput(evt.getActionCommand());
    }

    private void jBtnClearActionPerformed(java.awt.event.ActionEvent evt) {
            jTextMainScreen.setText("");
            clearSubscreen();
            jTextSubscreen.setText("Clear");
            answer=0;
    }

    private void jBtnDivisonActionPerformed(java.awt.event.ActionEvent evt) {
            if(!jTextMainScreen.getText().equals(""))
            answer=Double.parseDouble(jTextMainScreen.getText());
            jTextMainScreen.setText("");
            clearSubscreen();
            jTextSubscreen.setText(evt.getActionCommand());
            control=1;
    }

    private void jBtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
            if(!jTextMainScreen.getText().equals(""))
            answer=Double.parseDouble(jTextMainScreen.getText());
            jTextMainScreen.setText("");
            clearSubscreen();
            jTextSubscreen.setText(evt.getActionCommand());
            control=2;
    }

    private void jBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {
            if(!jTextMainScreen.getText().equals(""))
            answer=Double.parseDouble(jTextMainScreen.getText());
            jTextMainScreen.setText("");
            clearSubscreen();
            jTextSubscreen.setText(evt.getActionCommand());
            control=3;
    }

    private void jBtnSumActionPerformed(java.awt.event.ActionEvent evt) {
            if(!jTextMainScreen.getText().equals(""))
            answer=Double.parseDouble(jTextMainScreen.getText());
            jTextMainScreen.setText("");
            clearSubscreen();
            jTextSubscreen.setText(evt.getActionCommand());
            control=4;
    }

    private void jBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {
            clearSubscreen();
            jTextSubscreen.setText(evt.getActionCommand());
            calculate();
            if(!jTextMainScreen.getText().equals(""))
            jTextMainScreen.setText(Double.toString(answer));
    }

    private void jRadioButtonOffActionPerformed(java.awt.event.ActionEvent evt) {
       disabled();
    }
    private void jRadioButtonOnActionPerformed(java.awt.event.ActionEvent evt) {
        enabled();
    }

    public void disabled(){
        Component[] c=jPanelOperations.getComponents();
        for(int i=0;i<c.length;i++){
            if(c[i] instanceof JButton ||c[i] instanceof JTextField){
                c[i].setEnabled(false);
            }
        }
    }
    public void enabled(){
        Component[] c=jPanelOperations.getComponents();
        for(int i=0;i<c.length;i++){
            if(c[i] instanceof JButton ||c[i] instanceof JTextField){
                c[i].setEnabled(true);
            }
        }
    }
    public void clearSubscreen(){
        jTextSubscreen.setText("");
    }
    public void addInput(String str){
        jTextMainScreen.setText(jTextMainScreen.getText()+str);
    }
    
    public void calculate(){
        switch(control){
            case 1:
                  answer/=Double.parseDouble(jTextMainScreen.getText());
                  break;  
            case 2:
                  answer*=Double.parseDouble(jTextMainScreen.getText()); 
                  break;
            case 3:
                answer-=Double.parseDouble(jTextMainScreen.getText());
                break;
            case 4:
                answer+=Double.parseDouble(jTextMainScreen.getText());
                break;
        }
        control=0;
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnClear;
    private javax.swing.JButton jBtnDivison;
    private javax.swing.JButton jBtnEquals;
    private javax.swing.JButton jBtnMinus;
    private javax.swing.JButton jBtnMultiply;
    private javax.swing.JButton jBtnSum;
    private javax.swing.JPanel jPanelOperations;
    private javax.swing.JPanel jPanelScreen;
    private javax.swing.JRadioButton jRadioButtonOff;
    private javax.swing.JRadioButton jRadioButtonOn;
    private javax.swing.JTextField jTextMainScreen;
    private javax.swing.JTextField jTextSubscreen;
    
}
