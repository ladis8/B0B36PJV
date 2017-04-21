package HW05;

/**
 * Created by Ladis on 26.2.2017.
 */
public class TreeImpl implements Tree{

    private Node root;
    public TreeImpl(){}

    @Override
    public void setTree(int[] values) {
        root = _setTree(values, 0, values.length-1);
    }

    private Node _setTree(int [] values, int start, int end){
        if (start > end){
            return null;
        }
        //pokud je rozdil lichy, je sudy pocet prvku proto +1
        //pokud je rozdil sudy, je lichy pocet prvku a je to ten uprostred

        int rootpointer = (((end -start) %2 ==0)?(start +end)/2 :(start +end)/2 +1 );

        //System.out.println(rootpointer);
        Node node = new NodeImpl(values [rootpointer], _setTree(values, start, rootpointer-1),_setTree(values, rootpointer+1, end));

        return node;
    }

    @Override
    public Node getRoot() {
        return root;
    }


    public String toString (){
        StringBuilder sb = new StringBuilder();
        return _toString(0, root, sb).toString();
    }

    private StringBuilder _toString(int depth, Node node, StringBuilder sb){

        if (!(node ==null)){
            for (int i=0; i < depth; i++){
                sb.append(" ");
            }
            sb.append("- "+node.getValue()+"\n");
            sb= _toString(depth+1, node.getLeft(), sb);
            sb =_toString(depth+1, node.getRight(), sb);
        }
        return sb;


    }

    /*public static void main(String[] args) {


        int counter =1;

        while (counter <=10){
            int [] arr = new int [counter];
            for (int i=0; i < counter; i++){
                arr [i] = i+1;
            }
            counter++;
            Tree tree = new TreeImpl();
            tree.setTree(arr);
            System.out.println(tree);
        }

    }*/
}
