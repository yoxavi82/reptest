package operacions;

public class Operacions {


	public double factorial_iteratiu(int n){
        if(n < 0){
            throw  new IllegalArgumentException();
        }
        if(n == 1 || n == 0){
            return 1;
        }

        int aux = 1;
        for (int i = 2; i <= n; i++){
            aux *= i;
        }
        return aux;
    }
	public double getRecursiva(int n){
        if(n < 0){
            throw  new IllegalArgumentException();
        }
        if(n == 1 || n == 0){
            return 1;
        }
        Operacions fmenos1 = new Operacions();
        return n * fmenos1.getRecursiva(n - 1);
    }

}
