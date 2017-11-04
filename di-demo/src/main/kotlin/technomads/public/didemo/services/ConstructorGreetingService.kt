package technomads.public.didemo.services

import org.springframework.stereotype.Service

/**
 * Created by Alwyn Schoeman on 11/3/2017 with the help of a million pink unicorn bunnies.
 */

@Service
class ConstructorGreetingService : GreetingService {
  override fun sayGreeting() = "I was injected using the constructor"

}