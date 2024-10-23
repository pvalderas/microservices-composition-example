package main;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Main {

	private static final String exchange="composition";
	
	public static void main(String[] args) throws IOException, TimeoutException {
		
		Scanner teclado=new Scanner(System.in);

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("172.23.180.72");
		//factory.setHost("localhost");
		factory.setPort(5672);
		factory.setUsername("microservice");
		factory.setPassword("microservice");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		channel.exchangeDeclare(exchange, BuiltinExchangeType.TOPIC);
		
		String microservice, composition, message;
		
		System.out.println("Introduce composition ID:");
		composition=teclado.nextLine();

		
		do{
			System.out.println("Introduce an Physical World event [Empty to finish]:");
			message=teclado.nextLine();
			message=message.replaceAll(" ", "");
			if(message.length()>0) {
				String client=String.valueOf(System.currentTimeMillis());
				String routingKey=composition.toLowerCase()+"."+client;
			
				String BPMNMessage=composition+"_"+message+"Message";
				System.out.println(BPMNMessage);
				String messageJSON="{\"message\":\""+BPMNMessage+"\",\"client\":\""+client+"\"}";
				
				channel.basicPublish(exchange, routingKey, null, messageJSON.getBytes());
			}
		}while(message.length()>0);
		
		teclado.close();
		channel.close();
		connection.close();
		
	}

}
