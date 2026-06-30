

class MyHashSet {
    // Class fields accessible by all methods
    private List<Integer>[] buckets;
    private final int BUCKET_SIZE = 769;

    @SuppressWarnings("unchecked")
    public MyHashSet() {
        // Initialize the array of lists
        this.buckets = new LinkedList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        // Math.abs ensures the index is never negative
        return Math.abs(key) % BUCKET_SIZE;
    }

    public void add(int key) {
        int index = hash(key);
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        // Casting to Integer forces LinkedList to remove by value, not index
        buckets[index].remove((Integer) key);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }
}
