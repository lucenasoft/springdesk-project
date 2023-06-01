package br.com.lucenasoft.helpdesk.controllers.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
    @RequestMapping("recursos")
public class PagesController {
    

    @GetMapping("404")
    public ModelAndView error404(){
        return new ModelAndView("pagesTema/erros/error-404");
    }

    @GetMapping("500")
    public ModelAndView error405(){
        return new ModelAndView("pagesTema/erros/error-500");
    }

    @GetMapping("elementos")
    public ModelAndView basicElements(){
        return new ModelAndView("pagesTema/forms/basic_elements");
    }

    @GetMapping("buttons")
    public ModelAndView btns(){
        return new ModelAndView("pagesTema/forms/buttons");
    }

    @GetMapping("icons")
    public ModelAndView icons(){
        return new ModelAndView("pagesTema/icons/icon");
    }
}
