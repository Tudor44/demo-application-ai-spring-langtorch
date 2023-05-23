package it.gdorsi.demolangtorch;

import ai.knowly.langtorch.capability.module.openai.SimpleChatCapability;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class SimpleChatComponent {

    private final String openAiKey;
    private SimpleChatCapability chatBot;

    public SimpleChatComponent(@Value("${spring.openai.key}") String openAiKey) {
        this.openAiKey = openAiKey;
        chatBot = SimpleChatCapability.create(openAiKey);
    }

    public SimpleChatCapability getCapability() {return chatBot;}

	/*public String getResponseFromInput(String string) {
			return chatBot.run(string);
	}*/

}