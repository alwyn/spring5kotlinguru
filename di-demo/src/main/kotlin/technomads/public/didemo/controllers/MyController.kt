package technomads.public.didemo.controllers

import org.springframework.stereotype.Controller
import technomads.public.didemo.services.GreetingService

/**
 * Created by Alwyn Schoeman on 11/3/2017 with the help of a million pink unicorn bunnies.
 */

@Controller
class MyController(val greetingService : GreetingService) {

  fun hello() = greetingService.sayGreeting()
}