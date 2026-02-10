package Ejercicio_08;

public class TestProducto {

	public static void main(String[] args) {
		Producto[] productos = new Producto[5];
		
		productos[0] = new ProductoFresco("2026-02-01", "LOTE-REF-001", "España", "2026-04-09");
		productos[1] = new ProductoFresco("2026-02-01", "LOTE-REF-025", "Francia", "2026-03-28");
		productos[2] = new ProductoRefrigerado("2025-12-20", "LOTE-REF-004", "México", "2026-09-10", -2.5, "CSA-98765");
		productos[3] = new ProductoRefrigerado("2026-01-20", "LOTE-REF-154", "Italia", "2026-09-25", -4.5, "CSA-98965");
		productos[4] = new ProductoRefrigerado("2026-02-03", "LOTE-REF-205", "Portugal", "2026-06-16", -3, "CSA-98471");
		
		
		for(Producto p : productos) {
			if (p instanceof ProductoFresco) {
				ProductoFresco pF = (ProductoFresco)p;
				System.out.print(pF.toString());
				System.out.println();
			} else if (p instanceof ProductoRefrigerado) {
				ProductoRefrigerado pR = (ProductoRefrigerado)p;
				System.out.print(pR.toString());
				System.out.println();
			}
			System.out.println();
		}
	}

}
