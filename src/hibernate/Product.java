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
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id") // FK in product table
    private Brand brand;

    @Column(name = "is_divisible", nullable = false)
    private boolean isDivisible;

    public Product() {
    }

//    public Product(String Name, int brandId, String brand, boolean is_divisible) {
//        this.id = id;
//        this.Name = Name;
//        this.Brand = brandId;
//        this.is_divisible = is_divisible;
//
//    }
//    public Product(int id, String Name, int brand, boolean is_divisible) {
//        this.id = id;
//        this.Name = Name;
//        this.brand = brand;
//        this.is_divisible = is_divisible;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public boolean GetIsDivisible() {
        return isDivisible;
    }

    public void setIsDivisible(boolean isDivisible) {
        this.isDivisible = isDivisible;
    }

}
