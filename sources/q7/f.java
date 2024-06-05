package q7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import y7.v;

/* compiled from: BundleReader */
public class f {

    /* renamed from: g  reason: collision with root package name */
    private static final Charset f29690g = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final g f29691a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f29692b;

    /* renamed from: c  reason: collision with root package name */
    private final InputStreamReader f29693c;

    /* renamed from: d  reason: collision with root package name */
    e f29694d;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f29695e;

    /* renamed from: f  reason: collision with root package name */
    long f29696f;

    public f(g gVar, InputStream inputStream) {
        this.f29691a = gVar;
        this.f29692b = inputStream;
        this.f29693c = new InputStreamReader(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f29695e = allocate;
        allocate.flip();
    }

    private IllegalArgumentException a(String str) throws IOException {
        b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    private c c(String str) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            e b10 = this.f29691a.b(jSONObject.getJSONObject("metadata"));
            v.a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return b10;
        } else if (jSONObject.has("namedQuery")) {
            j q10 = this.f29691a.q(jSONObject.getJSONObject("namedQuery"));
            v.a("BundleElement", "Query loaded: " + q10.b(), new Object[0]);
            return q10;
        } else if (jSONObject.has("documentMetadata")) {
            h c10 = this.f29691a.c(jSONObject.getJSONObject("documentMetadata"));
            v.a("BundleElement", "Document metadata loaded: " + c10.b(), new Object[0]);
            return c10;
        } else if (jSONObject.has("document")) {
            b f10 = this.f29691a.f(jSONObject.getJSONObject("document"));
            v.a("BundleElement", "Document loaded: " + f10.b(), new Object[0]);
            return f10;
        } else {
            throw a("Cannot decode unknown Bundle element: " + str);
        }
    }

    private int g() {
        this.f29695e.mark();
        int i10 = 0;
        while (true) {
            try {
                if (i10 >= this.f29695e.remaining()) {
                    i10 = -1;
                    break;
                } else if (this.f29695e.get() == 123) {
                    break;
                } else {
                    i10++;
                }
            } finally {
                this.f29695e.reset();
            }
        }
        return i10;
    }

    private boolean h() throws IOException {
        this.f29695e.compact();
        int read = this.f29692b.read(this.f29695e.array(), this.f29695e.arrayOffset() + this.f29695e.position(), this.f29695e.remaining());
        boolean z10 = read > 0;
        if (z10) {
            ByteBuffer byteBuffer = this.f29695e;
            byteBuffer.position(byteBuffer.position() + read);
        }
        this.f29695e.flip();
        return z10;
    }

    private String i(int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i10 > 0) {
            if (this.f29695e.remaining() != 0 || h()) {
                int min = Math.min(i10, this.f29695e.remaining());
                byteArrayOutputStream.write(this.f29695e.array(), this.f29695e.arrayOffset() + this.f29695e.position(), min);
                ByteBuffer byteBuffer = this.f29695e;
                byteBuffer.position(byteBuffer.position() + min);
                i10 -= min;
            } else {
                throw a("Reached the end of bundle when more data was expected.");
            }
        }
        return byteArrayOutputStream.toString(f29690g.name());
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private java.lang.String j() throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3.g()
            r1 = -1
            if (r0 != r1) goto L_0x000d
            boolean r2 = r3.h()
            if (r2 != 0) goto L_0x0000
        L_0x000d:
            java.nio.ByteBuffer r2 = r3.f29695e
            int r2 = r2.remaining()
            if (r2 != 0) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            if (r0 == r1) goto L_0x002f
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r1 = r3.f29695e
            r1.get(r0)
            java.nio.charset.Charset r1 = f29690g
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.CharBuffer r0 = r1.decode(r0)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x002f:
            java.lang.String r0 = "Reached the end of bundle when a length string is expected."
            java.lang.IllegalArgumentException r0 = r3.a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.f.j():java.lang.String");
    }

    private c k() throws IOException, JSONException {
        String j10 = j();
        if (j10 == null) {
            return null;
        }
        int parseInt = Integer.parseInt(j10);
        String i10 = i(parseInt);
        this.f29696f += (long) (j10.getBytes(f29690g).length + parseInt);
        return c(i10);
    }

    public void b() throws IOException {
        this.f29692b.close();
    }

    public e d() throws IOException, JSONException {
        e eVar = this.f29694d;
        if (eVar != null) {
            return eVar;
        }
        c k10 = k();
        if (k10 instanceof e) {
            e eVar2 = (e) k10;
            this.f29694d = eVar2;
            this.f29696f = 0;
            return eVar2;
        }
        throw a("Expected first element in bundle to be a metadata object");
    }

    public long e() {
        return this.f29696f;
    }

    public c f() throws IOException, JSONException {
        d();
        return k();
    }
}
