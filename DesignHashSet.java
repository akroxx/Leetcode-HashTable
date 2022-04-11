class Bucket {
    private LinkedList<Integer> container;

    // Default constructor 
    public Bucket() {
        container = new LinkedList<Integer>();
    }

    public void insert(Integer key){
        int index = this.container.indexOf(key);
        // indexOf is a pre-defined function

        if(index == -1){    //returns -1 if element doesn't exist in the LinkedList
        // Hence add new node to LinkedList via existing library method addFirst
            this.container.addFirst(key);
        // Always adding in beginning of LinkedList as it allows lower time complexity
        }
    }

    public void delete(Integer key){
        this.container.remove(key);
        // Pre-defined function to remove node from Linked List
    }

    public boolean exisits(Integer key){
        int index = this.container.indexOf(key);
        return (index != -1);
    }
}


// Now defining the HashSet class

class MyHashSet {
    private Bucket[] bucketArray;
    private int keyRange;

    // Default constructor
    public MyHashSet() {
        this.keyRange = 769;
        // Defining size of bucketArray[]

        // Defining a bucketArray for with the defined size of keyRange
        this.bucketArray = new Bucket[this.keyRange];

        // Loop iteration for all elements of bucketArray wherein they each have a LL assigned
        for(int i =0; i <this.keyRange; i++){
            this.bucketArray[i] = new Bucket();
        }
    }

        protected int _hash(int key) {
            return (key % this.keyRange);
            
        }

        public void add(int key) {
            int bucketIndex = this._hash(key);
            this.bucketArray[bucketIndex].insert(key);
        }

        public void remove(int key) {
            int bucketIndex = this._hash(key);
            this.bucketArray[bucketIndex].delete(key);
        }

        // Return true if the HashSet contained specified element
        public boolean contains(int key){
            int bucketIndex = this._hash(key);
            return this.bucketArray[bucketIndex].exisits(key);
        }
    
}

