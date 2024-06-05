package lc;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: StringCodec */
public final class t implements i<String> {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f36133a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final t f36134b = new t();

    private t() {
    }

    /* renamed from: c */
    public String b(ByteBuffer byteBuffer) {
        int i10;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i10 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i10 = 0;
        }
        return new String(bArr, i10, remaining, f36133a);
    }

    /* renamed from: d */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f36133a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
