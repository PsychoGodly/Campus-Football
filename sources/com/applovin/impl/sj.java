package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sm;
import java.util.Objects;
import java.util.Set;

public final class sj {

    /* renamed from: b  reason: collision with root package name */
    private static k f12116b;

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f12117c;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f12118a;

    public sj(k kVar) {
        this.f12118a = k.k().getSharedPreferences("com.applovin.sdk.preferences." + kVar.d0(), 0);
        f12116b = kVar;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public void b(qj qjVar, Object obj) {
        b(qjVar, obj, this.f12118a);
    }

    public static void b(qj qjVar, Object obj, Context context) {
        a(qjVar.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public Object a(qj qjVar, Object obj) {
        return a(qjVar, obj, this.f12118a);
    }

    public static Object a(qj qjVar, Object obj, Context context) {
        return a(qjVar.a(), obj, qjVar.b(), a(context));
    }

    public void b(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        a(qjVar.a(), obj, sharedPreferences);
    }

    public Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        return a(qjVar.a(), obj, qjVar.b(), sharedPreferences);
    }

    public void b(qj qjVar) {
        a(this.f12118a.edit().remove(qjVar.a()));
    }

    public static Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences, boolean z10) {
        return a(qjVar.a(), obj, qjVar.b(), sharedPreferences, z10);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z10) {
        Object obj2;
        long j10;
        int i10;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    obj2 = obj != null ? Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue())) : Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    obj2 = obj != null ? Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue())) : Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                } else if (cls3.equals(cls)) {
                    if (obj != null) {
                        if (obj.getClass().equals(cls2)) {
                            i10 = ((Long) obj).intValue();
                        } else {
                            i10 = ((Integer) obj).intValue();
                        }
                        obj2 = Integer.valueOf(sharedPreferences.getInt(str, i10));
                    } else {
                        obj2 = Integer.valueOf(sharedPreferences.getInt(str, 0));
                    }
                } else if (cls2.equals(cls)) {
                    if (obj != null) {
                        if (obj.getClass().equals(cls3)) {
                            j10 = ((Integer) obj).longValue();
                        } else {
                            j10 = ((Long) obj).longValue();
                        }
                        obj2 = Long.valueOf(sharedPreferences.getLong(str, j10));
                    } else {
                        obj2 = Long.valueOf(sharedPreferences.getLong(str, 0));
                    }
                } else if (Double.class.equals(cls)) {
                    obj2 = obj != null ? Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue())))) : Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0)));
                } else if (String.class.equals(cls)) {
                    obj2 = sharedPreferences.getString(str, (String) obj);
                } else {
                    obj2 = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
                }
                if (obj2 != null) {
                    return cls.cast(obj2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return obj;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return obj;
        } catch (Throwable th) {
            if (z10) {
                t.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
            }
            return obj;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public Object a(qj qjVar) {
        Object a10 = a(qjVar, (Object) null);
        b(qjVar);
        return a10;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z10 = editor != null;
        if (!z10) {
            editor = sharedPreferences.edit();
        }
        if (obj == null) {
            editor.remove(str);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
        } else {
            t.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
            return;
        }
        if (!z10) {
            a(editor);
        }
    }

    private static void a(SharedPreferences.Editor editor) {
        try {
            if (zp.h()) {
                k kVar = f12116b;
                if (kVar == null || kVar.l0() == null) {
                    editor.apply();
                    return;
                }
                sm l02 = f12116b.l0();
                k kVar2 = f12116b;
                Objects.requireNonNull(editor);
                l02.a((xl) new kn(kVar2, true, "commitSharedPreferencesChanges", new a50(editor)), sm.b.OTHER);
                return;
            }
            editor.commit();
        } catch (Throwable th) {
            t.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    private static SharedPreferences a(Context context) {
        if (f12117c == null) {
            f12117c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f12117c;
    }
}
