package controller;

import domein.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.INotaService;

import java.util.List;

@Controller
public class NotaController {

    @Autowired
    INotaService notaService;

    @RequestMapping("/notas")
    public List<Nota> findAllNotas(){
        return notaService.findAll();
    }

}
