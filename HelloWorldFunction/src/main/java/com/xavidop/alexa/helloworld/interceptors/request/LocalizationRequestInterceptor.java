package com.xavidop.alexa.helloworld.interceptors.request;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.interceptor.RequestInterceptor;
import com.xavidop.alexa.helloworld.localization.LocalizationManager;

import java.util.Locale;

public class LocalizationRequestInterceptor implements RequestInterceptor {

    @Override
    public void process(HandlerInput input) {
        String localeString = input.getRequestEnvelope().getRequest().getLocale();
        Locale locale = new Locale.Builder().setLanguageTag(localeString).build();
        LocalizationManager.getInstance(locale);
    }
}