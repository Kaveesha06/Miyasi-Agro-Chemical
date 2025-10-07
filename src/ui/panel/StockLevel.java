package ui.panel;

import hibernate.Stock;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.BarcodeUtil;
import util.Message;

public class StockLevel extends javax.swing.JPanel {

    private SessionFactory sessionFactory;

    public StockLevel() {
        initComponents();
        this.sessionFactory = hibernate.HibernateUtil.getSessionFactory();
        stock_id.setEnabled(false);
        product_name.setEnabled(false);
        current = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stokTable = new javax.swing.JTable();
        load_table_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stock_id = new javax.swing.JTextField();
        product_name = new javax.swing.JTextField();
        product_qty = new javax.swing.JFormattedTextField();
        print_barCode_button = new javax.swing.JButton();
        dateTo = new com.toedter.calendar.JDateChooser();
        dateForm = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stockId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(248, 249, 250));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 45, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stock");

        stokTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        stokTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Srock ID", "Product ID", "Product Name", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stokTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stokTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stokTable);

        load_table_button.setBackground(new java.awt.Color(66, 153, 225));
        load_table_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        load_table_button.setText("Load Table");
        load_table_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_table_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 85, 104));
        jLabel3.setText("Product Name :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("Stock ID :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 85, 104));
        jLabel6.setText("Qty :");

        stock_id.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        product_name.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        product_qty.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        product_qty.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        print_barCode_button.setBackground(new java.awt.Color(56, 161, 105));
        print_barCode_button.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        print_barCode_button.setText("Print BarCode");
        print_barCode_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_barCode_buttonActionPerformed(evt);
            }
        });

        dateTo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        dateForm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("From");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("To");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 85, 104));
        jLabel8.setText("Product or Stock ID :");

        jButton1.setBackground(new java.awt.Color(229, 62, 62));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 143, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dateForm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(load_table_button, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print_barCode_button, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(stockId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(load_table_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(product_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print_barCode_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void load_table_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_table_buttonActionPerformed
        findStock();
    }//GEN-LAST:event_load_table_buttonActionPerformed

    private void stokTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stokTableMouseClicked
        if (evt.getClickCount() == 2) {
            selectStock();
        }
    }//GEN-LAST:event_stokTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearField();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void print_barCode_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_barCode_buttonActionPerformed
        print();
    }//GEN-LAST:event_print_barCode_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateForm;
    private com.toedter.calendar.JDateChooser dateTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton load_table_button;
    private javax.swing.JButton print_barCode_button;
    private javax.swing.JTextField product_name;
    private javax.swing.JFormattedTextField product_qty;
    private javax.swing.JTextField stockId;
    private javax.swing.JTextField stock_id;
    private javax.swing.JTable stokTable;
    // End of variables declaration//GEN-END:variables

    private List<Stock> current;
    private Stock stock;

    public void clearField() {
        stockId.setText("");
        stock_id.setText("");
        product_name.setText("");
        product_qty.setText("");
        this.dateForm.cleanup();
        this.dateTo.cleanup();
        current = new ArrayList<>();
        stock = null;
        loadTable();
    }

    private void findStock() {
        String stockIdText = this.stockId.getText().trim();
        Date from = this.dateForm.getDate();
        Date to = this.dateTo.getDate();

        if (from != null || to != null || !stockIdText.isEmpty()) {
            Session session = sessionFactory.openSession();

            StringBuilder hql = new StringBuilder(
                    "SELECT s FROM Stock s JOIN s.grnItem gi JOIN gi.grn g WHERE 1=1 "
            );

            if (from != null && to == null) {
                hql.append("AND g.date >= :from ");
            }

            if (from == null && to != null) {
                hql.append("AND g.date <= :to ");
            }

            if (from != null && to != null) {
                hql.append("AND g.date BETWEEN :from AND :to ");
            }

            if (!stockIdText.isEmpty()) {
                hql.append("AND s.id = :stockId ");
            }

            Query query = session.createQuery(hql.toString());

            if (from != null && to == null) {
                query.setParameter("from", from);
            }

            if (from == null && to != null) {
                query.setParameter("to", to);
            }

            if (from != null && to != null) {
                query.setParameter("from", from);
                query.setParameter("to", to);
            }

            if (!stockIdText.isEmpty()) {
                int stockId = Integer.parseInt(stockIdText);
                query.setParameter("stockId", stockId);
            }

            this.current = query.list();
            session.close();
            loadTable();
        } else {
            Message.warning("Please Add Date or Stock ID for Search", "Missing Data");
        }
    }

    private void loadTable() {
        DefaultTableModel model = (DefaultTableModel) stokTable.getModel();
        model.setRowCount(0);
        for (Stock stock : current) {
            Vector<String> vector = new Vector();
            vector.add(String.valueOf(stock.getId()));
            vector.add(String.valueOf(stock.getGrnItem().getProduct().getId()));
            vector.add(String.valueOf(stock.getGrnItem().getProduct().getName()));
            vector.add(String.valueOf(stock.getWholeQty() + " Items / " + stock.getLooseQty() + " KG"));
            model.addRow(vector);
        }

        this.stokTable.setModel(model);
    }

    private void selectStock() {
        stock = current.get(stokTable.getSelectedRow());

        stock_id.setText(String.valueOf(stock.getId()));
        product_name.setText(stock.getGrnItem().getProduct().getName());
    }

    private void print() {
        try {
            int qty = Integer.parseInt(product_qty.getText());

            if (qty > 0) {
                String productId = String.valueOf(stock.getId());
                String productName = stock.getGrnItem().getProduct().getName();
                double price = stock.getPrice();

                for (int i = 0; i < qty; i++) {
                    BarcodeUtil.printBarcode(productId, productName, price);
                }

            } else {
                Message.warning("Please Enter Valid QTY", "Validation Error");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Message.warning("Please Enter Valid QTY", "Validation Error");
        }
    }

}
