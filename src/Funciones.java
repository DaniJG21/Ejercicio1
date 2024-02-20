
public class Funciones {

	public void imprimir(int[] list) {
		System.out.print("[");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
			if (i < list.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public int[] eliminar(int[] list, int S) {
		for (int i = 0; i < list.length; i++) {
			list[i] = eliminarParte(list[i], S);
		}
		return list;
	}

	public int eliminarParte(int num, int S) {
		String numStr = String.valueOf(num);

		numStr = numStr.replaceAll("[^0-" + (S - 1) + "]", "");

		if (!numStr.isEmpty()) {
			return Integer.parseInt(numStr);
		}
		return 0;
	}
}
