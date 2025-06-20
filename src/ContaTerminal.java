public class ContaTerminal {
        private int numero;
        private String agencia;
        private String nomeCliente;
        private double saldo;

        public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public void setAgencia(String agencia) {
            this.agencia = agencia;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }

        public String getAgencia() {
            return agencia;
        }

        public String getNomeCliente() {
            return nomeCliente;
        }

        public double getSaldo() {
            return saldo;
        }

        /*Numero	Inteiro	1021
        Agencia	Texto	067-8
        Nome Cliente	Texto	MARIO ANDRADE
        Saldo	Decimal	237.48*/

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", this.nomeCliente, this.agencia, this.numero, this.saldo);
    };
}
