package zd;

import be.a;
import kotlin.jvm.internal.m;

/* compiled from: PlatformImplementations.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39547a;

    static {
        a aVar;
        a newInstance;
        Class<a> cls = a.class;
        try {
            newInstance = a.class.newInstance();
            m.d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            if (newInstance != null) {
                aVar = newInstance;
                f39547a = aVar;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        } catch (ClassCastException e10) {
            ClassLoader classLoader = newInstance.getClass().getClassLoader();
            ClassLoader classLoader2 = cls.getClassLoader();
            if (!m.a(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
            }
            throw e10;
        } catch (ClassNotFoundException unused) {
            try {
                Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                m.d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    try {
                        aVar = (a) newInstance2;
                    } catch (ClassCastException e11) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = cls.getClassLoader();
                        if (!m.a(classLoader3, classLoader4)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                        }
                        throw e11;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused2) {
                try {
                    ae.a newInstance3 = ae.a.class.newInstance();
                    m.d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = newInstance3;
                        } catch (ClassCastException e12) {
                            ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader6 = cls.getClassLoader();
                            if (!m.a(classLoader5, classLoader6)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                            }
                            throw e12;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused3) {
                    try {
                        Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        m.d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                        if (newInstance4 != null) {
                            try {
                                aVar = (a) newInstance4;
                            } catch (ClassCastException e13) {
                                ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                                ClassLoader classLoader8 = cls.getClassLoader();
                                if (!m.a(classLoader7, classLoader8)) {
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                                }
                                throw e13;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassNotFoundException unused4) {
                        aVar = new a();
                    }
                }
            }
        }
    }
}
