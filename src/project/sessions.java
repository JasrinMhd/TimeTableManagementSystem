package project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;
/**
 *
 * 
 */
public class sessions extends javax.swing.JFrame {

    private boolean True;

    private static final String username = "root";
    private static final String password = "";
    private static final String dataConn = "jdbc:mysql://localhost:3306/timetablesystem";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form NewJFrame
     */
    public sessions() {
        initComponents();
        displaytable();
        lecCombobox();
        tagCombobox();
        subCombobox();
        
        roomComboBox();
      
        table_update();
        lectureCombo();
        groupCombo();
        subGroupCombo();
        sessionIDCombo();
        
        
        DisplayConsecutiveSession();
        DisplayNonOverlapSession();
        DisplayParallelSession();
        
        updateConsecutiveCombo1();
        updateConsecutiveCombo2();
        updateNonCombo1();
        updateNonCombo2();
        updateNonCombo3();
        updateParallelCombo1();
        updateParallelCombo2();
        updateParallelCombo3();
        
        DisplaySelectedConsecutiveSession();
        DisplaySelectedNonOverlapSession();
        DisplaySelectedParallelSession();
        
        clearDatainaAlltextFields();
        
    }

    //---display sessions table in consecutive , non-overlap , parallel sides
    
    private void DisplayConsecutiveSession(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            consecutiveTable.setModel(DbUtils.resultSetToTableModel(rs));
                        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void DisplayNonOverlapSession(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            nonOverlapTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void DisplayParallelSession(){
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            parallelTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    

// display all sesion id in combo boxes in consecutive , non overlap and parallel session sides
    
    private void  updateConsecutiveCombo1(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                ConseCombo1.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateConsecutiveCombo2(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                ConseCombo2.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateNonCombo1(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                nonCombo1.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateNonCombo2(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                nonCombo2.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateNonCombo3(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                nonCombo3.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateParallelCombo1(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                parallelCombo1.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateParallelCombo2(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                parallelCombo2.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    private void  updateParallelCombo3(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                parallelCombo3.addItem(rs.getString("id"));
            }
       }catch(Exception e){
        }
    }
    
    private void DisplaySelectedConsecutiveSession(){
        
     // displaying Consecutive Session details
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from consecutivesessions";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            conseSessionShowTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void DisplaySelectedNonOverlapSession(){
        
        // displaying Consecutive Session details
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from nonoverlappingsessions";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            NonSessionShowTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void DisplaySelectedParallelSession(){
        
        // displaying Consecutive Session details
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from parallelsessions";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            ParallelSessionShowTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearDatainaAlltextFields(){
        
        // displaying Consecutive Session details
        
        try{
            selectedconse1.setText("");
            selectedconse2.setText("");
            
            selectedNon1.setText("");
            selectedNon2.setText("");
            selectedNon3.setText("");
            
           selectedParallel1.setText("");
           selectedParallel2.setText("");
           selectedParallel3.setText("");
           
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        nb = new javax.swing.JPanel();
        WDH = new javax.swing.JButton();
        lecture = new javax.swing.JButton();
        student = new javax.swing.JButton();
        subject = new javax.swing.JButton();
        tag = new javax.swing.JButton();
        session = new javax.swing.JButton();
        location = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        stat = new javax.swing.JButton();
        heading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        logoLab = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        contnt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLecture = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSubject = new javax.swing.JComboBox<>();
        jTag = new javax.swing.JComboBox<>();
        jGroup = new javax.swing.JComboBox<>();
        jNoStud = new javax.swing.JTextField();
        jDura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSession = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLecture2 = new javax.swing.JComboBox<>();
        contnt1 = new javax.swing.JPanel();
        id1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        consecutiveTable = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ConseCombo1 = new javax.swing.JComboBox<>();
        selectedconse1 = new javax.swing.JTextField();
        refresh1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        ConseCombo2 = new javax.swing.JComboBox<>();
        selectedconse2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        conseSessionShowTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        errorMsg1 = new javax.swing.JLabel();
        contnt2 = new javax.swing.JPanel();
        id2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        nonOverlapTable = new javax.swing.JTable();
        refresh2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        nonCombo1 = new javax.swing.JComboBox<>();
        selectedNon1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        nonCombo2 = new javax.swing.JComboBox<>();
        selectedNon2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        nonCombo3 = new javax.swing.JComboBox<>();
        selectedNon3 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        NonSessionShowTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        errorMsg2 = new javax.swing.JLabel();
        contnt3 = new javax.swing.JPanel();
        id3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        parallelTable = new javax.swing.JTable();
        refresh3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        parallelCombo1 = new javax.swing.JComboBox<>();
        selectedParallel1 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        parallelCombo2 = new javax.swing.JComboBox<>();
        selectedParallel2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        parallelCombo3 = new javax.swing.JComboBox<>();
        selectedParallel3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ParallelSessionShowTable = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        errorMsg3 = new javax.swing.JLabel();
        contnt4 = new javax.swing.JPanel();
        id4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chkBoxRoom = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        chkBoxDay = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_sTime = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_eTime = new javax.swing.JTextField();
        addPreferedSession = new javax.swing.JButton();
        btnClearPreSession = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        contnt5 = new javax.swing.JPanel();
        id5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        chkBoxlec = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        chkBoxGrp = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        chkBoxSubGrp = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        chkBox_sDay = new javax.swing.JComboBox<>();
        btnAddNot_A_T_Session = new javax.swing.JButton();
        BtnClearNAT = new javax.swing.JButton();
        BtnDeleteNAT = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        chkBox_sessionID = new javax.swing.JComboBox<>();
        txt_sTime1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_eTime1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        nb.setBackground(new java.awt.Color(153, 153, 255));

        WDH.setText("Working Days and Hours");
        WDH.setPreferredSize(new java.awt.Dimension(131, 30));
        WDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WDHActionPerformed(evt);
            }
        });

        lecture.setText("Lecturers");
        lecture.setPreferredSize(new java.awt.Dimension(131, 30));
        lecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectureActionPerformed(evt);
            }
        });

        student.setText("Students");
        student.setPreferredSize(new java.awt.Dimension(131, 30));
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        subject.setText("Subjects");
        subject.setPreferredSize(new java.awt.Dimension(131, 30));
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        tag.setText("Tags");
        tag.setPreferredSize(new java.awt.Dimension(131, 30));
        tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagActionPerformed(evt);
            }
        });

        session.setText("Sessions");
        session.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        session.setPreferredSize(new java.awt.Dimension(131, 30));

        location.setText("Locations");
        location.setPreferredSize(new java.awt.Dimension(131, 30));
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        generate.setText("Generate Timetable");
        generate.setPreferredSize(new java.awt.Dimension(131, 30));
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/shutdown (1).png"))); // NOI18N
        logout.setText("Exit");
        logout.setAutoscrolls(true);
        logout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 4, true));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        stat.setText("Statistics");
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbLayout = new javax.swing.GroupLayout(nb);
        nb.setLayout(nbLayout);
        nbLayout.setHorizontalGroup(
            nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lecture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(WDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(student, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(session, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nbLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        nbLayout.setVerticalGroup(
            nbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(session, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(logout)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        heading.setBackground(new java.awt.Color(153, 153, 255));
        heading.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("                       TIME TABLE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        headingLayout.setVerticalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        logo.setBackground(new java.awt.Color(153, 153, 255));

        logoLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Hnet.com-image.png"))); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLab, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoLab))
        );

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        contnt.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Select Lecture");

        jLabel3.setText("Subject code");

        jLabel4.setText("Tag");

        jLabel5.setText("Group ID");

        jLabel6.setText("Student count");

        jLabel7.setText("Duration ");

        jTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTagActionPerformed(evt);
            }
        });

        jNoStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNoStudActionPerformed(evt);
            }
        });

        jLabel8.setText("Hrs");

        TableSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Lecture", "Lecture 2", "Tag", "Subject Code", "No. Of Students", "Duration", "Group ID"
            }
        ));
        TableSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSessionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSession);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 153));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 51, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SESSIONS MANAGEMENT");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        jLabel9.setText("Select Assistant Lecture");

        jLecture2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout contntLayout = new javax.swing.GroupLayout(contnt);
        contnt.setLayout(contntLayout);
        contntLayout.setHorizontalGroup(
            contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contntLayout.createSequentialGroup()
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contntLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(77, 77, 77)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTag, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLecture2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGroup(contntLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(25, 25, 25)))
                        .addGap(21, 21, 21)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contntLayout.createSequentialGroup()
                                .addComponent(jDura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNoStud, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(contntLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contntLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(118, 118, 118)
                                .addComponent(jButton3)
                                .addGap(152, 152, 152)
                                .addComponent(jButton4)))))
                .addGap(0, 74, Short.MAX_VALUE))
            .addGroup(contntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        contntLayout.setVerticalGroup(
            contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contntLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLecture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jNoStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLecture2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Sessions", contnt);

        contnt1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 255));
        jLabel24.setText("See all the Sessions here ");
        jLabel24.setPreferredSize(new java.awt.Dimension(170, 50));

        consecutiveTable.setForeground(new java.awt.Color(0, 0, 153));
        consecutiveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "lecture", "tag", "noOFStudent", "groupID", "SubjectCode", "Duration Hours"
            }
        ));
        consecutiveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consecutiveTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(consecutiveTable);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 255));
        jLabel25.setText("Add Consecutive Sessions");
        jLabel25.setPreferredSize(new java.awt.Dimension(170, 50));

        jLabel26.setText("Select  your 2nd Session ID");

        ConseCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConseCombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConseCombo1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConseCombo1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConseCombo1MousePressed(evt);
            }
        });
        ConseCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConseCombo1ActionPerformed(evt);
            }
        });
        ConseCombo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConseCombo1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ConseCombo1KeyReleased(evt);
            }
        });

        selectedconse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedconse1ActionPerformed(evt);
            }
        });
        selectedconse1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                selectedconse1KeyReleased(evt);
            }
        });

        refresh1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh1.setForeground(new java.awt.Color(0, 204, 0));
        refresh1.setText("Refresh");
        refresh1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.SystemColor.activeCaption));
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });

        jLabel27.setText("Select  your 1st Session ID");

        ConseCombo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConseCombo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConseCombo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConseCombo2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConseCombo2MousePressed(evt);
            }
        });
        ConseCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConseCombo2ActionPerformed(evt);
            }
        });
        ConseCombo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ConseCombo2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ConseCombo2KeyReleased(evt);
            }
        });

        selectedconse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedconse2ActionPerformed(evt);
            }
        });
        selectedconse2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                selectedconse2KeyReleased(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 102, 255));
        jLabel28.setText("View Consecutive Sessions");

        conseSessionShowTable.setForeground(new java.awt.Color(0, 0, 153));
        conseSessionShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(conseSessionShowTable);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setText("Add Consecutive Session");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 51, 204));
        jButton8.setText("clear");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        errorMsg1.setForeground(new java.awt.Color(204, 0, 0));
        errorMsg1.setText(" ");

        javax.swing.GroupLayout contnt1Layout = new javax.swing.GroupLayout(contnt1);
        contnt1.setLayout(contnt1Layout);
        contnt1Layout.setHorizontalGroup(
            contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contnt1Layout.createSequentialGroup()
                        .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contnt1Layout.createSequentialGroup()
                        .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(contnt1Layout.createSequentialGroup()
                                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contnt1Layout.createSequentialGroup()
                                        .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ConseCombo1, 0, 101, Short.MAX_VALUE)
                                            .addComponent(ConseCombo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contnt1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(selectedconse2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contnt1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(selectedconse1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contnt1Layout.createSequentialGroup()
                                        .addGap(307, 307, 307)
                                        .addComponent(errorMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contnt1Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(300, 300, 300))))
        );
        contnt1Layout.setVerticalGroup(
            contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt1Layout.createSequentialGroup()
                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contnt1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMsg1))
                .addGap(4, 4, 4)
                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConseCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedconse1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConseCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectedconse2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contnt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id1)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consecutive Sessions", contnt1);

        contnt2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 255));
        jLabel29.setText("See all the Sessions here  ");

        nonOverlapTable.setForeground(new java.awt.Color(0, 0, 204));
        nonOverlapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecture", "Tag", "Subject Code", "No. Of Students", "Duration", "Group ID"
            }
        ));
        nonOverlapTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nonOverlapTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(nonOverlapTable);

        refresh2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh2.setForeground(new java.awt.Color(0, 204, 0));
        refresh2.setText("Refresh");
        refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh2ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 255));
        jLabel30.setText("Add Non-Overlapping Sessions");

        jLabel31.setText("Select your 1st Session ID");

        nonCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nonCombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nonCombo1MousePressed(evt);
            }
        });
        nonCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonCombo1ActionPerformed(evt);
            }
        });

        jLabel32.setText("Select your 2nd Session ID");

        nonCombo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nonCombo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nonCombo2MousePressed(evt);
            }
        });
        nonCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonCombo2ActionPerformed(evt);
            }
        });

        jLabel33.setText("Select your 3rd Session ID");

        nonCombo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nonCombo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nonCombo3MousePressed(evt);
            }
        });
        nonCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonCombo3ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 102, 255));
        jLabel34.setText("View Non-Overlap Sessions");

        NonSessionShowTable.setForeground(new java.awt.Color(0, 0, 153));
        NonSessionShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(NonSessionShowTable);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 51, 204));
        jButton6.setText("Add Non-Overlap  Session");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 51, 204));
        jButton9.setText("clear");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        errorMsg2.setForeground(new java.awt.Color(204, 0, 0));
        errorMsg2.setText("  ");

        javax.swing.GroupLayout contnt2Layout = new javax.swing.GroupLayout(contnt2);
        contnt2.setLayout(contnt2Layout);
        contnt2Layout.setHorizontalGroup(
            contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt2Layout.createSequentialGroup()
                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contnt2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(contnt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(contnt2Layout.createSequentialGroup()
                        .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contnt2Layout.createSequentialGroup()
                                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nonCombo1, 0, 116, Short.MAX_VALUE)
                                    .addComponent(nonCombo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nonCombo3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contnt2Layout.createSequentialGroup()
                                        .addComponent(selectedNon3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contnt2Layout.createSequentialGroup()
                                        .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contnt2Layout.createSequentialGroup()
                                                .addComponent(selectedNon2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(contnt2Layout.createSequentialGroup()
                                                .addComponent(selectedNon1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(errorMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contnt2Layout.setVerticalGroup(
            contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt2Layout.createSequentialGroup()
                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contnt2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refresh2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nonCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedNon1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMsg2))
                .addGap(18, 18, 18)
                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nonCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedNon2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contnt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nonCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedNon3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Non Overlapping Sessions", contnt2);

        contnt3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 255));
        jLabel35.setText("See all the Sessions here  ");

        parallelTable.setForeground(new java.awt.Color(0, 0, 204));
        parallelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Lecture", "Tag", "Subject Code", "No. Of Students", "Duration", "Group ID"
            }
        ));
        parallelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parallelTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(parallelTable);

        refresh3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh3.setForeground(new java.awt.Color(51, 204, 0));
        refresh3.setText("Refresh");
        refresh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh3ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 102, 255));
        jLabel36.setText("Add Pararllel Sessions");

        jLabel37.setText("Select your 2nd Session ID");

        parallelCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parallelCombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                parallelCombo1MousePressed(evt);
            }
        });
        parallelCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelCombo1ActionPerformed(evt);
            }
        });

        jLabel38.setText("Select your 1st Session ID");

        parallelCombo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parallelCombo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                parallelCombo2MousePressed(evt);
            }
        });
        parallelCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelCombo2ActionPerformed(evt);
            }
        });

        selectedParallel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedParallel2ActionPerformed(evt);
            }
        });

        jLabel39.setText("Select your 3rd Session ID");

        parallelCombo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parallelCombo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                parallelCombo3MousePressed(evt);
            }
        });
        parallelCombo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelCombo3ActionPerformed(evt);
            }
        });

        selectedParallel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedParallel3ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 51, 204));
        jButton7.setText("Add Parallel Session");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 102, 255));
        jLabel40.setText("View Parallel Sessions");

        ParallelSessionShowTable.setForeground(new java.awt.Color(0, 0, 153));
        ParallelSessionShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(ParallelSessionShowTable);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 51, 204));
        jButton10.setText("clear");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        errorMsg3.setForeground(new java.awt.Color(204, 0, 0));
        errorMsg3.setText(" ");

        javax.swing.GroupLayout contnt3Layout = new javax.swing.GroupLayout(contnt3);
        contnt3.setLayout(contnt3Layout);
        contnt3Layout.setHorizontalGroup(
            contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt3Layout.createSequentialGroup()
                .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(id3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contnt3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(contnt3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contnt3Layout.createSequentialGroup()
                            .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(contnt3Layout.createSequentialGroup()
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(parallelCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contnt3Layout.createSequentialGroup()
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(parallelCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(contnt3Layout.createSequentialGroup()
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(parallelCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(52, 52, 52)
                            .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(contnt3Layout.createSequentialGroup()
                                    .addComponent(selectedParallel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(errorMsg3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contnt3Layout.createSequentialGroup()
                                    .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(selectedParallel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectedParallel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        contnt3Layout.setVerticalGroup(
            contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt3Layout.createSequentialGroup()
                .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contnt3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refresh3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parallelCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedParallel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMsg3))
                .addGap(18, 18, 18)
                .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parallelCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedParallel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addGroup(contnt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parallelCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedParallel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab(" Parallel Sessions", contnt3);

        contnt4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Select Room");

        chkBoxRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Select Day");

        chkBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Start Time");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("End Time");

        addPreferedSession.setText("Add Session");
        addPreferedSession.setPreferredSize(new java.awt.Dimension(80, 33));
        addPreferedSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPreferedSessionActionPerformed(evt);
            }
        });

        btnClearPreSession.setText("Clear");
        btnClearPreSession.setPreferredSize(new java.awt.Dimension(80, 33));
        btnClearPreSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPreSessionActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 51, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Add Preferred Session");
        jLabel22.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout contnt4Layout = new javax.swing.GroupLayout(contnt4);
        contnt4.setLayout(contnt4Layout);
        contnt4Layout.setHorizontalGroup(
            contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt4Layout.createSequentialGroup()
                .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contnt4Layout.createSequentialGroup()
                        .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contnt4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(id4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contnt4Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contnt4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(chkBoxRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contnt4Layout.createSequentialGroup()
                                        .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12))
                                        .addGap(29, 29, 29)
                                        .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(contnt4Layout.createSequentialGroup()
                                                .addComponent(txt_sTime, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(contnt4Layout.createSequentialGroup()
                                                        .addComponent(addPreferedSession, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnClearPreSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(contnt4Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txt_eTime, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                        .addGap(0, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contnt4Layout.setVerticalGroup(
            contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id4)
                .addGap(46, 46, 46)
                .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contnt4Layout.createSequentialGroup()
                        .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(chkBoxRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(47, 47, 47)
                .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_sTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_eTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(contnt4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearPreSession, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPreferedSession, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Preferred Session", contnt4);

        contnt5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setText("Select Lecturer");

        chkBoxlec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel16.setText("Select Group");

        chkBoxGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel17.setText("Select Sub Group");

        chkBoxSubGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel18.setText("Select Day");

        chkBox_sDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));

        btnAddNot_A_T_Session.setText("Submit");
        btnAddNot_A_T_Session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNot_A_T_SessionActionPerformed(evt);
            }
        });

        BtnClearNAT.setText("Clear");
        BtnClearNAT.setPreferredSize(new java.awt.Dimension(80, 33));
        BtnClearNAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearNATActionPerformed(evt);
            }
        });

        BtnDeleteNAT.setText("Delete");
        BtnDeleteNAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteNATActionPerformed(evt);
            }
        });

        jLabel19.setText("Select Session ID");

        chkBox_sessionID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel20.setText("Start Time");

        jLabel21.setText("End Time");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Lecturer", "Student Group", "Sudent Subgroup", "Day", "Session ID", "Start Time", "End Time"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 51, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Not Available Time for Sessions");
        jLabel23.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout contnt5Layout = new javax.swing.GroupLayout(contnt5);
        contnt5.setLayout(contnt5Layout);
        contnt5Layout.setHorizontalGroup(
            contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contnt5Layout.createSequentialGroup()
                .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contnt5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkBox_sDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chkBoxSubGrp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkBoxGrp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkBoxlec, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_sTime1)
                            .addComponent(txt_eTime1)
                            .addComponent(chkBox_sessionID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contnt5Layout.createSequentialGroup()
                        .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contnt5Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(id5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contnt5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contnt5Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnAddNot_A_T_Session, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BtnClearNAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(BtnDeleteNAT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contnt5Layout.setVerticalGroup(
            contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contnt5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id5)
                .addGap(35, 35, 35)
                .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(chkBoxlec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkBox_sessionID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBoxGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBoxSubGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(txt_eTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBox_sDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(44, 44, 44)
                .addGroup(contnt5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNot_A_T_Session, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClearNAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDeleteNAT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Not Available Time", contnt5);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //display table
        private void displaytable(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            TableSession.setModel(DbUtils.resultSetToTableModel(rs));
            
         
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
    
    //combobox
    private void lecCombobox(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from lecture";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 jLecture.addItem(rs.getString("Name"));
             }
           
            
         
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
     private void tagCombobox(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from tag";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 jTag.addItem(rs.getString("TagName"));
             }
           
            
         
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
     private void subCombobox(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from subject";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 jSubject.addItem(rs.getString("code"));
             }
         }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
     }
     
     
    
    private void WDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WDHActionPerformed
     
        workingDaysHours working_DaysHours = new workingDaysHours();
        working_DaysHours.show();
        dispose();
        
        
    }//GEN-LAST:event_WDHActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        subject Subject = new subject();
       Subject.show();
       dispose();     

    }//GEN-LAST:event_subjectActionPerformed

    private void lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectureActionPerformed
        lecture Lecture = new lecture();
       Lecture.show();
       dispose();    
    }//GEN-LAST:event_lectureActionPerformed

    private void jTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTagActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from student";
             String sql2 = "select * from lecture";

            PreparedStatement pst = conn.prepareStatement(sql);
            PreparedStatement pst2 = conn.prepareStatement(sql2);
             
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst2.executeQuery();
            
            jGroup.removeAllItems();
            while(rs.next() & rs2.next()){
                if(jTag.getSelectedItem().equals("Lec") || jTag.getSelectedItem().equals("Tute")){

                    jGroup.addItem(rs.getString("GroupID"));
                    ///////////////
                   // while(rs2.next()){
                 jLecture2.addItem(rs2.getString("Name"));
            // }
                    
                    
                    
                    /////////////

                }else if(jTag.getSelectedItem().equals("Lab")){

                    jGroup.addItem(rs.getString("SubGroupID"));

                }else{
                    jGroup.setSelectedIndex(-1);
                }
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jTagActionPerformed

    private void jNoStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNoStudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNoStudActionPerformed

    private void TableSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSessionMouseClicked
        int i = TableSession.getSelectedRow();
        TableModel model = TableSession.getModel();
        //	lecture	 tag	noOFStudents	groupID	subjectCode	duration
        //issue tag GroupID
        //id.setText(model.getValueAt(i,6).toString());
        String Lec = model.getValueAt(i,1).toString();
        jLecture.setSelectedItem(Lec);
        
        String Lec2 = model.getValueAt(i,2).toString();
        jLecture2.setSelectedItem(Lec2);

        String tags = model.getValueAt(i,3).toString();
        jTag.setSelectedItem(tags);

        jNoStud.setText(model.getValueAt(i,4).toString());

        String groupID = model.getValueAt(i,5).toString();
        jGroup.setSelectedItem(groupID);

        String subjectCode = model.getValueAt(i,6).toString();
        jSubject.setSelectedItem(subjectCode);

        jDura.setText(model.getValueAt(i,7).toString());
    }//GEN-LAST:event_TableSessionMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "insert into session values (null, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            //	lecture	 tag	noOFStudents	groupID	subjectCode	duration

            String lec;
            lec = jLecture.getSelectedItem().toString();
            pst.setString(1, lec);
            
            String lec2;
            lec2 = jLecture2.getSelectedItem().toString();
            pst.setString(2, lec2);

            String tag;
            tag = jTag.getSelectedItem().toString();
            pst.setString(3, tag);

            try{
                pst.setInt(4, Integer.parseInt(jNoStud.getText()));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid Input : enter a valid number for No OF Students");
            }

            String groupID;
            groupID = jGroup.getSelectedItem().toString();
            pst.setString(5, groupID);

            String subjectCode;
            subjectCode = jSubject.getSelectedItem().toString();
            pst.setString(6, subjectCode);

            try{
                pst.setInt(7, Integer.parseInt(jDura.getText()));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid Input : enter a valid number for Duration");
            }

            pst.executeUpdate();

            //refresh table after insert data
            DefaultTableModel model = (DefaultTableModel)TableSession.getModel();
            model.setRowCount(0);
            displaytable();

            JOptionPane.showMessageDialog(this, "Session added");

            conn.close();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

        }

        private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            int row = TableSession.getSelectedRow();
            String value = (TableSession.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM session WHERE id="+value;
            PreparedStatement pst = conn.prepareStatement(query);
            pst.executeUpdate();

            DefaultTableModel model = (DefaultTableModel)TableSession.getModel();
            model.setRowCount(0);
            displaytable();

            JOptionPane.showMessageDialog(this, "Session deleted");
            conn.close();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            //	lecture	 tag	noOFStudents	groupID	subjectCode	duration
            String sql = "Update session set   lecture = ?, lecture2 = ?, tag = ? , noOFStudents = ?, groupID = ?, subjectCode = ? , durationHrs = ?  where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, jLecture.getSelectedItem().toString());
            pstmt.setString(2, jLecture2.getSelectedItem().toString());
            pstmt.setString(3, jTag.getSelectedItem().toString());
            pstmt.setString(4, jNoStud.getText());
            pstmt.setString(5, jGroup.getSelectedItem().toString());
            pstmt.setString(6, jSubject.getSelectedItem().toString());
            pstmt.setString(7, jDura.getText());

            int row = TableSession.getSelectedRow();
            String id = (TableSession.getModel().getValueAt(row, 0).toString());
            pstmt.setString(8, id);

            //to disable for editing  the TagID field

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Session updated succussfully");

            DefaultTableModel model = (DefaultTableModel)TableSession.getModel();
            model.setRowCount(0);
            displaytable();

            jLecture.setSelectedIndex(0);
            jTag.setSelectedIndex(0);
            jNoStud.setText("");
            jGroup.setSelectedIndex(0);
            jSubject.setSelectedIndex(0);
            jDura.setText("");

            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        //refresh table after insert data
        DefaultTableModel model = (DefaultTableModel)TableSession.getModel();
        model.setRowCount(0);
        displaytable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLecture.setSelectedIndex(0);
        jTag.setSelectedIndex(0);
        jNoStud.setText("");
        jGroup.setSelectedIndex(0);
        jSubject.setSelectedIndex(0);
        jDura.setText("");
        id.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
        Students stud = new Students();
       stud.show();
       dispose();
    }//GEN-LAST:event_studentActionPerformed

    private void tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagActionPerformed
        // TODO add your handling code here:
        Tags tags = new Tags();
        tags.show();
        dispose();
    }//GEN-LAST:event_tagActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
        AddLocation locatn = new AddLocation();
        locatn.show();
        dispose();
    }//GEN-LAST:event_locationActionPerformed

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        // TODO add your handling code here:
         Statistics stats = new Statistics();
        stats.show();
        dispose();
    }//GEN-LAST:event_statActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
         generateTimetable genTime = new generateTimetable();
        genTime.show();
        dispose();
    }//GEN-LAST:event_generateActionPerformed

    
    
    
    private void addPreferedSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPreferedSessionActionPerformed

        String sRoom = chkBoxRoom.getSelectedItem().toString();
        String sDay = chkBoxDay.getSelectedItem().toString();
//        String sTime = txt_sTime.getText();
//        String eTime = txt_eTime.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            pst = sqlConn.prepareStatement("insert into addpreferredsession(selectRoom, selectDay, startTime, endTime)values(?,?,?,?)");

            try{
                pst.setInt(3, Integer.parseInt(txt_sTime.getText()));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid Input : enter a valid Time");
            }
            
            try{
                pst.setInt(4, Integer.parseInt(txt_eTime.getText()));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid Input : enter a valid Time");
            }
            
            pst.setString(1, sRoom);
            pst.setString(2, sDay);
//            pst.setString(3, sTime);
//            pst.setString(4, eTime);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully added!!!");

       }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_addPreferedSessionActionPerformed

    private void btnClearPreSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPreSessionActionPerformed
        chkBoxRoom.setSelectedIndex(0);
        chkBoxDay.setSelectedIndex(0);
        txt_sTime.setText("");
        txt_eTime.setText("");
    }//GEN-LAST:event_btnClearPreSessionActionPerformed

    
    
    private void table_update()
    {
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            pst = sqlConn.prepareStatement("select * from addnotavailabletimesession");
            java.sql.ResultSet rs = pst.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            model.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector(); 
                
                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("sLecturer"));
                    v2.add(rs.getString("sGroup"));
                    v2.add(rs.getString("sSub_Group"));
                    v2.add(rs.getString("sDay"));
                    v2.add(rs.getString("sSessionID"));
                    v2.add(rs.getString("startTime"));
                    v2.add(rs.getString("endTime"));
                }
                
                model.addRow(v2);
                
            }
            
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnAddNot_A_T_SessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNot_A_T_SessionActionPerformed
       
        
        String sLecturer = chkBoxlec.getSelectedItem().toString();
        String sGroup = chkBoxGrp.getSelectedItem().toString();
        String sSubgroup = chkBoxSubGrp.getSelectedItem().toString();
        String sDay = chkBox_sDay.getSelectedItem().toString();
        String s_sessionID = chkBox_sessionID.getSelectedItem().toString();
//        String sTime = txt_sTime1.getText();
//        String eTime = txt_eTime1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            pst = sqlConn.prepareStatement("insert into addnotavailabletimesession(sLecturer, sGroup, sSub_Group, sDay, sSessionID, startTime, endTime)values(?,?,?,?,?,?,?)");

            try{
                pst.setInt(6, Integer.parseInt(txt_sTime1.getText()));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid Input : enter a valid Time");
            }
            
            try{
                pst.setInt(7, Integer.parseInt(txt_eTime1.getText()));

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Invalid Input : enter a valid Time");
            }
            
            pst.setString(1, sLecturer);
            pst.setString(2, sGroup);
            pst.setString(3, sSubgroup);
            pst.setString(4, sDay);
            pst.setString(5, s_sessionID);
//            pst.setString(6, sTime);
//            pst.setString(7, eTime);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully added!!!");
            table_update();

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnAddNot_A_T_SessionActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
        
        String lect = model.getValueAt(i,1).toString();
        chkBoxlec.setSelectedItem(lect);
        
        String grp = model.getValueAt(i,2).toString();
        chkBoxGrp.setSelectedItem(grp);
        
        String sgrp = model.getValueAt(i,3).toString();
        chkBoxSubGrp.setSelectedItem(sgrp);
        
        String sday = model.getValueAt(i,4).toString();
        chkBox_sDay.setSelectedItem(sday);
        
        String sesid = model.getValueAt(i,5).toString();
        chkBox_sessionID.setSelectedItem(sesid);
        

        txt_sTime1.setText(model.getValueAt(i, 6).toString());
        txt_eTime1.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnClearNATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearNATActionPerformed
        
        chkBoxlec.setSelectedIndex(0);
        chkBoxGrp.setSelectedIndex(0);
        chkBoxSubGrp.setSelectedIndex(0);
        chkBox_sDay.setSelectedIndex(0);
        chkBox_sessionID.setSelectedIndex(0);
        txt_sTime1.setText("");
        txt_eTime1.setText("");
        
    }//GEN-LAST:event_BtnClearNATActionPerformed

    private void BtnDeleteNATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteNATActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
         
         try {
             int id = Integer.parseInt(model.getValueAt(i, 0).toString());
             
             int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?","Warning",JOptionPane.YES_NO_OPTION);
             
             if(dialogResult == JOptionPane.YES_OPTION){
                 
                 Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            pst = sqlConn.prepareStatement("delete from addnotavailabletimesession where id=? ");
            
        
            pst.setInt(1, id);
                 
            
            pst.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this, "Successfully Deleted!!!");
            table_update();
            
            chkBoxlec.setSelectedIndex(0);
        chkBoxGrp.setSelectedIndex(0);
        chkBoxSubGrp.setSelectedIndex(0);
        chkBox_sDay.setSelectedIndex(0);
        chkBox_sessionID.setSelectedIndex(0);
        txt_sTime1.setText("");
        txt_eTime1.setText("");
            
             }
     
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnDeleteNATActionPerformed

    private void ConseCombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConseCombo1MouseClicked
       //errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo1MouseClicked

    private void ConseCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConseCombo1ActionPerformed
        String SelecetedConse = (String) ConseCombo1.getSelectedItem();
        selectedconse1.setText(SelecetedConse);

        //        try{
            //            Class.forName("com.mysql.jdbc.Driver");
            //            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            //
            //            String sql = "select * from session";
            //            PreparedStatement pstmt = conn.prepareStatement(sql);
            //            ResultSet rs = pstmt.executeQuery();
            //
            //
            //            while (rs.next()){
                //                String SelectedID = ConseCombo.getSelectedItem().toString();
                //                selectedConseText.setText(SelectedID);
                //
                //            }
            //        }catch(Exception e){
            //        }

        //---------------
        //        String SelectedID = ConseCombo.getSelectedItem().toString();
        //        selectedConseText.setText(SelectedID);
    }//GEN-LAST:event_ConseCombo1ActionPerformed

    private void ConseCombo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConseCombo1KeyPressed
        //    String SelecetedConse = (String) ConseCombo1.getSelectedItem();
        //    ChooseConseList5.setText(SelecetedConse);
    }//GEN-LAST:event_ConseCombo1KeyPressed

    private void selectedconse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedconse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedconse1ActionPerformed

    private void ConseCombo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConseCombo2MouseClicked
        //errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo2MouseClicked

    private void ConseCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConseCombo2ActionPerformed
        String SelecetedConse = (String) ConseCombo2.getSelectedItem();
        selectedconse2.setText(SelecetedConse);
    }//GEN-LAST:event_ConseCombo2ActionPerformed

    private void ConseCombo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConseCombo2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConseCombo2KeyPressed

    private void selectedconse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedconse2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedconse2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     if(selectedconse1.getText().trim().isEmpty() ||  selectedconse2.getText().trim().isEmpty()){
            errorMsg1.setText("Please fill all the details ");
        }
        else{
        
           try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Adding tag details to database
            String sql = "insert into consecutivesessions(sessionID1,sessionID2) values (?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, selectedconse1.getText());
            pstmt.setString(2, selectedconse2.getText());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Consecutive Sessions details added Successfully");
            errorMsg1.setText("");
            conn.close();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Display updated tag data from database to tag table
            PreparedStatement pstmt = conn.prepareStatement("select * from consecutivesessions");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)conseSessionShowTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("CID"),rs.getString("sessionID1"),rs.getString("sessionID2")};
                tm.addRow(o);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // clear data after adding in the form
        ConseCombo1.setSelectedIndex(0);
        ConseCombo2.setSelectedIndex(0);
        selectedconse1.setText("");
        selectedconse2.setText("");
     }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nonOverlapTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonOverlapTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nonOverlapTableMouseClicked

    private void refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh2ActionPerformed
        // refresh -> session table 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            //Selecting updated data from database to Student Table after adding
            PreparedStatement pstmt = conn.prepareStatement("select * from session");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)nonOverlapTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("id"),rs.getString("lecture"),rs.getString("lecture2"),rs.getString("tag"),rs.getInt("noOFStudents"),rs.getString("groupID"),rs.getString("subjectCode"),rs.getString("durationHrs")};
                tm.addRow(o);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // refresh combo boxes
        try{
            nonCombo1.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                nonCombo1.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            nonCombo2.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                nonCombo2.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            nonCombo3.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                nonCombo3.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        // clearing data in text fields when refresh
        selectedNon1.setText("");
        selectedNon2.setText("");
        selectedNon3.setText("");
        
        // refresh ->  selected Non-Overalp session table 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Selecting updated data from database to Student Table after adding
            PreparedStatement pstmt = conn.prepareStatement("select * from nonoverlappingsessions");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)NonSessionShowTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("NonOverlapID"),rs.getInt("sessionID1"),rs.getInt("sessionID2"),rs.getInt("sessionID3")};
                tm.addRow(o);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_refresh2ActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        
        // refresh -> session table 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            //Selecting updated data from database to Student Table after adding
            PreparedStatement pstmt = conn.prepareStatement("select * from session");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)consecutiveTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("id"),rs.getString("lecture"),rs.getString("lecture2"),rs.getString("tag"),rs.getInt("noOFStudents"),rs.getString("groupID"),rs.getString("subjectCode"),rs.getString("durationHrs")};
                tm.addRow(o);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // refresh combo boxes
        try{
            ConseCombo1.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                ConseCombo1.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            ConseCombo2.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                ConseCombo2.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // clearing data in text fields when refresh
        selectedconse1.setText("");
        selectedconse2.setText("");
        
        // refresh ->  selected conse session table 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Selecting updated data from database to Student Table after adding
            PreparedStatement pstmt = conn.prepareStatement("select * from consecutivesessions");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)conseSessionShowTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("CID"),rs.getInt("sessionID1"),rs.getInt("sessionID2")};
                tm.addRow(o);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
        //        try{
            //            Class.forName("com.mysql.jdbc.Driver");
            //            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            //
            //            String sql = "select * from consecutivesessions";
            //            PreparedStatement pstmt = conn.prepareStatement(sql);
            //            ResultSet rs = pstmt.executeQuery();
            //
            //            conseSessionShowTable.setModel(DbUtils.resultSetToTableModel(rs));
            //        } catch(Exception e){
            //            JOptionPane.showMessageDialog(null, e);
            //        }

        //         Statement stmt = null;
        //      String sql="select * from session;
        //      try{
            //      Connect conn=new Connect();
            //      stmt = conn.makeStatement();
            //        Class.forName("com.mysql.jdbc.Driver");
            //        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            //
            //       rs = stmt.executeQuery(sql);
            //        while(rs.next()) {
                //            int i=0;
                //            Object ids = rs.getString("id");
                //            Object items = rs.getString("GatewayJob");
                //            Object descriptions = rs.getString("Status");
                //            Object quantitys = rs.getString("Timework");
                //            Object price = rs.getString("Notes");
                //
                //            jTable1.getModel().setValueAt(ids,i, 0 );
                //            jTable1.getModel().setValueAt(items, i, 1);
                //            jTable1.getModel().setValueAt(descriptions, i, 2);
                //           jTable1.getModel().setValueAt(quantitys, i, 3);
                //          jTable1.getModel().setValueAt(price, i, 4);
                //          System.out.println(i);
                //        i++;
                //        }

            //        try{
                //            Class.forName("com.mysql.jdbc.Driver");
                //            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
                //
                //            String sql = "select * from session";
                //            PreparedStatement pstmt = conn.prepareStatement(sql);
                //            ResultSet rs = pstmt.executeQuery();
                //
                //            consecutiveTable.setModel(DbUtils.resultSetToTableModel(rs));
                //        } catch(Exception e){
                //            JOptionPane.showMessageDialog(null, e);
                //        }
    }//GEN-LAST:event_refresh1ActionPerformed

    private void parallelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parallelTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_parallelTableMouseClicked

    private void refresh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh3ActionPerformed
         // refresh -> parallel table 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            //Selecting updated data from database to Student Table after adding
            PreparedStatement pstmt = conn.prepareStatement("select * from session");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)parallelTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("id"),rs.getString("lecture"),rs.getString("lecture2"),rs.getString("tag"),rs.getInt("noOFStudents"),rs.getString("groupID"),rs.getString("subjectCode"),rs.getString("durationHrs")};
                tm.addRow(o);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // refresh combo boxes
        try{
            parallelCombo1.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                parallelCombo1.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            parallelCombo2.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                parallelCombo2.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            parallelCombo3.removeAllItems();

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            String sql = "select * from session";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                parallelCombo3.addItem(rs.getString("id"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        // clearing data in text fields when refresh
        selectedParallel1.setText("");
        selectedParallel2.setText("");
        selectedParallel3.setText("");
        
        // refresh ->  selected parallel session table 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Selecting updated data from database to Student Table after adding
            PreparedStatement pstmt = conn.prepareStatement("select * from parallelsessions");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)ParallelSessionShowTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("PID"),rs.getInt("sessionID1"),rs.getInt("sessionID2"),rs.getInt("sessionID3")};
                tm.addRow(o);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_refresh3ActionPerformed

    private void parallelCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelCombo1ActionPerformed
        String SelecetedConse = (String) parallelCombo1.getSelectedItem();
        selectedParallel1.setText(SelecetedConse);
    }//GEN-LAST:event_parallelCombo1ActionPerformed

    private void parallelCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelCombo2ActionPerformed
       String SelecetedConse = (String) parallelCombo2.getSelectedItem();
        selectedParallel2.setText(SelecetedConse);
    }//GEN-LAST:event_parallelCombo2ActionPerformed

    private void selectedParallel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedParallel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedParallel2ActionPerformed

    private void parallelCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelCombo3ActionPerformed
        String SelecetedConse = (String) parallelCombo3.getSelectedItem();
        selectedParallel3.setText(SelecetedConse);
    }//GEN-LAST:event_parallelCombo3ActionPerformed

    private void selectedParallel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedParallel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedParallel3ActionPerformed

    private void consecutiveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consecutiveTableMouseClicked

//        try{
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
//
//            String sql = "select id from session";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//
//        // ChooseConseList2.setText(model.getValueAt(selectedRowIndex, 0).toString());
//
//        //----------
//
//        try{Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
//
//            String sql = "select * from session";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//
//            while (rs.next()){
//                ParallelCombo.addItem(rs.getString("id"));
//            }
//        }catch(Exception e){
//        }
    }//GEN-LAST:event_consecutiveTableMouseClicked

    private void nonCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonCombo1ActionPerformed
        String SelecetedConse = (String) nonCombo1.getSelectedItem();
        selectedNon1.setText(SelecetedConse);
    }//GEN-LAST:event_nonCombo1ActionPerformed

    private void nonCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonCombo2ActionPerformed
        String SelecetedConse = (String) nonCombo2.getSelectedItem();
        selectedNon2.setText(SelecetedConse);
    }//GEN-LAST:event_nonCombo2ActionPerformed

    private void nonCombo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonCombo3ActionPerformed
        String SelecetedConse = (String) nonCombo3.getSelectedItem();
        selectedNon3.setText(SelecetedConse);
    }//GEN-LAST:event_nonCombo3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    if(selectedNon1.getText().trim().isEmpty() ||  selectedNon2.getText().trim().isEmpty() ||  selectedNon3.getText().trim().isEmpty()){
            errorMsg2.setText("Please fill all details ");
        }
        else{    
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Adding tag details to database
            String sql = "insert into nonoverlappingsessions(sessionID1,sessionID2,sessionID3) values (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, selectedNon1.getText());
            pstmt.setString(2, selectedNon2.getText());
            pstmt.setString(3, selectedNon3.getText());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Non-Overlapping Sessions details added Successfully");
            conn.close();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Display updated tag data from database to tag table
            PreparedStatement pstmt = conn.prepareStatement("select * from nonoverlappingsessions");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)NonSessionShowTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("NonOverlapID"),rs.getString("sessionID1"),rs.getString("sessionID2"),rs.getString("sessionID3")};
                tm.addRow(o);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // clear data after adding in the form
        nonCombo1.setSelectedIndex(0);
        nonCombo2.setSelectedIndex(0);
        nonCombo3.setSelectedIndex(0);
        selectedNon1.setText("");
        selectedNon2.setText("");
        selectedNon3.setText("");
        
      }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    if(selectedParallel1.getText().trim().isEmpty() ||  selectedParallel2.getText().trim().isEmpty() ||  selectedParallel3.getText().trim().isEmpty()){
            errorMsg3.setText("Please fill all details ");
        }
        else{ 
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Adding tag details to database
            String sql = "insert into parallelsessions(sessionID1,sessionID2,sessionID3) values (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, selectedParallel1.getText());
            pstmt.setString(2, selectedParallel2.getText());
            pstmt.setString(3, selectedParallel3.getText());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Parallel Sessions details added Successfully");
            conn.close();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");

            //Display updated tag data from database to tag table
            PreparedStatement pstmt = conn.prepareStatement("select * from parallelsessions");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)ParallelSessionShowTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getInt("PID"),rs.getString("sessionID1"),rs.getString("sessionID2"),rs.getString("sessionID3")};
                tm.addRow(o);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        // clear data after adding in the form
        parallelCombo1.setSelectedIndex(0);
        parallelCombo2.setSelectedIndex(0);
        parallelCombo3.setSelectedIndex(0);
        selectedParallel1.setText("");
        selectedParallel2.setText("");
        selectedParallel3.setText("");
        
      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
         int g = JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(g==0){
            System.exit(0);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        selectedconse1.setText("");
        selectedconse2.setText("");
        errorMsg1.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        selectedNon1.setText("");
        selectedNon2.setText("");
        selectedNon3.setText("");
        errorMsg2.setText("");
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        selectedParallel1.setText("");
        selectedParallel2.setText("");
        selectedParallel3.setText("");
        errorMsg3.setText("");
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ConseCombo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConseCombo1KeyReleased
        //errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo1KeyReleased

    private void ConseCombo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConseCombo2KeyReleased
       // errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo2KeyReleased

    private void selectedconse1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectedconse1KeyReleased
       // errorMsg1.setText("");
    }//GEN-LAST:event_selectedconse1KeyReleased

    private void selectedconse2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectedconse2KeyReleased
        //errorMsg1.setText("");
    }//GEN-LAST:event_selectedconse2KeyReleased

    private void ConseCombo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConseCombo1MouseEntered
        //errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo1MouseEntered

    private void ConseCombo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConseCombo1MousePressed
        errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo1MousePressed

    private void ConseCombo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConseCombo2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ConseCombo2MouseEntered

    private void ConseCombo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConseCombo2MousePressed
        errorMsg1.setText("");
    }//GEN-LAST:event_ConseCombo2MousePressed

    private void nonCombo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonCombo1MousePressed
        errorMsg2.setText("");
    }//GEN-LAST:event_nonCombo1MousePressed

    private void nonCombo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonCombo2MousePressed
        errorMsg2.setText("");
    }//GEN-LAST:event_nonCombo2MousePressed

    private void nonCombo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonCombo3MousePressed
        errorMsg2.setText("");
    }//GEN-LAST:event_nonCombo3MousePressed

    private void parallelCombo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parallelCombo1MousePressed
        errorMsg3.setText("");
    }//GEN-LAST:event_parallelCombo1MousePressed

    private void parallelCombo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parallelCombo2MousePressed
        errorMsg3.setText("");
    }//GEN-LAST:event_parallelCombo2MousePressed

    private void parallelCombo3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parallelCombo3MousePressed
        errorMsg3.setText("");
    }//GEN-LAST:event_parallelCombo3MousePressed

    private void roomComboBox(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from location";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 chkBoxRoom.addItem(rs.getString("room"));
             }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
    
    
    
    private void lectureCombo(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from lecture";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 chkBoxlec.addItem(rs.getString("Name"));
             }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
    private void groupCombo(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from student";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 chkBoxGrp.addItem(rs.getString("GroupID"));
             }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
    private void subGroupCombo(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from student";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 chkBoxSubGrp.addItem(rs.getString("SubGroupID"));
             }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
    private void sessionIDCombo(){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            String sql = "select * from session";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
             while(rs.next()){
                 chkBox_sessionID.addItem(rs.getString("id"));
             }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
            
    }
    
    
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
            java.util.logging.Logger.getLogger(sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sessions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sessions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClearNAT;
    private javax.swing.JButton BtnDeleteNAT;
    private javax.swing.JComboBox<String> ConseCombo1;
    private javax.swing.JComboBox<String> ConseCombo2;
    private javax.swing.JTable NonSessionShowTable;
    private javax.swing.JTable ParallelSessionShowTable;
    private javax.swing.JTable TableSession;
    private javax.swing.JButton WDH;
    private javax.swing.JButton addPreferedSession;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAddNot_A_T_Session;
    private javax.swing.JButton btnClearPreSession;
    private javax.swing.JComboBox<String> chkBoxDay;
    private javax.swing.JComboBox<String> chkBoxGrp;
    private javax.swing.JComboBox<String> chkBoxRoom;
    private javax.swing.JComboBox<String> chkBoxSubGrp;
    private javax.swing.JComboBox<String> chkBox_sDay;
    private javax.swing.JComboBox<String> chkBox_sessionID;
    private javax.swing.JComboBox<String> chkBoxlec;
    private javax.swing.JTable conseSessionShowTable;
    private javax.swing.JTable consecutiveTable;
    private javax.swing.JPanel contnt;
    private javax.swing.JPanel contnt1;
    private javax.swing.JPanel contnt2;
    private javax.swing.JPanel contnt3;
    private javax.swing.JPanel contnt4;
    private javax.swing.JPanel contnt5;
    private javax.swing.JLabel errorMsg1;
    private javax.swing.JLabel errorMsg2;
    private javax.swing.JLabel errorMsg3;
    private javax.swing.JButton generate;
    private javax.swing.JPanel heading;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jDura;
    private javax.swing.JComboBox<String> jGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jLecture;
    private javax.swing.JComboBox<String> jLecture2;
    private javax.swing.JTextField jNoStud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> jSubject;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jTag;
    private javax.swing.JButton lecture;
    private javax.swing.JButton location;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logoLab;
    private javax.swing.JButton logout;
    private javax.swing.JPanel nb;
    private javax.swing.JComboBox<String> nonCombo1;
    private javax.swing.JComboBox<String> nonCombo2;
    private javax.swing.JComboBox<String> nonCombo3;
    private javax.swing.JTable nonOverlapTable;
    private javax.swing.JComboBox<String> parallelCombo1;
    private javax.swing.JComboBox<String> parallelCombo2;
    private javax.swing.JComboBox<String> parallelCombo3;
    private javax.swing.JTable parallelTable;
    private javax.swing.JButton refresh1;
    private javax.swing.JButton refresh2;
    private javax.swing.JButton refresh3;
    private javax.swing.JTextField selectedNon1;
    private javax.swing.JTextField selectedNon2;
    private javax.swing.JTextField selectedNon3;
    private javax.swing.JTextField selectedParallel1;
    private javax.swing.JTextField selectedParallel2;
    private javax.swing.JTextField selectedParallel3;
    private javax.swing.JTextField selectedconse1;
    private javax.swing.JTextField selectedconse2;
    private javax.swing.JButton session;
    private javax.swing.JButton stat;
    private javax.swing.JButton student;
    private javax.swing.JButton subject;
    private javax.swing.JButton tag;
    private javax.swing.JTextField txt_eTime;
    private javax.swing.JTextField txt_eTime1;
    private javax.swing.JTextField txt_sTime;
    private javax.swing.JTextField txt_sTime1;
    // End of variables declaration//GEN-END:variables
}
