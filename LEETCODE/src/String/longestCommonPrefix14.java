package String;

/*
 Write a function to find the longest common prefix string amongst an array of strings.
 */
public class longestCommonPrefix14 {
    public static String longestCommonPrefix(String[] strs) {
    	if (strs==null || strs.length==0){
    		return "";
    	}
    	int minlen=strs[0].length();
        for (int i=0;i<strs.length;i++){
        	if(minlen>strs[i].length())
        		minlen=strs[i].length();
        }
        int s=0;
        for (;s<minlen;s++){
        	char tmp=strs[0].charAt(s);
        	for (int j=1;j<strs.length;j++){
        		if(tmp-strs[j].charAt(s)!=0)
        			return strs[0].substring(0,s);
        	}
        }
        return strs[0].substring(0,s); 
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strs={"abc","abcd","ab","ab"};
		String[] strs={};
		System.out.println(longestCommonPrefix(strs));

	}

}
