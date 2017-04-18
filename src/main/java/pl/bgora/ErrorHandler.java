package pl.bgora;

import org.springframework.stereotype.Component;

@Component("errorHandler")
public class ErrorHandler {

    public void handleError(Exception ex){
        throw new RuntimeException("ERROR!!!!");
    }
}
