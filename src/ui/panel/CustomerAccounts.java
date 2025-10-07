package ui.panel;

import hibernate.Customer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.popup.AddCustomer;
import util.Alert;
import util.Message;

public class CustomerAccounts extends javax.swing.JPanel {

    private SessionFactory sessionFactory;
    private List<Customer> customerList = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(CustomerAccounts.class);
    private double creditValue;
    private Customer selectedCus;

    public CustomerAccounts() {
        initComponents();

        nic.setEnabled(false);
        name.setEnabled(false);
        credit_ammount.setEditable(false);
        sessionFactory = hibernate.HibernateUtil.getSessionFactory();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        add_new_customer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        update_b = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        c_table = new javax.swing.JTable();
        clear_b = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        paid_amount = new javax.swing.JFormattedTextField();
        credit_ammount = new javax.swing.JFormattedTextField();
        pay_b = new javax.swing.JButton();

        setBackground(new java.awt.Color(248, 249, 250));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 45, 66));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Accounts");

        add_new_customer.setBackground(new java.awt.Color(66, 153, 225));
        add_new_customer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add_new_customer.setText("Add New Customer");
        add_new_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_new_customerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 85, 104));
        jLabel2.setText("Name :");

        name.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 85, 104));
        jLabel3.setText("Contact No :");

        contact.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        update_b.setBackground(new java.awt.Color(66, 153, 225));
        update_b.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update_b.setText("Update");
        update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 85, 104));
        jLabel4.setText("NIC :");

        nic.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        c_table.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        c_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Name", "Contact No", "Credits Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        c_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(c_table);

        clear_b.setBackground(new java.awt.Color(229, 62, 62));
        clear_b.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clear_b.setText("Clear Field");
        clear_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_bActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 85, 104));
        jLabel5.setText("Credit Amount :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 85, 104));
        jLabel6.setText("Paid amount :");

        paid_amount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        paid_amount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paid_amount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        credit_ammount.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        credit_ammount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        credit_ammount.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        pay_b.setBackground(new java.awt.Color(56, 161, 105));
        pay_b.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        pay_b.setText("Pay");
        pay_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(add_new_customer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_b, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(clear_b, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(credit_ammount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(paid_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pay_b, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_new_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_b, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear_b, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pay_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paid_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(credit_ammount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_new_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_new_customerActionPerformed
        AddCustomer dialog = new AddCustomer(null, true);
        dialog.setVisible(true);
        loadTable();
    }//GEN-LAST:event_add_new_customerActionPerformed

    private void clear_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_bActionPerformed
        clearField();
    }//GEN-LAST:event_clear_bActionPerformed

    private void c_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_tableMouseClicked
        int row = c_table.getSelectedRow();

        if (row != -1) {
            selectedCus = customerList.get(row);
            nic.setText(selectedCus.getNic());
            name.setText(selectedCus.getName());
            contact.setText(selectedCus.getPhone());
            credit_ammount.setText(String.valueOf(selectedCus.getCredits()));
            creditValue = selectedCus.getCredits();

        }
    }//GEN-LAST:event_c_tableMouseClicked

    private void update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bActionPerformed
        updateCustomer();
        loadTable();
    }//GEN-LAST:event_update_bActionPerformed

    private void pay_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_bActionPerformed
        payCredits();
    }//GEN-LAST:event_pay_bActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_new_customer;
    private javax.swing.JTable c_table;
    private javax.swing.JButton clear_b;
    private javax.swing.JTextField contact;
    private javax.swing.JFormattedTextField credit_ammount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nic;
    private javax.swing.JFormattedTextField paid_amount;
    private javax.swing.JButton pay_b;
    private javax.swing.JButton update_b;
    // End of variables declaration//GEN-END:variables

    public void clearField() {
        nic.setText("");
        name.setText("");
        contact.setText("");
        credit_ammount.setText("");
        paid_amount.setText("");
        c_table.clearSelection();
    }

    //---------------load customer table------------------------//
    public void loadTable() {

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"NIC", "Name", "Contact No", "Credits Amount"});
        customerList.clear();
        Session session = sessionFactory.openSession();

        try {

            List<hibernate.Customer> customer = session.createCriteria(hibernate.Customer.class).list();

            for (Customer c : customer) {
                customerList.add(c);

                model.addRow(new Object[]{
                    c.getNic(),
                    c.getName(),
                    c.getPhone(),
                    c.getCredits()

                });
            }
            c_table.setModel(model);

        } catch (Exception e) {
            logger.error("Customer Table loading Error ", e);
        } finally {
            session.close();
        }
    }

    //--------------update Customer details---------------------//
    public void updateCustomer() {
        int row = c_table.getSelectedRow();

        if (row == -1) {
            Alert.show("Please select a customer first.", Alert.AlertType.WARNING);
            return;
        }

        Customer selectedCus = customerList.get(row);

        String nic = selectedCus.getNic();
        String cname = name.getText();
        String cmobile = contact.getText();

        if (cname.isEmpty() || cmobile.isEmpty()) {
            Alert.show("Please fill in all fields.", Alert.AlertType.WARNING);
            return;
        }
        Session session = sessionFactory.openSession();

        try {

            Criteria customerCriteria = session.createCriteria(Customer.class);
            customerCriteria.add(Restrictions.eq("phone", cmobile));
            Customer customer = (Customer) customerCriteria.uniqueResult();

            if (customer != null) {
                Alert.show("Mobile number was added before", Alert.AlertType.WARNING);
                return;
            }
            if (!cmobile.matches("^07[01245678]{1}[0-9]{7}$")) {
                Alert.show("Invalid Mobile number", Alert.AlertType.WARNING);
                return;
            }

            Transaction t = session.beginTransaction();

            Customer customerr = (Customer) session.get(Customer.class, nic);
            customerr.setName(cname);
            customerr.setPhone(cmobile);

            session.update(customerr);
            t.commit();

            Alert.show("Customer updated successfully.", Alert.AlertType.SUCCESS);
            clearField();

        } catch (Exception e) {
            logger.error("Customer update was failed ", e);
            Alert.show("Update Failed.", Alert.AlertType.ERROR);

        } finally {
            session.close();
        }

    }

    // Counter for auto IDs
    private static int billCounter = 1;

    // Method to generate a unique bill ID
    private static String generateBillId() {
        String date = new SimpleDateFormat("MMdd").format(new Date());
        return "BILL-" + date + "-" + (billCounter++);
    }

    ////----------------pay button------------------------\\\\
    public void payCredits() {
        if (selectedCus == null) {
            Alert.show("Select Customer Firts.", Alert.AlertType.WARNING);
            return;
        }
        double credit = creditValue;
        String uName = name.getText();
        String sCredit = String.valueOf(credit);

        if (paid_amount.getValue() == null) {
            Alert.show("Paid amount 0.0", Alert.AlertType.WARNING);
            return;
        }
        Number paidValue = (Number) paid_amount.getValue();
        double paid = paidValue.doubleValue();
        String sPaid = String.valueOf(paid);

        double newCredit = credit - paid;
        String sNewCredit = String.valueOf(newCredit);

        if (paid >= credit) {
            
            double balanced = newCredit - newCredit;
            selectedCus.setCredits(balanced);

            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to print the bill?",
                    "Print Confirmation",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {

                try {
                    HashMap<String, Object> parm = new HashMap<>();

                    String billId = generateBillId();
                    parm.put("Parameter1", billId);
                    parm.put("Parameter2", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
                    parm.put("Parameter3", uName);
                    parm.put("Parameter4", sCredit);
                    parm.put("Parameter5", sPaid);
                    parm.put("Parameter6", sNewCredit);
                    parm.put("Parameter7", "0.00");

                    String in = "C:\\pos\\creditPay.jasper";

                    new util.Reporting().printReport(in, parm);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

//            Message.sucsses("Balanced:" + newCredit, "SUCCESS");
            
            Session session = sessionFactory.openSession();

            try {

                Transaction t = session.beginTransaction();
                session.update(selectedCus);
                t.commit();

            } catch (Exception e) {
                logger.error("Credit payment Error:", e);
            } finally {
                session.close();
            }
            credit_ammount.setText(String.valueOf(balanced));
            clearField();
            loadTable();
            selectedCus = null;
            return;
        }

        if (credit > paid) {
            
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to print the bill?",
                    "Print Confirmation",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {

                try {
                    HashMap<String, Object> parm = new HashMap<>();

                    String billId = generateBillId();
                    parm.put("Parameter1", billId);
                    parm.put("Parameter2", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
                    parm.put("Parameter3", uName);
                    parm.put("Parameter4", sCredit);
                    parm.put("Parameter5", sPaid);
                    parm.put("Parameter6", "0.00");
                    parm.put("Parameter7", sNewCredit);

                    String in = "C:\\pos\\creditPay.jasper";

                    new util.Reporting().printReport(in, parm);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            Message.sucsses("Paid Success! Available: " + newCredit, "SUCCESS");
            selectedCus.setCredits(newCredit);
            Session session = sessionFactory.openSession();

            try {

                Transaction t = session.beginTransaction();
                session.update(selectedCus);
                t.commit();

            } catch (Exception e) {
                logger.error("Credit Payment Error", e);
            } finally {
                session.close();
            }
            credit_ammount.setText(String.valueOf(newCredit));
            clearField();
            loadTable();
            selectedCus = null;
            return;
        }

    }
}
