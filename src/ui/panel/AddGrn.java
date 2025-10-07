package ui.panel;

import hibernate.Company;
import hibernate.GRN;
import hibernate.GRNItem;
import hibernate.Product;
import hibernate.Stock;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Message;

public class AddGrn extends javax.swing.JPanel {

    private static final Logger logger = LoggerFactory.getLogger(AddGrn.class);
    private SessionFactory sessionFactory;

    public AddGrn() {
        initComponents();
        this.sessionFactory = hibernate.HibernateUtil.getSessionFactory();
        loadCompaney();
        this.stockList = new ArrayList<>();
        productName.setEnabled(false);
        pSearch.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        clearSupplierInfoButton = new javax.swing.JButton();
        selectCompanyComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buyingPriceFormattedTextField = new javax.swing.JFormattedTextField();
        sellingPriceFormattedTextField = new javax.swing.JFormattedTextField();
        unitSellingPriceFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        batcheQuantityFormattedTextField = new javax.swing.JFormattedTextField();
        packKg = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addGRNTable = new javax.swing.JTable();
        addToListButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        totalFormattedTextField = new javax.swing.JFormattedTextField();
        clearProductInfoFieldButton = new javax.swing.JButton();
        getReportButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        expireDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        discounteFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        packG = new javax.swing.JFormattedTextField();
        productName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(248, 249, 250));
        setPreferredSize(new java.awt.Dimension(1274, 486));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 45, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GRN");

        pSearch.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pSearchKeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Company :");

        clearSupplierInfoButton.setBackground(new java.awt.Color(229, 62, 62));
        clearSupplierInfoButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearSupplierInfoButton.setForeground(new java.awt.Color(0, 62, 62));
        clearSupplierInfoButton.setText("Clear");
        clearSupplierInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSupplierInfoButtonActionPerformed(evt);
            }
        });

        selectCompanyComboBox.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectCompanyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearSupplierInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCompanyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearSupplierInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 85, 104));
        jLabel5.setText("Buying Price :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 85, 104));
        jLabel6.setText("Selling Price :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 85, 104));
        jLabel7.setText("Unit Selling Price :");

        buyingPriceFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        buyingPriceFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buyingPriceFormattedTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        buyingPriceFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buyingPriceFormattedTextFieldKeyReleased(evt);
            }
        });

        sellingPriceFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        sellingPriceFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sellingPriceFormattedTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        sellingPriceFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellingPriceFormattedTextFieldKeyReleased(evt);
            }
        });

        unitSellingPriceFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        unitSellingPriceFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        unitSellingPriceFormattedTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        unitSellingPriceFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitSellingPriceFormattedTextFieldKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 85, 104));
        jLabel8.setText("Batche Quantity :");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 85, 104));
        jLabel9.setText("Pack Size :");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 85, 104));
        jLabel10.setText("Expire Date :");

        batcheQuantityFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        batcheQuantityFormattedTextField.setText("0");
        batcheQuantityFormattedTextField.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        batcheQuantityFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                batcheQuantityFormattedTextFieldKeyReleased(evt);
            }
        });

        packKg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        packKg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        packKg.setText("0");
        packKg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        packKg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                packKgKeyReleased(evt);
            }
        });

        addGRNTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addGRNTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Buying Price", "Selling Price", "Unit Selling Price", "Batche Quantity", "Pack Size", "Expire date "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(addGRNTable);

        addToListButton.setBackground(new java.awt.Color(66, 153, 225));
        addToListButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addToListButton.setText("Add Stock");
        addToListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToListButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 85, 104));
        jLabel14.setText("Total :");

        totalFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalFormattedTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(38, 38, 38)
                .addComponent(totalFormattedTextField)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(totalFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clearProductInfoFieldButton.setBackground(new java.awt.Color(229, 62, 62));
        clearProductInfoFieldButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearProductInfoFieldButton.setText("Clear Fields");
        clearProductInfoFieldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearProductInfoFieldButtonActionPerformed(evt);
            }
        });

        getReportButton.setBackground(new java.awt.Color(56, 161, 105));
        getReportButton.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        getReportButton.setText("Save GRN");
        getReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getReportButtonActionPerformed(evt);
            }
        });

        productList.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        productList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        productList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productListKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(productList);

        expireDateChooser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        expireDateChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                expireDateChooserKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(74, 85, 104));
        jLabel12.setText("Discount :");

        discounteFormattedTextField.setText("0");
        discounteFormattedTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(74, 85, 104));
        jLabel13.setText("Search Product :");

        packG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        packG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        packG.setText("0");
        packG.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        packG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                packGKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setText("Product Name :");

        jLabel3.setText("Kg");

        jLabel11.setText("g");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel15.setText("Select Product In the List and Press ENTER ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator2))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(23, 23, 23))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pSearch)
                                .addComponent(unitSellingPriceFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyingPriceFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellingPriceFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(batcheQuantityFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(expireDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(packKg, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(packG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(discounteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addToListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearProductInfoFieldButton, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                    .addComponent(getReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(batcheQuantityFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discounteFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(addToListButton)
                            .addComponent(clearProductInfoFieldButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(buyingPriceFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(packKg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(packG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sellingPriceFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expireDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(unitSellingPriceFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearProductInfoFieldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearProductInfoFieldButtonActionPerformed
        ClearProductInfoField();
    }//GEN-LAST:event_clearProductInfoFieldButtonActionPerformed

    private void clearSupplierInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSupplierInfoButtonActionPerformed
        ClearSupplierDetails();
    }//GEN-LAST:event_clearSupplierInfoButtonActionPerformed

    private void pSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pSearchKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addProduct();
        } else {
            findProduct();
        }

    }//GEN-LAST:event_pSearchKeyReleased

    private void productListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productListKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addProduct();
            buyingPriceFormattedTextField.grabFocus();
        }
    }//GEN-LAST:event_productListKeyReleased

    private void addToListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToListButtonActionPerformed
        if (currernt != null) {
            addToList();
        } else {
            Message.error("Product Not FOund", "Validation Error");
        }
    }//GEN-LAST:event_addToListButtonActionPerformed

    private void getReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getReportButtonActionPerformed
        save();

    }//GEN-LAST:event_getReportButtonActionPerformed

    private void buyingPriceFormattedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buyingPriceFormattedTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sellingPriceFormattedTextField.grabFocus();
        }
    }//GEN-LAST:event_buyingPriceFormattedTextFieldKeyReleased

    private void sellingPriceFormattedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceFormattedTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            unitSellingPriceFormattedTextField.grabFocus();
        }
    }//GEN-LAST:event_sellingPriceFormattedTextFieldKeyReleased

    private void unitSellingPriceFormattedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitSellingPriceFormattedTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            batcheQuantityFormattedTextField.grabFocus();
        }
    }//GEN-LAST:event_unitSellingPriceFormattedTextFieldKeyReleased

    private void batcheQuantityFormattedTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_batcheQuantityFormattedTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            packKg.grabFocus();
        }

    }//GEN-LAST:event_batcheQuantityFormattedTextFieldKeyReleased

    private void packKgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packKgKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            packG.grabFocus();
        }
    }//GEN-LAST:event_packKgKeyReleased

    private void packGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packGKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            expireDateChooser.grabFocus();
        }
    }//GEN-LAST:event_packGKeyReleased

    private void expireDateChooserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expireDateChooserKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            discounteFormattedTextField.grabFocus();
        }
    }//GEN-LAST:event_expireDateChooserKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addGRNTable;
    private javax.swing.JButton addToListButton;
    private javax.swing.JFormattedTextField batcheQuantityFormattedTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField buyingPriceFormattedTextField;
    private javax.swing.JButton clearProductInfoFieldButton;
    private javax.swing.JButton clearSupplierInfoButton;
    private javax.swing.JFormattedTextField discounteFormattedTextField;
    private com.toedter.calendar.JDateChooser expireDateChooser;
    private javax.swing.JButton getReportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField pSearch;
    private javax.swing.JFormattedTextField packG;
    private javax.swing.JFormattedTextField packKg;
    private javax.swing.JList<String> productList;
    private javax.swing.JTextField productName;
    private javax.swing.JComboBox<String> selectCompanyComboBox;
    private javax.swing.JFormattedTextField sellingPriceFormattedTextField;
    private javax.swing.JFormattedTextField totalFormattedTextField;
    private javax.swing.JFormattedTextField unitSellingPriceFormattedTextField;
    // End of variables declaration//GEN-END:variables

    private void ClearSupplierDetails() {
        selectCompanyComboBox.setSelectedIndex(0);
    }

    private void ClearProductInfoField() {
        productName.setText("");
        buttonGroup1.clearSelection();
        pSearch.setText("");
        productList.clearSelection();
        buyingPriceFormattedTextField.setText("");
        sellingPriceFormattedTextField.setText("");
        unitSellingPriceFormattedTextField.setText("");
        batcheQuantityFormattedTextField.setText("");
        packKg.setText("0");
        packG.setText("0");
        expireDateChooser.setDate(null);
        discounteFormattedTextField.setText("0");
        addGRNTable.clearSelection();

        pSearch.setText("");
        addGRNTable.removeAll();
        selectCompanyComboBox.setSelectedIndex(0);
        currernt = null;
    }

    private void loadCompaney() {
        try {
            Session session = sessionFactory.openSession();
            Criteria criteria = session.createCriteria(Company.class);
            List<Company> cList = criteria.list();

            DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
            boxModel.addElement("Select Companey");
            for (Company company : cList) {
                boxModel.addElement(company.getName());
            }
            this.selectCompanyComboBox.setModel(boxModel);
            session.close();
        } catch (Exception e) {
            logger.error("Companey Load", e);
        }
    }

    private ArrayList<Product> productsList;
    private ArrayList<Stock> stockList;
    private Product currernt;
    private double total;

    private void findProduct() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Product.class);

        if (!pSearch.getText().isEmpty()) {
            criteria.add(Restrictions.ilike("name", pSearch.getText(), MatchMode.ANYWHERE));
        }

        productsList = (ArrayList<Product>) criteria.list();
        session.close();

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Product grain : productsList) {
            listModel.addElement(grain.getName());
        }
        this.productList.setModel(listModel);
    }

    private void addProduct() {
        int index = productList.getSelectedIndex();
        Product product = productsList.get(index);
        this.productName.setText(product.getName());
        this.currernt = product;
    }

    private void addToList() {
        // Get values from form fields
        String buyingPriceText = this.buyingPriceFormattedTextField.getText().trim();
        String sellingPriceText = this.sellingPriceFormattedTextField.getText().trim();
        String unitSellingPriceText = this.unitSellingPriceFormattedTextField.getText().trim();
        String batchQuantityText = this.batcheQuantityFormattedTextField.getText().trim();
        String packSizeText = this.packKg.getText().trim();
        String packSizeText2 = this.packG.getText().trim();
        String discountText = this.discounteFormattedTextField.getText().trim();
        Date expireDate = this.expireDateChooser.getDate();

        if (buyingPriceText.isEmpty()) {
            Message.error("Buying price cannot be empty", "Validation Error");
        } else if (sellingPriceText.isEmpty()) {
            Message.error("Selling price cannot be empty", "Validation Error");
        } else if (unitSellingPriceText.isEmpty()) {
            Message.error("Unit selling price cannot be empty", "Validation Error");
        } else if (batchQuantityText.isEmpty()) {
            Message.error("Batch quantity cannot be empty", "Validation Error");
        } else if (discountText.isEmpty()) {
            Message.error("Discount is invalid", "Validation Error");
        } else if (expireDate == null) {
            Message.error("Expire date must be selected", "Validation Error");
        } else {
            try {
                double buyingPrice = Double.parseDouble(buyingPriceText);
                double sellingPrice = Double.parseDouble(sellingPriceText);
                double unitSellingPrice = Double.parseDouble(unitSellingPriceText);
                int batchQuantity = Integer.parseInt(batchQuantityText);
                double discount = Double.parseDouble(discountText);

                if (buyingPrice <= 0) {
                    Message.error("Buying price must be greater than 0", "Validation Error");
                } else if (sellingPrice <= 0) {
                    Message.error("Selling price must be greater than 0", "Validation Error");
                } else if (batchQuantity <= 0) {
                    Message.error("Batch quantity must be greater than 0", "Validation Error");
                } else if (discount < 0 || discount > 90) {
                    Message.error("Discount cannot be negative. Enter a value between 0% and 100%.", "Discount is invalid");
                } else {

                    String doublePattern = "^[0-9]+(\\.[0-9]+)?$"; // integer or decimal

                    try {
                        if (!packSizeText.matches(doublePattern)) {
                            Message.warning("Kilograms must be a number.", "Validation Error");
                        } else if (!packSizeText2.matches(doublePattern)) {
                            Message.warning("Grams must be a number.", "Validation Error");
                        }
                        double kg = Double.parseDouble(packSizeText);
                        double g = Double.parseDouble(packSizeText2);

                        if (g > 1000) {
                            Message.warning("Grams cannot be more than 1000.", "Validation Error");
                        } else {
                            double totalKg = kg + (g / 1000.0);

                            if (buyingPrice > sellingPrice) {
                                Message.warning("Selling price cannot be lower than the buying price", "Price Error");
                            } else if (unitSellingPrice > sellingPrice) {
                                Message.warning("Selling price cannot be lower than the unit selling price", "Price Error");
                            } else {

                                if (totalKg > 0) {
                                    stockList.add(new Stock(
                                            0,
                                            totalKg,
                                            batchQuantity,
                                            0,
                                            discount,
                                            new GRNItem(currernt, null, buyingPrice, batchQuantity),
                                            expireDate,
                                            sellingPrice,
                                            unitSellingPrice));
                                    loadTable();
                                    ClearProductInfoField();
                                } else {
                                    Message.warning("Pack Size is Required", "QTY Error");
                                }
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        logger.error("add GRN item Error", e);
                    }

                }
            } catch (NumberFormatException e) {
                logger.error("add GRN item Error", e);
            }
        }
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) addGRNTable.getModel();
        model.setRowCount(0);
        double totalPrice = 0;
        for (Stock stock : stockList) {
            Vector<String> vector = new Vector();
            vector.add(stock.getGrnItem().getProduct().getName());
            vector.add(String.valueOf(stock.getGrnItem().getBuyingPrice()));
            vector.add(String.valueOf(stock.getPrice()));
            vector.add(String.valueOf(stock.getPricePerUnit()));
            vector.add(String.valueOf(stock.getGrnItem().getQty()));
            vector.add(String.valueOf(stock.getPackSize()));
            vector.add(new SimpleDateFormat("yyyy-MM-dd").format(stock.getExp()));
            totalPrice += stock.getGrnItem().getBuyingPrice() * stock.getGrnItem().getQty();
            model.addRow(vector);
        }
        this.totalFormattedTextField.setText(String.valueOf(totalPrice));
        this.addGRNTable.setModel(model);
        System.out.println(String.valueOf(total));
    }

    private void save() {

        if (!stockList.isEmpty()) {
            Session session = hibernate.HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
//            String companey = String.valueOf(selectCompanyComboBox.getSelectedIndex());
//            System.out.println(companey);

//            Company c = (Company) session.get(Company.class, Integer.valueOf(companey));
            String name = (String) selectCompanyComboBox.getSelectedItem();

            Criteria criteria = session.createCriteria(Company.class);
            criteria.add(Restrictions.eq("name", name));
            Company c = (Company) criteria.uniqueResult();

            if (c != null) {
                try {
                    GRN grn = new GRN(0, new Date(), c);
                    int id = (int) session.save(grn);
                    grn.setId(id);
                    for (Stock stock : stockList) {
                        stock.getGrnItem().setGrn(grn);
                        session.save(stock.getGrnItem());
                        session.save(stock);
                    }
                    transaction.commit();
                    Message.sucsses("Product Added", "Process Done");
                    clearAll();
                    session.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    transaction.rollback();
                    Message.error("GRN Registration Faild", "Data Base Error");
                    logger.error("GRN save", e);
                }
            } else {
                Message.error("Companey Not found", "Validation Error");
            }
        } else {
            Message.error("GRN Iteam not in the list ", "Validation Error");
        }
    }

    private void clearAll() {
        totalFormattedTextField.setText("0");
        productName.setText("");
        buttonGroup1.clearSelection();
        pSearch.setText("");
        productList.clearSelection();
        buyingPriceFormattedTextField.setText("");
        sellingPriceFormattedTextField.setText("");
        unitSellingPriceFormattedTextField.setText("");
        batcheQuantityFormattedTextField.setText("");
        packKg.setText("0");
        packG.setText("0");
        expireDateChooser.setDate(null);
        discounteFormattedTextField.setText("0");
        addGRNTable.clearSelection();

        pSearch.setText("");
        addGRNTable.removeAll();

        productsList = new ArrayList<>();
        stockList = new ArrayList<>();
        currernt = null;
        total = 0;
        loadTable();
    }
}
