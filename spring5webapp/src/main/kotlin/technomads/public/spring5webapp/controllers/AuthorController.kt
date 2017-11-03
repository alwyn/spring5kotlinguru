package technomads.public.spring5webapp.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import technomads.public.spring5webapp.repositories.AuthorRepository

/**
 * Created by Alwyn Schoeman on 11/2/2017 with the help of a million pink unicorn bunnies.
 */

@Controller
class AuthorController(val authorRepository: AuthorRepository) {

  @RequestMapping("/authors")
  fun getAuthors(model: Model): String {
    model.addAttribute("authors", authorRepository.findAll())
    return "authors"
  }
}