import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;  

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;  

        while (!q.isEmpty()) {
            int levelSize = q.size();  
            List<Integer> data = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                if (curr != null) {
                    data.add(curr.val);

                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
            }

            
            if (!flag) Collections.reverse(data);

            res.add(data);
            flag = !flag;  
        }

        return res;
    }
}
