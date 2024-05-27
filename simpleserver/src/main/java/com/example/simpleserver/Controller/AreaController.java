package com.example.simpleserver.Controller;

import com.example.simpleserver.Poligoni.Quadrato;
import com.example.simpleserver.Poligoni.Rettangolo;
import com.example.simpleserver.Poligoni.Triangolo;
import com.example.simpleserver.Entity.Aree_Perimetri;
import com.example.simpleserver.Entity.tabRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

//post quadrato, accetta in path variable quadrato/n e ritorna il quadrato
public class AreaController {
    private final com.example.simpleserver.Entity.tabRepository tabRepository;

    public AreaController(tabRepository tabRepository) {
        this.tabRepository = tabRepository;
    }

    @PostMapping(path = "/num^2/{n}")
    public @ResponseBody
    Double power(@PathVariable Double n) {
        return n * n;
    }

    @PostMapping(path = "rettangolo/{base}/{altezza}")
    public @ResponseBody
    String Rectangle(@PathVariable Double base, @PathVariable Double altezza) {
        Rettangolo R1 = new Rettangolo(base, altezza);
        Aree_Perimetri areePerimetri = new Aree_Perimetri();
        areePerimetri.setArea(R1.calcoloArea());
        areePerimetri.setPoligono("rettangolo");
        areePerimetri.setPerimetro(R1.calcoloPerimetro());
        tabRepository.save(areePerimetri);
        return "Area del rettangolo: " + R1.calcoloArea() + "Perimetro del rettangolo: " + R1.calcoloPerimetro();
    }

    @PostMapping(path = "quadrato/{lato}")
    public @ResponseBody
    String Square(@PathVariable Double lato) {
        Quadrato Q1 = new Quadrato(lato);
        Aree_Perimetri areePerimetri = new Aree_Perimetri();
        areePerimetri.setArea(Q1.calcoloArea());
        areePerimetri.setPoligono("quadrato");
        areePerimetri.setPerimetro(Q1.calcoloPerimetro());
        tabRepository.save(areePerimetri);
        return "Area del quadrato: " + Q1.calcoloArea() + " Perimetro del quadrato: " + Q1.calcoloPerimetro();
    }

    //Richiede parametri in Postman per la query
    @PostMapping(path = "triangolo")
    public @ResponseBody
    String Triangle(@RequestParam Double base, @RequestParam Double altezza, @RequestParam Double lato2, @RequestParam Double lato3) {
        Triangolo T1 = new Triangolo(base, altezza, lato2, lato3);
        Aree_Perimetri areePerimetri = new Aree_Perimetri();
        areePerimetri.setArea(T1.calcoloArea());
        areePerimetri.setPoligono("triangolo");
        areePerimetri.setPerimetro(T1.calcoloPerimetro());
        tabRepository.save(areePerimetri);
        return "Area del triangolo: " + T1.calcoloArea() + " Perimetro del triangolo: " + T1.calcoloPerimetro();
    }
}

