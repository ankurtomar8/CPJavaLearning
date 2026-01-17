

public class TreeConstruct {
    public static void main(String[] args){
        
        TreeNode root = new TreeNode(50);

        System.out.println(root.data); 
        
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(25);

        root.left.right = new TreeNode(27);

        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);

      // Ro(50),LRo(10),RRo(30),LLRo(25),LRRo(27)


        

    }

  public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            // initalization --> No node
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }


}
