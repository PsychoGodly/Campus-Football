package nc;

import android.view.PointerIcon;
import com.facebook.ads.AdError;
import java.util.HashMap;
import kc.h;

/* compiled from: MouseCursorPlugin */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Integer> f36492c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f36493a;

    /* renamed from: b  reason: collision with root package name */
    private final h f36494b;

    /* renamed from: nc.a$a  reason: collision with other inner class name */
    /* compiled from: MouseCursorPlugin */
    class C0420a implements h.b {
        C0420a() {
        }

        public void a(String str) {
            a.this.f36493a.setPointerIcon(a.this.d(str));
        }
    }

    /* compiled from: MouseCursorPlugin */
    class b extends HashMap<String, Integer> {
        b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", Integer.valueOf(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE));
            put("contextMenu", Integer.valueOf(AdError.NO_FILL_ERROR_CODE));
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* compiled from: MouseCursorPlugin */
    public interface c {
        PointerIcon c(int i10);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public a(c cVar, h hVar) {
        this.f36493a = cVar;
        this.f36494b = hVar;
        hVar.b(new C0420a());
    }

    /* access modifiers changed from: private */
    public PointerIcon d(String str) {
        if (f36492c == null) {
            f36492c = new b();
        }
        return this.f36493a.c(f36492c.getOrDefault(str, 1000).intValue());
    }

    public void c() {
        this.f36494b.b((h.b) null);
    }
}
