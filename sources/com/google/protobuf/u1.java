package com.google.protobuf;

import java.util.List;

/* compiled from: UninitializedMessageException */
public class u1 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f27215a = null;

    public u1(v0 v0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public e0 a() {
        return new e0(getMessage());
    }
}
