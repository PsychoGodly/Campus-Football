package ea;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f28835a;

    /* renamed from: b  reason: collision with root package name */
    protected final C0300b f28836b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: ea.b$b  reason: collision with other inner class name */
    public interface C0300b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(C0300b bVar) {
        this.f28836b = bVar;
    }

    public void a(a aVar) {
        this.f28835a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(String str) {
        a aVar = this.f28835a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void c(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
