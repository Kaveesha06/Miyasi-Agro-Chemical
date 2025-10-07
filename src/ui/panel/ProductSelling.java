package ui.panel;

import hibernate.Customer;
import hibernate.Sale;
import hibernate.SaleItem;
import hibernate.Stock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.popup.AddCustomer;
import util.Message;

public class ProductSelling extends javax.swing.JPanel {

    private SessionFactory sessionFactory;
    private static final Logger logger = LoggerFactory.getLogger(ProductSelling.class);

    public ProductSelling() {
        initComponents();
        clear();
        sessionFactory = hibernate.HibernateUtil.getSessionFactory();
        this.productList = new ArrayList<>();

        kg.setEnabled(false);
        g.setEnabled(false);
        
        java.awt.EventQueue.invokeLater(() -> pid.requestFocusInWindow());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        brand = new javax.swing.JFormattedTextField();
        qty = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dk = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        discount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paid = new javax.swing.JFormattedTextField();
        balance = new javax.swing.JFormattedTextField();
        price = new javax.swing.JTextField();
        kg = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cID = new javax.swing.JTextField();
        cName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        isCredit = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        exp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        subT = new javax.swing.JFormattedTextField();
        addList = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        isLoose = new javax.swing.JCheckBox();
        total = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        g = new javax.swing.JFormattedTextField();
        pName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(248, 249, 250));

        jButton2.setBackground(new java.awt.Color(229, 62, 62));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Clear Fields");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2clearProduct(evt);
            }
        });

        brand.setEditable(false);
        brand.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 85, 104));
        jLabel5.setText("Discount for item :");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 85, 104));
        jLabel9.setText("Paid amoun :");

        dk.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        dk.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dk.setText("00");
        dk.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dkKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Qty", "Unit Price", "Total amount for items"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        discount.setEditable(false);
        discount.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        discount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 85, 104));
        jLabel10.setText("Balance :");

        pid.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pidKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 85, 104));
        jLabel3.setText("Qty :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 85, 104));
        jLabel7.setText("Discount :");

        paid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        paid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paid.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });

        balance.setEditable(false);
        balance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        balance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        balance.setText("NAN");
        balance.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        price.setEditable(false);
        price.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        kg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        kg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(248, 249, 250));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setText("Customer ID :");

        cID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIDKeyTyped(evt);
            }
        });

        cName.setEditable(false);
        cName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(74, 85, 104));
        jLabel12.setText("Name :");

        jButton3.setBackground(new java.awt.Color(66, 153, 225));
        jButton3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton3.setText("New Coustomer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        isCredit.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        isCredit.setText("Selling for Credit");
        isCredit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                isCreditItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(isCredit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(isCredit)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        exp.setEditable(false);
        exp.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 45, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Selling");

        subT.setEditable(false);
        subT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        subT.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        addList.setBackground(new java.awt.Color(66, 153, 225));
        addList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addList.setText("Add to List");
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(56, 161, 105));
        print.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        print.setText("Print the Bill");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(74, 85, 104));
        jLabel15.setText("Brand :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 85, 104));
        jLabel6.setText("Sub Total :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Expire Date :");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 85, 104));
        jLabel8.setText("Total :");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 85, 104));
        jLabel14.setText("g / ml:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 85, 104));
        jLabel16.setText("Product Name :");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 85, 104));
        jLabel13.setText("Kg / L :");

        isLoose.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        isLoose.setForeground(new java.awt.Color(74, 85, 104));
        isLoose.setText("Loose Sell");
        isLoose.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                isLooseItemStateChanged(evt);
            }
        });

        total.setEditable(false);
        total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("00");
        total.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setText("Enter Product ID :");

        jSeparator1.setBackground(new java.awt.Color(248, 249, 250));

        g.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        g.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        g.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        pName.setEditable(false);
        pName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isLoose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(2, 2, 2)
                        .addComponent(kg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brand)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addList, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(subT, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dk, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel16)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel3)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isLoose))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(subT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(paid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2clearProduct(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2clearProduct
        clear();
    }//GEN-LAST:event_jButton2clearProduct

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        paid();

    }//GEN-LAST:event_paidKeyReleased

    private void cIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIDKeyReleased
        findCutomer();
    }//GEN-LAST:event_cIDKeyReleased

    private void isLooseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_isLooseItemStateChanged

        loosed();
    }//GEN-LAST:event_isLooseItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddCustomer addCustomer = new AddCustomer(null, true);
        addCustomer.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyReleased
        if (this.pid.getText().trim().length() >= 8) {
            loadProduct(this.pid.getText());
        }
    }//GEN-LAST:event_pidKeyReleased

    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
        addToList();
    }//GEN-LAST:event_addListActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        if (!productList.isEmpty() && productList != null) {
            save();
        }
    }//GEN-LAST:event_printActionPerformed

    private void dkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dkKeyReleased
        setDicount();
    }//GEN-LAST:event_dkKeyReleased

    private void isCreditItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_isCreditItemStateChanged
        creditSell();
    }//GEN-LAST:event_isCreditItemStateChanged

    private void cIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIDKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addList;
    private javax.swing.JFormattedTextField balance;
    private javax.swing.JFormattedTextField brand;
    private javax.swing.JTextField cID;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField discount;
    private javax.swing.JFormattedTextField dk;
    private javax.swing.JTextField exp;
    private javax.swing.JFormattedTextField g;
    private javax.swing.JCheckBox isCredit;
    private javax.swing.JCheckBox isLoose;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField kg;
    private javax.swing.JTextField pName;
    private javax.swing.JFormattedTextField paid;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JFormattedTextField qty;
    private javax.swing.JFormattedTextField subT;
    private javax.swing.JFormattedTextField total;
    // End of variables declaration//GEN-END:variables

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private Stock current;
    private List<SaleItem> productList;

    private double subTotal;

    private void loadProduct(String id) {
        try {
            Session session = sessionFactory.openSession();
            Stock product = (Stock) session.get(Stock.class, Integer.valueOf(id));

            if (product != null) {
                this.current = product;
                changeQTY(product);
                this.pName.setText(product.getGrnItem().getProduct().getName());

                Date expDate = product.getExp();
                this.exp.setText(sdf.format(expDate));

                discount.setText(String.valueOf(product.getDiscount()));
                brand.setText(product.getGrnItem().getProduct().getBrand().getName());
                price.setText(String.valueOf(product.getPrice()));
                loosed();
            } else {
                current = null;
                Message.sucsses("Product Not Found", "Valication Error");
            }
        } catch (Exception e) {
            current = null;
            Message.sucsses("Product Not Found", "Valication Error");
            logger.error("product Serch", e);
        }
    }

    private void changeQTY(Stock product) {
        if (product.getGrnItem().getProduct().GetIsDivisible()) {
            if (isLoose.isSelected()) {

            }
        } else {

        }
    }

    private void addToList() {

        if (current != null) {
            String qtyText = this.qty.getText().trim();
            String kgText = this.kg.getText().trim();
            String gText = this.g.getText().trim();

            String intPattern = "^[0-9]+$";        // integer only
            String doublePattern = "^[0-9]+(\\.[0-9]+)?$"; // integer or decimal

            if (current.getGrnItem().getProduct().GetIsDivisible() && isLoose.isSelected()) {
                try {
                    if (!kgText.matches(doublePattern)) {
                        Message.warning("Kilograms must be a number.", "Validation Error");
                    } else if (!gText.matches(doublePattern)) {
                        Message.warning("Grams must be a number.", "Validation Error");
                    } else {
                        double kg = Double.parseDouble(kgText);
                        double g = Double.parseDouble(gText);

                        if (g > 1000) {
                            Message.warning("Grams cannot be more than 1000.", "Validation Error");
                        } else {
                            double totalKg = kg + (g / 1000.0);

                            if (totalKg <= current.getLooseQty()) {
                                double newQty = current.getLooseQty() - totalKg;
                                current.setLooseQty(newQty);
                                productList.add(new SaleItem(current, null, totalKg, current.getPricePerUnit(), false, 0));
                            } else {
                                if (current.getWholeQty() >= 1) {
                                    double packSize = (current.getPackSize());

                                    if (packSize > totalKg) {
                                        int newWholeQty = current.getWholeQty() - 1;
                                        double newLosee = (current.getLooseQty() + packSize) - totalKg;
                                        current.setWholeQty(newWholeQty);
                                        current.setLooseQty(newLosee);
                                        productList.add(new SaleItem(current, null, totalKg, current.getPricePerUnit(), false, 0));
                                        clear();
                                    } else {
                                        Message.warning("Loose Qty Higer Tha Pack Size. Add a pack", "QTY Error");
                                    }

                                } else {
                                    Message.warning("Insufficient QTY", "QTY Error");
                                }
                            }

                        }
                    }

                } catch (IllegalArgumentException e) {
                    System.err.println("Validation error: " + e.getMessage());
                    logger.error("AddToList", e);
                }
            } else {
                try {

                    if (!qtyText.matches(intPattern)) {
                        Message.warning("Quantity was empty.", "Validation Error");
                    } else {
                        int qty = Integer.parseInt(qtyText);

                        if (qty == 0) {
                            Message.warning("Quantity can not be 0.", "Validation Error");
                        } else {

                            if (current.getWholeQty() >= qty) {
                                int newQty = current.getWholeQty() - qty;
                                current.setWholeQty(newQty);
                                productList.add(new SaleItem(current, null, qty, current.getPrice(), true, current.getDiscount()));
                                clear();
                            } else {
                                Message.warning("Invalied Quantity.", "Validation Error");
                            }
                        }

                    }

                } catch (IllegalArgumentException e) {
                    System.err.println("Validation error: " + e.getMessage());
                    logger.error("AddToList", e);
                }
            }
            loadTable();
        } else {
            Message.sucsses("Product Not Found", "Valication Error");
        }
    }

    private void loadTable() {
        subTotal = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (SaleItem p : productList) {
            Vector<String> vector = new Vector();
            vector.add(p.getStock().getGrnItem().getProduct().getName());
            vector.add(String.valueOf(p.getQuantity()));
            double up = p.getUnitPrice();
            if (p.getDiscount() > 0) {
                up = p.getUnitPrice() * ((100 - p.getDiscount()) / 100);
            }
            vector.add(Double.toString(up));
            double total = p.getQuantity() * p.getUnitPrice();
            if (p.getDiscount() > 0) {
                total = total * ((100 - p.getDiscount()) / 100);
            }

            subTotal = subTotal + total;
            Grndtotal = subTotal;
            vector.add(String.valueOf(total));
            model.addRow(vector);
            dk.setText("");
            paid.setText("");
            subT.setText(String.valueOf(subTotal));
            this.total.setText(String.valueOf(Grndtotal));
        }
    }

    private Customer customer;

    private void save() {
        Session session = sessionFactory.openSession();
        Sale sale = new Sale(0, new Date(), true, null);
        if (isCredit.isSelected()) {
            try {
                Customer customer = this.customer;
                if (customer != null) {
                    sale.setCustomer(customer);
                    sale.setIsCash(false);
                    customer.setCredits(customer.getCredits() + Grndtotal); // need to update to total 
                    session.update(customer);
                } else {
                    Message.warning("Customer Not Found", "Not found Error");
                    return;
                }
            } catch (Exception e) {
                Message.warning("Customer Not Found", "Not found Error");
                return;
            }
        }

        Transaction transaction = session.beginTransaction();

        try {
            int sid = (int) session.save(sale);
            sale.setId(sid);
            for (SaleItem p : productList) {
                p.setSale(sale);
                session.update(p.getStock());
                session.save(p);
            }
            if (customer != null) {
                System.out.println("");

            }

            String subTotal = String.valueOf(this.subT.getText());
            String dicount = String.valueOf(this.dk.getText());
            String total = String.valueOf(this.total.getText());
            String paid = String.valueOf(this.paid.getText());
            String balance = String.valueOf(this.balance.getText());

            if (subTotal.isBlank()) {
                subTotal = "0.00";
            }
            if (dicount.isBlank()) {
                subTotal = "0.00";
            }
            if (total.isBlank()) {
                subTotal = "0.00";
            }
            if (paid.isBlank()) {
                subTotal = "0.00";
            }
            if (balance.isBlank()) {
                subTotal = "0.00";
            }

            JRTableModelDataSource dataSourse = new JRTableModelDataSource(jTable1.getModel());
            HashMap<String, Object> parm = new HashMap<>();
            parm.put("Parameter1", String.valueOf(sid));
            parm.put("Parameter2", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            parm.put("Parameter3", subTotal);
            parm.put("Parameter4", dicount);
            parm.put("Parameter5", total);
            parm.put("Parameter6", paid);
            parm.put("Parameter7", balance);

            String in = "C:\\pos\\bill1.jasper";
            new util.Reporting().printReport(in, parm, dataSourse);

            transaction.commit();
            clearAll();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            Message.warning("Payment Error Plase Try Again", "Payments");
        }
    }

    private void findCutomer() {
        try {
            String id = this.cID.getText();
            if (id.length() >= 9) {
                Session session = sessionFactory.openSession();
                customer = (Customer) session.get(Customer.class, id);
                cName.setText(customer.getName());
                session.close();
            }
        } catch (Exception e) {
        }
    }

    private void clear() {
        pid.setText("");
        pName.setText("");
        exp.setText("");
        discount.setText("");
        brand.setText("");
        qty.setText("0");
        g.setText("0");
        kg.setText("0");
        price.setText("");
        isLoose.setSelected(false);
        current = null;
        price.setText("");
        print.setEnabled(false);
    }

    public void loosed() {
        if (current != null) {
            if (current.getGrnItem().getProduct().GetIsDivisible()) {
                isLoose.setEnabled(true);

                Stock product = current;
                if (isLoose.isSelected()) {
                    kg.setEnabled(true);
                    g.setEnabled(true);
                    qty.setEnabled(false);
                    price.setText(String.valueOf(product.getPricePerUnit()));

                } else {
                    kg.setEnabled(false);
                    g.setEnabled(false);
                    qty.setEnabled(true);
                    price.setText(String.valueOf(product.getPrice()));
                }

            } else {
                isLoose.setEnabled(false);
                Stock product = current;
                kg.setEnabled(false);
                g.setEnabled(false);
                qty.setEnabled(true);
                price.setText(String.valueOf(product.getPrice()));
            }
        }

    }

    private void paid() {
        try {
            if (!paid.getText().isEmpty()) {
                Double paidAmount = Double.parseDouble(paid.getText());

                Double balanceA = Grndtotal - paidAmount;

                if (balanceA <= 0) {
                    balance.setText(String.valueOf(balanceA));
                    print.setEnabled(true);
                    return;
                }
            }

            print.setEnabled(false);
            balance.setText(String.valueOf("NAN"));

        } catch (Exception e) {
            print.setEnabled(false);
            balance.setText(String.valueOf("NAN"));
        }
    }

    private double Grndtotal;

    private void setDicount() {
        if (!this.dk.getText().isEmpty()) {
            try {
                double discount = Double.parseDouble(dk.getText());
                if (discount > 0 && subTotal > discount) {
                    Grndtotal = subTotal - discount;
                    total.setText(String.valueOf(Grndtotal));
                } else {
                    Message.warning("Invalid Discount Type", "Validation Error");
                    total.setText(String.valueOf(subTotal));
                }
            } catch (Exception e) {
                total.setText(String.valueOf(subTotal));
                Message.warning("Invalid Discount Type", "Validation Error");
            }

        } else {
            total.setText(String.valueOf(subTotal));
        }
    }

    private void clearAll() {
        clear();
        current = null;
        productList = new ArrayList<>();
        loadTable();
        subT.setText("");
        dk.setText("");
        total.setText("");
        paid.setText("");
        balance.setText("NAN");
        cID.setText("");
        cName.setText("");
        customer = null;
        cName.setText("");
        cID.setText("");
        subTotal = 0;
        Grndtotal = 0;
    }

    private void creditSell() {
        if (isCredit.isSelected()) {
            print.setEnabled(true);
        } else {
            print.setEnabled(false);
        }
    }

}
