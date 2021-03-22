package org.sadtech.example.springvalidation.dto;

import lombok.Getter;
import lombok.Setter;
import org.sadtech.example.springvalidation.valid.CapitalLetter;
import org.sadtech.example.springvalidation.valid.Marker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@Table(name = "person")
public class PersonDto {

    @Id
    @Null(groups = Marker.OnCreate.class)
    @NotNull(groups = Marker.OnUpdate.class)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @CapitalLetter
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
