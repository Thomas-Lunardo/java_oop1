public class Classroom {

    public static void main(String[] args) {

        Wilder jeanClaude = new Wilder("Jean-Claude");
        jeanClaude.setAware(true);
        System.out.println(jeanClaude.whoAmI());
        
        Wilder henri = new Wilder("Henri");
        System.out.println(henri.whoAmI());
    }
}
