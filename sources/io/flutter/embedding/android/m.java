package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.s;
import kc.d;

/* compiled from: KeyChannelResponder */
public class m implements s.d {

    /* renamed from: a  reason: collision with root package name */
    private final d f33475a;

    /* renamed from: b  reason: collision with root package name */
    private final s.b f33476b = new s.b();

    public m(d dVar) {
        this.f33475a = dVar;
    }

    public void a(KeyEvent keyEvent, s.d.a aVar) {
        int action = keyEvent.getAction();
        boolean z10 = false;
        if (action == 0 || action == 1) {
            d.b bVar = new d.b(keyEvent, this.f33476b.a(keyEvent.getUnicodeChar()));
            if (action != 0) {
                z10 = true;
            }
            this.f33475a.e(bVar, z10, new l(aVar));
            return;
        }
        aVar.a(false);
    }
}
