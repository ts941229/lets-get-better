package singleton;

public class Util {
	private static Util util;
	private Util(){}
    public static Util getInstance(){
    	if(util==null){
        	util = new Util();
        }
        return util;
    }
}