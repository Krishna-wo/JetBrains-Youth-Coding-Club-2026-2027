package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class KWeightedRangeSum {
    public static void main(String [] args){
        Kattio io=new Kattio();
        int n=io.nextInt();
        int k=io.nextInt();
        long []arr=new long[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=io.nextLong();
        }
        for(int j=1;j<=k;j++){
            int mul=1;
            int l=io.nextInt();
            int r=io.nextInt();
            int end=r-l+1;
            for(int i=l;i<=r;i++){
                arr[i]+=mul;
                mul+=1;
            }
            
        }
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
