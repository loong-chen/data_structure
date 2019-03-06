package cc.chenlong.tree;

/**
 * 二叉搜索树
 * 二叉搜索树要求：若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
 * 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；它的左、右子树也分别为二叉排序树。
 *
 * @author chenlong
 * @date 2019/3/6 9:42
 */
public class BinarySearchTree implements Tree {

    /**
     * 根节点
     */
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 查找某个节点，我们必须从根节点开始遍历。
     * <p>
     * 　　①、查找值比当前节点值大，则搜索右子树；
     * <p>
     * 　　②、查找值等于当前节点值，停止搜索（终止条件）；
     * <p>
     * 　　③、查找值小于当前节点值，则搜索左子树；
     *
     * @param desData 要查找的节点
     * @return cc.chenlong.tree.Node
     * @author chenlong
     * @since 2019/3/6 9:59
     **/
    @Override
    public Node find(Comparable desData) {
        Node current = root;
        while (current != null) {
            //当前值比查找值大，搜索左子树
            if (desData.compareTo(current.getData()) < 0) {
                current = current.getLeftChild();
            } else if (desData.compareTo(current.getData()) > 0) {
                //当前值比查找值小，搜索右子树
                current = current.getRightChild();
            } else {
                return current;
            }
        }
        //遍历完整个树没找到，返回null
        return null;
    }

    @Override
    public boolean insert(Comparable insertData) {
        Node newNode = new Node(insertData);
        //当前树为空树，没有任何节点
        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                //当前值比插入值大，搜索左子节点
                if (insertData.compareTo(current.getData()) < 0) {
                    current = current.getLeftChild();
                    //左子节点为空，直接将新值插入到该节点
                    if (current == null) {
                        parentNode.setLeftChild(newNode);
                        return true;
                    }
                } else {
                    current = current.getRightChild();
                    //右子节点为空，直接将新值插入到该节点
                    if (current == null) {
                        parentNode.setRightChild(newNode);
                        return true;
                    }
                }
            }
        }
        return false;
    }


    /**
     * 中序遍历
     *
     * @param root 树的根节点
     * @return void
     * @author chenlong
     * @since 2019/3/6 10:18
     **/
    public void infixOrder(Node root) {
        if (root != null) {
            infixOrder(root.getLeftChild());
            root.display();
            infixOrder(root.getRightChild());
        }
    }

    /**
     * 前序遍历
     *
     * @param root 树的根节点
     * @return void
     * @author chenlong
     * @since 2019/3/6 10:18
     **/
    public void preOrder(Node root) {
        if (root != null) {
            root.display();
            preOrder(root.getLeftChild());
            preOrder(root.getRightChild());
        }
    }

    /**
     * 后序遍历
     *
     * @param root 树的根节点
     * @return void
     * @author chenlong
     * @since 2019/3/6 10:18
     **/
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeftChild());
            postOrder(root.getRightChild());
            root.display();
        }
    }

    /**
     * 找到最大值
     *
     * @param
     * @return cc.chenlong.tree.Node
     * @author chenlong
     * @since 2019/3/6 10:21
     **/
    public Node findMax() {
        Node current = root;
        Node maxNode = current;
        while (current != null) {
            maxNode = current;
            current = current.getRightChild();
        }
        return maxNode;
    }


    /**
     *
     * 找到最小值
     * @param
     * @return cc.chenlong.tree.Node
     * @author chenlong
     * @since 2019/3/6 10:21
     **/
    public Node findMin() {
        Node current = root;
        Node minNode = current;
        while (current != null) {
            minNode = current;
            current = current.getLeftChild();
        }
        return minNode;
    }

    @Override
    public boolean delete(Comparable key) {
        return false;
    }
}