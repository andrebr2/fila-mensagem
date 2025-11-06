package consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import config.RabbitMQConfig;

@Service
public class MensagemConsumidor {

	@RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {
        System.out.println("Recebido: " + message);
    }
	
}
