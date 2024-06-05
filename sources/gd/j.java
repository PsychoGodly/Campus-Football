package gd;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: StatusLine */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final i f32927a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32928b;

    /* renamed from: c  reason: collision with root package name */
    public final String f32929c;

    public j(i iVar, int i10, String str) {
        this.f32927a = iVar;
        this.f32928b = i10;
        this.f32929c = str;
    }

    public static j a(String str) throws IOException {
        i iVar;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                iVar = i.HTTP_1_0;
            } else if (charAt == 1) {
                iVar = i.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            iVar = i.HTTP_1_0;
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = MaxReward.DEFAULT_LABEL;
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new j(iVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32927a == i.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f32928b);
        if (this.f32929c != null) {
            sb2.append(' ');
            sb2.append(this.f32929c);
        }
        return sb2.toString();
    }
}
