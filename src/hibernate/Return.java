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
import javax.persistence.Table;

@Entity
@Table(name = "returns")
public class Return implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock Stock;

    @Column(name = "qty")
    private int qty;

    @Column(name = "isdamage")
    private boolean isdamage;

    public Return() {
    }

    public Return(int id, Date date, Stock Stock, int qty, boolean isdamage) {
        this.id = id;
        this.date = date;
        this.Stock = Stock;
        this.qty = qty;
        this.isdamage = isdamage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Stock getStock() {
        return Stock;
    }

    public void setStock(Stock Stock) {
        this.Stock = Stock;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean isIsdamage() {
        return isdamage;
    }

    public void setIsdamage(boolean isdamage) {
        this.isdamage = isdamage;
    }

}
