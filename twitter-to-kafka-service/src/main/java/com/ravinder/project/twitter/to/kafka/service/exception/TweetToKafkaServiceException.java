package com.ravinder.project.twitter.to.kafka.service.exception;

public class TweetToKafkaServiceException extends RuntimeException {

    public TweetToKafkaServiceException() {
    }

    public TweetToKafkaServiceException(String message) {
        super(message);
    }

    public TweetToKafkaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
