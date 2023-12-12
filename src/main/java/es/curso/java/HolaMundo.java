package es.curso.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HolaMundo {
	private static final Logger logger = LogManager.getLogger(HolaMundo.class);
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo 3" + args[0]);
		logger.info("Info");

	}

}
