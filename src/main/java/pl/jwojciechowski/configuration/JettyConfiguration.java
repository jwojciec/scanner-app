package pl.jwojciechowski.configuration;

import org.springframework.stereotype.Component;

@Component
public class JettyConfiguration {
    private String host;
    private String port;
    private String endpoint;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
