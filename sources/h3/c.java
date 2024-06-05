package h3;

import com.applovin.mediation.MaxReward;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: EventMessageEncoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f18742a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f18743b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f18742a = byteArrayOutputStream;
        this.f18743b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f18742a.reset();
        try {
            b(this.f18743b, aVar.f18736a);
            String str = aVar.f18737b;
            if (str == null) {
                str = MaxReward.DEFAULT_LABEL;
            }
            b(this.f18743b, str);
            this.f18743b.writeLong(aVar.f18738c);
            this.f18743b.writeLong(aVar.f18739d);
            this.f18743b.write(aVar.f18740f);
            this.f18743b.flush();
            return this.f18742a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
