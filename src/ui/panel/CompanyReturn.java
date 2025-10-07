package ui.panel;

import hibernate.Return;
import hibernate.Stock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Message;

public class CompanyReturn extends javax.swing.JPanel {

    SessionFactory factory;

    private static final Logger logger = LoggerFactory.getLogger(CompanyReturn.class);

    public CompanyReturn() {
        initComponents();
        r_p_name.setEnabled(false);
        factory = hibernate.HibernateUtil.getSessionFactory();
        updateList = new ArrayList<>();
        currentList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stockId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        qty = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        addTo_r_list = new javax.swing.JButton();
        clear_r_field = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        r_table = new javax.swing.JTable();
        r_button = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        r_p_name = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(248, 249, 250));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product Return");

        stockId.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        stockId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stockIdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setText("Enter Stock ID :");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 85, 104));
        jLabel16.setText("Product Name :");

        qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Qty :");

        addTo_r_list.setBackground(new java.awt.Color(66, 153, 225));
        addTo_r_list.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addTo_r_list.setText("Add to List");
        addTo_r_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTo_r_listActionPerformed(evt);
            }
        });

        clear_r_field.setBackground(new java.awt.Color(229, 62, 62));
        clear_r_field.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clear_r_field.setText("Clear Field");
        clear_r_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_r_fieldActionPerformed(evt);
            }
        });

        r_table.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        r_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Return Qty", "Return Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(r_table);

        r_button.setBackground(new java.awt.Color(56, 161, 105));
        r_button.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        r_button.setText("Return");
        r_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_buttonActionPerformed(evt);
            }
        });

        r_p_name.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Companey", "Damage" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(r_p_name, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addTo_r_list)
                                .addGap(18, 18, 18)
                                .addComponent(clear_r_field)))))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel16)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTo_r_list, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_r_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_p_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clear_r_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_r_fieldActionPerformed
        clearField();
    }//GEN-LAST:event_clear_r_fieldActionPerformed

    private void addTo_r_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTo_r_listActionPerformed
        addToList();
    }//GEN-LAST:event_addTo_r_listActionPerformed

    private void r_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_buttonActionPerformed
        save();
    }//GEN-LAST:event_r_buttonActionPerformed

    private void stockIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockIdKeyReleased
        findProduct();
    }//GEN-LAST:event_stockIdKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTo_r_list;
    private javax.swing.JButton clear_r_field;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField qty;
    private javax.swing.JButton r_button;
    private javax.swing.JTextField r_p_name;
    private javax.swing.JTable r_table;
    private javax.swing.JTextField stockId;
    // End of variables declaration//GEN-END:variables

    public void clearField() {
        stockId.setText("");
        r_p_name.setText("");
        qty.setText("");
        current = null;
    }

    private Stock current;
    private List<Stock> currentList;
    private List<Stock> updateList;

    private void findProduct() {
        if (stockId.getText().length() >= 8) {
            try {
                Session session = factory.openSession();
                current = (Stock) session.get(Stock.class, Integer.valueOf(stockId.getText()));
                if (current == null) {
                    Message.warning("Bill Data Not Found", "Not Found");
                    r_p_name.setText("");
                } else {
                    r_p_name.setText(current.getGrnItem().getProduct().getName());
                }
                session.close();
            } catch (Exception e) {
                r_p_name.setText("");
                Message.warning("Bill Data Not Found", "Not Found");
                logger.error("find Product", e);
            }

        }

    }

    private void addToList() {
        try {
            int lqty = Integer.parseInt(this.qty.getText());
            if (current.getWholeQty() >= lqty) {

                Stock stock = new Stock(
                        current.getId(),
                        current.getPackSize(),
                        current.getWholeQty(),
                        current.getLooseQty(),
                        current.getDiscount(),
                        current.getGrnItem(),
                        current.getExp(),
                        current.getPrice(), current.getPricePerUnit());

                current.setWholeQty(lqty);

                int newQTY = stock.getWholeQty() - lqty;
                stock.setWholeQty(newQTY);

                updateList.add(stock);
                currentList.add(current);

                clearField();
                loadTable();
            } else {
                Message.warning("Wrong Qty", "Error");
            }
        } catch (NumberFormatException e) {
            Message.warning("Wrong Qty", "Error");
        }
    }

    private void save() {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {

            boolean isDamage = false;

            if (jComboBox1.getSelectedIndex() == 1) {
                isDamage = true;
            }

            for (Stock stock : updateList) {
                session.update(stock);
            }

            for (Stock stock : currentList) {
                Return returns = new Return(0, new Date(), stock, stock.getWholeQty(), isDamage);
                session.save(returns);
            }

            transaction.commit();

            Message.sucsses("Retures Saved", "Sussess");
            clearAll();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            logger.error("Returen Error", e);
        }
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) r_table.getModel();
        model.setRowCount(0);
        double total = 0;
        for (Stock stock : currentList) {
            Vector<String> vector = new Vector();
            vector.add(stock.getGrnItem().getProduct().getName());
            vector.add(String.valueOf(String.valueOf(stock.getWholeQty())));
            double subT = stock.getWholeQty() * stock.getPrice();
            vector.add(String.valueOf(subT));
            model.addRow(vector);
            total += subT;
        }
        r_table.setModel(model);
        jTextField1.setText(String.valueOf(total));
    }

    private void clearAll() {
        current = null;
        currentList = new ArrayList<>();
        updateList = new ArrayList<>();
        clearField();
        loadTable();
    }

}
