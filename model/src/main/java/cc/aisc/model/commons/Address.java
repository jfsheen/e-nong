package cc.aisc.model.commons;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by sjf on 15-10-25.
 */
@MappedSuperclass
public class Address {
    @Column
    private String country;
    @Column
    private String province;
    @Column
    private String city;
    @Column
    private String district;
    @Column
    private String street;
    @Column
    private String addDetail;
    @Column
    private String zip;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddDetail() {
        return addDetail;
    }

    public void setAddDetail(String addDetail) {
        this.addDetail = addDetail;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return Objects.equal(country, that.country) &&
                Objects.equal(province, that.province) &&
                Objects.equal(city, that.city) &&
                Objects.equal(district, that.district) &&
                Objects.equal(street, that.street) &&
                Objects.equal(addDetail, that.addDetail) &&
                Objects.equal(zip, that.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(country, province, city, district, street, addDetail, zip);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", addDetail='" + addDetail + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
