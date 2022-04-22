package org.optimizely.social.exceptions;

public class ChannelNotImplementedException extends RuntimeException {
    public ChannelNotImplementedException() {
        super();
    }

    public ChannelNotImplementedException(String message) {
        super(message);
    }
}
