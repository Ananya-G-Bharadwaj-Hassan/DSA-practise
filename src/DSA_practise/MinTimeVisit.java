package DSA_practise;

class MinTime {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=1;i<points.length;i++){
            ans+=Math.max(
                    Math.abs(points[i][0]-points[i-1][0]),
                    Math.abs(points[i][1]-points[i-1][1])
            );
        }
        return ans;
    }

    public static void main(String[] args) {
        MinTime obj=new MinTime();
        System.out.println(obj.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{1,5},{5,3}}));
    }
}