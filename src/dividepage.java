/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author eljam3239
 */
public class dividepage extends javax.swing.JFrame {

    Random rand = new Random();
    //generates 2 random numbers to be divided by 5 and 25 respectively
    int num1 = rand.nextInt(80)+16; 
    int num2 = rand.nextInt(120)+30;
    //determines the correct quotients
    int ans1 = num1/5;
    int ans2 = num2/25;
    
    /**
     * Creates new form dividepage
     */
    public dividepage() {
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

        jPanel1 = new javax.swing.JPanel();
        dividehome = new javax.swing.JButton();
        dividetitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dividelesson = new javax.swing.JTextArea();
        divideq1 = new javax.swing.JLabel();
        divideq2 = new javax.swing.JLabel();
        divideuans1 = new javax.swing.JTextField();
        divideuans2 = new javax.swing.JTextField();
        divideoutput = new javax.swing.JLabel();
        dividebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(171, 152, 122));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(171, 152, 122));

        dividehome.setText("<--Home");
        dividehome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividehomeActionPerformed(evt);
            }
        });

        dividetitle.setForeground(new java.awt.Color(255, 255, 255));
        dividetitle.setText("Mental Division");

        dividelesson.setColumns(20);
        dividelesson.setRows(5);
        dividelesson.setText("Mental division is similar to mental multiplication because it relies on\nrecognition. For the first trick, you must identify when something is\nbeing divided by 5.\n\nTrick 1: When dividing something by 5, you are infact multiplying it\nby 1/5. This can be difficult when divide things like 37/5 or 46/5. But\ninstead of trying to multiply by 1/5, multiply by 2, then divide by 10.\n2/10 = 1/5, but multplying something by 2 is easy, then dividing by 10\nis as simple as moving the decimal place one place to the left.\n\n44/5 = 44*1/5 = 44*2/10 = 88/10 = 8.8\n53/5 = 53*1/5 = 53*2/10 = 106/10 = 10.6\n\nTrick 2: Much like trick 2, we can also easily divide numbers by 25. To do\nthis, you'll want to multiply the initial number by 4/100, which is the same\nas multiplying by 1/25 or dividing by 25.\n\n67/25 = 67*1/25 = 67*4/100 = 268/100 = 2.68 ( move the decimal 2 to \nthe left this time instead of 1)\n79/25 = 79*1/25 = 79*4/100 = 316/100 = 3.16\n\nNow you try a couple excersises and refresh the page for brand new ones.");
        jScrollPane1.setViewportView(dividelesson);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dividehome)
                .addGap(76, 76, 76)
                .addComponent(dividetitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dividehome)
                    .addComponent(dividetitle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
        );

        dividebutton.setText("Enter");
        dividebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(divideoutput))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(divideuans1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(dividebutton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(divideuans2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(divideq1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(divideq2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(divideq1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divideq2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divideuans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divideuans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(dividebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(divideoutput)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //allows users to navigate between pages
    private void dividehomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividehomeActionPerformed
        new titlepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dividehomeActionPerformed
    //displays the randomly generated questions
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        divideq1.setText(num1+" ÷ 5");
        divideq2.setText(num2+" ÷ "+25);
    }//GEN-LAST:event_formWindowActivated

    private void dividebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividebuttonActionPerformed
        String feedback = "";
       
        int numCorrect = 0;
        //receives the user's answers
        int uans1= Integer.parseInt(divideuans1.getText());
        int uans2= Integer.parseInt(divideuans2.getText());
        
        //determines how many answers the user got correct
        if (uans1 == ans1){
            numCorrect++;
        }
        if (uans2 == ans2){
            numCorrect++;
        }
        
        switch(numCorrect){//determines how well the user did based on how many answers they got correct
            case 0: feedback = "You scored 0%, try harder."; break;
            case 1: feedback = "You scored 50%, not bad!"; break;
            case 2: feedback = "You score 100%. Great job!"; break;
                
        }
        divideoutput.setText(feedback);//tells the user how well they did
    }//GEN-LAST:event_dividebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(dividepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dividepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dividepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dividepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dividepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividebutton;
    private javax.swing.JButton dividehome;
    private javax.swing.JTextArea dividelesson;
    private javax.swing.JLabel divideoutput;
    private javax.swing.JLabel divideq1;
    private javax.swing.JLabel divideq2;
    private javax.swing.JLabel dividetitle;
    private javax.swing.JTextField divideuans1;
    private javax.swing.JTextField divideuans2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}