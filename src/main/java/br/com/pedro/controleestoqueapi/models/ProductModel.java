package br.com.pedro.controleestoqueapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_product")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String barcode;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int amount;
    @Column(nullable = false)
    private double salePrice;
    @Column(nullable = false)
    private Date expirationDate;
    @Column(nullable = false)
    private Date createdAt;

}
