package aula04.heranca;

public class Carro extends Veiculo {
    private int qtdPortas;
    private String tipoCombustivel;

    public Carro(
            String placa,
            String cor,
            String modelo,
            int ano,
            int qtdPortas, String tipoCombustivel
    ) {
        super(placa, cor, modelo, ano);

        this.qtdPortas = qtdPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Quantidade de portas: " + qtdPortas);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
    }
}
