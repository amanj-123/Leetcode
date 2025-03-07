package LinkedList;

public class L705DesignHashSet {
    class MyHashSet {  //TC=O(1) SC=(10^6)
        private boolean[] set;
    
        public MyHashSet() {
            set = new boolean[1000001]; 
        }
    
        public void add(int key) {
            set[key] = true;
        }
    
        public void remove(int key) {
            set[key] = false;
        }
    
        public boolean contains(int key) {
            return set[key];
        }
    }
    
}
