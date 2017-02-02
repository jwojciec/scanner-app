package pl.jwojciechowski.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import pl.jwojciechowski.beans.WelcomeCamelBean;

@Component
public class WelcomeRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("jetty:http://0.0.0.0:8181/welcome")
                .bean(WelcomeCamelBean.class);
    }
}
