//Implemente um metodo insertAfter, abaixo, que insere o elemento obj2 uma posição
//após o elemento obj1. Considere a primeira ocorrência de obj1. Se obj1 não for
//encontrado, gere uma exceção apropriada.

public class e5
{
    static void main() {
        StaticList<Double> lista1 = new StaticList<>(10);

        lista1.insert(34.5,0);
        lista1.insert(12.6,1);
        lista1.insert(7.3,2);
        lista1.insert(12.6,3);

        lista1.insertAfter(12.6,5.0);
        System.out.print(lista1);
    }
}
