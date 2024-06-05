package androidx.media;

import android.text.TextUtils;
import androidx.core.util.c;

/* compiled from: MediaSessionManagerImplBase */
class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private String f4131a;

    /* renamed from: b  reason: collision with root package name */
    private int f4132b;

    /* renamed from: c  reason: collision with root package name */
    private int f4133c;

    h(String str, int i10, int i11) {
        this.f4131a = str;
        this.f4132b = i10;
        this.f4133c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4132b < 0 || hVar.f4132b < 0) {
            if (!TextUtils.equals(this.f4131a, hVar.f4131a) || this.f4133c != hVar.f4133c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f4131a, hVar.f4131a) && this.f4132b == hVar.f4132b && this.f4133c == hVar.f4133c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return c.b(this.f4131a, Integer.valueOf(this.f4133c));
    }
}
