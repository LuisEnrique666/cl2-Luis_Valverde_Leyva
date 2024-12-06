package edu.cibertec.cl2_Luis_Valverde_Leyva.dto;

public record FilmDto(Integer filmId,
                      String title,
                      String language,
                      Integer rentalDuration,
                      Double rentalRate) {
}
