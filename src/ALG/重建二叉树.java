package ALG;

public class 重建二叉树 {
    public static void main(String[] args) {

        int[] preorder = {1,2,4,7,3,5,6,8};
        int[] inorder = {4,7,2,1,5,3,8,6};
        construct(preorder,inorder);
    }

    static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    private static BinaryTreeNode construct(int[] preorder
            ,int[] inorder){
        if(preorder == null || inorder == null || preorder.length != inorder.length
                || inorder.length < 1){
            return null;
        }

        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private static BinaryTreeNode construct(int[] preorder,int ps,int pe
            ,int[] inorder,int is,int ie){

        if(ps > pe){
            return null;
        }
        int value = preorder[ps];
        int index = is;
        while(index <= ie && inorder[index] != value){
            index++;
        }

        if(index > ie){
            throw new RuntimeException("Invalid input");
        }

        BinaryTreeNode node = new BinaryTreeNode();
        node.value = value;
        node.left = construct(preorder,ps+1,ps+index-is,
                inorder,is,index - 1);
        node.right = construct(preorder,ps+index-is+1,pe,
                inorder,index+1,ie);
        System.out.println(node.value);
        return node;
    }
}
