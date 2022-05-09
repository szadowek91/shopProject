package pl.szadowek91.shopProject.entity;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@DynamicUpdate
@Table(name = "USER")
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Integer id;

    private String nick;

    private String password;

    @Column(name = "F_NAME")
    private String firstName;

    @Column(name = "L_NAME")
    private String lastName;

    private String phoneNumber;

    private String eMail;

    @OneToMany ()
    @JoinColumn(name = "ADDRESS_ID")
    private Integer addressId;

    private String permissionsProfile;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @Column(name = "ACTIVE")
    private String isActive = "N";

    @Column(name = "BANNED")
    private String isBanned = "N";

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date banStartDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date banEndDate;


    //  -- Implementing UserDetails -- \\

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nick;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isBanned.equalsIgnoreCase("T");
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return isActive.equalsIgnoreCase("T");
    }
}
