package t3;

import android.net.Uri;
import com.applovin.mediation.MaxReward;
import k4.l0;

/* compiled from: RangedUri */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f22631a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22632b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22633c;

    /* renamed from: d  reason: collision with root package name */
    private int f22634d;

    public i(String str, long j10, long j11) {
        this.f22633c = str == null ? MaxReward.DEFAULT_LABEL : str;
        this.f22631a = j10;
        this.f22632b = j11;
    }

    public i a(i iVar, String str) {
        String c10 = c(str);
        if (iVar != null && c10.equals(iVar.c(str))) {
            long j10 = this.f22632b;
            long j11 = -1;
            if (j10 != -1) {
                long j12 = this.f22631a;
                if (j12 + j10 == iVar.f22631a) {
                    long j13 = iVar.f22632b;
                    if (j13 != -1) {
                        j11 = j10 + j13;
                    }
                    return new i(c10, j12, j11);
                }
            }
            long j14 = iVar.f22632b;
            if (j14 != -1) {
                long j15 = iVar.f22631a;
                if (j15 + j14 == this.f22631a) {
                    if (j10 != -1) {
                        j11 = j14 + j10;
                    }
                    return new i(c10, j15, j11);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return l0.e(str, this.f22633c);
    }

    public String c(String str) {
        return l0.d(str, this.f22633c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f22631a == iVar.f22631a && this.f22632b == iVar.f22632b && this.f22633c.equals(iVar.f22633c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f22634d == 0) {
            this.f22634d = ((((527 + ((int) this.f22631a)) * 31) + ((int) this.f22632b)) * 31) + this.f22633c.hashCode();
        }
        return this.f22634d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f22633c + ", start=" + this.f22631a + ", length=" + this.f22632b + ")";
    }
}
