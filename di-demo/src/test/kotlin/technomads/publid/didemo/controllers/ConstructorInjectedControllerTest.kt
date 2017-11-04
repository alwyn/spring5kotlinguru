package technomads.publid.didemo.controllers

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import technomads.public.didemo.controllers.ConstructorInjectedController
import technomads.public.didemo.services.GreetingServiceImpl

/**
 * Created by Alwyn Schoeman on 11/3/2017 with the help of a million pink unicorn bunnies.
 */

class ConstructorInjectedControllerTest {
  private lateinit var constructorInjectedController : ConstructorInjectedController

  @Before
  fun setUp() {
    this.constructorInjectedController = ConstructorInjectedController(GreetingServiceImpl())
  }

  @Test
  fun testGreeting() {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, this.constructorInjectedController.sayHello())
  }
}