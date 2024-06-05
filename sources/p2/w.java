package p2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.unity3d.services.UnityAdsConstants;
import k4.n0;

/* compiled from: AudioTimestampPoller */
final class w {

    /* renamed from: a  reason: collision with root package name */
    private final a f21351a;

    /* renamed from: b  reason: collision with root package name */
    private int f21352b;

    /* renamed from: c  reason: collision with root package name */
    private long f21353c;

    /* renamed from: d  reason: collision with root package name */
    private long f21354d;

    /* renamed from: e  reason: collision with root package name */
    private long f21355e;

    /* renamed from: f  reason: collision with root package name */
    private long f21356f;

    /* compiled from: AudioTimestampPoller */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final AudioTrack f21357a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioTimestamp f21358b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        private long f21359c;

        /* renamed from: d  reason: collision with root package name */
        private long f21360d;

        /* renamed from: e  reason: collision with root package name */
        private long f21361e;

        public a(AudioTrack audioTrack) {
            this.f21357a = audioTrack;
        }

        public long a() {
            return this.f21361e;
        }

        public long b() {
            return this.f21358b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f21357a.getTimestamp(this.f21358b);
            if (timestamp) {
                long j10 = this.f21358b.framePosition;
                if (this.f21360d > j10) {
                    this.f21359c++;
                }
                this.f21360d = j10;
                this.f21361e = j10 + (this.f21359c << 32);
            }
            return timestamp;
        }
    }

    public w(AudioTrack audioTrack) {
        if (n0.f19738a >= 19) {
            this.f21351a = new a(audioTrack);
            g();
            return;
        }
        this.f21351a = null;
        h(3);
    }

    private void h(int i10) {
        this.f21352b = i10;
        if (i10 == 0) {
            this.f21355e = 0;
            this.f21356f = -1;
            this.f21353c = System.nanoTime() / 1000;
            this.f21354d = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        } else if (i10 == 1) {
            this.f21354d = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        } else if (i10 == 2 || i10 == 3) {
            this.f21354d = 10000000;
        } else if (i10 == 4) {
            this.f21354d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public void a() {
        if (this.f21352b == 4) {
            g();
        }
    }

    public long b() {
        a aVar = this.f21351a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1;
    }

    public long c() {
        a aVar = this.f21351a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f21352b == 2;
    }

    public boolean e(long j10) {
        a aVar = this.f21351a;
        if (aVar == null || j10 - this.f21355e < this.f21354d) {
            return false;
        }
        this.f21355e = j10;
        boolean c10 = aVar.c();
        int i10 = this.f21352b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c10) {
                        g();
                    }
                } else if (!c10) {
                    g();
                }
            } else if (!c10) {
                g();
            } else if (this.f21351a.a() > this.f21356f) {
                h(2);
            }
        } else if (c10) {
            if (this.f21351a.b() < this.f21353c) {
                return false;
            }
            this.f21356f = this.f21351a.a();
            h(1);
        } else if (j10 - this.f21353c > 500000) {
            h(3);
        }
        return c10;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f21351a != null) {
            h(0);
        }
    }
}
