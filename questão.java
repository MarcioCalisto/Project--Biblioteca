public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa a data
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Método para adicionar 1 dia à data
    public void adicionarUmDia() {
        dia++; // Incrementa o dia

        // Verifica o fim do mês
        if ((dia > 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) || 
            (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) || 
            (mes == 2 && (dia > 28 && !ehAnoBissexto()) || dia > 29)) {

            dia = 1; // Reseta o dia
            mes++; // Incrementa o mês

            // Verifica o fim do ano
            if (mes > 12) {
                mes = 1; // Reseta o mês
                ano++;   // Incrementa o ano
            }
        }
    }

    // Verifica se o ano é bissexto
    private boolean ehAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Método para mostrar a data no formato brasileiro
    public void mostrarData() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Data data = new Data(28, 2, 2024); // Ano bissexto
        System.out.print("Data original: ");
        data.mostrarData();

        data.adicionarUmDia();
        System.out.print("Data após adicionar 1 dia: ");
        data.mostrarData();
    }
}
