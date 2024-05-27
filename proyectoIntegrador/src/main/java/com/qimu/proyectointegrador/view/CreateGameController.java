package com.qimu.proyectointegrador.view;

import com.qimu.proyectointegrador.data.dtos.NewGameRequest;
import com.qimu.proyectointegrador.domain.entities.Game;
import com.qimu.proyectointegrador.domain.usecases.CreateGameUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class CreateGameController {

    private CreateGameUseCase useCase;

    public CreateGameController(CreateGameUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/games")
    public String addUser(@ModelAttribute NewGameRequest newGame) {
        this.useCase.execute(newGame.getTitle(), newGame.getStudio(),newGame.getGenreId());
        return "redirect:/games";
    }

}
