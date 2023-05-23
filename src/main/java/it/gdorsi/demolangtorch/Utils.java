package it.gdorsi.demolangtorch;

import ai.knowly.langtorch.capability.Capability;
import com.google.common.flogger.FluentLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {

    private Utils() {}

    static void readInputUntilEXIT(FluentLogger logger, Capability<String, String> capability)
            throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input;
                final String sentinel = "EXIT"; // Define a sentinel value to exit the loop
                logger.atInfo().log("Write a simple query for OpenAI");
                logger.atInfo().log("Type '%s' and press Enter to exit the application.%n", sentinel);

                while (true) {
                    input = reader.readLine();

                    if (input == null || sentinel.equalsIgnoreCase(input)) {
                        break; // Exit the loop if the user types the sentinel value
                    }

                    logger.atInfo().log("Me: " + input);
                    String assistantMsg = capability.run(input);
                    logger.atInfo().log("Assistant OpenAI: " + assistantMsg);
                }

                logger.atInfo().log("Exiting the application.");
    }

}
