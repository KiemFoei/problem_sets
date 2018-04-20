package exercise;
//	Ìæ»»¿Õ¸ñ
public class StringBufferDemoTest {
	public static void main(String[] args) {
		StringBufferDemo str=new StringBufferDemo();
		StringBuffer str1=new StringBuffer();
		str1.append("ÕÒ Êµ Ï° ÕÒÊµÏ°");
		str.replaceSpace(str1);
		System.out.println(str1);
	}
}
class StringBufferDemo{
	public String replaceSpace(StringBuffer str){
		if(str==null){
			return null;
		}
		int len=str.indexOf(" ");
		if(len>=0){
			str.replace(len, len+1, "%20");
			for(int i=0;i<str.length();i++){
				if(str.indexOf(" ",len)>i){
					int len1=str.indexOf(" ",len);
					str.replace(len1, len1+1, "%20");
				}
			}
		}else{
			return str.toString();
		}
		return str.toString();
		
	}
}