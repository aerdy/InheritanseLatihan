
public class Customer {
	private int id;
	private String nama;
	private int tanggal;
	
	public void setTanggal(int tanggal2){
		this.tanggal =tanggal2;
	}
	public int getTanggal(){
		return this.tanggal;
	}
	
	
	public void setId(int aId){
		this.id = aId; 	
	}
	
	public void setNama(String nama2){
		this.nama =nama2;
	}
	
	public int getId(){
		return this.id;
	}
	public String getNama(){
		return this.nama;
	}
	
}
