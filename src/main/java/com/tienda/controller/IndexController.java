package com.tienda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

        
/**
 *
 * @author Leidy PC
 */
        
@Controller
@Slf4j
public class IndexController {

    private Object attributeName;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var texto = "Estamos en semana 4";
        
        model.addAttribute (attributeName:"mensaje", attributeValue:texto);
        
        Cliente cliente1 = new Cliente(nombre:"Pedro", apellido:"Gomez Contreras", correo:"pcontreras@gmail.com", telefono:"7777-8888");
        Cliente cliente2 = new Cliente(nombre:"Pedro", apellido:"Gomez Contreras", correo:"pcontreras@gmail.com", telefono:"7777-8888");
        
        var clientes = Arrays.asList(a:cliente1, a:cliente2);
        
        model.addAttribute(attributeName:"clientes", attributeValue:clientes);
        
        return "index";
    }

    private static class Cliente {

        public Cliente() {
        }
    }
    
}
