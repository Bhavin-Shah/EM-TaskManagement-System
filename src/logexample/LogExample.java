package logexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Bhavin
 */
public class LogExample {

   static final Logger LOGGER = LoggerFactory.getLogger(LogExample.class);
    
    public static void main(String[] args) {
    
        //Logger logger = LoggerFactory.getLogger("logexample.LogExample");
//        LOGGER.debug("Hello World");
        LOGGER.info("Hello World!");
        
    }
}
