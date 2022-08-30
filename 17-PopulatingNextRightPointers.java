class Solution {
    //TC - O(N)
    //SC - O(N)
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            for(int i=0; i<size; ++i) {
                Node cur = q.poll();
                if(cur.left!=null)
                    q.offer(cur.left);
                if(cur.right!=null)
                    q.offer(cur.right);
                if(prev!=null)
                    prev.next = cur;
                prev = cur;
            }
        }
        
        return root;
    }
}
