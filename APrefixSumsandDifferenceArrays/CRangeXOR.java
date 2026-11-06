package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class CRangeXOR {
    public static void main(String args[]) throws IOException {
//     \[
//\boxed{XOR(l,r)=prefix[r]\oplus prefix[l-1]}
//\]
        Kattio io = new Kattio();

        int n = io.nextInt();
        int m = io.nextInt();

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            long x = io.nextLong();
            prefix[i] = prefix[i - 1] ^ x;
        }

        for (int i = 0; i < m; i++) {

            int l = io.nextInt();
            int r = io.nextInt();

            long ans = prefix[r] ^ prefix[l - 1];

            io.println(ans);
        }

        io.close();
    }
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        public Kattio() {
            this(System.in, System.out);
        }

        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(r.readLine());
                }
                return st.nextToken();
            } catch (Exception e) {
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
