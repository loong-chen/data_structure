package cc.chenlong.tree;

/**
 * 树
 *
 * @author chenlong
 * @date 2019/3/6 9:26
 */
public interface Tree {
    /**
     * 查找节点
     *
     * @param key
     * @return cc.chenlong.tree.Node
     * @author chenlong
     * @since 2019/3/6 9:36
     **/
    Node find(Comparable key);

    /**
     * 插入新节点
     *
     * @param key
     * @return boolean
     * @author chenlong
     * @since 2019/3/6 9:36
     **/
    boolean insert(Comparable key);

    /**
     * 删除节点
     *
     * @param key
     * @return boolean
     * @author chenlong
     * @since 2019/3/6 9:36
     **/
    boolean delete(Comparable key);
}