public class Main {

    public static void main(String[] args) {

            String s;

            Command c= Factory.getInstance().getCommand("C1");
            s = c.execute();
        System.out.println(s+" "+c.getClass());
            c=Factory.getInstance().getCommand("C2");
            s = c.execute();
        System.out.println(s+" "+c.getClass());
            c=Factory.getInstance().getCommand("C3");
            s = c.execute();
        System.out.println(s+" "+c.getClass());
            s = Factory.getInstance().getCommand("C2").execute();
        System.out.println(s+" "+s.getClass());
        }
}