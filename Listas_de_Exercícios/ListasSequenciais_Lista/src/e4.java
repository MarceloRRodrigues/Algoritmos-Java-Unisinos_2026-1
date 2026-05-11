//Implemente um metodo que remove da lista um elemento passado como parâmetro.
//Esse metodo retorna true quando o elemento é achado e removido, false caso
//contrário. Será removida apenas a primeira ocorrência do elemento.
//public boolean remove(E element)

public class e4
{
    static void main() {
        StaticList<Double> lista1 = new StaticList<>(10);

        lista1.insert(34.5,0);
        lista1.insert(12.6,1);
        lista1.insert(7.3,2);
        lista1.insert(12.6,3);

        lista1.remove(12.6);
        System.out.print(lista1);
    }
}
