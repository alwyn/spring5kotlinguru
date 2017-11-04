package technomads.public.didemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import technomads.public.didemo.controllers.ConstructorInjectedController
import technomads.public.didemo.controllers.GetterInjectedController
import technomads.public.didemo.controllers.MyController
import technomads.public.didemo.controllers.PropertyInjectedController

@SpringBootApplication
class DiDemoApplication

fun main(args: Array<String>) {
  val context = SpringApplication.run(DiDemoApplication::class.java, *args)

  val myController: MyController = context.getBean("myController") as MyController

  myController.hello()

  println (myController.hello())
  println ("PropertyInjected: ${(context.getBean("propertyInjectedController") as PropertyInjectedController).sayHello()}")
  println ("GetterInjected: ${(context.getBean("getterInjectedController") as GetterInjectedController).sayHello()}")
  println ("ConstructorInjected: ${(context.getBean("constructorInjectedController") as ConstructorInjectedController).sayHello()}")

}
