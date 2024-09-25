//There are n cities given along with respective population.
//You have to open m clinics in those cities such that maximum load on clinics are minimized.

public static int minimizeMaxLoad(int[] population, int m) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        
        for(int i : population) {
            pq.add(new double[]{i, 1});
            m--;
        }

        while(m-- > 0) {
            double[] max = pq.poll();
            max[1]++;
            max[0] = max[0] / max[1];
            pq.add(max);
        }
        
        return (int) pq.poll()[0];
    }
