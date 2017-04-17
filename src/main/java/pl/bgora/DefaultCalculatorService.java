package pl.bgora;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DefaultCalculatorService implements CalculatorService {

    @Resource
    CalculatorGateway defaultCalculatorGateway;

    @Override
    public String excecute(String equation) {
        return defaultCalculatorGateway.execute(equation);
    }
}
