package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.m;
import ne.c;

/* compiled from: ProtobufExtensions.kt */
public final class ProtobufExtensionsKt {
    public static final i fromBase64(String str) {
        m.e(str, "<this>");
        i o10 = i.o(Base64.decode(str, 2));
        m.d(o10, "copyFrom(android.util.Ba…oid.util.Base64.NO_WRAP))");
        return o10;
    }

    public static final String toBase64(i iVar) {
        m.e(iVar, "<this>");
        String encodeToString = Base64.encodeToString(iVar.J(), 2);
        m.d(encodeToString, "encodeToString(this.toBy…roid.util.Base64.NO_WRAP)");
        return encodeToString;
    }

    public static final i toByteString(UUID uuid) {
        m.e(uuid, "<this>");
        i o10 = i.o(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        m.d(o10, "copyFrom(bytes.array())");
        return o10;
    }

    public static final i toISO8859ByteString(String str) {
        m.e(str, "<this>");
        byte[] bytes = str.getBytes(c.f36517g);
        m.d(bytes, "this as java.lang.String).getBytes(charset)");
        i o10 = i.o(bytes);
        m.d(o10, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return o10;
    }

    public static final String toISO8859String(i iVar) {
        m.e(iVar, "<this>");
        String L = iVar.L(c.f36517g);
        m.d(L, "this.toString(Charsets.ISO_8859_1)");
        return L;
    }

    public static final UUID toUUID(i iVar) {
        m.e(iVar, "<this>");
        ByteBuffer c10 = iVar.c();
        m.d(c10, "this.asReadOnlyByteBuffer()");
        if (c10.remaining() == 36) {
            UUID fromString = UUID.fromString(iVar.N());
            m.d(fromString, "fromString(uuidString)");
            return fromString;
        } else if (c10.remaining() == 16) {
            return new UUID(c10.getLong(), c10.getLong());
        } else {
            throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
        }
    }
}
