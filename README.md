# springbootexample
A simple spring boot example

Exercise 01 The Spring framework
================================

Write a Spring application that comprises of the following classes/types :

class StartApplication           -> main method, starts Application
interface Application            -> defines a method public void run()
class OrderManagement            -> implements Application, printing "OrderManagement running ..." to stdout
class CRM                        -> implements Application, printing "CRM runnning ..." to stdout
class ApplicationContainer       -> defines a method public void startup()


Define a variable "app" of type Application inside the class "ApplicationContainer" 
that gets injected by the Spring bean factory with either a CRM or a OrderManagement application. 
In the method ApplicationContainer.startup(), app.run() should be called. Depending on which application is on your classpath, the appropriate message should be printed. 
The wiring of the classes can be realized either via @Component and @ComponentScan or via a @Configuration annotated class and a @Bean method. 
	See what happens if no or more than one bean of type "Application" are being found by the Spring bean factory.

