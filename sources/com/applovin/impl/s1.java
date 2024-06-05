package com.applovin.impl;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.unity3d.services.UnityAdsConstants;

final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f11266a;

    /* renamed from: b  reason: collision with root package name */
    private int f11267b;

    /* renamed from: c  reason: collision with root package name */
    private long f11268c;

    /* renamed from: d  reason: collision with root package name */
    private long f11269d;

    /* renamed from: e  reason: collision with root package name */
    private long f11270e;

    /* renamed from: f  reason: collision with root package name */
    private long f11271f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f11272a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f11273b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f11274c;

        /* renamed from: d  reason: collision with root package name */
        private long f11275d;

        /* renamed from: e  reason: collision with root package name */
        private long f11276e;

        public a(AudioTrack audioTrack) {
            this.f11272a = audioTrack;
        }

        public long a() {
            return this.f11276e;
        }

        public long b() {
            return this.f11273b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f11272a.getTimestamp(this.f11273b);
            if (timestamp) {
                long j10 = this.f11273b.framePosition;
                if (this.f11275d > j10) {
                    this.f11274c++;
                }
                this.f11275d = j10;
                this.f11276e = j10 + (this.f11274c << 32);
            }
            return timestamp;
        }
    }

    public s1(AudioTrack audioTrack) {
        if (yp.f13662a >= 19) {
            this.f11266a = new a(audioTrack);
            f();
            return;
        }
        this.f11266a = null;
        a(3);
    }

    public void a() {
        if (this.f11267b == 4) {
            f();
        }
    }

    public long b() {
        a aVar = this.f11266a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.f11266a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f11267b == 2;
    }

    public void e() {
        a(4);
    }

    public void f() {
        if (this.f11266a != null) {
            a(0);
        }
    }

    public boolean a(long j10) {
        a aVar = this.f11266a;
        if (aVar == null || j10 - this.f11270e < this.f11269d) {
            return false;
        }
        this.f11270e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f11267b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        f();
                    }
                } else if (!c10) {
                    f();
                }
            } else if (!c10) {
                f();
            } else if (this.f11266a.a() > this.f11271f) {
                a(2);
            }
        } else if (c10) {
            if (this.f11266a.b() < this.f11268c) {
                return false;
            }
            this.f11271f = this.f11266a.a();
            a(1);
        } else if (j10 - this.f11268c > 500000) {
            a(3);
        }
        return c10;
    }

    private void a(int i10) {
        this.f11267b = i10;
        if (i10 == 0) {
            this.f11270e = 0;
            this.f11271f = -1;
            this.f11268c = System.nanoTime() / 1000;
            this.f11269d = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        } else if (i10 == 1) {
            this.f11269d = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        } else if (i10 == 2 || i10 == 3) {
            this.f11269d = 10000000;
        } else if (i10 == 4) {
            this.f11269d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
