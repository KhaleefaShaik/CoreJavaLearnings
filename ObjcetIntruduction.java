package JavaLanguePackageConcepts;

public class ObjcetIntruduction {
	
	/*int object_id;
	String object_name;
	
	ObjcetIntruduction(int object_id, String object_name)
	{
		this.object_id=	object_id;
		this.object_name=object_name;
	}
	
	public int hashCode()
	{
		return object_id;
	}
	public static void main(String[] args) {
		
		ObjcetIntruduction obj= new ObjcetIntruduction(10,"firstobject");
		ObjcetIntruduction obj1= new ObjcetIntruduction(20,"secondobject");
		ObjcetIntruduction obj2= new ObjcetIntruduction(30,"secondobject");
		//System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		//System.out.println(obj.getClass());

	}*/

    public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	return "subbu";
    }
    
    public ObjcetIntruduction toString1()
    {
    	return this;
    }
	
	public static void main (String args[])
	{
		ObjcetIntruduction obj1 = new ObjcetIntruduction();
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.getClass().getMethods());
		//System.out.println("this is a super class");
	}
}
