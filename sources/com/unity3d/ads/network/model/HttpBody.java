package com.unity3d.ads.network.model;

import kotlin.jvm.internal.m;

/* compiled from: HttpBody.kt */
public interface HttpBody {

    /* compiled from: HttpBody.kt */
    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] bArr) {
            m.e(bArr, "content");
            this.content = bArr;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    /* compiled from: HttpBody.kt */
    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* compiled from: HttpBody.kt */
    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String str) {
            m.e(str, "content");
            this.content = str;
        }

        public final String getContent() {
            return this.content;
        }
    }
}
