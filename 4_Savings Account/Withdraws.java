/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/// ////// package bankproject;

/**
 *
 * @author karthikap733
 */
package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author karthikap733
 */
public class WithdrawS extends javax.swing.JFrame {

    /**
     * Creates new form WithdrawS
     */
     double value=0;
    double s=0;
    Login1 obj=null;
    public WithdrawS(Login1 obj) {
       this.obj=obj;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        inputAdd = new javax.swing.JTextField();
        buttonWith = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputWith = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        inputAdd.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        inputAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonWith.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonWith.setText("Withdraw");
        buttonWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWithActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Enter your amount");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WithDraw Money");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );

        inputWith.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        inputWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputWithActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputWith, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(buttonWith)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel3)
                    .addContainerGap(218, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(inputWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(buttonWith)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonWithActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, IOException {
        
    try
       {
        value=Double.parseDouble(inputWith.getText());
      
       if(value<0){ 
           JOptionPane.showMessageDialog(null,"You can enter only positive values");
           this.setVisible(false);
       }
       else
       {
           
           
       
       //String s=Double.toString(value);
       String r ="E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt";
     //  System.out.println("In Add Money"+r);
       File f=new File(r);
            FileReader fr;
            String d="",q="";
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
      while((d=br.readLine())!=null)
      { //System.out.println(d);
          if(d.contains("Money : "))
          { //System.out.println("R");
              //System.out.println("P" +d.substring(8));
               double x=Double.parseDouble(d.substring(8));
              s=x-value;
              q="Money : "+(Double.toString(s));
            //  System.out.println(q);
              replace("",d,q);
               JOptionPane.showMessageDialog(null,"Amount Withdrawed");
             this.setVisible(false);
          }
      }
           
    //   new File1().update("Money",s,obj);
    
    }
       }catch(Exception e )
        {
            e.getStackTrace();
        }
        
//         double value=Double.parseDouble(inputWith.getText());
//        CurrentAccount obj=new CurrentAccount();
//        if(value<0){
//            JOptionPane.showMessageDialog(null,"You can enter only positive values");
//            this.setVisible(false);
//
//        }
//        else if (value<obj.curr)
//        {
//          JOptionPane.showMessageDialog(null,"Your account does not have sufficient amount available");   
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"Amount Withdrawed");
//            this.setVisible(false);
//
//            obj.curr+=value;
//        }
//
    }//GEN-LAST:event_buttonWithActionPerformed
public void replace(String a, String b,String c)
    {
        try {
        // input the file content to the StringBuffer "input"
        BufferedReader file = new BufferedReader(new FileReader("E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt"));
        StringBuffer inputBuffer = new StringBuffer();
        String line;

        while ((line = file.readLine()) != null) {
            inputBuffer.append(line);
            inputBuffer.append('\n');
        }
        file.close();
        String inputStr = inputBuffer.toString();

       // System.out.println(inputStr); // display the original file for debugging

        // logic to replace lines in the string (could use regex here to be generic)
        
            inputStr = inputStr.replace(a + b, a + c);
        

        // display the new file for debugging
       // System.out.println("----------------------------------\n" + inputStr);

        // write the new string with the replaced line OVER the same file
        FileOutputStream fileOut = new FileOutputStream("E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt");
        fileOut.write(inputStr.getBytes());
        fileOut.close();

    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }}
    private void inputAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAddActionPerformed
       
    }//GEN-LAST:event_inputAddActionPerformed

    private void inputWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputWithActionPerformed
      try
        {
        value=Double.parseDouble(inputWith.getText());
      
       if(value<0){ 
           JOptionPane.showMessageDialog(null,"You can enter only positive values");
           this.setVisible(false);
       }
//       else
//       {
//           
//            JOptionPane.showMessageDialog(null,"Amount added");
//             this.setVisible(false);
//       }
       //String s=Double.toString(value);
       String r ="E:\\An1\\"+obj.l+ "\\"+obj.ac+ ".txt";
       System.out.println("In Add Money"+r);
       File f=new File(r);
            FileReader fr;
            String d="",q="";
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
      while((d=br.readLine())!=null)
      { System.out.println(d);
          if(d.contains("Money : "))
          { System.out.println("R");
              System.out.println("P" +d.substring(8));
               double x=Double.parseDouble(d.substring(8));
              s=x-value;
              q="Money : "+(Double.toString(s));
              System.out.println(q);
              replace("",d,q);
          }
      }
           
    //   new File1().update("Money",s,obj);
    
    }
        catch(Exception e )
        {
            e.getStackTrace();
        }
//         double value=Double.parseDouble(inputWith.getText());
//        CurrentAccount obj=new CurrentAccount();
//        if(value<0){
//            JOptionPane.showMessageDialog(null,"You can enter only positive values");
//            this.setVisible(false);
//
//        }
//        else if (value<obj.curr)
//        {
//          JOptionPane.showMessageDialog(null,"Your account does not have sufficient amount available");   
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"Amount Withdrawed");
//            this.setVisible(false);
//
//            obj.curr+=value;
//        }
//
  }//GEN-LAST:event_inputWithActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(WithdrawS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WithdrawS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WithdrawS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WithdrawS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Login1 obj = new Login1();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WithdrawS(obj).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonWith;
    private javax.swing.JTextField inputAdd;
    private javax.swing.JTextField inputWith;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
