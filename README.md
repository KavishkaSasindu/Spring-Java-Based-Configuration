# Spring-Java-Based-Configuration
In here we can demonstrate java based configuration for spring framework

- Spring Configuration most people refer to do using java based configuration

In this project learn it from scratch
    
* I provide how to configure spring context ina project 

#### Now lets see how to configure spring using java based

  1.first you need a java class
  
`AppConfig.Class`

    in here it is difference where we talk to container
    
XML method we call using `ClassPathXmlApplicationContext()`

In Java based configuration we use ``AnnotationConfigApplicationContext()``

    --Example

``ApplicationContext context = new AnnotationConfigApplicationContext("AppConfig.Class");``
in paranthesis we can use actual configuration file name (AppConfig.class)