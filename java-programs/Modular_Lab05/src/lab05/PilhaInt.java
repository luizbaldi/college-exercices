package lab05;

public class PilhaInt implements Cloneable {

	private int[] buffer;
	private int topo;
	
	public PilhaInt(int contMax) {
		buffer = new int[contMax];
		topo = -1;
	}
	
	public void push(int val) {
		buffer[++topo] = val;
	
	}
	
	public int pop() {
		return buffer[topo--];
	} 
	
	public Object clone() {
		try {
			PilhaInt nObj = (PilhaInt) super.clone();
			nObj.buffer = (int[]) buffer.clone();
			return nObj;
		} catch(CloneNotSupportedException e) {
			// Não pode  acontecer.  Nós damos  suporte
			// a  clone  e  arrays também .
			throw new InternalError(e.toString());
		}
	}
}
