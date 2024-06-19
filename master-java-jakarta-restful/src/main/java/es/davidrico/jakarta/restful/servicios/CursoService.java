package es.davidrico.jakarta.restful.servicios;

import jakarta.ejb.Local;
import es.davidrico.jakarta.restful.modelos.Curso;

import java.util.List;
import java.util.Optional;

@Local
public interface CursoService {
    List<Curso> listar();
    Curso guardar(Curso curso);
    Optional<Curso> porId(Long id);
    void eliminar(Long id);
}
