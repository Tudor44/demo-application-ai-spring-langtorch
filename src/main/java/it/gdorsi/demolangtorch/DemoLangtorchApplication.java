package it.gdorsi.demolangtorch;

import ai.knowly.langtorch.capability.module.openai.SimpleChatCapability;
import com.google.common.flogger.FluentLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static it.gdorsi.demolangtorch.Utils.readInputUntilEXIT;


//Simple chat demo using a SimpleChatComponent, a wrapper with the use of OpenAI's ChatCompletationAPI with Langtorch, a Java AI framework

@SpringBootApplication
public class DemoLangtorchApplication {
	private static final FluentLogger logger = FluentLogger.forEnclosingClass();
	public static void main(String[] args) {
		SpringApplication.run(DemoLangtorchApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(SimpleChatComponent simpleChat) {
		return args -> {
			readInputUntilEXIT(logger, simpleChat.getCapability());
		};
	}

}


