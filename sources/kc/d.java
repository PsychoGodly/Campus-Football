package kc;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import lc.a;
import lc.c;
import lc.f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: KeyEventChannel */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final lc.a<Object> f35808a;

    /* compiled from: KeyEventChannel */
    public interface a {
        void a(boolean z10);
    }

    /* compiled from: KeyEventChannel */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final KeyEvent f35809a;

        /* renamed from: b  reason: collision with root package name */
        public final Character f35810b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f35809a = keyEvent;
            this.f35810b = ch;
        }
    }

    public d(c cVar) {
        this.f35808a = new lc.a<>(cVar, "flutter/keyevent", f.f36114a);
    }

    private static a.e<Object> b(a aVar) {
        return new c(aVar);
    }

    private Map<String, Object> c(b bVar, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z10 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f35809a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f35809a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f35809a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f35809a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f35809a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f35809a.getMetaState()));
        Character ch = bVar.f35810b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f35809a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f35809a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f35809a.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z10 = false;
        if (obj != null) {
            try {
                z10 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e10) {
                xb.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e10);
            }
        }
        aVar.a(z10);
    }

    public void e(b bVar, boolean z10, a aVar) {
        this.f35808a.d(c(bVar, z10), b(aVar));
    }
}
