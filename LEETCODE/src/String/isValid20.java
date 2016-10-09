package String;

/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class isValid20 {
    public static boolean isValid(String s) {
    	StringBuilder sb=new StringBuilder();
    	char[] chs=s.toCharArray();
    	for (int i=0;i<chs.length;i++){
    		switch (chs[i]){
    			case '(':
    			case '[':
    			case '{':
    				sb.append(chs[i]);
    				break;
    			default:
    				int len=sb.length();
    				if (len==0){
    					return false;
    				}else{
    					if (chs[i]==')'){
    						len=sb.lastIndexOf("(")+1;
    					}else if(chs[i]==']'){
    						len=sb.lastIndexOf("[")+1;
    					}else if(chs[i]=='}'){
    					len=sb.lastIndexOf("{")+1;
    					}
    					if (len==sb.length()){
    						sb.deleteCharAt(len-1);
    					}else{
    						return false;
    					}
    				}
    		}
    	}
    	if (sb.length()==0){
    		return true;
    	}else {
    		return false;
    	}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println((int)'('+" "+(int)')');
		//System.out.println((int)'['+" "+(int)']');
		//System.out.println((int)'{'+" "+(int)'}');
		System.out.println(isValid("([)]"));

	}

}
