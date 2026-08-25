class TOH {
    int count=0;
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if (n == 0) {
            return 0;
        }
        towerOfHanoi(n - 1, from, aux, to);
        count++;
        towerOfHanoi(n - 1, aux, to, from);
        return count;
    }
    public static void main(String[] args) {
        TOH obj = new TOH();
        System.out.println(obj.towerOfHanoi(3, 1, 3, 2));
    }
}

