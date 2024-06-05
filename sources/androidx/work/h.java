package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final int f5176a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5177b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f5178c;

    public h(int i10, Notification notification, int i11) {
        this.f5176a = i10;
        this.f5178c = notification;
        this.f5177b = i11;
    }

    public int a() {
        return this.f5177b;
    }

    public Notification b() {
        return this.f5178c;
    }

    public int c() {
        return this.f5176a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f5176a == hVar.f5176a && this.f5177b == hVar.f5177b) {
            return this.f5178c.equals(hVar.f5178c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5176a * 31) + this.f5177b) * 31) + this.f5178c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f5176a + ", mForegroundServiceType=" + this.f5177b + ", mNotification=" + this.f5178c + '}';
    }
}
