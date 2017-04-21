package HW05;



/**
 * Created by Ladis on 26.2.2017.
 */
public class NodeImpl implements Node {
    private int value;
    private Node left;
    private Node right;

    public NodeImpl(int value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right =right;
    }

    @Override
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node node){
        left = node;
    }
    public void setRight(Node node){
        right = node;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public int getValue() {
        return value;
    }
}
