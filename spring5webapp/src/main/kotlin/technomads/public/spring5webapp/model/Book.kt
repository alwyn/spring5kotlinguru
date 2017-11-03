package technomads.public.spring5webapp.model

import javax.persistence.*

/**
 * Created by Alwyn Schoeman on 11/1/2017 with the help of a million pink unicorn bunnies.
 */

@Entity
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,
    val title: String,
    val isbn: String,
    @OneToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id")
    val publisher: Publisher,
    @ManyToMany
    @JoinTable(
        name = "author_book",
        joinColumns = arrayOf(JoinColumn(name = "book_id", referencedColumnName = "id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "author_id", referencedColumnName = "id")))
    val authors: Set<Author>)