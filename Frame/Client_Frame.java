/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Immeuble;

import Immeuble.Class.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LBC
 */
public class Client_Frame extends javax.swing.JFrame {
    private Client client;

    /**
     * Creates new form Client_Frame
     * @param client
     */
    public Client_Frame(Client client) {
        this.client = client;
        initComponents();
        jLabel50.setText(this.client.get_User_info()[1]);
        jLabel48.setText(this.client.get_User_info()[2]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Jbutton_Frame_Filtrer = new javax.swing.JButton();
        Jbutton_Frame_PrendreRDV = new javax.swing.JButton();
        Jbutton_Frame_EtatRDV = new javax.swing.JButton();
        jButton_deconnexion = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel_Acceuil = new javax.swing.JPanel();
        jPanel_EtatRDV = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_EtatRDV = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        Jbutton_Frame_AnnulerRDV = new javax.swing.JButton();
        jPanel_PrendreRDV = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_PrendreRDV = new javax.swing.JTable();
        field = new javax.swing.JTextField();
        Jbutton2_Frame_PrendreRDV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel_FiltrerPropriete = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Filtrer = new javax.swing.JTable();
        JCombo_categorie = new javax.swing.JComboBox();
        JCombo_region = new javax.swing.JComboBox();
        JCombo_zone = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel22.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("BIENVENUE SUR LA PAGE D'ACCUEIL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 720, 105));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jbutton_Frame_Filtrer.setFont(new java.awt.Font("Cambria", 3, 26)); // NOI18N
        Jbutton_Frame_Filtrer.setText("Filtrer");
        Jbutton_Frame_Filtrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_Frame_FiltrerActionPerformed(evt);
            }
        });
        jPanel4.add(Jbutton_Frame_Filtrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 205, 60));

        Jbutton_Frame_PrendreRDV.setFont(new java.awt.Font("Times New Roman", 3, 26)); // NOI18N
        Jbutton_Frame_PrendreRDV.setText("Prendre RDV");
        Jbutton_Frame_PrendreRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_Frame_PrendreRDVActionPerformed(evt);
            }
        });
        jPanel4.add(Jbutton_Frame_PrendreRDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 205, 60));

        Jbutton_Frame_EtatRDV.setFont(new java.awt.Font("Cambria", 3, 26)); // NOI18N
        Jbutton_Frame_EtatRDV.setText("Etat RDV");
        Jbutton_Frame_EtatRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_Frame_EtatRDVActionPerformed(evt);
            }
        });
        jPanel4.add(Jbutton_Frame_EtatRDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 205, 60));

        jButton_deconnexion.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jButton_deconnexion.setForeground(new java.awt.Color(255, 0, 0));
        jButton_deconnexion.setText("Déconnexion");
        jButton_deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deconnexionActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_deconnexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 189, 46));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Lastname");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, 30));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Firstname");
        jPanel4.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 90, 30));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Bonjour Mr");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 205, 540));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Acceuil.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel_AcceuilLayout = new javax.swing.GroupLayout(jPanel_Acceuil);
        jPanel_Acceuil.setLayout(jPanel_AcceuilLayout);
        jPanel_AcceuilLayout.setHorizontalGroup(
            jPanel_AcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel_AcceuilLayout.setVerticalGroup(
            jPanel_AcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel_Acceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 434));

        jPanel_EtatRDV.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_EtatRDV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_EtatRDV.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jTable_EtatRDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RDV_ID", "Propriété", "Rendez_vous", "Utilisateur", "Etat"
            }
        ));
        jTable_EtatRDV.setRowHeight(40);
        jScrollPane4.setViewportView(jTable_EtatRDV);

        jPanel_EtatRDV.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 720, 184));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vos Rendez-vous");
        jPanel_EtatRDV.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 13, 267, 41));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Annuler un rendez-vous");
        jPanel_EtatRDV.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 296, 160, 20));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("ID RDV");
        jPanel_EtatRDV.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 60, 30));
        jPanel_EtatRDV.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 90, 30));

        Jbutton_Frame_AnnulerRDV.setText("OK");
        Jbutton_Frame_AnnulerRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton_Frame_AnnulerRDVActionPerformed(evt);
            }
        });
        jPanel_EtatRDV.add(Jbutton_Frame_AnnulerRDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 80, -1));

        jPanel1.add(jPanel_EtatRDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 434));

        jPanel_PrendreRDV.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_PrendreRDV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_PrendreRDV.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jTable_PrendreRDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Propriété", "Catégorie", "Zone", "Surface", "Chambre", "Toilettes", "Cuisine", "Salon", "Type", "Prix"
            }
        ));
        jTable_PrendreRDV.setRowHeight(40);
        jScrollPane1.setViewportView(jTable_PrendreRDV);

        jPanel_PrendreRDV.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 321));
        jPanel_PrendreRDV.add(field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 90, 30));

        Jbutton2_Frame_PrendreRDV.setText("OK");
        Jbutton2_Frame_PrendreRDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbutton2_Frame_PrendreRDVActionPerformed(evt);
            }
        });
        jPanel_PrendreRDV.add(Jbutton2_Frame_PrendreRDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 80, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prendre RDV");
        jPanel_PrendreRDV.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 156, 15));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("ID Propriété");
        jPanel_PrendreRDV.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 30));

        jPanel1.add(jPanel_PrendreRDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 430));

        jPanel_FiltrerPropriete.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_FiltrerPropriete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Catégorie");
        jPanel_FiltrerPropriete.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Région");
        jPanel_FiltrerPropriete.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 13, -1, 16));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Zone");
        jPanel_FiltrerPropriete.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 14, -1, -1));

        jTable_Filtrer.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jTable_Filtrer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Propriete", "Catégorie", "Région", "Zone", "Chambre(s)", "Toilette(s)", "Cuisine(s)", "Salon(s)", "Type", "Prix"
            }
        ));
        jTable_Filtrer.setRowHeight(40);
        jScrollPane3.setViewportView(jTable_Filtrer);

        jPanel_FiltrerPropriete.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 710, 329));

        JCombo_categorie.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        JCombo_categorie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Location", "Vente" }));
        JCombo_categorie.setSelectedIndex(-1);
        JCombo_categorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_categorieActionPerformed(evt);
            }
        });
        jPanel_FiltrerPropriete.add(JCombo_categorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 38, 108, 30));

        JCombo_region.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        JCombo_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_regionActionPerformed(evt);
            }
        });
        jPanel_FiltrerPropriete.add(JCombo_region, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 102, 30));

        JCombo_zone.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        JCombo_zone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        JCombo_zone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCombo_zoneActionPerformed(evt);
            }
        });
        jPanel_FiltrerPropriete.add(JCombo_zone, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 38, 96, 30));

        jPanel1.add(jPanel_FiltrerPropriete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 720, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Méthode qui permet de modéliser une table en fonction d'une requête donnée
    private void Jtable_Modelisation(JTable jtable,String colonne[],String requete){
        Connection co1;
        Statement st1;
        ResultSet rs1;
        
        DefaultTableModel dtm = new DefaultTableModel();
        Object object[] = new Object[colonne.length];
        for (int i = 0; i < colonne.length; i++) {
            dtm.addColumn(colonne[i]);
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            co1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/immeuble?characterEncoding=latin1&useConfigs=maxPerformance","root","root");
            st1 = co1.createStatement();
            rs1 = st1.executeQuery(requete);
            while(rs1.next()){
                for (int i = 0; i < colonne.length; i++) {
                    object[i] = rs1.getObject(i+1);
                }
                dtm.addRow(object);
            }
            
        }catch (Exception e)
        {            
        }
        jtable.setModel(dtm);//on recupere ce qu'on a dans la table
    }
    
    //Méthode qui permet de recupérer les données de la table rendez-vous de l'objet client
    private void Jtable_RDV_EtatData(){
        int id_client = new Integer(client.get_User_info()[0]);
        String colonne[] = new String[]{"RDV_ID","Propriété","Type","Catégorie","Etat"};
        String requete = "SELECT RDV_ID,propriete_id, type, categorie, etat FROM rendez_vous JOIN propriete USING(propriete_id) where user_id = "+id_client+"";
        Jtable_Modelisation(jTable_EtatRDV, colonne, requete);
    }
    
    //Méthode qui permet de recupérer les données de la table propriété où les propriétés sont disponibles
    private void Jtable_Prendre_RDVData(){
        String colonne[] = new String[]{"ID","Catégorie","Surface","Zone","Chambre(s)","Toilette(s)",
            "Cuisine(s)","Salon(s)","Type","Prix"};
        String requete = "SELECT propriete_id, categorie,propriete.surface, zone.zone_name,nbre_chambre, nbre_toilette, nbre_cuisine," +
                    "nbre_salon, type, prix FROM propriete JOIN zone USING(zone_id) WHERE disponibilite_propriete = '1'";
        Jtable_Modelisation(jTable_PrendreRDV, colonne, requete);
    }
    
    //Méthode qui permet d'afficher toutes les propriétés
    private void Jtable_FiltrerData(){
        String colonne[] = new String[]{"ID","Catégorie","Surface","Region","Zone","Chambre(s)","Toilette(s)",
            "Cuisine(s)","Salon(s)","Type","Prix"};
        String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface,region.region_name, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id)";
        Jtable_Modelisation(jTable_Filtrer, colonne, requete);
    }
    
    //Méthode qui met le nom des régions disponible dans un liste de combo déroulante
    private void get_RegionName(JComboBox jcombo){
        Region region = new Region();
        String region_name[] = region.get_Regions_Names();
        for (int i = 0; i < region_name.length; i++) {
            jcombo.addItem(region_name[i]);
        }
        jcombo.setModel(new DefaultComboBoxModel(region_name));
}
    
    //Méthode qui met le nom des zones d'une région donnée dans un liste de combo déroulantes
    private void get_ZoneName(String Region_name,JComboBox jcombo){
        Zone zone = new Zone();
        String zone_name[] = zone.get_Zones_Names(Region_name);
        for(int i = 0; i < zone_name.length; i++) {
           jcombo.addItem(zone_name[i]);
        }     
        jcombo.setModel(new DefaultComboBoxModel(zone_name));       
}
    
    //Méthode qui initialise les tables de données
    private void initialize_Table(){
        Jtable_RDV_EtatData();
        Jtable_Prendre_RDVData(); 
        Jtable_FiltrerData();
    }
    
    //Méthode qui initialise les panels à l'écran d'acceuil
    private void initialize_Panel(){
        jPanel_EtatRDV.setVisible(false);
        jPanel_PrendreRDV.setVisible(false);
        jPanel_FiltrerPropriete.setVisible(false);       
        jPanel_Acceuil.setVisible(true);
    }
    
    private void jButton_deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deconnexionActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Se déconnecter ?", "CONFIRMATION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            new Connexion().setVisible(true);
            this.dispose();
        }
        jPanel2.setVisible(true);        
        
    }//GEN-LAST:event_jButton_deconnexionActionPerformed

    private void Jbutton_Frame_FiltrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_Frame_FiltrerActionPerformed
        // TODO add your handling code here:
        
        JCombo_categorie.setSelectedIndex(-1);
        JCombo_zone.setSelectedIndex(-1);
        JCombo_region.setSelectedIndex(-1);
        jPanel_FiltrerPropriete.setVisible(true);
        jPanel_EtatRDV.setVisible(false);
        jPanel_PrendreRDV.setVisible(false);
        jPanel_Acceuil.setVisible(false);
        Jtable_FiltrerData();
    }//GEN-LAST:event_Jbutton_Frame_FiltrerActionPerformed
      
    private void Jbutton_Frame_EtatRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_Frame_EtatRDVActionPerformed
        // TODO add your handling code here:
        jPanel_EtatRDV.setVisible(true);
        jPanel_FiltrerPropriete.setVisible(false);
        jPanel_PrendreRDV.setVisible(false);
        jPanel_Acceuil.setVisible(false);
    }//GEN-LAST:event_Jbutton_Frame_EtatRDVActionPerformed
   
    private void Jbutton_Frame_PrendreRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_Frame_PrendreRDVActionPerformed
        // TODO add your handling code here:
        jPanel_PrendreRDV.setVisible(true);
        jPanel_EtatRDV.setVisible(false);
        jPanel_FiltrerPropriete.setVisible(false);
        jPanel_Acceuil.setVisible(false);
    }//GEN-LAST:event_Jbutton_Frame_PrendreRDVActionPerformed

    private void Panel_EtatRDV(){
        jPanel_EtatRDV.setVisible(true);
        jTable_EtatRDV.setVisible(true);
        jPanel_FiltrerPropriete.setVisible(false);
        jPanel_PrendreRDV.setVisible(false);
    }
    private void Jbutton2_Frame_PrendreRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton2_Frame_PrendreRDVActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Voulez-vous valider ce rendez-vous ?", "CONFIRMATION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION
                &&
                client.Valider_RDV(new Integer(field.getText())) == true ) {
            JOptionPane.showMessageDialog(null, "Rendez-vous pris");
            Jtable_RDV_EtatData();
            field.setText("");
            Panel_EtatRDV();
        } else {
            JOptionPane.showMessageDialog(null, "Rendez-vous non pris");
        }                   
                     
    }//GEN-LAST:event_Jbutton2_Frame_PrendreRDVActionPerformed
    
    //Méthode qui filtre en fonction de la zone
    private void JCombo_zoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_zoneActionPerformed
        // TODO add your handling code here:       
        String zone_global = (String)JCombo_zone.getSelectedItem();
        String categorie_global = (String)JCombo_categorie.getSelectedItem();
        String region_global = (String)JCombo_region.getSelectedItem();
                
        String colonne[] = new String[]{"ID","Catégorie","Surface","Zone","Chambre(s)","Toilette(s)",
            "Cuisine(s)","Salon(s)","Type","Prix"};
             
        if(categorie_global != null && region_global != null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"' AND region_name= '"+region_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);               
        }

        else if(categorie_global == null && region_global != null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE region_name= '"+region_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);    
        }
                        
        else if(categorie_global != null && region_global == null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete); 
        }
            
        else if(categorie_global == null && region_global == null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete); 
        }        
    }//GEN-LAST:event_JCombo_zoneActionPerformed

    //Méthode qui filtre en fonction de la catégorie
    private void JCombo_categorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_categorieActionPerformed
        // TODO add your handling code here:
        
        String categorie_global = (String)JCombo_categorie.getSelectedItem();
        String zone_global = (String)JCombo_zone.getSelectedItem();
        String region_global = (String)JCombo_region.getSelectedItem();
       
        String colonne[] = new String[]{"ID","Catégorie","Surface","Zone","Chambre(s)","Toilette(s)",
            "Cuisine(s)","Salon(s)","Type","Prix"};            
        
        if(region_global != null && zone_global != null)
        {             
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"' AND region_name = '"+region_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);   
        }
        else if(region_global == null && zone_global != null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }
        else if(zone_global == null && region_global != null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"' AND region_name = '"+region_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }
        else if(region_global == null && zone_global == null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }        
    }//GEN-LAST:event_JCombo_categorieActionPerformed

    //Méthode qui filtre en fonction de la région
    private void JCombo_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCombo_regionActionPerformed
        // TODO add your handling code here:
        String region_global = (String)JCombo_region.getSelectedItem();   
        get_ZoneName(region_global,JCombo_zone);
        
        String zone_global = (String)JCombo_zone.getSelectedItem();
        String categorie_global = (String)JCombo_categorie.getSelectedItem();
        
        String colonne[] = new String[]{"ID","Catégorie","Surface","Zone","Chambre(s)","Toilette(s)",
            "Cuisine(s)","Salon(s)","Type","Prix"};  
            
        if(categorie_global != null && zone_global != null)
        {              
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie = '"+categorie_global+"' AND region_name= '"+region_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }
        else if (categorie_global == null && zone_global != null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE region_name= '"+region_global+"' AND zone_name = '"+zone_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }
        else if (categorie_global != null && zone_global == null)
        {                
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE categorie ='"+categorie_global+"' AND region_name= '"+region_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }
        else if(categorie_global == null && zone_global == null)
        {
            String requete = "SELECT propriete.propriete_id, propriete.categorie,propriete.surface, zone.zone_name, nbre_chambre, nbre_toilette, nbre_cuisine," +
                "nbre_salon, type, prix FROM propriete JOIN zone using(zone_id) JOIN region USING(region_id) WHERE region_name= '"+region_global+"'";
            Jtable_Modelisation(jTable_Filtrer, colonne, requete);
        }

    }//GEN-LAST:event_JCombo_regionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setResizable(false);
        initialize_Panel();
        initialize_Table();
        get_RegionName(JCombo_region);
        
    }//GEN-LAST:event_formWindowOpened

    private void Jbutton_Frame_AnnulerRDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbutton_Frame_AnnulerRDVActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Voulez-vous annuler ce rendez-vous ?", "CONFIRMATION", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION
            &&
            client.Annuler_RDV(new Integer(jTextField18.getText())) == true ) {
            JOptionPane.showMessageDialog(null, "Rendez-vous annulé");
            Jtable_RDV_EtatData();
            jTextField18.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Rendez-vous non annulé");
        }
    }//GEN-LAST:event_Jbutton_Frame_AnnulerRDVActionPerformed

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
            java.util.logging.Logger.getLogger(Client_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_Frame(new Client()).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JCombo_categorie;
    private javax.swing.JComboBox JCombo_region;
    private javax.swing.JComboBox JCombo_zone;
    private javax.swing.JButton Jbutton2_Frame_PrendreRDV;
    private javax.swing.JButton Jbutton_Frame_AnnulerRDV;
    private javax.swing.JButton Jbutton_Frame_EtatRDV;
    private javax.swing.JButton Jbutton_Frame_Filtrer;
    private javax.swing.JButton Jbutton_Frame_PrendreRDV;
    private javax.swing.JTextField field;
    private javax.swing.JButton jButton_deconnexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_Acceuil;
    private javax.swing.JPanel jPanel_EtatRDV;
    private javax.swing.JPanel jPanel_FiltrerPropriete;
    private javax.swing.JPanel jPanel_PrendreRDV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable_EtatRDV;
    private javax.swing.JTable jTable_Filtrer;
    private javax.swing.JTable jTable_PrendreRDV;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}
