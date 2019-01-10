package piet.piraat.dlqcloudstreamexample.laracroft;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AGoodTalker {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/{something}")
    public void tak(@PathVariable("something") String something) {
        amqpTemplate.convertAndSend("piet", "piraat", new SomeDto(something));
    }
}
