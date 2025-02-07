package hibernate_oto.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "details")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "empDetail",
            cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
    @ToString.Exclude
    private Employee employee;

    public Detail(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
