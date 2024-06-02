public class IntegerSet {
    private boolean[] conjunto;

    public IntegerSet() {
        conjunto = new boolean[101]; // Índices del 0 al 100
    }

    public boolean[] getConjunto() {
        return conjunto;
    }

    public void union(IntegerSet otroConjunto) {
        boolean[] otro = otroConjunto.getConjunto();
        for (int i = 0; i < 101; i++) {
            conjunto[i] = conjunto[i] || otro[i];
        }
    }

    public void interseccion(IntegerSet otroConjunto) {
        boolean[] otro = otroConjunto.getConjunto();
        for (int i = 0; i < 101; i++) {
            conjunto[i] = conjunto[i] && otro[i];
        }
    }

    public void insertaElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = true;
        }
    }

    public void eliminaElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public boolean igualA(IntegerSet otroConjunto) {
        boolean[] otro = otroConjunto.getConjunto();
        for (int i = 0; i < 101; i++) {
            if (conjunto[i] != otro[i]) {
                return false;
            }
        }
        return true;
    }
}
