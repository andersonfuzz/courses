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
    /*
     * {
     * Quando você quer converter um objeto Java em JSON ou um JSON em um objeto
     * Java, você pode usar bibliotecas como o Jackson para fazer essa conversão de
     * forma automática
     * Ao usar a anotação @JsonProperty, você pode especificar o nome do campo no
     * JSON que corresponde a cada atributo da classe.
     * ==>nullable = false<== indica que o valor desse campo não pode ser nulono
     * banco de dados
     * }
     */

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String category;
}
