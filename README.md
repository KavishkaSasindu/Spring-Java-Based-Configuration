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
in parenthesis we can use actual configuration file name (AppConfig.class)


* next create a class and `Alien` then Dependency Injection(simply spring create the object)

```
package org.example.config;

import org.example.Alien;
import org.example.App;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien() {
        return new Alien();
    }
}
```

simply it will create an object spring
