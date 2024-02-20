
public class Inverso {

	public static void main(String[] args) {

		Funciones num = new Funciones();

		int[] list = { 10, 25, 34, 54, 86, 71 };
		int S = 7;
		int[] inverso = new int[list.length];

		num.imprimir(list);
		list = num.eliminar(list, S);

		for (int i = 0; i < list.length; i++) {
			int j = list.length - i - 1;
			inverso[j] = list[i];
		}
		list = inverso;

		num.imprimir(list);
	}
}
