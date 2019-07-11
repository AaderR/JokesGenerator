package pl.akademiaKodu.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    /*
        po adresie url;
        localhost:8080/ przechodzi do metody
        generateJoke()
        ModelMap służy do przekazywnia danych z Kontrolera do widoku html
        jeśli piszemy map.put("name","michał");
        to w HTML będzie widoczna zmienna name, której wartością będzie Michał

                                            */
    @GetMapping("/")
    public String generateJoke(ModelMap map){
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        map.put("Quote",chuckNorrisQuotes.getRandomQuote());

        return "joke";                            // przejdz do pliku
                                            // resources/templates/joke.html
    }



}
