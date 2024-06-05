package gd;

import java.io.IOException;

/* compiled from: Protocol */
public enum i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f32926a;

    private i(String str) {
        this.f32926a = str;
    }

    public static i a(String str) throws IOException {
        i iVar = HTTP_1_0;
        if (str.equals(iVar.f32926a)) {
            return iVar;
        }
        i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.f32926a)) {
            return iVar2;
        }
        i iVar3 = HTTP_2;
        if (str.equals(iVar3.f32926a)) {
            return iVar3;
        }
        i iVar4 = SPDY_3;
        if (str.equals(iVar4.f32926a)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f32926a;
    }
}
