package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.Service;
import service.ServiceImpl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    Service service = new ServiceImpl();
    @GetMapping("/cars")
    public String printCar(@RequestParam(name = "locale", required = false, defaultValue = "ru")String locale, ModelMap model) {
        List<Car> cars = service.getCars();
        model.addAttribute("cars", cars);
        model.addAttribute("locale", locale);
        return "cars";

    }
}
