package JetBrainsYouthCodingClub20262027.APrefixSumsandDifferenceArrays;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ISubarraysDivisiblebyK {
    public static void main (String args[]) {
        Kattio io=new Kattio();
        int n=io.nextInt();
        long k=io.nextLong();
        HashMap<Long,Long> map=new HashMap<>();
        long prefix=0;
        long count=0;
        map.put(0L,1L);
        for(int i=0;i<n;i++){
            long x=io.nextLong();
            prefix+=x;
            long target=(prefix%k+k)%k;
            count+=map.getOrDefault(target,0L);
            map.put(target,map.getOrDefault(target,0L)+1);
        }
        io.println(count);
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
