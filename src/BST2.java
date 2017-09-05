import javax.swing.tree.TreeNode;

/**
 * Created by jiayicheng on 17/8/10.
 */
public class BST2 {
    boolean check(TreeNode a)
    {
        return check(a,null,null);
    }

    boolean check(TreeNode a,Integer min,Integer max)
    {
        if(a==null)
            return true;

        if((min!=null&&a.data<=min)||(max!=null&&a.data>=max))
            return false;

        if(!check(a.left,min,n.data)||!check(a.right,n.data,max))
            return false;
    return true;
    }
}
