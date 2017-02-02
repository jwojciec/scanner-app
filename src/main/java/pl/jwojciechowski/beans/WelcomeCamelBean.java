package pl.jwojciechowski.beans;

import org.springframework.stereotype.Component;

@Component
public class WelcomeCamelBean {
    public String process() {
        return "Welcome to scanner-app!";
    }
}
