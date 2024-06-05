package com.applovin.impl;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class nd {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, p3 p3Var) {
        if (p3Var != null) {
            a(mediaFormat, "color-transfer", p3Var.f10571c);
            a(mediaFormat, "color-standard", p3Var.f10569a);
            a(mediaFormat, "color-range", p3Var.f10570b);
            a(mediaFormat, "hdr-static-info", p3Var.f10572d);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void a(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
