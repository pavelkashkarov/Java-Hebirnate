package ru.netology.domain;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;


@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonId implements Serializable {

    private String name;

    private String surname;

    private Integer age;

}
