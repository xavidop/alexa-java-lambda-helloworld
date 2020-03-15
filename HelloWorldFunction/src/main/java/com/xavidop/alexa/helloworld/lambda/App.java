package com.xavidop.alexa.helloworld.lambda;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.xavidop.alexa.helloworld.handlers.*;

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
                        new FallbackIntentHandler())
                // Add your skill id below
                //.withSkillId("[unique-value-here]")
                .build();
    }

    public App() {
        super(getSkill());
    }

}
