package xyz.homesangsang.websocketsecuritydemo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import xyz.homesangsang.websocketsecuritydemo.entity.Greeting;
import xyz.homesangsang.websocketsecuritydemo.entity.HelloMessage;

@Controller
@MessageMapping("/app/greeting")
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000);
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
