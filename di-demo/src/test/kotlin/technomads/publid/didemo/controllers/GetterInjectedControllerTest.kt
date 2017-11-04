package technomads.publid.didemo.controllers

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import technomads.public.didemo.controllers.GetterInjectedController
import technomads.public.didemo.services.GreetingServiceImpl

/**
 * Created by Alwyn Schoeman on 11/3/2017 with the help of a million pink unicorn bunnies.
 */

class GetterInjectedControllerTest {
  lateinit var getterInjectedController : GetterInjectedController

  @Before
  fun setUp() {
    this.getterInjectedController = GetterInjectedController()
    this.getterInjectedController.setGreetingService(GreetingServiceImpl())
  }

  @Test
  fun testGreeting() {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, this.getterInjectedController.sayHello())
  }
}
