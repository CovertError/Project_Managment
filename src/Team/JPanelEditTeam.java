package Team;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Users.JPanelUserMenu;
import main.DatabaseCon;
import main.JPanelMenu;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class JPanelEditTeam extends javax.swing.JPanel {

    /**
     * Creates new form Projects.JPanelCreateProject
     */
    public JPanelEditTeam(JFrame jframe) {
        DatabaseCon db = new DatabaseCon();
        this.myCon = db.getConnection();
        this.jframe = jframe;
        initComponents();
    }

    public JFrame jframe;
    public Connection myCon;

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Cyber AgoraSymbol.png")); // NOI18N

        jList1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DefaultListModel model = new DefaultListModel();
        addItemsToList(model);
        jList1.setModel(model);
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()){
                    JList source = (JList)event.getSource();
                    String selected = source.getSelectedValue().toString();
                    try {
                        jTextField3.setText(selected);
                        Statement stmt  = myCon.createStatement();
                        String getAllUserInfoSQL = "SELECT * " +
                                "FROM teams WHERE teamName='"+selected+"'";
                        ResultSet getAllUserInfors = stmt.executeQuery(getAllUserInfoSQL);
                        while (getAllUserInfors.next()) {
                            String leadMember = getAllUserInfors.getString("leadMember");
                            leadMember = getMemberName(Integer.parseInt(leadMember));
                            jTextField2.setText(leadMember);
                            String firstMember = getAllUserInfors.getString("firstMember");
                            firstMember = getMemberName(Integer.parseInt(firstMember));
                            jTextField1.setText(firstMember);
                            String secondMember = getAllUserInfors.getString("secondMember");
                            secondMember = getMemberName(Integer.parseInt(secondMember));
                            jTextField4.setText(secondMember);
                            String thirdMember = getAllUserInfors.getString("thirdMember");
                            thirdMember = getMemberName(Integer.parseInt(thirdMember));
                            jTextField5.setText(thirdMember);
                            String forthMember = getAllUserInfors.getString("forthMember");
                            forthMember = getMemberName(Integer.parseInt(forthMember));
                            jTextField6.setText(forthMember);
                            getAllUserInfors.close();
                            stmt.close();
                        }

                    }catch (Exception e){}
                }
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Save Edits");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("firstMember:");



        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Team Name:");


        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("thirdMember:");




        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("leadMember:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("forthMember:");


        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("secondMember:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 1102, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(229, 229, 229)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(5, 5, 5)
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(12, 12, 12))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(24, 24, 24)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(78, 78, 78)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39))
        );
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String teamName = jTextField3.getText();
        try {
            String sqlUpdate = "UPDATE teams SET teamName = ?,leadMember = ?,firstMember = ?,secondMember = ?,thirdMember = ?,forthMember = ? WHERE teamName = ?";
            PreparedStatement preparedStatement = myCon.prepareStatement(sqlUpdate,
                    Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, teamName);
            preparedStatement.setString(7, teamName);
            int counter = 2;
            ArrayList<String> myArray = new ArrayList<>();
            String leadMember = jTextField2.getText();
            myArray.add(leadMember);
            String firstMember = jTextField1.getText();
            myArray.add(firstMember);
            String secondMember = jTextField4.getText();
            myArray.add(secondMember);
            String thirdMember = jTextField5.getText();
            myArray.add(thirdMember);
            String forthMember = jTextField6.getText();
            myArray.add(forthMember);
            for (String element : myArray) {
                String findPosistionIDSQL = "SELECT * FROM members WHERE memberName='"+element+"'";
                Statement stmt  = myCon.createStatement();
                ResultSet rs    = stmt.executeQuery(findPosistionIDSQL);
                while (rs.next()) {
                    int id=rs.getInt("id");
                    if (counter != 5){
                        preparedStatement.setInt(counter,id);
                        counter++;
                    }else{
                        break;
                    }
                }
            }
            while (counter != 7) {
                preparedStatement.setNull(counter, java.sql.Types.INTEGER);
                counter++;
            }
            int rowAffected = preparedStatement.executeUpdate();
            JPanelMenu jPanelMenu = new JPanelMenu(this.jframe);
            this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            width = width / 6;
            int intWidth = (int) Math.round(width);
            double height = screenSize.getHeight();
            height = height / 6;
            int intheight = (int) Math.round(height);
            this.jframe.setLocation(intWidth, intheight);
            Container contain = this.jframe.getContentPane();
            contain.removeAll();
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            this.jframe.add(jPanelMenu);
            this.jframe.validate();
            this.jframe.repaint();
            this.jframe.pack();
            this.jframe.setVisible(true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void addItemsToList(DefaultListModel model ){
        try {
            String findPosistionIDSQL = "SELECT * FROM teams";
            Statement stmt = myCon.createStatement();
            ResultSet rs = stmt.executeQuery(findPosistionIDSQL);
            while (rs.next()) {
                model.addElement(rs.getString("teamName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public String getMemberName(int id) {
        String getPosistionNameSQL = "SELECT * FROM members WHERE id='" + id + "'";
        Statement rsstmt = null;
        String memberName = null;
        try {
            rsstmt = myCon.createStatement();
            ResultSet rs = rsstmt.executeQuery(getPosistionNameSQL);
            while (rs.next()) {
                memberName = rs.getString("memberName");
                rs.close();
                rsstmt.close();
            }
        } catch (SQLException e) {

        }
        return memberName;
    }



    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
}
