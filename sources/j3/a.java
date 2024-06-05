package j3;

import f3.h;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r6.c;
import r6.e;

/* compiled from: IcyDecoder */
public final class a extends h {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f19273c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f19274a = e.f29803c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f19275b = e.f29802b.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f19274a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f19275b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f19275b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f19274a.reset();
            byteBuffer.rewind();
        }
    }

    /* access modifiers changed from: protected */
    public f3.a b(f3.e eVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new f3.a(new c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f19273c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e10 = c.e(group);
                e10.hashCode();
                if (e10.equals("streamurl")) {
                    str2 = group2;
                } else if (e10.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new f3.a(new c(bArr, str, str2));
    }
}
