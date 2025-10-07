package ui.panel;

import hibernate.Grain;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.jdesktop.swingx.prompt.PromptSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.CoreValidator;
import util.Message;

public class BuyGrains extends javax.swing.JPanel {

    private static final Logger logger = LoggerFactory.getLogger(BuyGrains.class);
    private SessionFactory sessionFactory;
    private List<Grain> grainsList;

    public BuyGrains() {
        initComponents();
        totalPrice.setEnabled(false);
        tableContent();
        PromptSupport.setPrompt("0.00", buyingPrice);
        sessionFactory = hibernate.HibernateUtil.getSessionFactory();
        loadGranis("");
        this.grainsList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        grainsName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        buyingPrice = new javax.swing.JFormattedTextField();
        kg = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        g = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addtoList = new javax.swing.JButton();
        clearField = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grainTable = new javax.swing.JTable();
        viewReport = new javax.swing.JButton();
        totalPrice = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));

        jLabel2.setBackground(new java.awt.Color(248, 249, 250));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 45, 66));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buy Grains");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(248, 249, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 85, 104));
        jLabel1.setText("Name :");

        grainsName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        grainsName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grainsNameKeyReleased(evt);
            }
        });

        gList.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        gList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(gList);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 85, 104));
        jLabel3.setText("Buying Price :");

        buyingPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        buyingPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buyingPrice.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        kg.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        kg.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));
        kg.setValue(0);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Quantity :");

        g.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        g.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 85, 104));
        jLabel5.setText("kg");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 85, 104));
        jLabel6.setText("g");

        addtoList.setBackground(new java.awt.Color(66, 153, 225));
        addtoList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addtoList.setText("Add to list");
        addtoList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addtoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoListActionPerformed(evt);
            }
        });

        clearField.setBackground(new java.awt.Color(229, 62, 62));
        clearField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearField.setText("Clear Field");
        clearField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 85, 104));
        jLabel7.setText("[per kg]");

        jPanel4.setBackground(new java.awt.Color(248, 249, 250));

        grainTable.setBackground(new java.awt.Color(248, 249, 250));
        grainTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        grainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Buying Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grainTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(grainTable);

        viewReport.setBackground(new java.awt.Color(56, 161, 105));
        viewReport.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        viewReport.setText("Save");
        viewReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportActionPerformed(evt);
            }
        });

        totalPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        totalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalPrice.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 85, 104));
        jLabel8.setText("Total Price :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(66, 153, 225));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Add Name");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grainsName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addtoList, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(kg, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grainsName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtoList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(clearField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldActionPerformed
        clearAll();
    }//GEN-LAST:event_clearFieldActionPerformed

    //search Grains
    private void grainsNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grainsNameKeyReleased
        loadGranis(this.grainsName.getText());
    }//GEN-LAST:event_grainsNameKeyReleased

    //register new 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveGrains();
    }//GEN-LAST:event_jButton1ActionPerformed

    // add to the table
    private void addtoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoListActionPerformed
        setupBuy();
    }//GEN-LAST:event_addtoListActionPerformed

    private void viewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportActionPerformed
        Save();
    }//GEN-LAST:event_viewReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoList;
    private javax.swing.JFormattedTextField buyingPrice;
    private javax.swing.JButton clearField;
    private javax.swing.JSpinner g;
    private javax.swing.JList<String> gList;
    private javax.swing.JTable grainTable;
    private javax.swing.JTextField grainsName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner kg;
    private javax.swing.JFormattedTextField totalPrice;
    private javax.swing.JButton viewReport;
    // End of variables declaration//GEN-END:variables

    public void tableContent() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < grainTable.getColumnCount(); i++) {
            grainTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        ((DefaultTableCellRenderer) grainTable.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void loadGranis(String name) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Grain.class);

        if (!name.isEmpty()) {
            criteria.add(Restrictions.ilike("name", name, MatchMode.ANYWHERE));
        }

        ArrayList<Grain> grainsList = (ArrayList<Grain>) criteria.list();
        session.close();

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Grain grain : grainsList) {
            listModel.addElement(grain.getName());
        }
        this.gList.setModel(listModel);
    }

    // register new granis
    private void saveGrains() {
        String name = this.grainsName.getText();
        if (!name.isEmpty()) {
            try {
                Session session = sessionFactory.openSession();
                Criteria criteria = session.createCriteria(Grain.class);
                criteria.add(Restrictions.ilike("name", name, MatchMode.ANYWHERE));

                if (criteria.list().isEmpty()) {
                    Grain grain = new Grain();
                    grain.setName(name);
                    session.save(grain);
                    session.beginTransaction().commit();
                    session.close();
                    Message.sucsses("New Product Registered [name : " + name + "]", "Sucsses");
                    grainsName.setText("");
                    loadGranis("");
                } else {
                    Message.error("Product Already Registered", "Warning");
                }

            } catch (Exception e) {
                e.printStackTrace();
                logger.error("Grains save Error", e);
                Message.error("Somthing Went Wrong", "Error");
            }

            Grain grain = new Grain();
            grain.setName(name);
        } else {
            Message.error("Name Can not be empty", "Warning");
        }

    }

    private void setupBuy() {

        String name = this.gList.getSelectedValue();

        if (name != null && !name.isEmpty()) {
            Session session = sessionFactory.openSession();

            Criteria criteria = session.createCriteria(Grain.class);
            criteria.add(Restrictions.eq("name", name));
            if (!criteria.list().isEmpty()) {
                Grain grain = (Grain) criteria.list().get(0);

                String price = buyingPrice.getText();
                try {
                    double buyPrice = Double.parseDouble(price);
                    grain.setBuying_price(buyPrice);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.error("Price update Error", e);
                    Message.warning("Price Update Faild Plase Try Again ", "Error");
                    return;
                }

                try {
                    double kg = Double.parseDouble(String.valueOf(this.kg.getValue()));
                    double g = Double.parseDouble(String.valueOf(this.g.getValue()));
                    if (g >= 1000) {
                        Message.error("Grams must be less than 1000", "Warning");
                        return;
                    } else {
                        double totalKg = kg + (g / 1000.0);
                        if (totalKg > 0) {
                            grain.setQty(totalKg);
                            grainsList.add(grain);
                            showProducts();
                        } else {
                            Message.warning("Qty is 0", "Error");
                        }
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    Message.warning("Please enter valid numbers", "Error");
                }
            } else {
                Message.error("Produc not Found Plase Try again", "Error");
            }
            session.close();
        } else {
            Message.warning("Plases Select A product", "warning");
        }
    }

    private void showProducts() {
        DefaultTableModel model = (DefaultTableModel) grainTable.getModel();
        model.setRowCount(0);
        for (Grain grain : grainsList) {
            Vector vector = new Vector();
            vector.add(grain.getName());
            vector.add(grain.getBuying_price());
            vector.add(grain.getQty());
            vector.add(grain.getBuying_price() * grain.getQty());
            model.addRow(vector);
            setTotal();
        }
        this.grainTable.setModel(model);
        setTotal();
        clearFieald();
    }

    private void clearFieald() {
        grainsName.setText("");
        buyingPrice.setText("0.00");
        kg.setValue(0);
        g.setValue(0);
        this.gList.clearSelection();
    }

    private void clearAll() {
        clearFieald();
        this.totalPrice.setText("");
        DefaultTableModel model = (DefaultTableModel) grainTable.getModel();
        model.setRowCount(0);
        this.grainTable.setModel(model);
        this.grainsList = new ArrayList<>();
    }

    private void Save() {
        if (grainsList.isEmpty()) {
            Message.error("Product Not In the List", "Iteam Not found");
        } else {

            Session session = sessionFactory.openSession();

            for (Grain grain : grainsList) {

                Criteria criteria = session.createCriteria(Grain.class);

                criteria.add(Restrictions.eq("name", grain.getName()));
                if (!criteria.list().isEmpty()) {

                    Grain g = (Grain) criteria.list().get(0);
                    double newqty = g.getQty() + grain.getQty();

                    System.out.println(g.getQty() + " + " + grain.getQty() + " = " + newqty);

                    g.setQty(newqty);
                    session.save(g);
                } else {
                    Message.error("Product Not Found [" + grain.getName() + "]", "Iteam Not found");
                }
            }
            session.beginTransaction().commit();
            session.close();
            Message.sucsses("Done", "Iteam Not found");
            clearAll();
            // Print the bill 
        }

    }

    private void setTotal() {
        double total = 0;
        for (Grain grain : grainsList) {
            total = total + (grain.getQty() * grain.getBuying_price());
        }
        this.totalPrice.setText(String.valueOf(total));
    }

}
