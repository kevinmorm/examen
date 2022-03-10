package iTicket.com.controller;

import iTicket.com.entidad.Concierto;
import iTicket.com.interfaceService.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private IConciertoService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Concierto>concierto=service.listar();
        model.addAttribute("concierto",concierto);
        return "index";
    }
    
}
