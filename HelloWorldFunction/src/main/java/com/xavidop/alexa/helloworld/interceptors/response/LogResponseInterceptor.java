package com.xavidop.alexa.helloworld.interceptors.response;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.interceptor.ResponseInterceptor;
import com.amazon.ask.model.Response;
import com.xavidop.alexa.helloworld.interceptors.request.LogRequestInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class LogResponseInterceptor implements ResponseInterceptor {

    static final Logger logger = LogManager.getLogger(LogRequestInterceptor.class);
    @Override
    public void process(HandlerInput input, Optional<Response> output) {
        logger.info(output.toString());
    }
}