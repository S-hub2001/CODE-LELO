public class constructerVSmethod
{
    constructerVSmethod(){
        System.out.println("Constructor Called");
    }
 
    public void show(){
         System.out.println("Method Called");
    }
	public static final void main(String[] args) {
        constructerVSmethod obj1 = new constructerVSmethod();
	    obj1.show();
	}
}