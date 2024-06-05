package com.applovin.impl;

public interface ye {

    /* renamed from: a  reason: collision with root package name */
    public static final ye f13602a = new a();

    class a implements ye {
        a() {
        }

        public boolean a(d9 d9Var) {
            String str = d9Var.f7153m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        public xe b(d9 d9Var) {
            String str = d9Var.f7153m;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (str.equals("application/vnd.dvb.ait")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new z0();
                    case 1:
                        return new qa();
                    case 2:
                        return new ta();
                    case 3:
                        return new v7();
                    case 4:
                        return new qk();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(d9 d9Var);

    xe b(d9 d9Var);
}
