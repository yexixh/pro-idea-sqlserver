package learn2.pro.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "Cus")
public class Custom {

    @Id
    @Column(name = "custom_id")
    private String customID;

    private String customName;

    private String customAddress;

    private String customPhone;


    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public String getCustomAddress() {
        return customAddress;
    }

    public void setCustomAddress(String customAddress) {
        this.customAddress = customAddress;
    }

    public String getCustomPhone() {
        return customPhone;
    }

    public void setCustomPhone(String customPhone) {
        this.customPhone = customPhone;
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    @Override
    public String toString() {
        return "custom{" +
                "customName='" + customName + '\'' +
                ", customAddress='" + customAddress + '\'' +
                ", customPhone='" + customPhone + '\'' +
                ", customID='" + customID + '\'' +
                '}';
    }
}
