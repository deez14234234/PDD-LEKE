package service;

public class MatematicaServiceImpl implements MatematicaService {

    @Override
    public int calcularMCD(int a, int b) {
        // Algoritmo de Euclides (iterativo)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Asegura valor positivo
    }

    @Override
    public int calcularMCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / calcularMCD(a, b);
    }
}
