package JetBrainsYouthCodingClub20262027.BGreedyAlgorithms;

import java.io.*;
import java.util.StringTokenizer;

public class ABracketSubsequence {
    public static void main(String[] args) {
        Kattio io = new Kattio();
        String s = io.next();
        int n = s.length();

        int[] stack = new int[n];
        int top = 0;
        boolean[] keep = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack[top++] = i;
            } else if (top > 0) {
                keep[stack[--top]] = true;
                keep[i] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (keep[i]) sb.append(s.charAt(i));
        }

        io.println(sb.length());
        io.println(sb);
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