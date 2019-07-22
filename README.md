# Pokedex
A simple pokedex java application

## How to run
You must be connected to the internet to run this. 
There's a bash script called `pokedex` created for you to run this app. Just use command like :
```
./pokedex pikachu
```
```
./pokedex Ability Capsule
```

## Design decisions 
* Decided to not use build tools (Maven/Gradle/Etc).
    * Right now this is still a simple app, we don't need that many library yet
    * Adding build tools, will make the client need to install it in their system
    * This way client just need java and execute the command
    * Comes with loss that if we need external library we need to check it in and include it in our classpath
    * Currently we also checked in jackson library to help with json parsing

* Package structure.
    * contoller = accept input from view, call service, and get the domain model. In the future it will also convert the domain model to ViewModel. So view doesn't know about model at all
    * converter = translate from source object to destination objects
    * domain = representation of our business data, and rules around it
    * dto = data transfer object, a middle object between domain model and data that we get from other server
    * infrastructure = holds anything that will help us do any processing across project
    * service = layer that holds business logic
    * view = accept and pass input to controller and do all presentation of returned information. Right now it knows about domain which is bad design, in the future controller will pass ViewModel instead.
 
 