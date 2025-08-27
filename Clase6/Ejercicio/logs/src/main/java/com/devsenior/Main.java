package com.devsenior;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Iniciando la aplicacion");

        //crear empleados y gerentes
        Empleado emp1 = new Empleado("Juan", 30, 3000.0);
        Gerente ger1 = new Gerente("Carlos", 40, 5000.0, "Ventas");
  
        logger.info("Informacion del empleado: " + emp1);
        logger.info("Informacion del gerente: " + ger1);


        //aumentar salario
        emp1.aumentarSalario(10);
        ger1.aumentarSalario(15);

        logger.info("Informacion del empleado despues del aumento: " + emp1);
        logger.info("informacion del gerente despues del aumento: " + ger1);


        logger.info("Finalizando la aplicacion");
        logger.trace("Este es un mensaje de traza");
        logger.debug("Este es un mensaje de depuracion");
        logger.error("Este es un mensaje de error");
        logger.fatal("Este es un mensaje fatal");
    }
}