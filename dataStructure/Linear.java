package dataStructure;

public class Linear {
	

		/*public static int search(int a[],int k)
		{
		    for(int i=0; i<a.length-1; i++)
		    {
		        if(a[i]==k)
		        return i;
		    }
		        return -1;
		}

		*/
		static class TestClass {
		    public static void main(String args[] )  {
		    
		       int a[]={5,11,33,55,66,77};
		       int k=55;
		      
		    /*  int res= search(a,k);
		        if(res==-1) 
		            System.out.println("Not Found");
		        
		        else
		            System.out.println("element found at index  "+ res);
*/
		    for(int i=0;i<a.length-1;i++)
		    {
		    	if(a[i]==k)
		    		System.out.println("found "+a[i]);
		    		break;
		    }
		    	
		    		System.out.println("not found");
		    

		    }
			}
}
