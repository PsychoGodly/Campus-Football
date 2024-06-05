package p;

import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* compiled from: TrustedWebActivityIntent */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f21088a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Uri> f21089b;

    b(Intent intent, List<Uri> list) {
        this.f21088a = intent;
        this.f21089b = list;
    }

    public Intent a() {
        return this.f21088a;
    }
}
