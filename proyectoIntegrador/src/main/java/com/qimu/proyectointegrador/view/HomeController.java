package com.qimu.proyectointegrador.view;

import com.qimu.proyectointegrador.domain.entities.Game;
import com.qimu.proyectointegrador.domain.entities.Genre;
import com.qimu.proyectointegrador.domain.usecases.ListAllGamesUseCase;
import com.qimu.proyectointegrador.domain.usecases.ListAllGenreUseCase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private ListAllGamesUseCase listAllGamesUseCase;
    private ListAllGenreUseCase listAllGenreUseCase;

    public HomeController(ListAllGamesUseCase listAllGamesUseCase, ListAllGenreUseCase listAllGenreUseCase) {
        this.listAllGamesUseCase = listAllGamesUseCase;
        this.listAllGenreUseCase = listAllGenreUseCase;
    }

    @GetMapping("/games")
    public String execute(Model model) {
        List<Game> games = listAllGamesUseCase.execute();
        List<Genre> genres = listAllGenreUseCase.execute();
        model.addAttribute("games",games);
        model.addAttribute("genres",genres);
        return "list";
    }

}
