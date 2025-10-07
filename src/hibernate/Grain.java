package hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grain")
public class Grain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "buying_price")
    private double buying_price;

    @Column(name = "selling_price")
    private double selling_price;

    @Column(name = "qty")
    private double qty;

    public Grain() {
    }

    public Grain(String name, double buying_price, double selling_price, double qty) {
        this.name = name;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.qty = qty;
    }

    public Grain(int id, String name, double buying_price, double selling_price, double qty) {
        this.id = id;
        this.name = name;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.qty = qty;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBuying_price() {
        return buying_price;
    }

    public void setBuying_price(double buying_price) {
        this.buying_price = buying_price;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

}
