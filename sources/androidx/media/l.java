package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* compiled from: VolumeProviderCompat */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f4135a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4136b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4137c;

    /* renamed from: d  reason: collision with root package name */
    private int f4138d;

    /* renamed from: e  reason: collision with root package name */
    private d f4139e;

    /* renamed from: f  reason: collision with root package name */
    private VolumeProvider f4140f;

    /* compiled from: VolumeProviderCompat */
    class a extends VolumeProvider {
        a(int i10, int i11, int i12, String str) {
            super(i10, i11, i12, str);
        }

        public void onAdjustVolume(int i10) {
            l.this.e(i10);
        }

        public void onSetVolumeTo(int i10) {
            l.this.f(i10);
        }
    }

    /* compiled from: VolumeProviderCompat */
    class b extends VolumeProvider {
        b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        public void onAdjustVolume(int i10) {
            l.this.e(i10);
        }

        public void onSetVolumeTo(int i10) {
            l.this.f(i10);
        }
    }

    /* compiled from: VolumeProviderCompat */
    private static class c {
        static void a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    /* compiled from: VolumeProviderCompat */
    public static abstract class d {
        public abstract void a(l lVar);
    }

    public l(int i10, int i11, int i12) {
        this(i10, i11, i12, (String) null);
    }

    public final int a() {
        return this.f4138d;
    }

    public final int b() {
        return this.f4136b;
    }

    public final int c() {
        return this.f4135a;
    }

    public Object d() {
        if (this.f4140f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f4140f = new a(this.f4135a, this.f4136b, this.f4138d, this.f4137c);
            } else if (i10 >= 21) {
                this.f4140f = new b(this.f4135a, this.f4136b, this.f4138d);
            }
        }
        return this.f4140f;
    }

    public abstract void e(int i10);

    public abstract void f(int i10);

    public void g(d dVar) {
        this.f4139e = dVar;
    }

    public final void h(int i10) {
        this.f4138d = i10;
        if (Build.VERSION.SDK_INT >= 21) {
            c.a((VolumeProvider) d(), i10);
        }
        d dVar = this.f4139e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public l(int i10, int i11, int i12, String str) {
        this.f4135a = i10;
        this.f4136b = i11;
        this.f4138d = i12;
        this.f4137c = str;
    }
}
