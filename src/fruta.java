
public class fruta {
	private String fruta;
	private int cantidad;
	private String unidad;
public fruta(int cantidad, String unidad, String fruta) {
	this.fruta = fruta;
	this.cantidad = cantidad;
	this.unidad = unidad;
	}
public String getFruta() {
	return fruta;
}
public int getCantidad() {
	return cantidad;
}
public String getUnidad() {
	return unidad;
}
@Override
public String toString(){
	return cantidad + unidad + fruta;
}
}
