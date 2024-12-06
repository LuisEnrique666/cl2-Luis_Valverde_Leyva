package edu.cibertec.cl2_Luis_Valverde_Leyva.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmCategoryPk {

    private Integer filmId;
    private Integer categoryId;

}

