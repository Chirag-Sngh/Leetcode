/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        if(root == null){
            return "X";
        }
        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);
        return root.val + "," + leftSerialized + "," + rightSerialized;
    }
    public TreeNode deserialize(String data) {
        Queue<String> nodesLeft = new LinkedList<>();
    nodesLeft.addAll(Arrays.asList(data.split(",")));
        return deserializedHelper(nodesLeft);
        }
    public TreeNode deserializedHelper(Queue<String> nodesLeft){
        String valueForNode = nodesLeft.poll();
        if(valueForNode.equals("X")) return null;
        TreeNode newNode = new 
            TreeNode (Integer.valueOf(valueForNode));
        newNode.left = deserializedHelper(nodesLeft);
         newNode.right = deserializedHelper(nodesLeft);
        return newNode ;
    }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));