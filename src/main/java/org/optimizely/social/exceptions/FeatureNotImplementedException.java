package org.optimizely.social.exceptions;

public class FeatureNotImplementedException extends RuntimeException {
    public FeatureNotImplementedException() {
        super();
    }

    public FeatureNotImplementedException(String message) {
        super(message);
    }
}
