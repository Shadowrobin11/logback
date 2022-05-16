package com.nttdata.nttdata_projectmaven_eclipse;

import java.security.SecureRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Creación de Claves aleatorias.
 *
 */
public class App 
{
	
	 private final static Logger LOG = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	LOG.info("TRAZA INICIO");
    	
    	for (int i = 0; i < 5000; i++) {
            LOG.debug("Clave aleatoria {}.",generateRandomString(10));
            LOG.debug("\n");
        }
    	
    	LOG.info("TRAZA FIN");
    }
    	
    
    /**
     * Este método devuelve una cadena aleatoria generada con SecureRandom
     * 
     * 
     */
    public static String generateRandomString(int length) {
    	
    	LOG.info("TRAZA INICIO");
    	
        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        String NUMBER = "0123456789";

        String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
        SecureRandom random = new SecureRandom();
    
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            // 0-62 (exclusivo), retorno aleatorio 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

            sb.append(rndChar);
            sb.append(rndChar);
        }
        LOG.info("TRAZA FIN");
        
        return sb.toString();
    }
}
