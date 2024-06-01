package learn2.pro.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sup")
public class Supplier {
    @Id
    private String supID;
    private String supName;
    private String supAddress;
    private String supPhone;
    private String supPerson;

    public String getSupID() {
        return supID;
    }

    public void setSupID(String supID) {
        this.supID = supID;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress;
    }

    public String getSupPhone() {
        return supPhone;
    }

    public void setSupPhone(String supPhone) {
        this.supPhone = supPhone;
    }

    public String getSupPerson() {
        return supPerson;
    }

    public void setSupPerson(String supPerson) {
        this.supPerson = supPerson;
    }

    @Override
    public String toString() {
        return "Sup{" +
                "supID='" + supID + '\'' +
                ", supName='" + supName + '\'' +
                ", supAddress='" + supAddress + '\'' +
                ", supPhone='" + supPhone + '\'' +
                ", supPerson='" + supPerson + '\'' +
                '}';
    }
}
