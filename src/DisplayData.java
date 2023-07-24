import java.util.Scanner;

public class DisplayData {
    private Account data;

    public void dysplay(Account data){
        this.data = data;
        String inputValue;
        double deposit;
        Scanner input =  new Scanner(System.in);
        System.out.printf("Olá %s seu saldo inicial é %.2f .%nrealize seu primeiro depósito.",data.getName(),data.getBalance());
        System.out.println("gostaria de realizar seu deposito? SIM ou NÃO");
        inputValue = input.nextLine();
        if(inputValue.trim().equals("sim") ){
            System.out.println("digite o valor abaixo.");
            deposit = input.nextDouble();
            data.deposit(deposit);
            System.out.printf("Seu deposito de R$ %.2f, foi realizado com sucesso!%n seu novo saldo é R$ %.2f",deposit,data.getBalance());
        }else{
            System.out.println("ok, divirta-se com nosso APP :)");
        }

    }

}
