package technomads.public.didemo.services

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

/**
 * Created by Alwyn Schoeman on 11/3/2017 with the help of a million pink unicorn bunnies.
 */

@Service
@Primary
class PrimaryGreetingService : GreetingService {
  override fun sayGreeting() = "Hello - Primary Greeting Service"
}