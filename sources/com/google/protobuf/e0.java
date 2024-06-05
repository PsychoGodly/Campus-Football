package com.google.protobuf;

import java.io.IOException;

/* compiled from: InvalidProtocolBufferException */
public class e0 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private v0 f26995a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26996b;

    /* compiled from: InvalidProtocolBufferException */
    public static class a extends e0 {
        public a(String str) {
            super(str);
        }
    }

    public e0(String str) {
        super(str);
    }

    static e0 b() {
        return new e0("Protocol message end-group tag did not match expected tag.");
    }

    static e0 c() {
        return new e0("Protocol message contained an invalid tag (zero).");
    }

    static e0 d() {
        return new e0("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static e0 f() {
        return new e0("CodedInputStream encountered a malformed varint.");
    }

    static e0 g() {
        return new e0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static e0 h() {
        return new e0("Failed to parse the message.");
    }

    static e0 i() {
        return new e0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static e0 l() {
        return new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static e0 m() {
        return new e0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f26996b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f26996b = true;
    }

    public e0 k(v0 v0Var) {
        this.f26995a = v0Var;
        return this;
    }

    public e0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
