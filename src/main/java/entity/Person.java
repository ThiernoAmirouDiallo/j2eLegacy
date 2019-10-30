package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor()
@Data
@Entity
@Table(name = "Persons")
public class Person {
    @Id
    @GeneratedValue
    Long idPerson;

    @Column(name = "FIRST_NAME")
    String firstname;

    @Column(name = "LAST_NAME")
    String lastname;

    @Column(name = "EMAIL")
    String email;
}
