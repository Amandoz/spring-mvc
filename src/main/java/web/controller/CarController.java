package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printWelcome(@RequestParam(name = "locale", required = false, defaultValue = "ru")String locale, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw", 1, 20200.5));
        cars.add(new Car("bmw", 2, 20300.5));
        cars.add(new Car("bmw", 3, 4000.5));
        model.addAttribute("cars", cars);
        model.addAttribute("locale", locale);
        return "cars";

    }
}
