public class Main{
    public static void main(String[] args) {
        DisplayData rendering = new DisplayData();
        Account firstUser = new Account("Jonas limah", 50.00);
        Account secondUser =  new Account("joão melo",0.00);
        rendering.dysplay(firstUser);
        rendering.dysplay(secondUser);

    }
}