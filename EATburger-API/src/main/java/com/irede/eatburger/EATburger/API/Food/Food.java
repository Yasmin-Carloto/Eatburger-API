package com.irede.eatburger.EATburger.API.Food;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "food")
@Entity(name = "food")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private Float price;
    private Integer time;
    private String description;
    private String type;
    private Boolean ischecked;
}
