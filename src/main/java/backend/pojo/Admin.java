package backend.pojo;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author: OY
 * @date: 10:17 2019/11/27
 */
@Entity
@Table(name = "admin")
public class Admin {
    private String adminId;
    private String password;
    private BigInteger role;
    private String nikename;

    @Id
    @Column(name = "adminID")
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role")
    public BigInteger getRole() {
        return role;
    }

    public void setRole(BigInteger role) {
        this.role = role;
    }

    @Basic
    @Column(name = "nikename")
    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        if (adminId != null ? !adminId.equals(admin.adminId) : admin.adminId != null) return false;
        if (password != null ? !password.equals(admin.password) : admin.password != null) return false;
        if (role != null ? !role.equals(admin.role) : admin.role != null) return false;
        if (nikename != null ? !nikename.equals(admin.nikename) : admin.nikename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId != null ? adminId.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (nikename != null ? nikename.hashCode() : 0);
        return result;
    }
}
