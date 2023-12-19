package sit.int202.preexam.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
@NamedQueries({
        @NamedQuery(name = "CUSTOMER.FIND_ALL", query = "select c from Customer c"),
        @NamedQuery(name = "CUSTOMER.FIND_USER",query = "select c from Customer c where concat(trim(c.contactFirstName), ' ', trim(c.contactLastName)) = :user_account")
})
public class Customer {
    @Id
    private Integer customerNumber;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String salesRepEmployeeNumber;
    private String creditLimit;
    private String password;
}
