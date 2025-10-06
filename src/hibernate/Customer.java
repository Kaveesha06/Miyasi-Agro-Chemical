package hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custome")
public class Customer implements Serializable {

    @Id
    @Column(name="nic", length = 12, nullable = false)
    private String nic;
    
    @Column(name="name", length = 100, nullable = false)
    private String name;
    
    @Column(name="phone", length = 10, nullable = true)
    private String phone;
    
    @Column(name="address", length = 100, nullable = true)
    private String address;
    
    @Column(name="credits", nullable = false)
    private double credits;

    public Customer(String nic, String name, String phone, String address, double credits) {
        this.nic = nic;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.credits = credits;
    }

    public Customer() {
        
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
