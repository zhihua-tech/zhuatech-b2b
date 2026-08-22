/* Copyright 2026 Shanghai Rujing Zhihua Information Technology Co., Ltd. · https://www.zhuatech.cn/ */
package cn.zhuatech.b2b.model;
import jakarta.persistence.*;
@Entity @Table(name="b2b_user")
public class UserAccount extends BaseEntity {
    public enum Role { ADMIN, B2B_OPERATOR, BUSINESS_BUYER, QUALITY }
    @Column(nullable=false,unique=true,length=32) private String username; @Column(nullable=false) private String password;
    @Column(nullable=false,length=50) private String fullName; @Enumerated(EnumType.STRING) @Column(nullable=false,length=20) private Role role;
    @Column(name="business_account_code",length=32) private String businessAccountCode; @Column(nullable=false) private boolean enabled=true;
    protected UserAccount(){}
    public UserAccount(String username,String password,String fullName,Role role,String businessAccountCode){this.username=username;this.password=password;this.fullName=fullName;this.role=role;this.businessAccountCode=businessAccountCode;}
    public String getUsername(){return username;} public String getPassword(){return password;} public String getFullName(){return fullName;} public Role getRole(){return role;} public String getBusinessAccountCode(){return businessAccountCode;} public boolean isEnabled(){return enabled;}
}
