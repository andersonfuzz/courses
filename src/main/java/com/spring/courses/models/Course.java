package com.spring.courses.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // combina várias anotações do Lombok em uma única anotação, incluindo
      // @Getter,@Setter, @EqualsAndHashCode e @ToString
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;

    @Column(length = 200, nullable = false) // ==>nullable = false<== indica que o valor desse campo não pode ser nulo
                                            // no banco de dados
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}
