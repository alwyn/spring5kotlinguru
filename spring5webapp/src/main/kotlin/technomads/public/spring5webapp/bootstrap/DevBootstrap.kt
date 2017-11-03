package technomads.public.spring5webapp.bootstrap

import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component
import technomads.public.spring5webapp.model.Author
import technomads.public.spring5webapp.model.Book
import technomads.public.spring5webapp.model.Publisher
import technomads.public.spring5webapp.repositories.AuthorRepository
import technomads.public.spring5webapp.repositories.BookRepository
import technomads.public.spring5webapp.repositories.PublisherRepository

/**
 * Created by Alwyn Schoeman on 11/2/2017 with the help of a million pink unicorn bunnies.
 */

@Component
class DevBootstrap(
    val authorRepository: AuthorRepository,
    val bookRepository: BookRepository,
    val publisherRepository: PublisherRepository)
  : ApplicationListener<ContextRefreshedEvent> {

  override fun onApplicationEvent(event: ContextRefreshedEvent?) {
    initData()
  }

  private fun initData() {
    var publisher = publisherRepository.save(Publisher(name = "Harper Collins", address = "1st Ave"))

    val eric = authorRepository.save(Author(
        firstName = "Eric",
        lastName = "Evans"))
    bookRepository.save(Book(
        title = "Domain Driven Design",
        isbn = "1234345234",
        publisher = publisher,
        authors = mutableSetOf(eric)))

    publisher = publisherRepository.save(Publisher(name = "Worx", address = "5th Ave"))

    val rod = authorRepository.save(Author(
        firstName = "Rod",
        lastName = "Johnson"))
    bookRepository.save(Book(
        title = "J2EE Development without EJB",
        isbn = "5674565",
        publisher = publisher,
        authors = mutableSetOf(rod)
    ))

  }

}
