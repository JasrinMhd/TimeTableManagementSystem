
package project;
//import java.sql.*;


import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Jahran
 */
public class workingDaysHours extends javax.swing.JFrame {
    

    private boolean True;

    /**
     * Creates new form NewJFrame
     */
    public workingDaysHours() {
        initComponents();
        table_update();
        
        
    }
    


    
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
        contnt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cBoxNo_WD = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        updateWDH = new javax.swing.JButton();
        deleteWDH = new javax.swing.JButton();
        addWDH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        chk_monday = new javax.swing.JCheckBox();
        chk_tuesday = new javax.swing.JCheckBox();
        chk_wednesday = new javax.swing.JCheckBox();
        chk_thursday = new javax.swing.JCheckBox();
        chk_friday = new javax.swing.JCheckBox();
        chk_saturday = new javax.swing.JCheckBox();
        chk_sunday = new javax.swing.JCheckBox();
        jSpinner_W_time = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nb.setBackground(new java.awt.Color(153, 153, 255));

        WDH.setBackground(new java.awt.Color(153, 153, 153));
        WDH.setText("Add Working Days and Hours");
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
        session.setPreferredSize(new java.awt.Dimension(131, 30));
        session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionActionPerformed(evt);
            }
        });

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

        logout.setBackground(new java.awt.Color(0, 102, 153));
        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/logout.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setAutoscrolls(true);

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
            .addComponent(lecture, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(WDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(student, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(session, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nbLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(27, 27, 27))
        );

        heading.setBackground(new java.awt.Color(153, 153, 255));
        heading.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("              TIME TABLE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout headingLayout = new javax.swing.GroupLayout(heading);
        heading.setLayout(headingLayout);
        headingLayout.setHorizontalGroup(
            headingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("                            Add Working Days and Hours");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Number of Working Days");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Working Days");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Working Time per Day");

        cBoxNo_WD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5", "6", "7" }));

        jLabel6.setText("hours");

        updateWDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/update.png"))); // NOI18N
        updateWDH.setText("UPDATE");
        updateWDH.setPreferredSize(new java.awt.Dimension(69, 30));
        updateWDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateWDHActionPerformed(evt);
            }
        });

        deleteWDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/delete.png"))); // NOI18N
        deleteWDH.setText("DELETE");
        deleteWDH.setPreferredSize(new java.awt.Dimension(69, 30));
        deleteWDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteWDHActionPerformed(evt);
            }
        });

        addWDH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons8-insert-button-48 (1).png"))); // NOI18N
        addWDH.setText("  Add");
        addWDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWDHActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Num_of_Working_Days", "Working days ", "Working hours per day"
            }
        ));
        jTable1.setPreferredSize(new java.awt.Dimension(507, 80));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        chk_monday.setText("Monday");

        chk_tuesday.setText("Tuesday");

        chk_wednesday.setText("Wednesday");

        chk_thursday.setText("Thursday");

        chk_friday.setText("Friday");

        chk_saturday.setText("Saturday");

        chk_sunday.setText("Sunday");

        jSpinner_W_time.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        jSpinner_W_time.setDoubleBuffered(true);
        jSpinner_W_time.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSpinner_W_timeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout contntLayout = new javax.swing.GroupLayout(contnt);
        contnt.setLayout(contntLayout);
        contntLayout.setHorizontalGroup(
            contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contntLayout.createSequentialGroup()
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contntLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contntLayout.createSequentialGroup()
                                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contntLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contntLayout.createSequentialGroup()
                                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cBoxNo_WD, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contntLayout.createSequentialGroup()
                                        .addComponent(jSpinner_W_time, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contntLayout.createSequentialGroup()
                                        .addComponent(chk_friday)
                                        .addGap(26, 26, 26)
                                        .addComponent(chk_saturday)
                                        .addGap(8, 8, 8)
                                        .addComponent(chk_sunday)))
                                .addGap(174, 174, 174)
                                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addWDH, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteWDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateWDH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(contntLayout.createSequentialGroup()
                                .addComponent(chk_monday)
                                .addGap(18, 18, 18)
                                .addComponent(chk_tuesday)
                                .addGap(10, 10, 10)
                                .addComponent(chk_wednesday)
                                .addGap(18, 18, 18)
                                .addComponent(chk_thursday))))
                    .addGroup(contntLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contntLayout.setVerticalGroup(
            contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contntLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contntLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cBoxNo_WD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46))
                    .addGroup(contntLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addWDH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk_monday)
                        .addComponent(chk_tuesday)
                        .addComponent(chk_wednesday)
                        .addComponent(chk_thursday)))
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contntLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(updateWDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contntLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_sunday)
                            .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chk_friday)
                                .addComponent(chk_saturday)))))
                .addGap(11, 11, 11)
                .addGroup(contntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner_W_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(deleteWDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

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
                    .addComponent(heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    Connection con1;
    PreparedStatement insert;
    
    
    private void table_update()
    {
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            insert = con1.prepareStatement("select * from workingdayshours");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            
            Df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector(); 
                
                for(int a=1; a<=c; a++)
                {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("num_Wdays"));
                    v2.add(rs.getString("w_days"));
                    v2.add(rs.getString("w_hours"));
                }
                
                Df.addRow(v2);
                
            }
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void WDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WDHActionPerformed
       
    }//GEN-LAST:event_WDHActionPerformed

    private void updateWDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateWDHActionPerformed

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
         
         try {
             int id = Integer.parseInt(model.getValueAt(i, 0).toString());
             String No_wdys = cBoxNo_WD.getSelectedItem().toString();
             int W_hrs = Integer.valueOf(jSpinner_W_time.getValue().toString()); 
             
             
        int counter=0;
        String w_days = "";
        if(chk_monday.isSelected()){
            w_days += chk_monday.getText()+" ";
            counter++;
        }
        if(chk_tuesday.isSelected()){
            w_days += chk_tuesday.getText()+" ";
            counter++;
        }
        if(chk_wednesday.isSelected()){
            w_days += chk_wednesday.getText()+" ";
            counter++;
        }
        if(chk_thursday.isSelected()){
            w_days += chk_thursday.getText()+" ";
            counter++;
        }
        if(chk_friday.isSelected()){
            w_days += chk_friday.getText()+" ";
            counter++;
        }
        if(chk_saturday.isSelected()){
            w_days += chk_saturday.getText()+" ";
            counter++;
        }
        if(chk_sunday.isSelected()){
            w_days += chk_sunday.getText()+" ";
            counter++;
        }
        
        int nwd = Integer.parseInt(cBoxNo_WD.getSelectedItem().toString());
        if(counter==nwd){
             
             
             
             
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            insert = con1.prepareStatement("update workingdayshours set num_Wdays=?, w_days=?, w_hours=? where id=? ");
            
            insert.setString(1, No_wdys);
            insert.setString(2, w_days);
            insert.setInt(3, W_hrs);
            insert.setInt(4, id);
            
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully Updated!!!");
            table_update();
            
            cBoxNo_WD.setSelectedIndex(0);
            
            chk_monday.setSelected(false);
            chk_tuesday.setSelected(false);
            chk_wednesday.setSelected(false);
            chk_thursday.setSelected(false);
            chk_friday.setSelected(false);
            chk_saturday.setSelected(false);
            chk_sunday.setSelected(false);
            
            jSpinner_W_time.setValue(0);
            
            
             }else{
            JOptionPane.showMessageDialog(null,"Error miss match" );
        
        }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
    }//GEN-LAST:event_updateWDHActionPerformed

    private void addWDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWDHActionPerformed
       
        
        String No_wdys = cBoxNo_WD.getSelectedItem().toString();
        int W_hrs = Integer.valueOf(jSpinner_W_time.getValue().toString());
        
        
        int counter=0;
        String w_days = "";
        if(chk_monday.isSelected()){
            w_days += chk_monday.getText()+" ";
            counter++;
        }
        if(chk_tuesday.isSelected()){
            w_days += chk_tuesday.getText()+" ";
            counter++;
        }
        if(chk_wednesday.isSelected()){
            w_days += chk_wednesday.getText()+" ";
            counter++;
        }
        if(chk_thursday.isSelected()){
            w_days += chk_thursday.getText()+" ";
            counter++;
        }
        if(chk_friday.isSelected()){
            w_days += chk_friday.getText()+" ";
            counter++;
        }
        if(chk_saturday.isSelected()){
            w_days += chk_saturday.getText()+" ";
            counter++;
        }
        if(chk_sunday.isSelected()){
            w_days += chk_sunday.getText()+" ";
            counter++;
        }
        
        int nwd = Integer.parseInt(cBoxNo_WD.getSelectedItem().toString());
        if(counter==nwd){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            insert = con1.prepareStatement("insert into workingdayshours(num_Wdays, w_days, w_hours)values(?,?,?)");
            

            
            insert.setString(1, No_wdys);
            insert.setString(2, w_days);
            insert.setInt(3, W_hrs);
            insert.executeUpdate();
            
            
           
            
            JOptionPane.showMessageDialog(null, "Successfully added");
        
            table_update();
            
            cBoxNo_WD.setSelectedIndex(0);
            chk_monday.setSelected(false);
            chk_tuesday.setSelected(false);
            chk_wednesday.setSelected(false);
            chk_thursday.setSelected(false);
            chk_friday.setSelected(false);
            chk_saturday.setSelected(false);
            chk_sunday.setSelected(false);
           jSpinner_W_time.setValue(0);
            
        
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }else{
            JOptionPane.showMessageDialog(null,"Error miss match" );
        
        }
        
    }//GEN-LAST:event_addWDHActionPerformed

    private void deleteWDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteWDHActionPerformed
        
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
         
         try {
             int id = Integer.parseInt(model.getValueAt(i, 0).toString());
             
             int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?","Warning",JOptionPane.YES_NO_OPTION);
             
             if(dialogResult == JOptionPane.YES_OPTION){
                 
                 Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetablesystem","root","");
            
            insert = con1.prepareStatement("delete from workingdayshours where id=? ");
            
        
            insert.setInt(1, id);
                 
            
            insert.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this, "Successfully Deleted!!!");
            table_update();
            
            cBoxNo_WD.setSelectedIndex(0);
            
            chk_monday.setSelected(false);
            chk_tuesday.setSelected(false);
            chk_wednesday.setSelected(false);
            chk_thursday.setSelected(false);
            chk_friday.setSelected(false);
            chk_saturday.setSelected(false);
            chk_sunday.setSelected(false);
            
            jSpinner_W_time.setValue(0);
                 
                 
            
             }
     
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(workingDaysHours.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_deleteWDHActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // try { 
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
  
//        String w_days = model.getValueAt(i, 2).toString();
//                boolean Mon=w_days.contains("Monday");
//                boolean Tue=w_days.contains("Tuesday");
//                boolean Wed=w_days.contains("Wednesday");
//                boolean Thu=w_days.contains("Thursday");
//                boolean Fri=w_days.contains("Friday");
//                boolean Sat=w_days.contains("Saturday");
//                boolean Sun=w_days.contains("Sunday");
//                if(Mon){
//                    chk_monday.setSelected(true);
//                }
//                if(Tue){
//                    chk_tuesday.setSelected(true);
//                }
//                if(Wed){
//                    chk_wednesday.setSelected(true);
//                }
//                if(Thu){
//                    chk_thursday.setSelected(true);
//                }
//                if(Fri){
//                    chk_friday.setSelected(true);
//                }
//                if(Sat){
//                    chk_saturday.setSelected(true);
//                }
//                if(Sun){
//                    chk_sunday.setSelected(true);
//                }
        
        
        
        String cBoxNo_WDy = model.getValueAt(i,1).toString();
        cBoxNo_WD.setSelectedItem(cBoxNo_WDy);
         

          
          
           String w_days = model.getValueAt(i, 2).toString();
           if(w_days.equals("Monday Tuesday Wednesday Thursday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(true);  
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           if(w_days.equals("Monday Wednesday Thursday ")){
               chk_monday.setSelected(true);
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(true); 
               chk_tuesday.setSelected(false);
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           if(w_days.equals("Tuesday ")){
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(true);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);  
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           if(w_days.equals("Wednesday ")){
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false);
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(false);  
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           if(w_days.equals("Thursday ")){
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(true);  
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           if(w_days.equals("Friday ")){
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);  
               chk_friday.setSelected(true);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           
           if(w_days.equals("Saturday ")){
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);  
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
           if(w_days.equals("Sunday ")){
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);  
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(true);
                    
           }
           
           
           
           
           
           
           if(w_days.equals("Monday Tuesday Wednesday Thursday Friday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(true);  
               chk_friday.setSelected(true);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
                    
           }
            if(w_days.equals("Monday Tuesday Wednesday Thursday Friday Saturday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(true);  
               chk_friday.setSelected(true);
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(false);
                    
           }
            if(w_days.equals("Monday Tuesday Wednesday Thursday Friday Saturday Sunday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(true);  
               chk_friday.setSelected(true);
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
                    
           }
            
           if(w_days.equals("Monday Tuesday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true); 
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
           }
           if(w_days.equals("Monday Tuesday Wednesday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true); 
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
           }
            if(w_days.equals("Monday Tuesday Saturday Sunday ")){
                chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
           }
            if(w_days.equals("Monday Tuesday Friday Saturday Sunday ")){
                chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(true);
           }
             if(w_days.equals("Monday Tuesday Thursday Friday ")){
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(true);
               chk_friday.setSelected(true);
               chk_thursday.setSelected(true);
               chk_saturday.setSelected(false);
               chk_sunday.setSelected(false);
               chk_wednesday.setSelected(false);
               
           }
           
           if(w_days.equals("Monday Saturday Sunday ")){
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_monday.setSelected(true);
               chk_tuesday.setSelected(false); 
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
           }
           if(w_days.equals("Tuesday Saturday Sunday ")){
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(true); 
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
           }
           if(w_days.equals("Wednesday Saturday Sunday ")){
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false); 
               chk_wednesday.setSelected(true);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
           }
           if(w_days.equals("Thursday Saturday Sunday ")){
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false); 
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(true);
               chk_friday.setSelected(false);
           }
           if(w_days.equals("Friday Saturday Sunday ")){
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false); 
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(true);
           }
           if(w_days.equals("Saturday Sunday ")){
               chk_saturday.setSelected(true);
               chk_sunday.setSelected(true);
               chk_monday.setSelected(false);
               chk_tuesday.setSelected(false); 
               chk_wednesday.setSelected(false);
               chk_thursday.setSelected(false);
               chk_friday.setSelected(false);
           }

         
        jSpinner_W_time.setValue(Integer.valueOf(model.getValueAt(i, 3).toString()));



// } catch (Exception e) {
//             e.printStackTrace();
//             
//        }



                
                
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSpinner_W_timeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner_W_timeKeyReleased
        
    }//GEN-LAST:event_jSpinner_W_timeKeyReleased

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        Students stud = new Students();
       stud.show();
       dispose();
    }//GEN-LAST:event_studentActionPerformed

    private void lectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectureActionPerformed
        lecture Lecture = new lecture();
       Lecture.show();
       dispose();
    }//GEN-LAST:event_lectureActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        subject Subject = new subject();
       Subject.show();
       dispose();
    }//GEN-LAST:event_subjectActionPerformed

    private void tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagActionPerformed
        Tags tags = new Tags();
        tags.show();
        dispose();
    }//GEN-LAST:event_tagActionPerformed

    private void sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionActionPerformed
        // TODO add your handling code here:
        sessions Session = new sessions();
        Session.show();
        dispose();
    }//GEN-LAST:event_sessionActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        
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
            java.util.logging.Logger.getLogger(workingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workingDaysHours.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workingDaysHours().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WDH;
    private javax.swing.JButton addWDH;
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> cBoxNo_WD;
    private javax.swing.JCheckBox chk_friday;
    private javax.swing.JCheckBox chk_monday;
    private javax.swing.JCheckBox chk_saturday;
    private javax.swing.JCheckBox chk_sunday;
    private javax.swing.JCheckBox chk_thursday;
    private javax.swing.JCheckBox chk_tuesday;
    private javax.swing.JCheckBox chk_wednesday;
    private javax.swing.JPanel contnt;
    private javax.swing.JButton deleteWDH;
    private javax.swing.JButton generate;
    private javax.swing.JPanel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_W_time;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton lecture;
    private javax.swing.JButton location;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logoLab;
    private javax.swing.JButton logout;
    private javax.swing.JPanel nb;
    private javax.swing.JButton session;
    private javax.swing.JButton stat;
    private javax.swing.JButton student;
    private javax.swing.JButton subject;
    private javax.swing.JButton tag;
    private javax.swing.JButton updateWDH;
    // End of variables declaration//GEN-END:variables
}
