package cc.chenlong.tree;

/**
 * 树的节点
 *
 * @author chenlong
 * @date 2019/3/6 9:31
 */
public class Node {

    /**
     * 节点数据
     */
    private Comparable data;

    /**
     * 左子节点的引用
     */
    private Node leftChild;

    /**
     * 右子节点的引用
     */
    private Node rightChild;

    public Node() {
    }

    public Node(Comparable data) {
        this.data = data;
    }

    public Node(Comparable data, Node leftChild, Node rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Comparable getData() {
        return data;
    }

    public void setData(Comparable data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    /**
     * 打印节点内容
     *
     * @param
     * @return void
     * @author chenlong
     * @since 2019/3/6 9:32
     **/
    public void display(){
        System.out.println(data);
    }


}