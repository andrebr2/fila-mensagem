package com.example.fila_mensagem.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.fila_mensagem.config.RabbitMQConfig;

@Service
public class MensagemConsumidor {

	@RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String mensagem) {
        System.out.println("Recebido: " + mensagem);
    }
	
}