import javax.swing.tree.TreeNode;

/**
 * Created by jiayicheng on 17/8/9.
 */
public class BSt1 {
    Integer last_print=null;
    boolean checkBST(TreeNode n)
    {
        if(n==null) return true;

        if(!checkBST(n.left)) return false;

        if(last_print!=null&&n.data<=last_print)
            return false;

        last_print=n.data;
        if(!checkBST(n.right)) return false;
        return true;
    }//由小到大

}
