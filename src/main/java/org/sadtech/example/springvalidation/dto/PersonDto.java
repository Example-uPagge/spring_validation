package org.sadtech.example.springvalidation.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@Table(name = "person")
public class PersonDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Min(1)
    @Max(10)
    @Column(name = "number")
    private int numberBetweenOneAndTen;

    @Column(name = "ip_address")
    @Pattern(
            regexp = "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$",
            message = "Не соответствует формату IP адреса"
    )
    private String ipAddress;

}
