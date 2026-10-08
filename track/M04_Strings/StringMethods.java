
public class StringMethods {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);//KodNest Technologies
        System.out.println(str.toLowerCase());//kodnest technologies
        System.out.println(str.toUpperCase());//KODNEST TECHNOLOGIES
        System.out.println(str.charAt(3));//N
        //System.out.println(str.charAt(99));//StringIndexOutOfBoundException
        System.out.println(str.contains("Nest"));//True
        System.out.println(str.contains("nest"));//false
        System.out.println(str.concat(" PVT LTD"));//KodNest Technologies PVT LTD
        System.out.println(str.startsWith("Kod"));//true
        System.out.println(str.startsWith("Nest"));//false
        System.out.println(str.endsWith("ies"));//true
        System.out.println(str.endsWith("Nest"));//false
        System.out.println(str.indexOf(4));//-1
        System.out.println(str.indexOf('N'));//3
        System.out.println(str.length());//20
        System.out.println(str.replace('e', 'A'));//KodNAst TAchnologiAs
        System.out.println(str.substring(2));//dNest Technologies
        System.out.println(str.substring(2, 15));//dNest Technol
    }
}
