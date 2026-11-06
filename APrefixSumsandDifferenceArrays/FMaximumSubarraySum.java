package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class FMaximumSubarraySum {
    public static void main(String[] args) {
        Kattio io=new Kattio();
        int n=io.nextInt();
        long  currentSum=0;
        long maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            long x=io.nextLong();
            currentSum=Math.max(currentSum+x,x);
            maxSum=Math.max(maxSum,currentSum);
        }
        io.println(maxSum);
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
