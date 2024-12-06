package edu.cibertec.cl2_Luis_Valverde_Leyva.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import edu.cibertec.cl2_Luis_Valverde_Leyva.entity.Film;


public interface FilmRepository extends CrudRepository<Film, Integer> {

    @Cacheable(value = "films")
    Iterable<Film> findAll();

    @CacheEvict(value = "films", allEntries = true)
    Film save(Film film);

    @CacheEvict(value = "films", allEntries = true)
    void delete(Film film);

}
