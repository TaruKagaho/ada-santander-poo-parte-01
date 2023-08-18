package aula04.heranca;

public class Main04Heranca {
    public static void imprimirDados(Veiculo veiculo) {
        veiculo.exibirDados();
    }

    public static void main(String[] args) {
        Carro carro01 = new Carro(
                "123456",
                "cinza",
                "Celta",
                2015,
                4,
                "Flex"
        );

        Moto moto01 = new Moto(
                "PX4B79",
                "preto",
                "CX",
                2019,
                700
        );

        // carro01.exibirDados();
        imprimirDados(carro01);
        System.out.println("-------");
        // moto01.exibirDados();
        imprimirDados(moto01);
    }
}