package k4;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import l4.c;

/* compiled from: MediaFormatUtil */
public final class u {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, c cVar) {
        if (cVar != null) {
            d(mediaFormat, "color-transfer", cVar.f19907c);
            d(mediaFormat, "color-standard", cVar.f19905a);
            d(mediaFormat, "color-range", cVar.f19906b);
            a(mediaFormat, "hdr-static-info", cVar.f19908d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }
}
