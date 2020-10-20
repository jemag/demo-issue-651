package ca.gc.dfo.demoissue651;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBinding(Processor.class)
public class CloudStream {

  @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
  public String handleMessage(String message) {
    return message;
  }
}
