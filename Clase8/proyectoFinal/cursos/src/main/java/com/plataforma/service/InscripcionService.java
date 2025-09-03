package com.plataforma.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.*;

import com.plataforma.exception.CursoLlenoException;
import com.plataforma.exception.EstudianteNoEncontradoException;
import com.plataforma.model.Curso;
import com.plataforma.model.Estudiante;
import com.plataforma.model.Inscripcion;

public class InscripcionService {

    private static final Logger logger = LogManager.getLogger(InscripcionService.class);
    
    //coleccion de inscripciones
    private List<Inscripcion> inscripciones;

    public InscripcionService() {
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirEstudiante(Curso curso, Estudiante estudiante) throws CursoLlenoException {
        if(curso.estaLLeno()) {
            logger.error("Intento de inscripción fallido: curso lleno {} en el curso {}: cupo lleno.", curso.getNombre());
            throw new CursoLlenoException("El curso "+ curso.getNombre() + " está lleno. No se puede inscribir al estudiante " + estudiante.getNombre());
        }

        curso.agregarEstudiante(estudiante);
        Inscripcion inscripcion = new Inscripcion(estudiante, curso);
        inscripciones.add(inscripcion);
        logger.info("Estudiante {} inscrito exitosamente en el curso {}.", estudiante.getNombre(), curso.getNombre());
    }  
    
    public List<Inscripcion> buscarInscripcionesPorEstudiante(Estudiante estudiante) throws EstudianteNoEncontradoException {
        //creamos una lisa para guardar las inscripciones del estudiante
        List<Inscripcion> inscripcionesDelEsudiante = new ArrayList<>();

        for(Inscripcion inscripcion : inscripciones) {
            if(inscripcion.getEstudiante().getId().equals(estudiante.getId())) {
                inscripcionesDelEsudiante.add(inscripcion);
            }
        }

        //si no enocnramos inscripciones, registramos un aviso en los logs
        if(inscripcionesDelEsudiante.isEmpty()) {   
            logger.warn("No se encontraron inscripciones para el estudiante con ID: {}", estudiante.getId());
            throw new EstudianteNoEncontradoException("No se encontraron inscripciones para el" +
             "estudiante con ID: " + estudiante.getId());
        } else {
            logger.info("Se encontraron {} inscripciones para el estudiante con ID: {}", inscripcionesDelEsudiante.size(), estudiante.getId());
        }

        return inscripcionesDelEsudiante;
    }
    

}
