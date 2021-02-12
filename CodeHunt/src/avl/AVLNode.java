package avl;
/*
 * The class AVLNode
 */
public class AVLNode
{
    AVLNode llink, rlink;
    int info;
    int height;

    //default constructor
    public AVLNode()
    {
    	llink = null;
        rlink = null;
        info = 0;
        height = 0;
    }
    
    //constructor with parameter
    public AVLNode(int info)
    {
        llink = null;
        rlink = null;
        this.info = info;
        height = 0;
    }
    
    //toString method
    public String toString(){
    	return ""+info;
    }
}//end class AVLNode
