package com.xavidop.alexa.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.xavidop.alexa.helloworld.localization.LocalizationManager;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CancelandStopIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText =  LocalizationManager.getInstance().getMessage("GOODBYE_MSG");
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }
}