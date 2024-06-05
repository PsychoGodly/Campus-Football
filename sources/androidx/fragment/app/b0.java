package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter */
final class b0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f3500a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f3501b = new StringBuilder(128);

    b0(String str) {
        this.f3500a = str;
    }

    private void h() {
        if (this.f3501b.length() > 0) {
            Log.d(this.f3500a, this.f3501b.toString());
            StringBuilder sb2 = this.f3501b;
            sb2.delete(0, sb2.length());
        }
    }

    public void close() {
        h();
    }

    public void flush() {
        h();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                h();
            } else {
                this.f3501b.append(c10);
            }
        }
    }
}
