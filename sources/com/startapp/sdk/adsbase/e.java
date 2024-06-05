package com.startapp.sdk.adsbase;

import android.content.SharedPreferences;
import android.os.Build;
import com.startapp.j9;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.s;
import com.startapp.t7;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class e implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17011a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17012b;

    /* compiled from: Sta */
    public interface b {
    }

    public e(SharedPreferences sharedPreferences) {
        this(sharedPreferences, (b) null);
    }

    /* renamed from: a */
    public a edit() {
        return new a(this.f17011a.edit(), this.f17011a.getAll(), this.f17012b);
    }

    public boolean contains(String str) {
        try {
            return this.f17011a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public Map<String, ?> getAll() {
        try {
            return this.f17011a.getAll();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    public boolean getBoolean(String str, boolean z10) {
        try {
            return this.f17011a.getBoolean(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    public float getFloat(String str, float f10) {
        try {
            return this.f17011a.getFloat(str, f10);
        } catch (Throwable unused) {
            return f10;
        }
    }

    public int getInt(String str, int i10) {
        try {
            return this.f17011a.getInt(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    public long getLong(String str, long j10) {
        try {
            return this.f17011a.getLong(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    public String getString(String str, String str2) {
        try {
            return this.f17011a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        try {
            return this.f17011a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f17011a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f17011a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public e(SharedPreferences sharedPreferences, b bVar) {
        this.f17011a = sharedPreferences;
        this.f17012b = bVar;
    }

    /* compiled from: Sta */
    public static class a implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        public final SharedPreferences.Editor f17013a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, ?> f17014b;

        /* renamed from: c  reason: collision with root package name */
        public final b f17015c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17016d;

        public a(SharedPreferences.Editor editor, Map<String, ?> map, b bVar) {
            this.f17013a = editor;
            this.f17014b = map;
            this.f17015c = bVar;
        }

        public final <T> void a(String str, T t10) {
            if (this.f17015c != null && !j9.a(this.f17014b.get(str), t10)) {
                this.f17016d = true;
            }
        }

        public void apply() {
            if (Build.VERSION.SDK_INT < 9) {
                this.f17013a.commit();
            } else {
                this.f17013a.apply();
            }
            b bVar = this.f17015c;
            if (bVar != null && this.f17016d) {
                this.f17016d = false;
                t7.f17299d.a(((s) bVar).f17218a.f17173a, MetaDataRequest.RequestReason.EXTRAS);
            }
        }

        public SharedPreferences.Editor clear() {
            if (!this.f17014b.isEmpty()) {
                this.f17016d = true;
            }
            this.f17013a.clear();
            return this;
        }

        public boolean commit() {
            return this.f17013a.commit();
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            a(str, Boolean.valueOf(z10));
            this.f17013a.putBoolean(str, z10);
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f10) {
            a(str, Float.valueOf(f10));
            this.f17013a.putFloat(str, f10);
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i10) {
            a(str, Integer.valueOf(i10));
            this.f17013a.putInt(str, i10);
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j10) {
            a(str, Long.valueOf(j10));
            this.f17013a.putLong(str, j10);
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            a(str, str2);
            this.f17013a.putString(str, str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set set) {
            a(str, set);
            this.f17013a.putStringSet(str, set);
            return this;
        }

        public a a(String str, String str2) {
            a(str, str2);
            this.f17013a.putString(str, str2);
            return this;
        }

        public a a(String str, int i10) {
            a(str, Integer.valueOf(i10));
            this.f17013a.putInt(str, i10);
            return this;
        }

        public a a(String str, long j10) {
            a(str, Long.valueOf(j10));
            this.f17013a.putLong(str, j10);
            return this;
        }

        /* renamed from: a */
        public a remove(String str) {
            if (this.f17014b.containsKey(str)) {
                this.f17016d = true;
            }
            this.f17013a.remove(str);
            return this;
        }
    }
}
