package com.alura.bookalura1.repository;

import com.alura.bookalura1.modelos.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>
{
    @Query("SELECT a FROM Author a WHERE a.nacimiento >= :anoBusqueda ORDER BY a.nacimiento ASC ")
    List<Author> autorPorFecha(int anoBusqueda);

}