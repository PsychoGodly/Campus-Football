package x9;

import com.unity3d.services.core.device.MimeTypes;

public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);
    

    /* renamed from: a  reason: collision with root package name */
    private final String f31245a;

    private f(String str) {
        this.f31245a = str;
    }

    public String toString() {
        return this.f31245a;
    }
}
