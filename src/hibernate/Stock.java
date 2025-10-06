package hibernate;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pack_size", nullable = false)
    private double packSize;

    @Column(name = "whole_qty", nullable = false)
    private int wholeQty;

    @Column(name = "loose_qty", nullable = false)
    private double looseQty;

    @Column(name = "discount", nullable = false)
    private double discount;

    @ManyToOne
    @JoinColumn(name = "grn_item_id")
    private GRNItem grnItem;

    @Column(name = "exp", nullable = true)
    private Date exp;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "price_pre_unit", nullable = false)
    private double pricePerUnit;

    // Constructors
    public Stock() {
    }

    public Stock(int id, double packSize, int wholeQty, double looseQty, double discount, GRNItem grnItem, Date exp, double price, double pricePerUnit) {
        this.id = id;
        this.packSize = packSize;
        this.wholeQty = wholeQty;
        this.looseQty = looseQty;
        this.discount = discount;
        this.grnItem = grnItem;
        this.exp = exp;
        this.price = price;
        this.pricePerUnit = pricePerUnit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
   
    public double getPackSize() {
        return packSize;
    }

    public void setPackSize(double packSize) {
        this.packSize = packSize;
    }

    public int getWholeQty() {
        return wholeQty;
    }

    public void setWholeQty(int wholeQty) {
        this.wholeQty = wholeQty;
    }

    public double getLooseQty() {
        return looseQty;
    }

    public void setLooseQty(double looseQty) {
        this.looseQty = looseQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public GRNItem getGrnItem() {
        return grnItem;
    }

    public void setGrnItem(GRNItem grnItem) {
        this.grnItem = grnItem;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
