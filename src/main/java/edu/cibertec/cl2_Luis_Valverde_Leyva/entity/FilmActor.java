package edu.cibertec.cl2_Luis_Valverde_Leyva.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActor {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private FilmActorPk filmActorPk;
    private Date lastUpdate;

    @ManyToOne
    @MapsId("filmId")
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private Film film;

}

