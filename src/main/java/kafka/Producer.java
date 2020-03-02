package kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer {


    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "firstTopic";

/*    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);*/
    }


