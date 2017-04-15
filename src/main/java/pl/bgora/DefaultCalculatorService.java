package pl.bgora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DefaultCalculatorService implements CalculatorService {

    @Autowired
    CalculatorGateway calculatorGateway;

    @Override
    public String getVaule(String equation) {
        return calculatorGateway.getVaule(equation);
    }
}
