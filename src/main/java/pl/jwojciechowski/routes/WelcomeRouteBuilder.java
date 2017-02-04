package pl.jwojciechowski.routes;

import pl.jwojciechowski.beans.S3ListCamelBean;
import pl.jwojciechowski.configuration.AppConfiguration;
import pl.jwojciechowski.configuration.JettyConfiguration;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WelcomeRouteBuilder extends RouteBuilder {
    private static final String JETTY_URL = "jetty:http://%s:%s/%s";
    private final JettyConfiguration jettyConfiguration;

    @Autowired
    public WelcomeRouteBuilder(AppConfiguration appConfiguration) {
        this.jettyConfiguration = appConfiguration.getJettyConfiguration();
    }

    @Override
    public void configure() throws Exception {
        from(String.format(JETTY_URL, jettyConfiguration.getHost(), jettyConfiguration.getPort(), jettyConfiguration.getEndpoint()))
            .bean(S3ListCamelBean.class);
    }
}
