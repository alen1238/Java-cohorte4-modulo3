package com.plataforma.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.*;

import com.plataforma.exception.CursoNoEncontradoException;
import com.plataforma.model.Curso;

public class CursoService {
    private static final Logger logger = LogManager.getLogger(CursoService.class);

    private List<Curso> cursos;

    public CursoService() {
        this.cursos = new ArrayList<>();
    }

    //agregar un curso
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        logger.info("Curso agregado: " + curso.getNombre());
    }

    //Listar todos los cursos
    public List<Curso> listarCursos() {
        return cursos;
    }

    //buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) throws CursoNoEncontradoException {
        
        for(Curso curso : cursos) {
            if(curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }

        logger.warn("Curso no encontrado con código: " + codigo);
        throw new CursoNoEncontradoException("Curso con el código " + codigo + " no encontrado.");
    }



}
