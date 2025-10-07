package hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grn_item")
public class GRNItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "grn")
    private GRN grn;

    @Column(name = "buying_price")
    private double buyingPrice;

    @Column(name = "qty")
    private int qty;

    public GRNItem() {
    }

    public GRNItem(Product product, GRN grn, double buyingPrice, int qty) {
        this.product = product;
        this.grn = grn;
        this.buyingPrice = buyingPrice;
        this.qty = qty;
    }

    public GRNItem(int id, Product product, GRN grn, double buyingPrice, int qty) {
        this.id = id;
        this.product = product;
        this.grn = grn;
        this.buyingPrice = buyingPrice;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public GRN getGrn() {
        return grn;
    }

    public void setGrn(GRN grn) {
        this.grn = grn;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
