package com.qimu.proyectointegrador.view;

import com.qimu.proyectointegrador.domain.usecases.DeleteGameUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeleteGameController {
    private DeleteGameUseCase useCase;

    public DeleteGameController(DeleteGameUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/games/{id}")
    public String execute(@PathVariable String id){
        this.useCase.execute(id);
        return "redirect:/games";
    }
}
