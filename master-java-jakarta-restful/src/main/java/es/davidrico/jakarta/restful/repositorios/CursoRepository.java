package es.davidrico.jakarta.restful.repositorios;

import es.davidrico.jakarta.restful.modelos.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
    Curso porId(Long id);
    void eliminar(Long id);
}
