package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.StringTokenizer;

public class EAdditionsThenSums {
    public static void main(String args[]) {
        Kattio io=new Kattio();
        int n=io.nextInt();
        int m=io.nextInt();
        int o=io.nextInt();
        long arr[]=new long[n+1];
        long diff[]=new long[n+2];
        for(int i=1;i<=n;i++){
            arr[i]=io.nextLong();
        }
        for(int i=1;i<=m;i++){
            int l=io.nextInt();
            int r=io.nextInt();
            long x=io.nextLong();
            diff[l]+=x;
            diff[r+1]-=x;
        }
        long sum=0;
        for(int i=1;i<=n;i++) {
            sum += diff[i];
            arr[i]+=sum;
        }

        for(int i=1;i<=n;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=1;i<=o;i++){
            int l=io.nextInt();
            int r=io.nextInt();
            io.println(arr[r]-arr[l-1]);
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

