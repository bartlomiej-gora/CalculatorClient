package pl.bgora;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DefaultCalculatorService implements CalculatorService {

    @Resource
    CalculatorGateway calculatorGateway;

    @Override
    public String getVaule(String equation) {
        return calculatorGateway.getVaule(equation);
    }
}
