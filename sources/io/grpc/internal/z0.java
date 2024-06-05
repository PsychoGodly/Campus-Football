package io.grpc.internal;

import io.grpc.internal.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* compiled from: JndiResourceResolverFactory */
final class z0 implements c0.g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f35550a = d();

    /* compiled from: JndiResourceResolverFactory */
    static final class a implements c {
        a() {
        }

        private static void b() {
            if (z0.f35550a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", z0.f35550a);
            }
        }

        private static void c(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        private static void d(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        public List<String> a(String str, String str2) throws NamingException {
            b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e10) {
                                c(all2, e10);
                            }
                        }
                        all2.close();
                    } catch (NamingException e11) {
                        c(all, e11);
                    }
                }
                all.close();
            } catch (NamingException e12) {
                d(initialDirContext, e12);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* compiled from: JndiResourceResolverFactory */
    static final class b implements c0.f {

        /* renamed from: b  reason: collision with root package name */
        private static final Logger f35551b = Logger.getLogger(b.class.getName());

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f35552c = Pattern.compile("\\s+");

        /* renamed from: a  reason: collision with root package name */
        private final c f35553a;

        public b(c cVar) {
            this.f35553a = cVar;
        }

        static String b(String str) {
            StringBuilder sb2 = new StringBuilder(str.length());
            int i10 = 0;
            boolean z10 = false;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if (!z10) {
                    if (charAt != ' ') {
                        if (charAt == '\"') {
                            z10 = true;
                        }
                    }
                    i10++;
                } else if (charAt == '\"') {
                    z10 = false;
                    i10++;
                } else if (charAt == '\\') {
                    i10++;
                    charAt = str.charAt(i10);
                }
                sb2.append(charAt);
                i10++;
            }
            return sb2.toString();
        }

        public List<String> a(String str) throws NamingException {
            Logger logger = f35551b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            c cVar = this.f35553a;
            List<String> a10 = cVar.a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a10.size())});
            }
            ArrayList arrayList = new ArrayList(a10.size());
            for (String b10 : a10) {
                arrayList.add(b(b10));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* compiled from: JndiResourceResolverFactory */
    interface c {
        List<String> a(String str, String str2) throws NamingException;
    }

    private static Throwable d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e10) {
            return e10;
        } catch (RuntimeException e11) {
            return e11;
        } catch (Error e12) {
            return e12;
        }
    }

    public c0.f a() {
        if (b() != null) {
            return null;
        }
        return new b(new a());
    }

    public Throwable b() {
        return f35550a;
    }
}
