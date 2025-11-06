package com.example.fila_mensagem.produtor;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fila_mensagem.config.RabbitMQConfig;

@Service
public class MensagemProdutor {

	@Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String mensagem) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NAME,
                RabbitMQConfig.ROUTING_KEY,
                mensagem
        );
        System.out.println("Enviado: " + mensagem);
    }
	
}