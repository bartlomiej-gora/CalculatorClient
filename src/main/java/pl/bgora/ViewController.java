package pl.bgora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/clientView")
    public String getView() {
        return "/view";
    }

    @PostMapping("/clientView")
    public ModelAndView postView(@RequestParam String equation) {
        ModelAndView modelAndView = new ModelAndView();
        String result = calculatorService.excecute(equation);
        modelAndView.addObject("value", result);
        modelAndView.setViewName("/view");
        return modelAndView;
    }
}
