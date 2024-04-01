public class test {
    public static void main(String[] args){
        String str="127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\"";
        System.out.println(str.indexOf(" "));
        System.out.println(str.substring(0, str.indexOf(" ")));
        int a = str.indexOf("\"");
        int b = str.indexOf(" /",a);
        System.out.println(str.substring(a+1,b));
    }
}
