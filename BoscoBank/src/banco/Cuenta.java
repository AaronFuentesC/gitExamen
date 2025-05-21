package banco;

import java.io.Serializable;

/**
 *
 * @author Aarón Fuentes Casanova
 */
public class Cuenta implements Serializable, Operable{

    public CuentaData data = new CuentaData();

	public Cuenta(String iban, String titular, String dni) {
        this.data.setIban(iban);
        this.data.setTitular(titular);
        this.data.setSaldo(0);
        this.data.setDni(dni);
    }

    public Cuenta() {
        this.data.setIban("");
        this.data.setTitular("");
        this.data.setSaldo(0);
        this.data.setDni("");
    }

    @Override
	public void ingresar(double cantidad) {
        this.data.setSaldo(this.data.getSaldo() + cantidad);
    }

    @Override
	public void retirar(double cantidad) {
        this.data.setSaldo(this.data.getSaldo() - cantidad);
    }

    @Override
    public String toString() {       
        return String.format("%-24s %-30s %9s %10.2f", this.data.getIban(), this.data.getTitular(), this.data.getDni(), this.data.getSaldo());
    }

}
