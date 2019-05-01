package arrayAndInheritage;

public class array_inheritage {//Супер класс из которого идёт наследование 
		int bigNumber,suma,dif;
		int number;
		int []array = {1, 5, 10, 80, 9, 500545, 5132132, 215132, 56, 582, 4815, 45123, 45612, 8745, 4};

	public static void main(String[] args) {	
		
	}
	public static void printArray(int[] array) {
	}
	public void sort1() {
		int j = 0;
			for (int i = 0; i < array.length; i++) {
				number =  array[i];
				for (j = i - 1; j >= 0 && j > number; j --) {
					array[j + 1] = array[j];
					
				}
				array[j + 1] = number;
		}
		for(int i = 0; i < array.length; i++)System.out.print(array[i] + " " + "\n");
	}
	public int summa() {
		for (int i = 0; i<array.length; i++){
			suma = 0;
			suma += array[i];	
}
		System.out.println("Сумма чисел массива:" + suma);
		return suma;
}
	public int difference() {
		for (int i = 0; i<array.length; i++){
		dif = dif - array[i];
		}
		System.out.println("Разность чисел массива:" + dif);
		return dif;
}
	public int bN() {
		for (int i = 0; i<array.length; i++){
		bigNumber = array[0];
		if(array[i] > bigNumber) {
			bigNumber = array[i];
		}
}
		System.out.println("Большее число:" + bigNumber);
		return bigNumber;
	}
}
