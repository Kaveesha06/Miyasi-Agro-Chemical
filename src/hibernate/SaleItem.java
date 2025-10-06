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
@Table(name = "sale_item")
public class SaleItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne
    @JoinColumn(name = "sales_id")
    private Sale sale;

    @Column(name = "qty")
    private double quantity;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "is_pack_sale")
    private boolean isPackSale;

    @Column(name = "discount")
    private double discount;

    public SaleItem() {
    }

    public SaleItem(Stock stock, Sale sale, double quantity, double unitPrice, boolean isPackSale, double discount) {
        this.id = id;
        this.stock = stock;
        this.sale = sale;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.isPackSale = isPackSale;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isIsPackSale() {
        return isPackSale;
    }

    public void setIsPackSale(boolean isPackSale) {
        this.isPackSale = isPackSale;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
