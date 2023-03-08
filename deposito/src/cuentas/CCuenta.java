package cuentas;
/**
 * Esta clase cuenta con las variables, constructores, getters y setters precisos para trabajar en el main de la Tarea 4. Se trata de hacer depósitos y retiradas de dinero, y consultar el estado de cuentas.
 * @author Marcos
 * @version 1.0
 * 
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
	public float cantidad;

    public CCuenta()
    {
    }

    /**
     * Este constructor nos permite crear nuevos objetos
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * 
     * @return Constructor getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Nos permite hacer un ingreso
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Nos permite hacer una retirada
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Nos permite acceder al atributo encapsulado
     * @return
     */
	@SuppressWarnings("unused")
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * Nos permite utilizar el atributo encapsulado
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Nos permite acceder al atributo encapsulado
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Nos permite utilizar el atributo encapsulado
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Nos permite acceder al atributo encapsulado
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * Nos permite utilizar el atributo encapsulado
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Nos permite acceder al atributo encapsulado
	 * @return
	 */
	@SuppressWarnings("unused")
	private double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * Nos permite utilizar el atributo encapsulado
	 * @param tipoInterés
	 */
	@SuppressWarnings("unused")
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Nos permite acceder al atributo encapsulado
	 * @return
	 */
	public static float ingresar() {
		// TODO Auto-generated method stub
		return 0;
		
	}


}
