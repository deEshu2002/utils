int BFS(Node start, Node target){
    Queue<Node> q;
    Set<Node> visited;

    q.offer(start);
    visited.add(start);

    while(q is not Empty){
        int sz = q.size();
        for(int i = 0; i < sz; i++){
            Node curr = q.poll();
            if(curr is target)
                return step;
            for(Node neighbor: neighbors){
                if(x not in visited){
                    q.offer(x);
                    visted.add(x);
                }
            }
        }
    }
}
