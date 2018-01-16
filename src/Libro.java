
public class Libro {

	//Attributi
	
	private String titolo;
	private String autore;
	private int numeroPagine;
	private static double costoPagina=0.05;
	private final double COSTO_FISSO=5.5;
	
	
	//Metodi
	
	public Libro(String titoloInserito, String autoreInserito, int numeroPagineInserite)
	{
		titolo=titoloInserito;
		autore=autoreInserito;
		numeroPagine=numeroPagineInserite;
		
	}
	
	public String getTitolo()
	{
		return titolo;
	}
	public void setTitolo(String titoloInserito)
	{
		titolo=titoloInserito;
	}
	
	public String getAutore()
	{
		return autore;
	}
	public void setAutore(String autoreInserito)
	{
		autore=autoreInserito;
	}
	
	public int getNumeroPagine()
	{
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagineInserite)
	{
		numeroPagine=numeroPagineInserite;
	}
	
	public double getCostoPagina()
	{
		return costoPagina;
	}
	
	public static void setCostoPagina (double costoPaginaInserito)
	{
		costoPaginaInserito=costoPagina;
	}
	
	//Altri Metodi
	
	public double prezzo()
	{
		return ((getNumeroPagine()*costoPagina)+COSTO_FISSO);
	}
	
}
