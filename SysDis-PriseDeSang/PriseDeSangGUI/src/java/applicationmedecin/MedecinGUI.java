package applicationmedecin;

import static applicationmedecin.ConnectionGUI.getMySessionBean;
import ejb.MySessionBeanRemote;
import javax.ejb.EJB;
import javax.swing.DefaultListModel;

public class MedecinGUI extends javax.swing.JFrame {

       
    private DefaultListModel modeleList = new DefaultListModel();
    private String NomSelected = null;
    String[] boxes = new String[8];

    //<editor-fold defaultstate="collapsed" desc=" Getter / Setter ">
    public DefaultListModel getModeleList() {
        return modeleList;
    }

    public void setModeleList(DefaultListModel modeleList) {
        this.modeleList = modeleList;
    }

    public String getNomSelected() {
        return NomSelected;
    }

    public void setNomSelected(String NomSelected) {
        this.NomSelected = NomSelected;
    }
    //</editor-fold >
    
    public MedecinGUI() {
        initComponents();
        
        String Patient = getMySessionBean().RecupererPatient();
        System.out.println(Patient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAjouter = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CheckHematocrite = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        CheckVGM = new javax.swing.JCheckBox();
        CheckCCMH = new javax.swing.JCheckBox();
        CheckTCMH = new javax.swing.JCheckBox();
        CheckRDW = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ButtonEnvoyer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListPatient = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextNom = new javax.swing.JTextField();
        CheckLeucocytes = new javax.swing.JCheckBox();
        TextPrenom = new javax.swing.JTextField();
        CheckHematies = new javax.swing.JCheckBox();
        CheckHemoglobine = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonAjouter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAjouter.setForeground(new java.awt.Color(0, 153, 204));
        ButtonAjouter.setText("Ajouter");
        ButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAjouterActionPerformed(evt);
            }
        });

        CheckHematocrite.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckHematocrite.setText("Hématocrite");
        CheckHematocrite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        CheckVGM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckVGM.setText("V.G.M");
        CheckVGM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        CheckCCMH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckCCMH.setText("C.C.M.H");
        CheckCCMH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        CheckTCMH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckTCMH.setText("T.C.M.H");
        CheckTCMH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        CheckRDW.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckRDW.setText("RDW");
        CheckRDW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText(". . . . . .  5.300 /mm3                  4.000 à 10.000");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText(". . . . . .  4.730.000 /mm3          4200000 à 5800000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText(". . . . . .  14,3 g%                            13,0 à 18,0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText(". . . . . .  42,8 %                              40,0 à 54,0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText(". . . . . .  90 u3                                 80 à 100");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText(". . . . . .  33,4 %                              32,0 à 36,0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText(". . . . . .  30,2 uug                            26,0 à 33,0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText(". . . . . .  13,5 %                                inf. à 15,0");

        ButtonEnvoyer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonEnvoyer.setForeground(new java.awt.Color(153, 102, 255));
        ButtonEnvoyer.setText("Envoyer");
        ButtonEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnvoyerActionPerformed(evt);
            }
        });

        ListPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListPatient);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Nom:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Choisir un patient:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Prénom:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Choisir les analyses:");

        TextNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextNom.setForeground(new java.awt.Color(204, 0, 204));

        CheckLeucocytes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckLeucocytes.setText("Leucocytes");
        CheckLeucocytes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        TextPrenom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextPrenom.setForeground(new java.awt.Color(204, 0, 204));

        CheckHematies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckHematies.setText("Hématies");
        CheckHematies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        CheckHemoglobine.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CheckHemoglobine.setText("Hémoglobine");
        CheckHemoglobine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckLeucocytesCheckTCMHMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(ButtonAjouter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CheckLeucocytes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CheckHematies)
                                        .addComponent(CheckHemoglobine)
                                        .addComponent(CheckHematocrite)
                                        .addComponent(CheckVGM)
                                        .addComponent(CheckCCMH))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(CheckTCMH))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CheckRDW)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(ButtonEnvoyer)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckLeucocytes)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckHematies)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckHemoglobine)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckHematocrite)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckVGM)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckCCMH)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckTCMH)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckRDW)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEnvoyer))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAjouter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAjouterActionPerformed

//        mySessionBean.AjouterPatient(TextNom.getText(), TextPrenom.getText());
//
//        RecupererPatients();

    }//GEN-LAST:event_ButtonAjouterActionPerformed

    private void ButtonEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnvoyerActionPerformed
        // TODO add your handling code here:

        // JMS + faire passer le nom du patient ainsi que les analyses
        
        getMySessionBean().DemandeAnalyse(NomSelected, boxes);
    }//GEN-LAST:event_ButtonEnvoyerActionPerformed

    private void ListPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListPatientMouseClicked
        setNomSelected(ListPatient.getSelectedValue().toString()); // Récupérer le patient séléctionné
    }//GEN-LAST:event_ListPatientMouseClicked

    //<editor-fold defaultstate="collapsed" desc=" Check Analyse TRUE / FALSE ">
    private void CheckLeucocytesCheckTCMHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckLeucocytesCheckTCMHMouseClicked
        // TODO add your handling code here:
        
        /* CheckLeucocytes */
        if(CheckLeucocytes.isSelected())
            boxes[0] = CheckLeucocytes.getText(); 
        else
        {
            if(CheckLeucocytes.isSelected() == false)
                boxes[0] = null;
        }
        
        /* CheckHematies */
        if(CheckHematies.isSelected())
            boxes[1] = CheckHematies.getText(); 
        else
        {
            if(CheckHematies.isSelected() == false)
                boxes[1] = null;
        }
        
        /* CheckHemoglobine */
        if( CheckHemoglobine.isSelected())
            boxes[2] = CheckHemoglobine.getText(); 
        else
        {
            if(CheckHemoglobine.isSelected() == false)
                boxes[2] = null;
        }
        
        /* CheckHematocrite */
        if( CheckHematocrite.isSelected())
            boxes[3] = CheckHematocrite.getText(); 
        else
        {
            if(CheckHematocrite.isSelected() == false)
                boxes[3] = null;
        }
        
        /* CheckVGM */
        if(CheckVGM.isSelected())
            boxes[4] = CheckVGM.getText(); 
        else
        {
            if(CheckVGM.isSelected() == false)
                boxes[4] = null;
        }
        
        /* CheckCCMH */
        if( CheckCCMH.isSelected())
            boxes[5] = CheckCCMH.getText(); 
        else
        {
            if(CheckCCMH.isSelected() == false)
                boxes[5] = null;
        }    
        
        /* CheckTCMH */
        if(CheckTCMH.isSelected())
            boxes[6] = CheckTCMH.getText(); 
        else
        {
            if(CheckTCMH.isSelected() == false)
                boxes[6] = null;
        }       
        
        /* CheckRDW */
        if(CheckRDW.isSelected())
            boxes[7] = CheckRDW.getText(); 
        else
        {
            if(CheckRDW.isSelected() == false)
                boxes[7] = null;
        }      

        for(int i=0; i < boxes.length; i++)
            System.out.println("boxes " + i + ": " + boxes[i]);

    }//GEN-LAST:event_CheckLeucocytesCheckTCMHMouseClicked
    //</editor-fold >
    
    /* @param args the command line arguments */
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
            java.util.logging.Logger.getLogger(MedecinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedecinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedecinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedecinGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedecinGUI().setVisible(true);
            }
        });
    }

    public void RecupererPatients()
    {
        //SupprimerPatient();
        
//        String Patient = mySessionBean.RecupererPatient();
//        System.out.println(Patient);
    }
    
    public void SupprimerPatient()
    {
        getModeleList().clear();
        ListPatient.setModel(getModeleList());
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjouter;
    private javax.swing.JButton ButtonEnvoyer;
    private javax.swing.JCheckBox CheckCCMH;
    private javax.swing.JCheckBox CheckHematies;
    private javax.swing.JCheckBox CheckHematocrite;
    private javax.swing.JCheckBox CheckHemoglobine;
    private javax.swing.JCheckBox CheckLeucocytes;
    private javax.swing.JCheckBox CheckRDW;
    private javax.swing.JCheckBox CheckTCMH;
    private javax.swing.JCheckBox CheckVGM;
    private javax.swing.JList<String> ListPatient;
    private javax.swing.JTextField TextNom;
    private javax.swing.JTextField TextPrenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
