package hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_return_item")
public class CustomerReturnItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "qty")
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "return_id")
    private CustomerReturn customerReturn;

    @ManyToOne
    @JoinColumn(name = "sale_item_id")
    private SaleItem saleItem;

    public CustomerReturnItem() {
    }

    public CustomerReturnItem(int id, double quantity, CustomerReturn customerReturn, SaleItem saleItem) {
        this.id = id;
        this.quantity = quantity;
        this.customerReturn = customerReturn;
        this.saleItem = saleItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public CustomerReturn getCustomerReturn() {
        return customerReturn;
    }

    public void setCustomerReturn(CustomerReturn customerReturn) {
        this.customerReturn = customerReturn;
    }

    public SaleItem getSaleItem() {
        return saleItem;
    }

    public void setSaleItem(SaleItem saleItem) {
        this.saleItem = saleItem;
    }
}
