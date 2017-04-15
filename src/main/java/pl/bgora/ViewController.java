package pl.bgora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class ViewController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/calculatorClientView")
    public String getView() {
        return "/calculatorView";
    }

    @PostMapping("/calculatorClientView")
    public String postView(ModelAndView modelAndView) {
        String equation = (String) modelAndView.getModel().get("equation");
        String result = calculatorService.getVaule(equation);
        modelAndView.addObject("value", result);
        return "/calculatorView";
    }
}
