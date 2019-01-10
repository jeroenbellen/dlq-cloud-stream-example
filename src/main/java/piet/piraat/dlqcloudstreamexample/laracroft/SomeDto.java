package piet.piraat.dlqcloudstreamexample.laracroft;

import com.fasterxml.jackson.annotation.JsonCreator;

public class SomeDto {

    public final String something;

    @JsonCreator
    public SomeDto(String something) {
        this.something = something;
    }
}
