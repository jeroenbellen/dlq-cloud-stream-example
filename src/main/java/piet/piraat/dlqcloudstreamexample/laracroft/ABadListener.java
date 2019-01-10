package piet.piraat.dlqcloudstreamexample.laracroft;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ABadListener {

    @StreamListener(Sink.INPUT)
    public void listen(SomeDto input) {
        System.out.println(new Date().toInstant().toString() + " " + input.something);

        throw new RuntimeException("Don't care!");
    }
}
