package yc;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import dc.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lc.c;
import yc.a;

/* compiled from: SharedPreferencesPlugin */
public class l implements dc.a, a.b {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f39427a;

    /* renamed from: b  reason: collision with root package name */
    private k f39428b;

    /* compiled from: SharedPreferencesPlugin */
    static class a implements k {
        a() {
        }

        public String a(List<String> list) throws RuntimeException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        public List<String> b(String str) throws RuntimeException {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public l() {
        this(new a());
    }

    private Map<String, Object> h(String str, Set<String> set) throws RuntimeException {
        Map<String, ?> all = this.f39427a.getAll();
        HashMap hashMap = new HashMap();
        for (String next : all.keySet()) {
            if (next.startsWith(str) && (set == null || set.contains(next))) {
                hashMap.put(next, j(next, all.get(next)));
            }
        }
        return hashMap;
    }

    private void i(c cVar, Context context) {
        this.f39427a = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            j.r(cVar, this);
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    private Object j(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f39428b.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            SharedPreferences.Editor remove = this.f39427a.edit().remove(str);
            remove.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f39428b.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    public Map<String, Object> a(String str, List<String> list) throws RuntimeException {
        return h(str, list == null ? null : new HashSet(list));
    }

    public Boolean b(String str, List<String> list) throws RuntimeException {
        SharedPreferences.Editor edit = this.f39427a.edit();
        Map<String, ?> all = this.f39427a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String next : all.keySet()) {
            if (next.startsWith(str) && (list == null || list.contains(next))) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public Boolean c(String str, List<String> list) throws RuntimeException {
        SharedPreferences.Editor edit = this.f39427a.edit();
        return Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f39428b.a(list)).commit());
    }

    public Boolean d(String str, Long l10) {
        return Boolean.valueOf(this.f39427a.edit().putLong(str, l10.longValue()).commit());
    }

    public Boolean e(String str, String str2) {
        if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return Boolean.valueOf(this.f39427a.edit().putString(str, str2).commit());
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    public Boolean f(String str, Boolean bool) {
        return Boolean.valueOf(this.f39427a.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    public Boolean g(String str, Double d10) {
        String d11 = Double.toString(d10.doubleValue());
        SharedPreferences.Editor edit = this.f39427a.edit();
        return Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d11).commit());
    }

    public void onAttachedToEngine(a.b bVar) {
        i(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        j.r(bVar.b(), (a.b) null);
    }

    public Boolean remove(String str) {
        return Boolean.valueOf(this.f39427a.edit().remove(str).commit());
    }

    l(k kVar) {
        this.f39428b = kVar;
    }
}
