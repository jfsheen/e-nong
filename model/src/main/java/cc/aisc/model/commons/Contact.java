package cc.aisc.model.commons;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by sjf on 15-10-25.
 */
@MappedSuperclass
public class Contact {
    @Column
    private String mobile;
    @Column
    private String telephone;
    @Column
    @Email
    private String email;
    @Column
    private String qq;
    @Column
    private String weixin;
    @Column
    private String weibo;
    @Column
    private String facebook;
    @Column
    private String twitter;
    @Column
    private String linkedin;
    @Column
    private String resevered;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getResevered() {
        return resevered;
    }

    public void setResevered(String resevered) {
        this.resevered = resevered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equal(mobile, contact.mobile) &&
                Objects.equal(telephone, contact.telephone) &&
                Objects.equal(email, contact.email) &&
                Objects.equal(qq, contact.qq) &&
                Objects.equal(weixin, contact.weixin) &&
                Objects.equal(weibo, contact.weibo) &&
                Objects.equal(facebook, contact.facebook) &&
                Objects.equal(twitter, contact.twitter) &&
                Objects.equal(linkedin, contact.linkedin) &&
                Objects.equal(resevered, contact.resevered);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mobile, telephone, email, qq, weixin, weibo, facebook, twitter, linkedin, resevered);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "mobile='" + mobile + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", weibo='" + weibo + '\'' +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                ", linkedin='" + linkedin + '\'' +
                ", resevered='" + resevered + '\'' +
                '}';
    }
}
