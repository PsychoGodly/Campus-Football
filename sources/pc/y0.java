package pc;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.w0;
import com.google.firebase.auth.x0;
import com.google.firebase.auth.z0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import pc.a1;

/* compiled from: FlutterFirebaseTotpMultiFactor */
public class y0 implements a1.j {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, z0> f37260a = new HashMap();

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(a1.f0 f0Var, Task task) {
        if (task.isSuccessful()) {
            z0 z0Var = (z0) task.getResult();
            f37260a.put(z0Var.i(), z0Var);
            f0Var.success(new a1.z.a().b(Long.valueOf((long) z0Var.g())).c(Long.valueOf((long) z0Var.b())).f(z0Var.i()).e(z0Var.a()).d(Long.valueOf(z0Var.f())).a());
            return;
        }
        f0Var.a(v.e(task.getException()));
    }

    public void a(String str, String str2, a1.f0<String> f0Var) {
        w0 b10 = x0.b(f37260a.get(str), str2);
        String uuid = UUID.randomUUID().toString();
        w0.f37209d.put(uuid, b10);
        f0Var.success(uuid);
    }

    public void b(String str, a1.f0<a1.z> f0Var) {
        x0.a(w0.f37207b.get(str)).addOnCompleteListener(new x0(f0Var));
    }

    public void c(String str, String str2, a1.f0<String> f0Var) {
        w0 c10 = x0.c(str, str2);
        String uuid = UUID.randomUUID().toString();
        w0.f37209d.put(uuid, c10);
        f0Var.success(uuid);
    }
}
