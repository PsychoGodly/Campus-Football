package vc;

import com.google.android.ump.ConsentForm;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.r;

/* compiled from: UserMessagingCodec */
public class c extends r {

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, ConsentForm> f39136d = new HashMap();

    c() {
    }

    private List<String> q(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object next : (List) obj) {
                if (next instanceof String) {
                    arrayList.add((String) next);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Object g(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case -127:
                return new b((Boolean) g(byteBuffer.get(), byteBuffer), (a) g(byteBuffer.get(), byteBuffer));
            case -126:
                return new a((Integer) g(byteBuffer.get(), byteBuffer), q(g(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.f39136d.get((Integer) g(byteBuffer.get(), byteBuffer));
            default:
                return super.g(b10, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof b) {
            byteArrayOutputStream.write(-127);
            b bVar = (b) obj;
            p(byteArrayOutputStream, bVar.c());
            p(byteArrayOutputStream, bVar.b());
        } else if (obj instanceof a) {
            byteArrayOutputStream.write(-126);
            a aVar = (a) obj;
            p(byteArrayOutputStream, aVar.b());
            p(byteArrayOutputStream, aVar.c());
        } else if (obj instanceof ConsentForm) {
            byteArrayOutputStream.write(-125);
            p(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(ConsentForm consentForm) {
        this.f39136d.remove(Integer.valueOf(consentForm.hashCode()));
    }

    /* access modifiers changed from: package-private */
    public void s(ConsentForm consentForm) {
        this.f39136d.put(Integer.valueOf(consentForm.hashCode()), consentForm);
    }
}
