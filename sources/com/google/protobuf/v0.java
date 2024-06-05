package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: MessageLite */
public interface v0 extends w0 {

    /* compiled from: MessageLite */
    public interface a extends w0, Cloneable {
        v0 A();

        v0 build();

        a q(v0 v0Var);

        a u(j jVar, q qVar) throws IOException;
    }

    a b();

    void c(OutputStream outputStream) throws IOException;

    void d(l lVar) throws IOException;

    i e();

    int f();

    byte[] i();

    a j();

    f1<? extends v0> k();
}
