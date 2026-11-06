package JetBrainsYouthCodingClub20262027.BGreedyAlgorithms;


import java.io.*;
import java.util.*;

public class BCheese {

    static class Pair {
        long first;
        long second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Kattio io = new Kattio();

        int n = io.nextInt();
        long m = io.nextLong();

        Pair[] pairs = new Pair[n];

        for (int i = 0; i < n; i++) {
            long a = io.nextLong();
            long b = io.nextLong();

            pairs[i] = new Pair(a, b);
        }

        Arrays.sort(pairs, (a, b) ->
                Long.compare(b.first, a.first));

        long ans = 0;

        for (int i = 0; i < n; i++) {

            if (m == 0) break;

            // Take as many grams as possible
            long take = Math.min(m, pairs[i].second);

            ans += take * pairs[i].first;

            m -= take;
        }

        io.println(ans);
        io.flush();
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
