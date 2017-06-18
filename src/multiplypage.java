
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eljam3239
 */
public class multiplypage extends javax.swing.JFrame {
    
    Random rand = new Random();
    
    
    int[] trick = new int[11];//creates an array with 11 spots for integers to be stored
    int numa;
    int num1 = rand.nextInt(89)+10;//for trick 1, determines a number to multiply by 11
    
    int randomindex = rand.nextInt(10);
    int num2 = populate(randomindex);//for trick 2, calls the populate method to receive a pseudo random double digit number ending in 5
    
    int digit1n1 = rand.nextInt(10);//determines a random digit for the 1s unit in a double-digit number
    int digit2n2 = 10-digit1n1;//determines the other 1s digit's complimentary (number that adds to 10)
    int tens = rand.nextInt(10)*10; //determines what shared 10s unit will be aded to the single digits
    int num3 = tens+digit1n1;//for trick 3 which two numbers begin with the same number and whose second digits add to 10
    int num4 = tens+digit2n2;//for trick 3
    
    
    //determines what the correct answers are
    int ans1 = num1*11;
    int ans2 = num2*num2;
    int ans3 = num3*num4;
    
    
    /**
     * Creates new form multiply page
     */
    public multiplypage() {
        initComponents();
    }
    //a method that populates a 10 index array with random double-digit numbers ending in 5 
    public int populate(int randomindex){
        for (int i =0; i<=10;i++){
        
        trick[i]=(5)+10*i;
        numa = trick[randomindex];
        
        
        }return numa;
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
        timeshome = new javax.swing.JButton();
        timestitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        timesq1 = new javax.swing.JLabel();
        timesq2 = new javax.swing.JLabel();
        timesq3 = new javax.swing.JLabel();
        timesuans1 = new javax.swing.JTextField();
        timesuans2 = new javax.swing.JTextField();
        timesuans3 = new javax.swing.JTextField();
        timesenter = new javax.swing.JButton();
        timesoutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 83, 61));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 83, 61));

        timeshome.setText("<--Home");
        timeshome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeshomeActionPerformed(evt);
            }
        });

        timestitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        timestitle.setForeground(new java.awt.Color(255, 255, 255));
        timestitle.setText("Mental Multiplication");

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 83, 61));
        jTextArea1.setRows(5);
        jTextArea1.setText("Multiplying two terms on the fly is extremely impressive and will\ndefinitely impress your audiences, but it can also be quite difficult\nbecause you have to recognize certaing indicators so you know what\ntrick to use. \n\nTrick 1: When multiplying any twoor more digit number, simply leave\nthe beginning and end the same and insert the sum of those two \nin the center, like this:\n\n23*11=251 ~ 2 at the start, 3 at the end and 5(2+3) in the middle.\nIf the sum of the first and last digit is 10 or greater, simply carry the 1\nto the first digit, like this:\n\n38*11=418 ~ 3 at start, 11 in middle(carry the one, 3 becomes 4), 8 last\n\nTrick 2: To square any 2-digit number ending in 5, simply take the 'tens'\ndigit, multiply it by whaterver number is 1 more than it, then append 25 to\nthe product, like this:\n\n65x65 ~ first do 6x7=42, then add a 25 to the end\n65x65 = 4225\n\n25x25 ~ first do 2x3=6, then add a 25 to the end\n25x25 = 625\n\nTrick 3: If you're multilying two 2-digit numbers, and you notice that they \nbegin with the same number and their second digits sum to 10, like 88x82,\nthen use the same methos as in trick #2. Multiply the first digit by the \nnumber 1 more than itself, then append the product of the second digits at \nthe end, like this:\n34x36 ~both begin with three and 3+7 = 10\n33x37~3x4(1 more than the first digit) = 12, 3x7 =21\n34x36 = 1221\n\nNow you try and be sure to preactice lots!");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeshome)
                        .addGap(89, 89, 89)
                        .addComponent(timestitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeshome)
                    .addComponent(timestitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        timesenter.setText("Enter");
        timesenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesenterActionPerformed(evt);
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
                .addGap(77, 77, 77)
                .addComponent(timesq1)
                .addGap(139, 139, 139)
                .addComponent(timesq2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timesq3)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(timesoutput)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(timesuans1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timesenter)
                    .addComponent(timesuans2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timesuans3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timesq1)
                    .addComponent(timesq2)
                    .addComponent(timesq3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timesuans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesuans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesuans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(timesenter)
                .addGap(33, 33, 33)
                .addComponent(timesoutput)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //allows users to travel between panels
    private void timeshomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeshomeActionPerformed
        new titlepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_timeshomeActionPerformed

    private void timesenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesenterActionPerformed
        String feedback = "";
        String bonus="";
        int numCorrect = 0;
        //determines what the user's inputted answers are
        int uans1= Integer.parseInt(timesuans1.getText());
        int uans2= Integer.parseInt(timesuans2.getText());
        int uans3= Integer.parseInt(timesuans3.getText());
        //determines how many questions the user got right
        if (uans1 == ans1){
            numCorrect++;
        }
        if (uans2 == ans2){
            numCorrect++;
        }
        if (uans3 == ans3){
            numCorrect++;
        }
        
        
        switch(numCorrect){//determines how well the user did based on their number of correct answers
            case 0: feedback = "You scored 0%, try harder."; break;
            case 1: feedback = "You scored 33%, I know you can do better!"; break;
            case 2: feedback = "You score 66%. Great!"; break;
            case 3: feedback = "You scored 100%, nice one genius!"; break;    
        }
        timesoutput.setText(feedback);//tells the user how well they did
    }//GEN-LAST:event_timesenterActionPerformed
    //shows the user what the randomly generated questions are
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        timesq1.setText(num1+" x 11");
        timesq2.setText(num2+" x "+num2);
        timesq3.setText(num3+" x "+num4);
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(multiplypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(multiplypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(multiplypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(multiplypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new multiplypage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton timesenter;
    private javax.swing.JButton timeshome;
    private javax.swing.JLabel timesoutput;
    private javax.swing.JLabel timesq1;
    private javax.swing.JLabel timesq2;
    private javax.swing.JLabel timesq3;
    private javax.swing.JLabel timestitle;
    private javax.swing.JTextField timesuans1;
    private javax.swing.JTextField timesuans2;
    private javax.swing.JTextField timesuans3;
    // End of variables declaration//GEN-END:variables
}