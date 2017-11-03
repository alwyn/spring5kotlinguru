package technomads.public.spring5webapp.model

import javax.persistence.*

/**
 * Created by Alwyn Schoeman on 11/1/2017 with the help of a million pink unicorn bunnies.
 */

@Entity
data class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,
    val firstName: String,
    val lastName: String,
    @ManyToMany(mappedBy = "authors")
    val books: Set<Book> = mutableSetOf())
