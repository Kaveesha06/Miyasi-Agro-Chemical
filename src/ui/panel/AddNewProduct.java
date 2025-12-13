package ui.panel;

import hibernate.Brand;
import hibernate.Product;
import hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
import util.Alert;
import util.Alert.AlertType;

public class AddNewProduct extends javax.swing.JPanel {

    private List<Product> productList = new ArrayList<>();
    private SessionFactory sessionFactory;
    private static final Logger logger = LoggerFactory.getLogger(AddNewProduct.class);

    public AddNewProduct() {
        initComponents();
        sessionFactory = hibernate.HibernateUtil.getSessionFactory();
        checkbox();
//        tableColumn();
        tableContent();
        loadBrandList();
        loadProductsTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        brandname = new javax.swing.JTextField();
        addbrand = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        brandlist = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        updateproduct = new javax.swing.JButton();
        addproduct = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        isdevide = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(248, 249, 250));

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));

        jPanel3.setBackground(new java.awt.Color(248, 249, 250));

        jPanel4.setBackground(new java.awt.Color(248, 249, 250));

        jLabel1.setBackground(new java.awt.Color(248, 249, 250));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 85, 104));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Brand");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(248, 249, 250));

        jLabel3.setBackground(new java.awt.Color(248, 249, 250));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 85, 104));
        jLabel3.setText("Brand Name :");

        brandname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        brandname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                brandnameKeyReleased(evt);
            }
        });

        addbrand.setBackground(new java.awt.Color(66, 153, 225));
        addbrand.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        addbrand.setText("Add Brand");
        addbrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbrandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addbrand, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(brandname))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(248, 249, 250));

        brandlist.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        brandlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        brandlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brandlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandlistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(brandlist);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );

        jPanel6.setBackground(new java.awt.Color(248, 249, 250));

        jPanel9.setBackground(new java.awt.Color(248, 249, 250));

        producttable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Product Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        producttable.getTableHeader().setReorderingAllowed(false);
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttable);
        if (producttable.getColumnModel().getColumnCount() > 0) {
            producttable.getColumnModel().getColumn(2).setResizable(false);
        }

        updateproduct.setBackground(new java.awt.Color(66, 153, 225));
        updateproduct.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        updateproduct.setText("Update");
        updateproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateproductActionPerformed(evt);
            }
        });

        addproduct.setBackground(new java.awt.Color(66, 153, 225));
        addproduct.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        addproduct.setText("Add Product");
        addproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(updateproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(248, 249, 250));

        jLabel4.setBackground(new java.awt.Color(248, 249, 250));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Product Name :");

        productname.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        isdevide.setBackground(new java.awt.Color(248, 249, 250));
        isdevide.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        isdevide.setForeground(new java.awt.Color(74, 85, 104));
        isdevide.setText("is devide  :  ");
        isdevide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        isdevide.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jButton2.setBackground(new java.awt.Color(229, 62, 62));
        jButton2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2.setText("Clear Field");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isdevide, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(isdevide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setBackground(new java.awt.Color(248, 249, 250));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Product");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(248, 249, 250));
        jSeparator1.setForeground(new java.awt.Color(74, 85, 104));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1165, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(107, 107, 107)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brandnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandnameKeyReleased
        searchBrand();
    }//GEN-LAST:event_brandnameKeyReleased

    private void addbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbrandActionPerformed
        addBrand();
    }//GEN-LAST:event_addbrandActionPerformed

    private void brandlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandlistMouseClicked
        String selectedBrand = brandlist.getSelectedValue();
        if (selectedBrand != null) {
            brandname.setText(selectedBrand);
        }
    }//GEN-LAST:event_brandlistMouseClicked

    private void addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductActionPerformed
        addProduct();
    }//GEN-LAST:event_addproductActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        tableClicked();
    }//GEN-LAST:event_producttableMouseClicked

    private void updateproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateproductActionPerformed
        updateProduct();
    }//GEN-LAST:event_updateproductActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbrand;
    private javax.swing.JButton addproduct;
    private javax.swing.JList<String> brandlist;
    private javax.swing.JTextField brandname;
    private javax.swing.JCheckBox isdevide;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField productname;
    private javax.swing.JTable producttable;
    private javax.swing.JButton updateproduct;
    // End of variables declaration//GEN-END:variables

    public void tableColumn() {
        producttable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        producttable.getColumnModel().getColumn(0).setPreferredWidth(650);
        producttable.getColumnModel().getColumn(1).setPreferredWidth(140);
        producttable.getColumnModel().getColumn(2).setPreferredWidth(140);

    }

    // Center all table column data
    public void tableContent() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < producttable.getColumnCount(); i++) {
            producttable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        ((DefaultTableCellRenderer) producttable.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
    }

    //is divide or not
    public void checkbox() {
//        updateComboBox(isdevide.isSelected());

        isdevide.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                updateComboBox(isdevide.isSelected());
            }
        });
    }

    public void addBrand() {

        String brandName = brandname.getText();
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            if (brandName.isEmpty()) {
                Alert.show("Brand name was empty", Alert.AlertType.WARNING);
                return;
            }

            Criteria c = session.createCriteria(Brand.class);
            c.add(Restrictions.eq("name", brandName));
            Brand existing = (Brand) c.uniqueResult();

            if (existing == null) {
                tx = session.beginTransaction();
                Brand brand = new Brand();
                brand.setName(brandName);
                session.save(brand);
                tx.commit();

                brandname.setText("");
                loadBrandList();

            } else {
                Alert.show("Brand already exists!", AlertType.WARNING);
//                Message.warning("Brand already exists", "Warning");
            }

        } catch (Exception e) {
            logger.error("Brand Updated Error ", e);

        } finally {
            session.close();
        }

    }

    public void loadBrandList() {
        Session session = sessionFactory.openSession();
        DefaultListModel<String> model = new DefaultListModel<>();

        try {
            Criteria criteria = session.createCriteria(Brand.class);
            List<Brand> brandList = criteria.list();

            for (Brand brand : brandList) {
                model.addElement(brand.getName());
            }

            brandlist.setModel(model);
        } catch (Exception e) {
            logger.error("Brand List Loading Error ", e);

        } finally {
            session.close();
        }
    }

    public void searchBrand() {
        String searchText = brandname.getText().trim();

        DefaultListModel<String> model = new DefaultListModel<>();

        Session session = sessionFactory.openSession();

        try {
            Criteria criteria = session.createCriteria(Brand.class);

            if (!searchText.isEmpty()) {
                criteria.add(Restrictions.ilike("name", searchText, MatchMode.ANYWHERE));
            }

            List<Brand> resultList = criteria.list();

            for (Brand brand : resultList) {
                model.addElement(brand.getName());
            }

            brandlist.setModel(model);

        } catch (Exception e) {
            logger.error("Brand Searching Error ", e);

        } finally {
            session.close();
        }
    }

    //.----------------add Product---------------------.//
    public void addProduct() {
        String productName = productname.getText().trim();
        String brandName = brandname.getText().trim();
        boolean isDivisible = isdevide.isSelected();

        if (productName.isEmpty() || brandName.isEmpty()) {
            Alert.show("Please fill all fields", Alert.AlertType.WARNING);
            return;
        }
        if (productName.length() > 80) {
            Alert.show("Product was lagest ", Alert.AlertType.WARNING);
            return;
        }
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            Criteria brandCriteria = session.createCriteria(Brand.class);
            brandCriteria.add(Restrictions.eq("name", brandName));
            Brand brand = (Brand) brandCriteria.uniqueResult();

            if (brand == null) {
                Alert.show("Brand not found!", Alert.AlertType.ERROR);
                return;
            }

            Criteria productCriteria = session.createCriteria(Product.class);
            productCriteria.add(Restrictions.eq("name", productName));
            productCriteria.add(Restrictions.eq("brand", brand));  // ensure it's the same brand
            Product existingProduct = (Product) productCriteria.uniqueResult();

            if (existingProduct != null) {
                Alert.show("This product already exists!", Alert.AlertType.ERROR);
                return;
            }

            tx = session.beginTransaction();

            Product product = new Product();
            product.setName(productName);
            product.setBrand(brand);
            product.setIsDivisible(isDivisible);

            session.save(product);
            tx.commit();

            Alert.show("Product added successfully!", Alert.AlertType.SUCCESS);
            productname.setText("");
            isdevide.setSelected(false);
            loadProductsTable();
            clear();

        } catch (Exception e) {
            logger.error("Product adding ", e);

        } finally {
            session.close();
        }
    }

    //.----------------load table---------------------.//
    public void loadProductsTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Name", "Brand", "Divisible"});

        productList.clear();

        Session session = sessionFactory.openSession();

        try {
            List<Product> products = session.createCriteria(Product.class).list();

            for (Product p : products) {
                productList.add(p);

                model.addRow(new Object[]{
                    p.getName(),
                    p.getBrand().getName(),
                    p.GetIsDivisible() ? "Yes" : "No"
                });
            }

            producttable.setModel(model);

        } catch (Exception e) {
            logger.error("Load Product Error ", e);

        } finally {
            session.close();
        }
    }

    public void tableClicked() {
        int row = producttable.getSelectedRow();

        if (row != -1) {

            Product selectedProduct = productList.get(row);

            productname.setText(selectedProduct.getName());
            brandname.setText(selectedProduct.getBrand().getName());
            isdevide.setSelected(selectedProduct.GetIsDivisible());
        }
    }

    //.----------------update Product---------------------.//
    public void updateProduct() {
        int row = producttable.getSelectedRow();

        if (row == -1) {
            Alert.show("Please select a product first.", Alert.AlertType.WARNING);
            return;
        }

        Product selectedProduct = productList.get(row);

        int id = selectedProduct.getId();

        String name = productname.getText().trim();
        String brandName = brandname.getText().trim();
        boolean isDivisible = isdevide.isSelected();

        if (name.isEmpty() || brandName.isEmpty()) {
            Alert.show("Please fill in all fields.", Alert.AlertType.WARNING);
            return;
        }

        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {

            Criteria brandCriteria = session.createCriteria(Brand.class);
            brandCriteria.add(Restrictions.eq("name", brandName));
            Brand brand = (Brand) brandCriteria.uniqueResult();

            if (brand == null) {
                Alert.show("Brand not found.", Alert.AlertType.WARNING);
                return;
            }

            Criteria productCriteria = session.createCriteria(Product.class);
            productCriteria.add(Restrictions.eq("name", name));
            productCriteria.add(Restrictions.eq("brand", brand)); 
            Product existingProduct = (Product) productCriteria.uniqueResult();

            if (existingProduct != null) {
                Alert.show("This product already exists!", Alert.AlertType.ERROR);
                return;
            }

            tx = session.beginTransaction();

            Product product = (Product) session.get(Product.class, id);

            product.setName(name);
            product.setBrand(brand);
            product.setIsDivisible(isDivisible);

            session.update(product);
            tx.commit();

            Alert.show("Product updated successfully.", Alert.AlertType.SUCCESS);
            loadProductsTable();
            clear();

        } catch (Exception e) {
            logger.error("Product Update Error ", e);
            Alert.show("Update Failed.", Alert.AlertType.ERROR);

        } finally {
            session.close();
        }
    }

    public void clear() {
        brandname.setText("");
        productname.setText("");
        loadBrandList();
    }

}
