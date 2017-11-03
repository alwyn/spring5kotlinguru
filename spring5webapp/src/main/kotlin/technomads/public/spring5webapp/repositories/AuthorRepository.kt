package technomads.public.spring5webapp.repositories

import org.springframework.data.repository.CrudRepository
import technomads.public.spring5webapp.model.Author

/**
 * Created by Alwyn Schoeman on 11/2/2017 with the help of a million pink unicorn bunnies.
 */

interface AuthorRepository : CrudRepository<Author,Long>
