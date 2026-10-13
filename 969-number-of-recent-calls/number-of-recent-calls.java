class RecentCounter {
    Queue<Integer> list;
    public RecentCounter() {
        list = new LinkedList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        
        while(!list.isEmpty() && t - 3000 > list.peek()){
            list.poll();
        }
        return list.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */