package com.unity3d.services.core.properties;

import java.util.UUID;
import kotlin.jvm.internal.m;

/* compiled from: SessionIdReader.kt */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId;

    static {
        String uuid = UUID.randomUUID().toString();
        m.d(uuid, "randomUUID().toString()");
        sessionId = uuid;
    }

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}
