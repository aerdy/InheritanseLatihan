
public class CustemerTest {
	public static void main(String[] args) {
		MemberCustomer Mb = new MemberCustomer();
		Mb.setId(212);
		Mb.setNama("anan");
		Mb.setTanggal(12);
		System.out.println("Tanggal lahir ="+ Mb.getTanggal());
		System.out.println(" Customer ="+ Mb.getId());
		System.out.println("Nama = " + Mb.getNama());
	}

}
