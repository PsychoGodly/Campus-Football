package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.jvm.internal.m;

/* compiled from: InitializationException.kt */
public final class InitializationException extends Exception {
    private final Configuration config;
    private final ErrorState errorState;
    private final Exception originalException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitializationException(ErrorState errorState2, Exception exc, Configuration configuration) {
        super(exc);
        m.e(errorState2, "errorState");
        m.e(exc, "originalException");
        m.e(configuration, "config");
        this.errorState = errorState2;
        this.originalException = exc;
        this.config = configuration;
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, ErrorState errorState2, Exception exc, Configuration configuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorState2 = initializationException.errorState;
        }
        if ((i10 & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i10 & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState2, exc, configuration);
    }

    public final ErrorState component1() {
        return this.errorState;
    }

    public final Exception component2() {
        return this.originalException;
    }

    public final Configuration component3() {
        return this.config;
    }

    public final InitializationException copy(ErrorState errorState2, Exception exc, Configuration configuration) {
        m.e(errorState2, "errorState");
        m.e(exc, "originalException");
        m.e(configuration, "config");
        return new InitializationException(errorState2, exc, configuration);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitializationException)) {
            return false;
        }
        InitializationException initializationException = (InitializationException) obj;
        return this.errorState == initializationException.errorState && m.a(this.originalException, initializationException.originalException) && m.a(this.config, initializationException.config);
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final ErrorState getErrorState() {
        return this.errorState;
    }

    public final Exception getOriginalException() {
        return this.originalException;
    }

    public int hashCode() {
        return (((this.errorState.hashCode() * 31) + this.originalException.hashCode()) * 31) + this.config.hashCode();
    }

    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }
}
