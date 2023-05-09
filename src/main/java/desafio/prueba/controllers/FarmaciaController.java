package desafio.prueba.controllers;

import desafio.prueba.models.Farmacia;
import desafio.prueba.services.FarmaciaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farmacias")
public class FarmaciaController {

    private final FarmaciaService farmaciaService;

    public FarmaciaController(FarmaciaService farmaciaService) {
        this.farmaciaService = farmaciaService;
    }
    //Obtener las farmacias por comuna
    @GetMapping("/{comuna}")
    public Farmacia[] getFarmacias(@PathVariable String comuna) {
        return farmaciaService.getFarmacias(comuna);
    }
}



