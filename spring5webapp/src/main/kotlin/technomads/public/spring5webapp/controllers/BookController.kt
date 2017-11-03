package technomads.public.spring5webapp.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import technomads.public.spring5webapp.repositories.BookRepository

/**
 * Created by Alwyn Schoeman on 11/2/2017 with the help of a million pink unicorn bunnies.
 */

@Controller
class BookController(val bookRepository: BookRepository) {

  @RequestMapping("/books")
  fun getBooks(model: Model) : String {
    model.addAttribute("books", bookRepository.findAll())
    return "books"
  }
}
