package cc.aisc.model.base;

import com.google.common.base.Objects;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by sjf on 15-10-25.
 */

@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 32, nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;// ID

    //@SearchableProperty(store = Store.YES)
    @Column(updatable = false)
    private Date createDate;// 创建日期
    //@SearchableProperty(store = Store.YES)
    private Date modifyDate;// 修改日期

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(createDate, that.createDate) &&
                Objects.equal(modifyDate, that.modifyDate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, createDate, modifyDate);
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
