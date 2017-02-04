package pl.jwojciechowski.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class AppConfiguration {
    private JettyConfiguration jettyConfiguration;

    public JettyConfiguration getJettyConfiguration() {
        return jettyConfiguration;
    }

    public void setJettyConfiguration(JettyConfiguration jettyConfiguration) {
        this.jettyConfiguration = jettyConfiguration;
    }
}
