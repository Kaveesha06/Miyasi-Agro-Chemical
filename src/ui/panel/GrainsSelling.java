package ui.panel;

import hibernate.Grain;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.jdesktop.swingx.prompt.PromptSupport;
import util.Alert;
import util.Message;

public class GrainsSelling extends javax.swing.JPanel {

    SessionFactory sessionFactory = hibernate.HibernateUtil.getSessionFactory();

    public GrainsSelling() {
        initComponents();
        totalPrice.setEditable(false);
        balance.setEditable(false);
        PromptSupport.setPrompt("0.00", price);

        gList = new ArrayList();
        loadGranis();

        sell.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        grainsName = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        price = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        addList = new javax.swing.JButton();
        clearField = new javax.swing.JButton();
        kg = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        g = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellingGrainsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        paidAmount = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        balance = new javax.swing.JFormattedTextField();
        sell = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 249, 250));

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 45, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grains Selling");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(248, 249, 250));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setText("Grains :");

        grainsName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        grainsName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        grainsName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grainsNameItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 85, 104));
        jLabel3.setText("Selling Price :");

        price.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        price.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        price.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Quantity :");

        addList.setBackground(new java.awt.Color(66, 153, 225));
        addList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addList.setText("Add to List");
        addList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
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

        kg.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        kg.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 85, 104));
        jLabel8.setText("[Per kg]");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 85, 104));
        jLabel9.setText("kg");

        g.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        g.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999, 1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 85, 104));
        jLabel10.setText("g");

        jButton1.setBackground(new java.awt.Color(66, 153, 225));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Add Price");
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grainsName, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(kg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grainsName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(clearField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(248, 249, 250));

        sellingGrainsTable.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        sellingGrainsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grains", "Unit Price", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sellingGrainsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellingGrainsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(sellingGrainsTable);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 85, 104));
        jLabel5.setText("Total Price :");

        totalPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.00"))));
        totalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalPrice.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 85, 104));
        jLabel6.setText("Paid Amount :");

        paidAmount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        paidAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paidAmount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paidAmountKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 85, 104));
        jLabel7.setText("Balance :");

        balance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("'Rs.' #,##0.00' /-'"))));
        balance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        balance.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        sell.setBackground(new java.awt.Color(56, 161, 105));
        sell.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        sell.setText("Sell");
        sell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sell, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void clearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldActionPerformed
        clear();
    }//GEN-LAST:event_clearFieldActionPerformed

    private void grainsNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grainsNameItemStateChanged
        findProduct();
    }//GEN-LAST:event_grainsNameItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updatePrice();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
        addToList();
    }//GEN-LAST:event_addListActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        save();
    }//GEN-LAST:event_sellActionPerformed

    private void paidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidAmountKeyReleased
        setBalcne();
    }//GEN-LAST:event_paidAmountKeyReleased

    private void paidAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidAmountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_paidAmountKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addList;
    private javax.swing.JFormattedTextField balance;
    private javax.swing.JButton clearField;
    private javax.swing.JSpinner g;
    private javax.swing.JComboBox<String> grainsName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner kg;
    private javax.swing.JFormattedTextField paidAmount;
    private javax.swing.JFormattedTextField price;
    private javax.swing.JButton sell;
    private javax.swing.JTable sellingGrainsTable;
    private javax.swing.JFormattedTextField totalPrice;
    // End of variables declaration//GEN-END:variables

    private Grain current;
    private List<Grain> gList;

    private void loadGranis() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Grain.class);

        ArrayList<Grain> grainsList = (ArrayList<Grain>) criteria.list();
        session.close();

        DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
//        boxModel.addElement("Select");
        for (Grain grain : grainsList) {
            boxModel.addElement(grain.getName());
        }
        grainsName.setModel(boxModel);
    }

    private void findProduct() {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Grain.class);
        criteria.add(Restrictions.eq("name", grainsName.getSelectedItem()));
        current = (Grain) criteria.list().get(0);
        price.setText(String.valueOf(current.getSelling_price()));
        session.close();
    }

    private void updatePrice() {
        if (current != null) {
            Session session = sessionFactory.openSession();
            try {
                double price = Double.parseDouble(this.price.getText());
                if (price > 0) {
                    current.setSelling_price(price);
                    session.update(current);
                    session.beginTransaction().commit();
                    session.close();
                    Message.sucsses("Price Updated", "Success");
                } else {
                    Message.error("Wrong Price Format", "Error");
                }
            } catch (NumberFormatException e) {
                Message.error("Wrong Price Format", "Error");
            } catch (Exception e) {
                Message.error("Somthing Went Wrong Plase Try Again", "Error");
            }
        } else {
            Message.error("Product Not Found Plase Try Again", "Error");
        }

    }

    private void addToList() {

        String intPattern = "^[0-9]+$";        // integer only
        String doublePattern = "^[0-9]+(\\.[0-9]+)?$"; // integer or decimal
        String kgText = String.valueOf(this.kg.getValue());
        String gText = String.valueOf(this.g.getValue());
        try {

            if (current == null) {
                Message.warning("Please select a Grain !!", "Empty");
                return;
            }

            if (price.equals(0.00) && price == null) {
                Message.warning("Set selling price", "Empty");
                return;
            }

            if (kg.getValue().equals(0) && g.getValue().equals(0)) {
                Message.warning("Select Quantity", "Empty");
                return;
            }

            if (!kgText.matches(doublePattern)) {
                Message.warning("Kilograms must be a number.", "Validation Error");
            } else if (!gText.matches(doublePattern)) {
                Message.warning("Grams must be a number.", "Validation Error");
            }
            double kg = Double.parseDouble(kgText);
            double g = Double.parseDouble(gText);

            if (g > 1000) {
                Message.warning("Grams cannot be more than 1000.", "Validation Error");
            } else {
                double totalKg = kg + (g / 1000.0);

                if (current.getQty() >= totalKg) {
                    current.setQty(totalKg);
                    gList.add(current);

                    loadTable();

                } else {
                    Message.warning("Insufficient QTY", "QTY Error");
                }
            }
        } catch (NumberFormatException e) {
            Message.warning("Kilograms must be a number.", "Validation Error");
        }
        clear();
    }

    private void loadTable() {
        // Load The table using gList data;
        DefaultTableModel model = (DefaultTableModel) sellingGrainsTable.getModel();
        model.setRowCount(0);

        double total = 0.0;

        for (Grain g : gList) {
            Vector vector = new Vector();
            vector.add(g.getName());
            vector.add(g.getSelling_price());
            vector.add(g.getQty());

            double itemTotal = g.getQty() * g.getSelling_price();
            vector.add(itemTotal);

            model.addRow(vector);
            total += itemTotal;

            this.totalPrice.setText(String.valueOf(total));
        }
    }

    private void save() {
        DefaultTableModel model = (DefaultTableModel) sellingGrainsTable.getModel();
        if (model.getRowCount() == 0) {
            Alert.show("Empty item found", Alert.AlertType.WARNING);
            return;
        }
        String pay = paidAmount.getText();
        if (pay.isEmpty()) {
            Alert.show("Check payment amount", Alert.AlertType.WARNING);
            return;
        }

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            for (Grain grain : gList) {
                Grain g = (Grain) session.get(Grain.class, grain.getId());
                double newqty = g.getQty() - grain.getQty();
                g.setQty(newqty);
                session.save(g);

            }
            printBill(gList);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            Message.error("Something Went Wrong Plase Try Agin", "Database Error");
        }

        clear();

        model.setRowCount(0);

        totalPrice.setText("");
        paidAmount.setText("");
        balance.setText("");

    }

    private void clear() {
        grainsName.setSelectedIndex(0);
        price.setText("");
        kg.setValue(0);
        g.setValue(0);
    }

    private void printBill(List<Grain> gList) {

    }

    private void setBalcne() {
        try {
            double total = Double.parseDouble(totalPrice.getText());
            double paid = Double.parseDouble(paidAmount.getText());

            double blnc = total - paid;

            if (blnc <= 0) {
                sell.setEnabled(true);
                balance.setText(String.valueOf(blnc));
            } else {
                sell.setEnabled(false);
            }
        } catch (Exception e) {
            sell.setEnabled(false);
        }
    }
}
