package ui.panel;

import hibernate.CustomerReturn;
import hibernate.CustomerReturnItem;
import hibernate.Sale;
import hibernate.SaleItem;
import hibernate.Stock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Message;

public class CostomerReturn extends javax.swing.JPanel {

    SessionFactory factory = hibernate.HibernateUtil.getSessionFactory();
    private static final Logger logger = LoggerFactory.getLogger(CostomerReturn.class);

    public CostomerReturn() {
        initComponents();
        product_name.setEnabled(false);
        return_total.setEnabled(false);
        this.returnList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customer_return_t = new javax.swing.JTable();
        bill_id = new javax.swing.JTextField();
        product_name = new javax.swing.JTextField();
        qty = new javax.swing.JFormattedTextField();
        r_button = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        clear_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        return_total = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 249, 250));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Returns");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 85, 104));
        jLabel1.setText("Bill ID :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setText("Product Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Qty :");

        customer_return_t.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        customer_return_t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customer_return_t);

        bill_id.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        bill_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bill_idKeyReleased(evt);
            }
        });

        product_name.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        qty.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        qty.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        r_button.setBackground(new java.awt.Color(66, 153, 225));
        r_button.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        r_button.setText("Return");
        r_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_buttonActionPerformed(evt);
            }
        });

        clear_button.setBackground(new java.awt.Color(229, 62, 62));
        clear_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clear_button.setText("Clear Field");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 85, 104));
        jLabel7.setText("Return Total :");

        return_total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        return_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        return_total.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(66, 153, 225));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(bill_id))
                        .addGap(35, 35, 35)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(923, 923, 923)
                        .addComponent(r_button, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(return_total, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(return_total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        cleatField();
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        stageProduct();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addToList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_buttonActionPerformed
        Save();
    }//GEN-LAST:event_r_buttonActionPerformed

    private void bill_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_idKeyReleased
        findProduct();
    }//GEN-LAST:event_bill_idKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bill_id;
    private javax.swing.JButton clear_button;
    private javax.swing.JTable customer_return_t;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField product_name;
    private javax.swing.JFormattedTextField qty;
    private javax.swing.JButton r_button;
    private javax.swing.JFormattedTextField return_total;
    // End of variables declaration//GEN-END:variables

    public void cleatField() {
        bill_id.setText("");
        product_name.setText("");
        qty.setText("");
        return_total.setText("");
        customer_return_t.clearSelection();
        current = null;
    }

    List<SaleItem> currentList;
    List<CustomerReturnItem> returnList;
    Sale current;

    private void findProduct() {
        if (bill_id.getText().length() >= 8) {
            try {
                Session session = factory.openSession();
                Sale sale = (Sale) session.get(Sale.class, Integer.valueOf(bill_id.getText()));

                if (sale != null) {
                    current = sale;
                    Criteria c = session.createCriteria(SaleItem.class);
                    c.add(Restrictions.eq("sale", current));
                    currentList = c.list();
                    session.close();

                    loadCombo();
                } else {
                    Message.warning("Bill Data Not Found", "Not Found");
                }
            } catch (Exception e) {
                Message.warning("Bill Data Not Found", "Not Found");
                logger.error("Find Product", e);
            }

        }
    }

    private void loadCombo() {
        DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
        boxModel.addElement("Select Product");
        for (SaleItem saleItem : currentList) {
            boxModel.addElement(saleItem.getStock().getGrnItem().getProduct().getName());
        }
        jComboBox1.setModel(boxModel);
    }

    private void stageProduct() {
        if (jComboBox1.getSelectedIndex() >= 1) {
            int index = jComboBox1.getSelectedIndex() - 1;
            product_name.setText(currentList.get(index).getStock().getGrnItem().getProduct().getName());
        } else {
            product_name.setText("");
        }
    }

    private void addToList() {
        try {
            if (jComboBox1.getSelectedIndex() >= 1) {
                int lqty = Integer.parseInt(this.qty.getText());
                int index = jComboBox1.getSelectedIndex() - 1;
                if (currentList.get(index).getQuantity() >= lqty) {
                    returnList.add(new CustomerReturnItem(0, lqty, null, currentList.get(index)));

                    loadTable();
                } else {
                    Message.warning("Wrong Qty", "Error");
                }
            } else {
                Message.warning("Select A product", "Error");
            }
        } catch (NumberFormatException e) {
            Message.warning("Wrong Qty", "Error");
        }
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) customer_return_t.getModel();
        model.setRowCount(0);
        double total = 0;

        double grandTotal = 0;
        for (CustomerReturnItem c : returnList) {
            Vector vector = new Vector();
            vector.add(c.getSaleItem().getStock().getGrnItem().getProduct().getName());
            vector.add(c.getQuantity());
            double subT = c.getQuantity() * c.getSaleItem().getStock().getPrice();
            grandTotal += subT;
            vector.add(String.valueOf(subT));
            model.addRow(vector);
        }
        customer_return_t.setModel(model);
        return_total.setText(String.valueOf(grandTotal));
    }

    private void Save() {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        CustomerReturn customerReturn = new CustomerReturn(0, new Date(), current);

        try {
            session.save(customerReturn);
            for (CustomerReturnItem r : returnList) {
                r.setCustomerReturn(customerReturn);
                session.save(r);
            }
            transaction.commit();
            Message.sucsses("Returns Saved", "Success");
            clearAll();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            logger.error("save Error", e);
        }
    }

    private void clearAll() {
        cleatField();
        current = null;
        currentList = new ArrayList<>();
        returnList = new ArrayList<>();
        loadTable();
        loadCombo();
    }

}
