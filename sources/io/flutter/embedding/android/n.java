package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: KeyData */
public class n {

    /* renamed from: a  reason: collision with root package name */
    long f33477a;

    /* renamed from: b  reason: collision with root package name */
    a f33478b;

    /* renamed from: c  reason: collision with root package name */
    long f33479c;

    /* renamed from: d  reason: collision with root package name */
    long f33480d;

    /* renamed from: e  reason: collision with root package name */
    boolean f33481e;

    /* renamed from: f  reason: collision with root package name */
    String f33482f;

    /* compiled from: KeyData */
    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: a  reason: collision with root package name */
        private long f33487a;

        private a(long j10) {
            this.f33487a = j10;
        }

        public long a() {
            return this.f33487a;
        }
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer a() {
        int i10;
        try {
            String str = this.f33482f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            if (bytes == null) {
                i10 = 0;
            } else {
                i10 = bytes.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) i10);
            allocateDirect.putLong(this.f33477a);
            allocateDirect.putLong(this.f33478b.a());
            allocateDirect.putLong(this.f33479c);
            allocateDirect.putLong(this.f33480d);
            allocateDirect.putLong(this.f33481e ? 1 : 0);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
