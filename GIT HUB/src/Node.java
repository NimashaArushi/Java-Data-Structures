
public class Node {
int data;
Node left,right;

    public Node(int value) {
        data =value;
        left = right=null ;
       
    }}

class Binarytree{
    Node root;

 Binarytree(){
    root=null;
    
    
}
    //==========    insert method =============
    Node insert(Node node,int value){
    if(node==null){
        return new Node(value);}
    
    if(value<node.data){
        node.left=insert(node.left,value);
    
    }
    else if(value>node.data){
     node.right=insert(node.right,value);
    }
    return node;
       
    }
    
    
    //============   Search Method ==================
    boolean search(Node node,int key){
    if(node==null)return false;
    if(node.data==key)return true;
    
    if(key<node.data){
    return search(node.left,key);
    
    }
    else{return search(node.right,key);
    }
  }
    
          // Delete Method ======
       Node delete(Node root,int key){
       if(root==null)return root;
       if(key<root.data){
         root.left=delete(root.left,key);  
         }
       else if(key>root.data){
          root.right=delete(root.right,key);
       }
       
       else{
       if(root.left==null)return root.right;
       else if(root.right==null)return root.left;
       
       root.data=minValue(root.right);
       root.right=delete(root.right,root.data);
       
       }
       return root;
       
       }
       
      int minValue(Node root){
      int minv=root.data;
      while(root.left!=null){
      minv=root.left.data;
      root=root.left;
      }
      return minv;}
      
  

    
     // ===== Tree Height =======
     int findheight(Node node){
     if(node==null){
     return -1;
     }
     
     int leftheight=findheight(node.left);
     int rightheight=findheight(node.right);
     
     if(leftheight>rightheight){
     return leftheight+1;
     }
     else{
     return rightheight+1;
     }
     
     }
     
 
     //========     Tree Traversals   ===========
    void inoder(Node node){
      if(node==null)return ;
       
      inoder(node.left);
      System.out.println(node.data+" ");
      inoder(node.right);
     }
 
    void postoder(Node node){
      if(node==null)return ;
       
      postoder(node.left);
      postoder(node.right);
      System.out.println(node.data+" ");

     }
    
       void preoder(Node node){
      if(node==null)return ;
       
      System.out.println(node.data+" ");
      preoder(node.left);
      preoder(node.right);
    }
    
    
   
    
    public static void main(String[] args) {
     Binarytree tree=new Binarytree();
       
        tree.root=tree.insert(tree.root,12);
        tree.insert(tree.root,10);
        tree.insert(tree.root,8);
        tree.insert(tree.root,25);
        tree.insert(tree.root,3);
        tree.insert(tree.root,35);
        tree.insert(tree.root,15);
        tree.insert(tree.root,11);
        
        
        
        System.out.println("=== Inoder Method ===");
        tree.inoder(tree.root);
        
        System.out.println("=== Postoder Method ===");
        tree.postoder(tree.root); 
 
        System.out.println("=== Pretoder Method ===");
        tree.preoder(tree.root); 
        
        
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("=====S E A R C H I N G   M E T H O D =====");
        System.out.println("Is 10 in tree ? "+tree.search(tree.root, 10));
        System.out.println("Is 48 in tree ? "+tree.search(tree.root, 48));
         
        System.out.println("-------------------------------------------------");
         
        System.out.println("=== F i n d   H e i g h t ===");
        System.out.println(" Tree height is :"+tree.findheight(tree.root));
         System.out.println(" ");
        
         tree.root = tree.delete(tree.root, 10); 
         System.out.println("== After Deleting 10 ==");
         tree.inoder(tree.root); 
        
        
        
    }
     
    }
    

