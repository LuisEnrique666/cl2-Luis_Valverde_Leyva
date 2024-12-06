package edu.cibertec.cl2_Luis_Valverde_Leyva.service;

import edu.cibertec.cl2_Luis_Valverde_Leyva.dto.FilmCreateDto;
import edu.cibertec.cl2_Luis_Valverde_Leyva.dto.FilmDetailDto;
import edu.cibertec.cl2_Luis_Valverde_Leyva.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findDetailById(Integer id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean createFilm(FilmCreateDto filmCreateDto);
    Boolean deleteFilmById(Integer id);

}
