package c8;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final byte f24308a = Byte.parseByte("01110000", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final byte f24309b = Byte.parseByte("00001111", 2);

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    public String a() {
        byte[] c10 = c(UUID.randomUUID(), new byte[17]);
        c10[16] = c10[0];
        c10[0] = (byte) ((f24309b & c10[0]) | f24308a);
        return b(c10);
    }
}
