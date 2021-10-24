package config;

import org.aeonbits.owner.Config;

//@Config.Sources({"classpath:config/${environment}.properties"}) // Будет брать из System.properties
@Config.Sources({"classpath:config/credentials.properties"}) // classpath -> resources/
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
