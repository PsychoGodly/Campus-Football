package s9;

import com.unity3d.services.core.device.MimeTypes;

/* compiled from: Sta */
public enum b {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);
    

    /* renamed from: a  reason: collision with root package name */
    private final String f30324a;

    /* access modifiers changed from: public */
    b(String str) {
        this.f30324a = str;
    }

    public String toString() {
        return this.f30324a;
    }
}
