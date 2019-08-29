public class BST{
    protected BSTNode root;
    public void insert(int val){
        if(root==null){
            root = new BSTNode(val);
        }
        else{
            root.insert(val);
        }
    }
    public boolean search(int val){
        if(root == null){
            return false;
        }
        else{
            return root.search(val);
        }

    }
    public void inorder(){
        if(root==null){
            return;
        }
        else{
            root.inorder();
        }
    }
    public void postorder(){
        if(root==null){
            return;
        }
        else{
            root.postorder();
        }
    }
    public void preorder(){
        if(root==null){
            return;
        }
        else{
            root.preorder();
        }
    }
    public int height(){
        if(root==null){
            return 0;
        }
        else{
            return root.height();
        }
    }
}