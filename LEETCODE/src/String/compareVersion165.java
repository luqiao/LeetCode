package String;
/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
 */
public class compareVersion165 {
    public static int compareVersion(String version1, String version2) {	
        String[] strs1=version1.split("\\.");
        String[] strs2=version2.split("\\.");
        int i=0;
        while(i<strs1.length && i<strs2.length){
        	int num1=Integer.parseInt(strs1[i]);
        	int num2=Integer.parseInt(strs2[i]);
        	if(num1==num2){
        		i++;
        	}else if(num1>num2){
        		return 1;
        	}else{
        		return -1;
        	}
        }
        if (i==strs1.length&&i==strs2.length){
        	return 0;
        }else if (i<strs1.length){
        	for(int j=i;j<strs1.length;j++)
        		if(Integer.parseInt(strs1[j])>0)
        			return 1;
        	return 0;
        }else{
        	for(int j=i;j<strs2.length;j++)
        		if(Integer.parseInt(strs2[j])>0)
        			return -1;
        	return 0;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str11="1",str12="1";
		String str21="1.1",str22="1.1";
		String str31="1.1",str32="1";
		String str41="1",str42="1.1";
		String str51="1.0",str52="1";
		String str61="1",str62="1.0";
		System.out.println(compareVersion(str11,str12));
		System.out.println(compareVersion(str21,str22));
		System.out.println(compareVersion(str31,str32));
		System.out.println(compareVersion(str41,str42));
		System.out.println(compareVersion(str51,str52));
		System.out.println(compareVersion(str61,str62));

	}

}

