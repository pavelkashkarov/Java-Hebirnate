package ru.netology.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    @EmbeddedId
    private PersonId personId;

    private String phoneNumber;
    private String cityOfLiving;
}

