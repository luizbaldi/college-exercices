package lab05;


import java.util.Calendar;


public class Data {
	    private int dia, mes, ano; // tres atributos inteiros
	    static final int numDias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	    public static int cont = 0;
	    
	    public Data() {
	    	Calendar c = Calendar.getInstance();
	    	dia = c.get(Calendar.DAY_OF_MONTH);
	    	mes = c.get(Calendar.MONTH) + 1;
	    	ano = c.get(Calendar.YEAR);
	    	cont++;
	    }
	    
	    public Data(int d, int m, int a) throws ExcecaoDataInvalida {
	    	this.setAno(a);
	    	this.setMes(m);
	    	this.setDia(d);
	       cont++;
	    }

	    
	    
	    public int getDia() {
			return dia;
		}

		public void setDia(int dia) throws ExcecaoDataInvalida {
		       if ((dia > 0) && (dia <= numDias[mes-1]))
		    	   this.dia = dia;
		       else throw new ExcecaoDataInvalida("DIA", dia);
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) throws ExcecaoDataInvalida {
		       if ((mes > 0) && (mes <= 12))
		    	   this.mes = mes;
		       else throw new ExcecaoDataInvalida("MES", mes);
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) throws ExcecaoDataInvalida {
		       if (ano > 1900) this.ano = ano;
		       else throw new ExcecaoDataInvalida("ANO", ano);
		}

		public boolean anoBisexto() {
	      if (ano % 4 != 0)
	         return false;
	      else if (ano % 100 != 0)
	               return true;
	            else if (ano % 400 != 0) 
	                    return false;
	                 else  return true;
	    }
	    public void finalize() throws Throwable {
	    	cont--;
	    }
	 }