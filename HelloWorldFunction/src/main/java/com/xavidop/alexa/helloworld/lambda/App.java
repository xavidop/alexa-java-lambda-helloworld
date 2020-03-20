package com.xavidop.alexa.helloworld.lambda;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.xavidop.alexa.helloworld.handlers.*;
import com.xavidop.alexa.helloworld.interceptors.request.LogRequestInterceptor;
import com.xavidop.alexa.helloworld.interceptors.response.LogResponseInterceptor;

/**
 * Handler for requests to Lambda function.
 */
public class App extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler(),
                        new ErrorHandler())
                .addExceptionHandler(new MyExceptionHandler())
                .addRequestInterceptors(new LogRequestInterceptor())
                .addResponseInterceptors(new LogResponseInterceptor())
                // Add your skill id below
                //.withSkillId("[unique-value-here]")
                .build();
    }

    public App() {
        super(getSkill());
    }

}
