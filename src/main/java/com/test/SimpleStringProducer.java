package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleStringProducer {

	public static void main(String[] args) {
		SpringApplication.run(SimpleStringProducer.class, args);
		/*Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		KafkaProducer<String, String> producer = new KafkaProducer<>(props);
		for (int i = 0; i < 100; i++) {
			ProducerRecord<String, String> record = new ProducerRecord<>("mytopic", "value-" + i);
			producer.send(record);
		}

		producer.close();*/
	}
}

//public class SimpleStringProducer {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
